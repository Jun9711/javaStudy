package org.java.array;

public class Array1 {

	public static void main(String[] args) {
		
		System.out.println("�迭");
		
		// int�� �����͸� ���� �� �� �ִ� �迭 arr1�� �����Ͽ���.
		int[] arr1=new int[5];
		
		//int arr1[]=new int[5]; << �̷��Ե� �� �� ����.
		
		// �ʱ�ȭ
//		arr1[0]=1;
//		arr1[1]=2;
//		arr1[2]=3;
//		arr1[3]=4;
//		arr1[4]=5;
//		System.out.println(arr1[0]);
//		System.out.println(arr1[1]);
//		System.out.println(arr1[2]);
//		System.out.println(arr1[3]);
//		System.out.println(arr1[4]);
//		for���� �̿��ؼ� arr1�� 01234�� �ʱ�ȭ�ϰ� �ֿܼ� �� ������ ���� ����غ�����.
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i]=i+1;
			System.out.println("arr1[" + i + "] = " + arr1[i]);
		}
		
		System.out.println("�迭�� �� ���� : " + arr1.length);
		System.out.println("�迭�� ������ �ε��� : " + (arr1.length-1));
		
		
		
		// int�� �����͸� ���� �� �� �ִ� �迭 arr2�� �����ϰ�, int�� 1,2,3,4,5�� �ʱ�ȭ�ߴ�.
		int[] arr2=new int[] {1,2,3,4,5};
		
		// int�� �����͸� ���� �� �� �ִ� �迭 arr3�� �����ϰ�, int�� 1,2,3,4,5�� �ʱ�ȭ�ߴ�.
		int[] arr3= {1,2,3,4,5};
		
		char[] chArr1=new char[5];
		for(int k=0; k<chArr1.length; k++);
			
		char[] chArr2=new char[] {'a','b','c','d','e'};
		for (int i=0; i<chArr2.length; i++) {
			System.out.println("chArr2[ " + i + "] = " + chArr1[i]);
		}
		
		int[] lotto=new int[45];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i]=i+1;
			System.out.println("lotto [ " + i + " ]  = " + lotto[i]);
		}
		
		
		
	}
}
