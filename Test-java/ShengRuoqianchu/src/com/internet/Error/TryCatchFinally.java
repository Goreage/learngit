package com.internet.Error;

public class TryCatchFinally {
	public static void main(String[] args) {
		int i=0;
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		for ( i=0; i<11; i++)
		{
			try
			{
				System.out.println("a["+i+"]/"+i+"="+(a[i]/i));
			}catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("���������±��쳣��");
			}catch(ArithmeticException e)
			{
				System.out.println("���������쳣��");
			}catch(Exception e)
			{
				System.out.println("����"+e.getMessage()+"�쳣");
			}
			finally
			{
				System.out.println("i="+i);
			}
		}
	}
}
