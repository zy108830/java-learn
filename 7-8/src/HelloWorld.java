/**
 * Created by zqq on 10/4/16.
 */
public class HelloWorld {
	public static void main(String[] args) {
		HelloWorld hello=new HelloWorld();
		/**
		 * Java的方法重载
		 */
		hello.print();
		hello.print(888);
		hello.print("Hello");
	}

	public void print(){
		System.out.println("调用了无参数的print方法");
	}

	public void print(int num){
		System.out.println("调用了int参数的print方法: "+num);
	}

	public void print(String str){
		System.out.println("调用了String参数的print方法: "+str);
	}
}
