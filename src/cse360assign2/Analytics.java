package cse360assign2;

/**
 * Extension of the OrderedIntList that provides analytical methods.
 * 
 * @author Kevin Fox | PIN 23
 */
public class Analytics extends OrderedIntList {
	/**
	 * Calculates the mean of the integer list.
	 * @return mean Double
	 */
	public double mean()
	{
		if (listSize == 0) return -1;
		
		// Calculate mean
		double mean = 0;
		
		for (int index = 0; index < listSize; index++)
		{
			mean += intList[index];
		}
		
		return mean / listSize;
	}
	
	/**
	 * Calculates the median of the integer list.
	 * @return median Integer
	 */
	public int median()
	{
		if (listSize == 0) return -1;
		
		// Calculate the median
		int median;
		
		if (listSize % 2 == 0)
		{
			// Even - average of two
			int index = (listSize / 2);
			median = (intList[index - 1] + intList[index]) / 2;
		} else {
			// Odd - single value
			int index = (listSize / 2);
			median = intList[index];
		}
		
		return median;
	}
	
	/**
	 * Gets the highest value in the integer list.
	 * @return highest Integer
	 */
	public int high()
	{
		if (listSize == 0) return -1;
		
		// Get the highest value
		int highest = Integer.MIN_VALUE;
		
		for (int index = 0; index < listSize; index++)
		{
			if (intList[index] > highest)
				highest = intList[index];
		}
		
		return highest;
	}
	
	/**
	 * Gets the lowest value in the integer list.
	 * @return lowest Integer
	 */
	public int low()
	{
		if (listSize == 0) return -1;
		
		// Get the lowest value
		int lowest = Integer.MAX_VALUE;
		
		for (int index = 0; index < listSize; index++)
		{
			if (intList[index] < lowest)
				lowest = intList[index];
		}
		
		return lowest;
	}
	
	/**
	 * Returns the number of integers in the list.
	 * @return listSize Integer
	 */
	public int numInts()
	{
		return listSize;
	}
}
