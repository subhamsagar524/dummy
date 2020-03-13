package chapter7;

import java.util.ArrayList;
public class Q2
{
	public static void main(String[] arg)
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		int sum=0;
		for(int i=0;i<al.size();i++)
		{
			String s=al.get(i).toString();
			sum=sum+Integer.parseInt(s);
		}
		System.out.println("sum="+sum);
	}
}