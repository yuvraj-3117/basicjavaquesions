package ARRAYSINJAVA;

public class PiintDuplicateArray {

	public static void main(String[] args) {
		int a [] = {10,20,30,20,40,10,40,50,70};
		System.out.println("duplicate element are :");
		for (int i =0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i]==a[j])//20==20 so print20 then 30==30 so print  is continue
				{
					System.out.print(a[i]+" ");
				}
			}
		}
	}

}
