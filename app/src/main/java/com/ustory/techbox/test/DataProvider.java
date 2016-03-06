package com.ustory.techbox.test;

import com.example.administrator.test2.R;

/**
 * @ Author: qiyue (ustory)
 * @ Email: qiyuekoon@foxmail.com
 * @ Data:2016/3/4
 */
public class DataProvider {

    public static int iTTechCount = 9;
    public static String iTTechTitle[] ={
            "Volley","Glide","Picasso","OKHttp",
            "Gson","XUtil","ImageLoader","Butternife",
            "Glie"
    };

    public static int iTTechImage[] = {

    };

    public static String content[] = {
            "今年的Google I/O 2013上，Volley发布了。Volley是Android平台上的网络通信库，能使网络通信更快，更简单，更健壮。",
            "在泰国举行的谷歌开发者论坛上，谷歌为我们介绍了一个名叫 Glide 的图片加载库，作者是bumptech",
            "picasso是Square公司开源的一个Android图形缓存库，可以实现图片下载和缓存功能。仅仅只需要一行代码就能完全实现图片的异步加载",
            "OkHttp是一个相对成熟的网络解决方案，据说Android4.4的源码中可以看到HttpURLConnection已经替换成OkHttp实现了。所以我们更有理由相信OkHttp的强大",
            "谷歌GSON这个Java类库可以把Java对象转换成JSON,也可以把JSON字符串转换成一个相等的Java对象。",
            "xUtils 最初源于Afinal框架，进行了大量重构，使得xUtils支持大文件上传，更全面的http请求协议支持(10种谓词)，拥有更加灵活的ORM，更多的事件注解支持且不受混淆影响...",
            "Android UI-开源框架ImageLoader",
            "ButterKnife是一个专注于Android系统的View注入框架，让你从此从这些烦人臃肿的代码中解脱出来",
            "Dagger以来注入矿建，主要是由Google技术人员参与开发的，当然包括Square的各位及其他一些Contributors在内的大牛也贡献了不少"
    };

    public static String similar_key_0[] = {
            "Android","Android","Android","Android","Android",
            "Android","Android","Android","Android"
    };
    public static String similar_key_1[] = {
            "Volley","Glide","Picasso","OKHttp",
            "Gson","XUtil","ImageLoader","Butternife",
            "Dragger"
    };
    public static String dates[] = {
            "2016.3.5","2016.3.3","2016.3.1","2016.2.25","2016.2.24",
            "2016.2.22","2016.2.21","2016.1.19","2016.1.4",
    };

    public static int photo[] = {
            R.mipmap.test8,R.mipmap.test7,R.mipmap.test2,R.mipmap.test3,
            R.mipmap.test4,R.mipmap.test5,R.mipmap.test6,R.mipmap.test9,
            R.mipmap.test1
    };

    public static String volleyContent[] = {
            "测试请求String类型数据","测试请求JSON类型数据","测试请求Image",
            "测试ImageLoader","测试NetworkImageView","测试自定义XML请求","测试发送POST请求"
    };
    public final static int STRING_REQUEST = 0;
    public final static int JSON_REQUEST = 1;
    public final static int IMAGE_REQUEST = 2;
    public final static int IMAGE_LOADER = 3;
    public final static int NETWORK_IMAGEVIEW = 4;
    public final static int XML_REQUEST = 5;
    public final static int POST_REQUEST = 6;

    public static int ids [] = {
        STRING_REQUEST,JSON_REQUEST,IMAGE_REQUEST,IMAGE_LOADER,NETWORK_IMAGEVIEW,XML_REQUEST,POST_REQUEST
    };


}
