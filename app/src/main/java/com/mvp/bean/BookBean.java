package com.mvp.bean;

import java.util.List;

/**
 * Created by zh on 2018/4/22.
 */

public class BookBean {


    /**
     * count : 1
     * start : 0
     * total : 1156
     * books : [{"rating":{"max":10,"numRaters":23769,"average":"8.5","min":0},"subtitle":"","author":["[明] 施耐庵","罗贯中"],"pubdate":"1997-1","tags":[{"count":3996,"name":"古典文学","title":"古典文学"},{"count":2885,"name":"水浒传","title":"水浒传"},{"count":2418,"name":"四大名著","title":"四大名著"},{"count":2410,"name":"小说","title":"小说"},{"count":1354,"name":"中国","title":"中国"},{"count":1283,"name":"古典名著","title":"古典名著"},{"count":978,"name":"经典","title":"经典"},{"count":920,"name":"名著","title":"名著"}],"origin_title":"","image":"https://img3.doubanio.com/view/subject/m/public/s1147854.jpg","binding":"平装","translator":[],"catalog":"引首\n第一回 张天师祈禳瘟疫 洪太尉误走妖魔\n第二回 王教头私走延安府 九纹龙大闹史家村\n第三回 史大郎夜走华阴县 鲁提辖拳打镇关西\n第四回 赵员外重修文殊院 鲁智深大闹五台山\n第五回 小霸王醉入销金帐 花和尚大闹桃花村\n第六回 九纹龙剪径赤松林 鲁智深火烧瓦罐寺\n第七回 花和尚倒拔垂杨柳 豹子头误入白虎堂\n第八回 林教头刺配沧州道 鲁智深大闹野猪林\n第九回 柴进门招天下客 林冲棒打洪教头\n第十回 林教头风雪山神庙 陆虞候火烧草料场\n第十一回 朱贵水亭施号箭 林冲雪夜上梁山\n第十二回 梁山泊林冲落草 汴京城杨志卖刀\n第十三回 急先锋东郭争功 青面兽北京斗争\n第十四回 赤发鬼醉卧灵官殿 晁天王认义东溪村\n\u2026\u2026","pages":"1314","images":{"small":"https://img3.doubanio.com/view/subject/s/public/s1147854.jpg","large":"https://img3.doubanio.com/view/subject/l/public/s1147854.jpg","medium":"https://img3.doubanio.com/view/subject/m/public/s1147854.jpg"},"alt":"https://book.douban.com/subject/1008357/","id":"1008357","publisher":"人民文学出版社","isbn10":"7020008747","isbn13":"9787020008742","title":"水浒传（全二册）","url":"https://api.douban.com/v2/book/1008357","alt_title":"","author_intro":"","summary":"《水浒传》是我国第一部以农民起义为题材的长篇章回小说，是我国文学史上一座巍然屹立的丰碑，也是世界文学宝库中一颗光彩夺目的明珠。数百年来，它一直深受我国人民的喜爱，并被译为多种文字，成为我国流传最为广泛的古代长篇小说之一。\n    《水浒传》具体而生动地描写了以宋江为首的农民起义发生、发展直至失财的整个过程，揭露了封建社会的黑暗、腐朽和统治阶级的种种罪恶，热情歌颂了起义英雄的反抗精神和正义行动，塑造了一大批梁山好汉的光辉形象，形象地揭示了封建社会\u201c官逼民反\u201d的客观真理和农民起义失败的内在原因。","series":{"id":"106","title":"中国古典文学读本丛书"},"price":"50.60元"}]
     */

    private int count;
    private int start;
    private int total;
    private List<BooksBean> books;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<BooksBean> getBooks() {
        return books;
    }

    public void setBooks(List<BooksBean> books) {
        this.books = books;
    }

    public static class BooksBean {
        /**
         * rating : {"max":10,"numRaters":23769,"average":"8.5","min":0}
         * subtitle :
         * author : ["[明] 施耐庵","罗贯中"]
         * pubdate : 1997-1
         * tags : [{"count":3996,"name":"古典文学","title":"古典文学"},{"count":2885,"name":"水浒传","title":"水浒传"},{"count":2418,"name":"四大名著","title":"四大名著"},{"count":2410,"name":"小说","title":"小说"},{"count":1354,"name":"中国","title":"中国"},{"count":1283,"name":"古典名著","title":"古典名著"},{"count":978,"name":"经典","title":"经典"},{"count":920,"name":"名著","title":"名著"}]
         * origin_title :
         * image : https://img3.doubanio.com/view/subject/m/public/s1147854.jpg
         * binding : 平装
         * translator : []
         * catalog : 引首
         第一回 张天师祈禳瘟疫 洪太尉误走妖魔
         第二回 王教头私走延安府 九纹龙大闹史家村
         第三回 史大郎夜走华阴县 鲁提辖拳打镇关西
         第四回 赵员外重修文殊院 鲁智深大闹五台山
         第五回 小霸王醉入销金帐 花和尚大闹桃花村
         第六回 九纹龙剪径赤松林 鲁智深火烧瓦罐寺
         第七回 花和尚倒拔垂杨柳 豹子头误入白虎堂
         第八回 林教头刺配沧州道 鲁智深大闹野猪林
         第九回 柴进门招天下客 林冲棒打洪教头
         第十回 林教头风雪山神庙 陆虞候火烧草料场
         第十一回 朱贵水亭施号箭 林冲雪夜上梁山
         第十二回 梁山泊林冲落草 汴京城杨志卖刀
         第十三回 急先锋东郭争功 青面兽北京斗争
         第十四回 赤发鬼醉卧灵官殿 晁天王认义东溪村
         ……
         * pages : 1314
         * images : {"small":"https://img3.doubanio.com/view/subject/s/public/s1147854.jpg","large":"https://img3.doubanio.com/view/subject/l/public/s1147854.jpg","medium":"https://img3.doubanio.com/view/subject/m/public/s1147854.jpg"}
         * alt : https://book.douban.com/subject/1008357/
         * id : 1008357
         * publisher : 人民文学出版社
         * isbn10 : 7020008747
         * isbn13 : 9787020008742
         * title : 水浒传（全二册）
         * url : https://api.douban.com/v2/book/1008357
         * alt_title :
         * author_intro :
         * summary : 《水浒传》是我国第一部以农民起义为题材的长篇章回小说，是我国文学史上一座巍然屹立的丰碑，也是世界文学宝库中一颗光彩夺目的明珠。数百年来，它一直深受我国人民的喜爱，并被译为多种文字，成为我国流传最为广泛的古代长篇小说之一。
         《水浒传》具体而生动地描写了以宋江为首的农民起义发生、发展直至失财的整个过程，揭露了封建社会的黑暗、腐朽和统治阶级的种种罪恶，热情歌颂了起义英雄的反抗精神和正义行动，塑造了一大批梁山好汉的光辉形象，形象地揭示了封建社会“官逼民反”的客观真理和农民起义失败的内在原因。
         * series : {"id":"106","title":"中国古典文学读本丛书"}
         * price : 50.60元
         */

        private RatingBean rating;
        private String subtitle;
        private String pubdate;
        private String origin_title;
        private String image;
        private String binding;
        private String catalog;
        private String pages;
        private ImagesBean images;
        private String alt;
        private String id;
        private String publisher;
        private String isbn10;
        private String isbn13;
        private String title;
        private String url;
        private String alt_title;
        private String author_intro;
        private String summary;
        private SeriesBean series;
        private String price;
        private List<String> author;
        private List<TagsBean> tags;
        private List<?> translator;

        public RatingBean getRating() {
            return rating;
        }

        public void setRating(RatingBean rating) {
            this.rating = rating;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
        }

        public String getPubdate() {
            return pubdate;
        }

        public void setPubdate(String pubdate) {
            this.pubdate = pubdate;
        }

        public String getOrigin_title() {
            return origin_title;
        }

        public void setOrigin_title(String origin_title) {
            this.origin_title = origin_title;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getBinding() {
            return binding;
        }

        public void setBinding(String binding) {
            this.binding = binding;
        }

        public String getCatalog() {
            return catalog;
        }

        public void setCatalog(String catalog) {
            this.catalog = catalog;
        }

        public String getPages() {
            return pages;
        }

        public void setPages(String pages) {
            this.pages = pages;
        }

        public ImagesBean getImages() {
            return images;
        }

        public void setImages(ImagesBean images) {
            this.images = images;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public String getIsbn10() {
            return isbn10;
        }

        public void setIsbn10(String isbn10) {
            this.isbn10 = isbn10;
        }

        public String getIsbn13() {
            return isbn13;
        }

        public void setIsbn13(String isbn13) {
            this.isbn13 = isbn13;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getAlt_title() {
            return alt_title;
        }

        public void setAlt_title(String alt_title) {
            this.alt_title = alt_title;
        }

        public String getAuthor_intro() {
            return author_intro;
        }

        public void setAuthor_intro(String author_intro) {
            this.author_intro = author_intro;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public SeriesBean getSeries() {
            return series;
        }

        public void setSeries(SeriesBean series) {
            this.series = series;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public List<String> getAuthor() {
            return author;
        }

        public void setAuthor(List<String> author) {
            this.author = author;
        }

        public List<TagsBean> getTags() {
            return tags;
        }

        public void setTags(List<TagsBean> tags) {
            this.tags = tags;
        }

        public List<?> getTranslator() {
            return translator;
        }

        public void setTranslator(List<?> translator) {
            this.translator = translator;
        }

        public static class RatingBean {
            /**
             * max : 10
             * numRaters : 23769
             * average : 8.5
             * min : 0
             */

            private int max;
            private int numRaters;
            private String average;
            private int min;

            public int getMax() {
                return max;
            }

            public void setMax(int max) {
                this.max = max;
            }

            public int getNumRaters() {
                return numRaters;
            }

            public void setNumRaters(int numRaters) {
                this.numRaters = numRaters;
            }

            public String getAverage() {
                return average;
            }

            public void setAverage(String average) {
                this.average = average;
            }

            public int getMin() {
                return min;
            }

            public void setMin(int min) {
                this.min = min;
            }
        }

        public static class ImagesBean {
            /**
             * small : https://img3.doubanio.com/view/subject/s/public/s1147854.jpg
             * large : https://img3.doubanio.com/view/subject/l/public/s1147854.jpg
             * medium : https://img3.doubanio.com/view/subject/m/public/s1147854.jpg
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }

        public static class SeriesBean {
            /**
             * id : 106
             * title : 中国古典文学读本丛书
             */

            private String id;
            private String title;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }

        public static class TagsBean {
            /**
             * count : 3996
             * name : 古典文学
             * title : 古典文学
             */

            private int count;
            private String name;
            private String title;

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }
    }
}
