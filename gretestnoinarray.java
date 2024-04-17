package ARRAYSINJAVA;

import java.util.Scanner;

public class gretestnoinarray {

	public static void main(String[] args) {
		int a []= {13,65,12,8,9,4};
		int max;
		
			max=a[0];//suru ke element ko gretest maan liya//
			for(int i=1;i<a.length;i++)
		{
				if(a[i]>max)//a[i]<max isme smallest number aa jyga
				{
					max=a[i];
				}}
			System.out.println("maximum number is"+max);
	}}
