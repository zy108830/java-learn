# java-learn
根据慕课网 http://www.imooc.com/learn/85 的教程学习Java

##Java核心概念
JRE:Java程序运行环境
JVM:是JRE的一部分,跨平台性
JDK:开发Java程序的工具包(包含了JRE),分为JavaSE,JavaEE,JavaME三种版本
包含关系为:JDK>JVM>JRE

##JDK安装
java -version有输出即表示JDK安装成功了
和JDK使用有关的变量说明:
(1)JAVA_HOME:用于指定项目的JDK路径,Mac下可以使用/usr/libexec/java_home来定位默认JDK
        也可通过/usr/libexec/java_home输出所有版本的JAVA_HOME
(2)PATH:java,javac等命令所在的目录
(3)CLASSPATH:在java xxx.class的时候用于指定.class文件的搜索路径;
        注意,最好不要使用java /path/to/xxx.class,而应该先cd /path/to/
        然后再java xxx.class,不然有可能会报错

##编译与执行
(1)编译.java文件:javac xxx.java
(2)执行.class文件:java xxx(不需要再加后缀)





