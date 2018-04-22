package com.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.GsonBuilder;
import com.mvp.bean.BookBean;
import com.mvp.utils.RetrofitService;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitActivity extends AppCompatActivity {

    @BindView(R.id.tv_book)
    TextView tvBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);
        ButterKnife.bind(this);

        //创建retrofit对象,传入baseurl ,添加gson转换工厂(接口返回的数据不是我们需要的实体类)
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(RetrofitService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().create()))
                .build();

        RetrofitService service=retrofit.create(RetrofitService.class);

        Call<BookBean> beanCall=service.getSearchBook("水浒传",null,0,1);


        beanCall.enqueue(new Callback<BookBean>() {
            @Override
            public void onResponse(Call<BookBean> call, Response<BookBean> response) {
                tvBook.setText(response.body()+"");
            }

            @Override
            public void onFailure(Call<BookBean> call, Throwable t) {
                Toast.makeText(RetrofitActivity.this,"请求失败",Toast.LENGTH_LONG).show();
            }
        });
    }
}
