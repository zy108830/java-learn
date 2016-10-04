/**
 * Created by zqq on 10/4/16.
 */
public class Person {
	public class Inner{
		public void print(){
			System.out.println("Hello World");
		}
	}
	public static void main(String[] args) {
		/**
		 * 内部类提供了更好的封装方式;
		 * 需要注意一下内部类的实例化方式;
		 */
		Person person=new Person();
		Inner i=person.new Inner();
		i.print();
	}
}
