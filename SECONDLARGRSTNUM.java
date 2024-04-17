package ARRAYSINJAVA;

public class SECONDLARGRSTNUM {

	public static void main(String[] args) {
	
		int a[]={20,10,45,34,23,60};
		int l =a.length;
		int temp;
		
		for(int i =0; i<a.length; i++)
		{
			for(int j=i+1;j<a.length; j++ )
			{
				
				 if(a[i]>a[j])
				 {
					temp=a[i];
					a[j]=a[i];
					a[i]=temp;
				}}}
					System.out.print("second largest number is::"+a[l-2]);
					
				}
				
			}
		