package sample;

import java.util.Scanner;

public class LongestPalindrome {
	public static String palindromic(String str) {
		int n=str.length();
		int j;
		String maxLen="";
		String subs="";
		String subrev="";
		for(int i=0;i<n;i++) {
			j=n-1;
			
			while(i<j) {
				if(str.charAt(i) ==str.charAt(j) && maxLen.length()<(j-i+1)) {
					subs=str.substring(i, j+1);
					subrev=new StringBuilder(subs).reverse().toString();
					if(subs.equals(subrev)) {
						maxLen=subs;
					}
				}
				j--;
				
			}
			
			
		}
		if(maxLen.length()==0) {
			maxLen=str.substring(0,1);
			return maxLen;
		}
		return maxLen;
	}

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		String str=Sc.next();
		String val=palindromic(str);
		System.out.println(val);
	}

}


