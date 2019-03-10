import java.io.*;
importjava.util.Scanner;
importjava.lang.Math;
public class first{
	public static void main(String args[])
	{
	Scanner in=new Scanner(System.in);
	System.out.println("enter the cartesian point");
	intx,y,dist,r,t;
	x=in.nextInt();
	y=in.nextInt();
r=in.nextInt();
t= in.nextInt();
	dist=Math.abs(r-x)+Math.abs(t-y);
	System.out.println("the distance is "+dist);
		System.out.println("the end");
	}
}
