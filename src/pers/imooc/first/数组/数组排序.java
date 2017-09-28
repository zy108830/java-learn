package pers.imooc.first.数组;

import java.util.Arrays;

/**
 * Created by zqq on 10/3/16.
 */
public class 数组排序 {
	public static void main(String[] args) {
		int[] nums={1,3,2,7,4,8};
		//排序数组
		Arrays.sort(nums);
		System.out.println("排序后数组中元素的值: ");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		//转换为字符串
		System.out.println(Arrays.toString(nums));
	}
}
