package com.mvp.utils;

import com.mvp.bean.BookBean;
import com.mvp.bean.User;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.*;
import rx.Observable;

/**
 * Created by Administrator on 2018/4/22.
 */

public interface RetrofitService {
    //https://api.douban.com/v2/book/search?q=水浒传&tag=&start=0&count=1

     String BASE_URL="https://api.douban.com/v2/";
    //book/search相当于BASE_URL后的地址,query代表拼接的参数
    @GET("book/search")
    Call<BookBean> getSearchBook(@Query("q") String name,
                                 @Query("tag") String tag,
                                 @Query("start") int start,
                                 @Query("count") int count);
    //参数过多时可调用QueryMap
    @GET("book/search")
    Call<BookBean> getSearchBook2(@QueryMap Map<String,String> potions);



    //post可传递对象作为Http请求体
    @POST("users/new")
    Call<BookBean> createBook(@Body BookBean bookBean);


    //添加header
    @Headers({
            "Accept: application/vnd.github.v3.full+json",
            "User-Agent: Retrofit-Sample-App"
    })
    @GET("user")
    Call<User> getUser();


    //retrofit+rxjava后
    @GET("book/search")
    Observable<BookBean> getSearchBook3(@Query("q") String name,
                                        @Query("tag") String tag,
                                        @Query("start") int start,
                                        @Query("count") int count);

}
