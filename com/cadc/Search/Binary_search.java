package com.cadc.Search;

public class Binary_search {

	public static void main(String[] args) {
		int a []= {2,4,6,8,10,12,14,18,20};
		int srch=12;
		int li=0;
		int hi=a.length-1;
		int mi=li+hi/2;
		while(li<=hi)
		{
			if(a[mi]==srch)
			{
				System.out.println("Element present at "+mi+" index position");
				break;
			}
			else if(a[mi]<srch)
			{
				li=mi+1;
			}
			else
			{
				hi=mi-1;
			}
			mi=(li+hi)/2;
		}
		if(li>hi)
		{
			System.out.println("Element not found");
		}

	}

}
