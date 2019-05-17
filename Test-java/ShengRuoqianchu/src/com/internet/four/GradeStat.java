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
		System.out.printf("��ӭ�鿴���³ɼ���\n%s!\n\n", getCourseName());
	}

	public void processGrades() {
		outputGrades();
		System.out.printf("\nƽ�����ǣ�%.2f\n",getAverage());
		System.out.printf("��ͷ��ǣ�%d\n��߷��ǣ�%d\n\n",getMinimum(),getMaximum());
		outputBarChart();
	}

	public int getMinimum() {
		int lowGrade = grades[ 0 ];
	/*
	 * ����ʹ��for������ʽ������ʹ�õļ�for���Ĵ���οɼ���һ������Ԫ�صĺ�:
	* int x[] = [1,2,3,4,5,6,7];
	* int  sum;
	 *������������x����˳��ȡ��ÿ��Ԫ�ص�ֵ����������y 
	*for ( int y:x)
	*	sum += y; //��Ҫע����ǣ�y�洢��������Ԫ�ص�ֵ���������±�ȼ۵�for������£�
			for ( int i=0; i<x.length; i++)
	*		sum += x[i];
	* for ( int grade : grades)����˼������ȡ��grades�����Ԫ��ֵ������������grade
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
		System.out.println("�ɼ��ֲ��ʣ�");
		int frequency[] = new int [ 11 ];
		for ( int grade :grades )
			++frequency[ grade/10 ];	//�ο������µ��������
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
		System.out.println("�ɼ����£�\n");
		for (int student=0; student<grades.length; student++)
			System.out.printf("Student %2d: %3d\n", student+1, grades[ student ]);
	}
	
	public static void main(String[] args) {
		int gradesArray[] = {90,89,36,89,87,76,87,76,89,92,12,90 };
		GradeStat myGrade = new GradeStat("Java������Ƴɼ�", gradesArray);
		myGrade.displayMessage();
		myGrade.processGrades();
	}
}
