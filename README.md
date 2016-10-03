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

##使用IDEA作为项目开发工具
使用IDEA开发工具,相比较于记事本,最明显的好处就是右键单击.java文件即可自动编译运行

###打开了IDEA项目选择界面之后:
(1)如果是Create New Project,很好,这不会有任何问题
(2)最好不要使用open功能,因为你打开的可能是一个普通文件夹
(3)如果源代码确实在一个普通的文件夹中,而且我想基于此文件夹采用IDEA工具进行开发
  那么使用Import Project,这个功能会基于此文件夹自动完成一系列项目配置

###项目,模块,包,类和方法之间的关系:
  在IDEA打开的一个项目下,可以新建多个模块
  在一个模块下,可以新建多个包（一对多）；
  在一个包下,可以新建多个类（一对多）；
  一个类（接口类，interface）中可以有多个抽象方法（一对多）；
  一个类（实现类，继承（extends）自接口类）中可以有多个方法（一对多）；

##Java语法
(1)Java是大小写敏感的,字符串两端需要加入双引号





