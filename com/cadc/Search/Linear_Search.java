package com.cadc.Search;
import java.util.*;

public class Linear_Search {

	public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8,9,10};
	int key=5;
	int temp=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==key)
		{
			System.out.println("key element present at "+i+" index position");
			temp=temp+1;
			
		}
	}
	if(temp==0)
	{
		System.out.println("Element is not found");
	}
	
	
		
		
				
		
	}

}
