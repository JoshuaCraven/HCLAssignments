package com.hcl.assignment2;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class fibonacci 
{
    public static void main( String[] args )
    {
        int k=0;
        int a=1;
        int b=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n =sc.nextInt();
        System.out.println("0 "+"\n"+ "1"+"\n"+"1" );
        while(k<=n) {
        	k=a+b;
        	if (k>=n) 
        		break;
        	System.out.println(k +" ");
        	a=b;
        	b=k;
        }
    }
}
