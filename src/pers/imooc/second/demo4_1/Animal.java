package pers.imooc.second.demo4_1;

/**
 * Created by zqq on 10/4/16.
 */
public class Animal {
	public String name="肥妹";
	protected int age=23;
	private char sex='男';

	public static void main(String[] args) {
		System.out.println("动物父类");
	}

	public void printName(){
		System.out.println("调用父类方法输出："+this.name);
	}

	public String eat(Animal animal){
		return  "调用Animal类的eat";
	}
}
