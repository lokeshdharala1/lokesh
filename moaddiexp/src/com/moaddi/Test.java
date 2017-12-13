package com.moaddi;

public class Test {
	
	public static void main(String[] args){ 
		
	 int n=4;
	int i,j,num=1,k=num,I=1;
	for(i=1;i<=n;i++)
	{ 
	k=num-1;
	for(j=1;j<=num;j++)
	{
	if(j%2==0)
	System.out.print("*");
	else
	{
	if(i%2==0)
	{
	System.out.print(k+I-num+i);
	I++;
	k=k-2;
	}
	else
	System.out.print(I++);
	}
	}
	num=num+2;
	System.out.println();
	}
	}


}
