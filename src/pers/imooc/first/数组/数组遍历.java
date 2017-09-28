package pers.imooc.first.数组;

public class 数组遍历 {
	public static void main(String[] args) {
		String[] name={"zqq","yfx","siguoya"};
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}

		System.out.println("使用foreach来遍历数组");
		for (String n: name) {
			System.out.println(n);
		}
	}
}
