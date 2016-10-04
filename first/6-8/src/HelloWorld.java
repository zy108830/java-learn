import java.util.Arrays;

/**
 * Created by zqq on 10/4/16.
 */
public class HelloWorld {
	public static void main(String[] args) {
		int[] nums={10,30,25,20,15};

		System.out.println("先对数组进行排序");
		Arrays.sort(nums);

		System.out.println("使用for来遍历数组 :");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

		System.out.println("使用foreach来遍历数组");
		for (int num: nums) {
			System.out.println(num);
		}
	}
}
