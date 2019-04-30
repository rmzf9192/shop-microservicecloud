#Java

#主要技术栈
 
 - [Spring cloud Edgware.RELEASE](https://spring.io/projects/spring-cloud)
 - [Spring Boot 1.5+](http://projects.spring.io/spring-boot/)
 - [Spring Security 1.5+](https://spring.io/projects/spring-security)
 - [MyBatis 3.4+](http://www.mybatis.org/mybatis-3/)
 备注：技术栈将会逐步更新
  安全方面：使用 Spring Security（比shiro更复杂，更有难度，同时的话会提供更加完善的功能）
  消息中间件：待定
  分布式文件系统：FASTDF
  数据库中间件：shard/mycat
  分布式事务：XA,事务补偿机制，基于消息中间件的通知，最大努力通知型，alibaba的Fescar
  分布式锁：zookeeper,redis,数据库锁机制
  前端使用vue及相关组件：已确定
 
 ## 开发工具
 
 - [Maven 3.5.2](http://maven.apache.org/)
 - [JetBrains Intelli IDEA 2018.2+](https://www.jetbrains.com/idea/) (Plugins: EditorConfig, Lombok)
 - [EditorConfig](http://editorconfig.org/)
 - [Lombok](https://projectlombok.org/features/index.html)
 
 ## 测试工具
 
 - [JUnit4](https://junit.org/junit4/)
 - [Spock](http://spockframework.org/)
 
 ### 开发
   1.该项目是采用springcloud实现微服务架构，目前服务端支持Mybatis开发及配置文件开发（主要是真的复杂的sql）
   2.可以通过mvn命令执行相关的操作
 ### 功能
   1.第一阶段
      支持普通的电商功能（功能描述比较模糊，功能定位尚不明确）
   2.第二阶段
      支持视频的上传，在线播放。
   3.优化阶段
      包括技术架构的完善及功能的优化
   
 ### 打包
 
 1. 修改POM的包方式，然后利用idea的mvn package
