/**
 * Created by zqq on 10/3/16.
 */
public class HelloWorld {
	public static void main(String[] args){
		int a=12;
		float b=9.99f;
		int c=a+(int)b;
		System.out.println(c);//21
		/**
		 * 在java中,int类型除以int类型,结果一定是int类型
		 * 如果想保留精度,就必须将int类型转换为浮点类型
		 */
		System.out.println(35/4);//8
		System.out.println((double)35/4);//8.75

	}
}
