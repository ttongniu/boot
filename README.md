# 工程简介

## Thymeleaf
### Thymeleaf简介
本工程是一个简单的Thymeleaf的例子，用于向同学们展示如何快速上手Thymeleaf + Spring。学习本工程需要同学们对Spring 和 Thymeleaf有一定的了解，不过本工程会尽量清晰明了，降低同学们的学习门槛。


### Thymeleaf工程解读


工程结果如图所示：

```
.
├── README.md
├── pom.xml
└── src
    └── main
        ├── java
        │       └── com
        │             └── example
        │                 └── servingwebcontent
        │                     ├── GreetingController.java //Controller，用于接收不同的网页映射
        │                     └── ServingWebContentApplication.java //程序启动入口
        └── resources
            ├── static //静态页面
            │         └── index.html  //首页 http://127.0.0.1:8080
            └── templates//动态模板页面
                └── greeting.html // http://127.0.0.1:8080/greeting
11 directories, 15 files

```




# 延伸阅读

### Thymeleaf延伸阅读

* Thymeleaf官网： https://www.thymeleaf.org/documentation.html

* Java工程脚手架： https://start.aliyun.com
