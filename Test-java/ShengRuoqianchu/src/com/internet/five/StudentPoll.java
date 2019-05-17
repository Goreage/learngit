package com.internet.five;
	/*
	 * 开发者：***
	 * 开发地点：***
	 * 开发时间：****年**月**日
	 * 最后一次修改时间：****年**月**日
	 * 功能简介：要求40名学生对某个食堂的饭菜质量按照1~10的分值进行评价（1 表示非常差 10表示非常好 ）。将
	 * 40个评价结果保存在一个整型数组中，并对评价结果进行分析
	 */
public class StudentPoll {
	public static void main(String[] args) {
		int responses[] = {1,2,6,4,8,5,9,7,5,8,10,1,6,3,8,6,10,3,8,2,7,6,5,7,6,8,
				6,7,5,6,6,5,6,7,5,6,4,8,6,8,10};
		//声明长度为11的数组，用于统计1~10不同分值评价数
		int frequency [] = new int[11];
		for( int i=0; i<responses.length; i++)
			/*
			 * 使用下标为frequencry[1],frequencry[2],frequencry[2],frequencry[3]
			 * frequencry[4],frequencry[5],frequencry[6],frequencry[7],frequencry[8],frequencry[9]
			 * ,frequencry[10]的数组元素统计responses[i]中的值并把相应的结果通过++计算后保存到数组元素responses中。数组元素responses[i]和整型变量i一样
			 * 可以执行自增，自减运算并赋值
			 */
			++frequency[responses[i]];
		System.out.printf("%s%10s\n","打分值","多少人次");
		for( int j=1; j<frequency.length; j++)
			//输出数组中的分析结果
			System.out.printf("%6d%10d\n",j,frequency[j]);
	}
}
