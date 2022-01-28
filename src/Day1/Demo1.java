package Day1;

import java.util.Scanner;

public class Demo1 {
	
	//int[] a={1,2,3,4,1,2,3,6,7,8,3,1}
	//1->3
	//2-->2
	//3->3
	//4-->1
public static void main(String[] args) {
	int[] a=new int[10];
	Scanner sc=new Scanner(System.in);
	
	System.out.println("length:"+a.length);
	System.out.println("Enter"+a.length+" elements");
	
	for(int i=0;i<a.length;i++)//
	{
		a[i]=sc.nextInt();
	}
	
	//number 7 Factorial
	//7! -->1X2X3X4X5X6X7
	//accept number from user and find factors of that
	//16 ,1,2,4,8,16
	//24->1,2,3,4,6,8,12,24
	//1*2*3*4*5
}
}

//a={1,2,3,4,5}
//b={6,7,8,9,10}
//c->10={1,2,3,4,5,6,7,8,9,10}
//c->{1,6,2,7,3,8,4,9,5,10}
