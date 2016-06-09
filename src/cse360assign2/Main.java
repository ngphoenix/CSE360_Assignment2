package cse360assign2;

import java.util.Random;

public class Main
{
	public static void main(String[] args)
	{
		OrderedIntList list = new OrderedIntList();
		Random rng = new Random();
		
		for (int i = 0; i < 5; i++)
		{
			int rint = rng.nextInt(10);
			list.insert(rint);
		}
		
		list.print();
	}
}
