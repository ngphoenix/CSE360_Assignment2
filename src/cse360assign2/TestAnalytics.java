package cse360assign2;

import java.util.Random;

/**
 * Tests the validity of the Analytics class output
 * 
 * @author Kevin Fox | PIN 23
 */
public class TestAnalytics {
	public static void main(String[] args)
	{
		Analytics list = new Analytics();
		
		// Test median for both odd and even cases
		for (int index = 1; index <= 4; index++)
		{
			list.insert(index);
		}
		
		System.out.println("Median (1 2 3 4) = 2.5 = 2: " + (list.median() == 2));
		
		list.insert(5);
		
		System.out.println("Median (1 2 3 4 5) = 3: " + (list.median() == 3));
		
		// Test mean
		System.out.println("Mean (1 2 3 4 5) = 3: " + (list.mean() == 3));
		
		// Test for high and low
		System.out.println("High (1 2 3 4 5) = 5: " + (list.high() == 5));
		System.out.println("Low (1 2 3 4 5) = 1: " + (list.low() == 1));
		
		// Test for size
		System.out.println("Size (1 2 3 4 5) = 5: " + (list.numInts() == 5));
		
		// Test OrderedIntList for order
		Random random = new Random();
		
		for (int index = 0; index < 15; index++)
		{
			list.insert(random.nextInt(5) + 1);
		}
		
		System.out.println("Inspect the following for errors in order:");
		list.print();
	}
}
