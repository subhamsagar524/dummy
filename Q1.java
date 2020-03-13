package chapter7;

import java.util.ArrayList;
public class Q1
{
	public static void main(String[] arg)
	{
		ArrayList al=new ArrayList();
		al.add("subham");
		al.add("sagar");
		al.add("paira");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	}
}