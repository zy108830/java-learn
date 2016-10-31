package pers.imooc.second.demo4_3;

/**
 * 使用场景
 * （1）要求子类必须实现某些方法，但是不用管子类具体怎样实现
 * （2）从多个具有相同特征的类中抽象出一个抽象类，作为子类的一个模版，避免子类的随意设计
 * 使用规则
 * （1）使用abstract定义抽象类
 * （2）抽象类的方法只要声明，不要实现
 * （3）包含抽象方法的类都是抽象类
 * （4）抽象类可以包含普通方法，也可以没有抽象方法
 * （5）抽象类不可以直接被实例化
 */
public abstract  class Telphone {
    //打电话
    public abstract void call();
    //发消息
    public abstract void message();
}
