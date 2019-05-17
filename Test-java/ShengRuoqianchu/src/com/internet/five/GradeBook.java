package com.internet.five;
	/*
	 * 项目目的
	 * 	通过本项目的联系综合复习已学的知识，同时参考第6章的内容。要求使用二维数组保存多个学生在一个学期中的个门成绩并进行相应的处理
	 * 通过项目训练激发学生的自学兴趣，通过自学第6章的知识达到巩固已学知识以及预习新知识的目的。
	 * 项目需求分析
	 * 	本项目使用二维数组保存多个学生在第一个学期的各门成绩，每列元素表示某门考试所在学生成绩。GradeBook类的代码，其中定义的多个方法分别用于计算该学期
	 * 中各门课程的最低成绩，最高成绩，平均成绩以及输出学期中所有成绩的分布。使用GradeBookTest类
	 */
public class GradeBook {
	private String courseName;
	private int grades[] [];
	public GradeBook(String name, int gradesArray[] []) {
		courseName=name;
		grades=gradesArray;
	}
	public void setCourseName(String name) {
		courseName=name;
	}
	public String getCourseName() {
		return courseName;
	}
	public void displayMessage() {
		System.out.printf("Welcome to the grade book for\n%s!\n\n",getCourseName());
	}
	public void processGrades() {
		outputGrades();
		System.out.printf("\n%s %d\n%s %d\n\n","the lowest grade in the grade book is",getMinimum(),
				"the hightest grade in the grade book is",getMaximum());
		outputBarChart();	
	}
	public int getMinimum() {
		int lowGrade=grades[ 0 ] [ 0 ];
		for (int studentGrades[] : grades)
		{	
			for (int grade : studentGrades)
			{
				if (grade<lowGrade)
					lowGrade=grade;
			}
		}
		return lowGrade;
	}
	public int getMaximum() {
		int highGrade=grades[ 0 ] [ 0 ];
		for (int studentGrades[] : grades)
		{
			for (int grade : studentGrades)
			{
				if (grade>highGrade)
					highGrade=grade;
			}
		}
		return highGrade;
	}
	public double getAverage(int setOfGrades[]) {
		int total=0;
		for (int grade : setOfGrades)
			total += grade;
		return (double) total/setOfGrades.length;
	}
	public void outputBarChart() {
		System.out.println("Overall grade distribution:");
		int frequency[]=new int[ 11 ];
		for (int studentGrades[] : grades) {
			for (int grade : studentGrades)
				++frequency[ grade/10 ];
		}
		for (int count=0; count<frequency.length; count++)
		{
			if (count==10)
				System.out.printf("%5d:",100);
			else
				System.out.printf("%02d-%02d:",count *10,count * 10+9 );
			for (int stars=0; stars<frequency[ count ]; stars++)
				System.out.print("*");
			System.out.println();
		}		
	}
	public void outputGrades() {
		System.out.println("The grades are:\n");
		System.out.print("		");
		for (int test=0; test<grades[0].length; test++)
			System.out.printf("Test %d  ",test+1);
		System.out.println("Average");
		for (int student=0; student<grades.length; student++)
		{
			System.out.printf("Student %2d",student+1);
			for (int test : grades[ student ])
				System.out.printf("%8d",test);
			double average=getAverage(grades[ student ]);
			System.out.printf("%9.2f\n",average);
		}
	}
}
