package day1;

public class IntText {
	public static void main(String[] args) {
//		Integer 常量池-128-127 都为true 以后我也可以问别人
		Integer i = -1290000;
		Integer j = -1290000;
		boolean x = i == j  ;//? true : false;//有什么问题 结果就是true,false 没必要三位运算符		
		System.out.println(x);
		
		
	}
}
