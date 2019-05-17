package com.internet.four;

public class GradeStat {
	private String courseName;
	private int grades[];

	public GradeStat(String name, int gradesArray[]) {
		courseName = name;
		grades = gradesArray;
	}

	public void setCourseName(String name) {
		courseName = name;
	}

	public String getCourseName() {
		return courseName;
	}

	public void displayMessage() {
		System.out.printf("欢迎查看以下成绩：\n%s!\n\n", getCourseName());
	}

	public void processGrades() {
		outputGrades();
		System.out.printf("\n平均分是：%.2f\n",getAverage());
		System.out.printf("最低分是：%d\n最高分是：%d\n\n",getMinimum(),getMaximum());
		outputBarChart();
	}

	public int getMinimum() {
		int lowGrade = grades[ 0 ];
	/*
	 * 下面使用for语句简化形式。下列使用的简化for语句的代码段可计算一个数组元素的和:
	* int x[] = [1,2,3,4,5,6,7];
	* int  sum;
	 *遍历整个数组x，按顺序取出每个元素的值并赋给变量y 
	*for ( int y:x)
	*	sum += y; //需要注意的是，y存储的是数组元素的值，而不是下标等价的for语句如下：
			for ( int i=0; i<x.length; i++)
	*		sum += x[i];
	* for ( int grade : grades)的意思是依次取出grades数组的元素值，并赋给变量grade
	*/		
		for ( int grade : grades )
		{
			if ( grade < lowGrade )
				lowGrade = grade; 
		}
		return lowGrade;
	}
	
	public int getMaximum(){
		int highGrade = grades [0];
		for ( int grade : grades ) {
			if ( grade > highGrade )
				highGrade = grade;
		}
		return highGrade;
	}
	
	public double getAverage() {
		int total = 0;
		for ( int grade : grades )
			total += grade;
		return (double) total/grades.length;
	}
	
	public void outputBarChart() {
		System.out.println("成绩分布率：");
		int frequency[] = new int [ 11 ];
		for ( int grade :grades )
			++frequency[ grade/10 ];	//参考第五章的相关内容
		for (int count=0; count<frequency.length; count++)
		{
			//("00~09:",...,"90~99:","100:")
			if ( count == 10 )
				System.out.printf("%5d:",100);
			else
				System.out.printf("%02d-%02d:",count * 10, count *10+9);
			for (int stars=0; stars<frequency[ count ]; stars++)
				System.out.printf("*");
			System.out.println();			
		}
	}
	
	public void outputGrades() {
		System.out.println("成绩如下：\n");
		for (int student=0; student<grades.length; student++)
			System.out.printf("Student %2d: %3d\n", student+1, grades[ student ]);
	}
	
	public static void main(String[] args) {
		int gradesArray[] = {90,89,36,89,87,76,87,76,89,92,12,90 };
		GradeStat myGrade = new GradeStat("Java程序设计成绩", gradesArray);
		myGrade.displayMessage();
		myGrade.processGrades();
	}
}
