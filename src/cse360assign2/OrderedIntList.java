package cse360assign2;

/**
 * Simple class for a sorted and dynamically resizing array of integers.
 * The list is sorted from least to greatest.
 * 
 * @author Kevin Fox | PIN 23
 */
public class OrderedIntList
{
	private boolean debugging = true;
	protected int[] intList;
	protected int listSize;

	/**
	 * Default constructor.
	 */
	OrderedIntList()
	{
		intList = new int[10];
	}

	/**
	 * Inserts an integer into the list. The list order is least to greatest.
	 * @param newInt Integer that will be inserted into the list. 
	 */
	public void insert(int newInt)
	{
		// DEBUG
		if (debugging)
		{
			System.out.println("@D public void insert(int newInt = " + newInt + ")");
		}
					
		// Grow the list if it has reached capacity
		if (listSize == intList.length)
			grow();
		
		if (listSize == 0)
		{
			// Empty list - insert at the beginning, incrementing size
			intList[0] = newInt;
			listSize++;
			
			// DEBUG
			if (debugging)
			{
				System.out.println("@D\t Added " + newInt + " at index 0");
			}
		}
		else
		{
			int insertAt = 0;
			
			// Find the index to insert at. The list is sorted from lowest to highest.
			while (newInt >= intList[insertAt] && insertAt < listSize)
			{
				// DEBUG
				if (debugging)
				{
					System.out.println("@D\t newInt = " + newInt +
										"\tintList[insertAt] = " + intList[insertAt] +
										"\tinsertAt++");
				}
				
				insertAt++;
			}
			
			// Move everything past insertAt to the right, starting from the end of the list.
			for (int index = listSize; index > insertAt; index--)
				intList[index] = intList[index - 1];
			
			// Insert at the new location, incrementing list size
			intList[insertAt] = newInt;
			listSize++;
			
			// DEBUG
			if (debugging)
			{
				System.out.println("@D\t Added " + newInt + " at index " + insertAt);
			}
		}
	}

	/**
	 * Grows the list to double the current size, allowing more entries to be added.
	 */
	protected void grow()
	{
		// DEBUG
		if (debugging)
		{
			System.out.println("@D protected void grow()");
		}
				
		// Create an empty list that is twice as big as the last
		int[] biggerList = new int[listSize * 2];
		
		// Copy over the old values
		for (int index = 0; index < listSize; index++)
			biggerList[index] = intList[index];
		
		// Reassign the old list to the new list
		intList = biggerList;
		
		// DEBUG
		if (debugging)
		{
			System.out.println("@D\t List grew to " + intList.length + " indexes");
		}
	}

	/**
	 * Print the contents of the list to System.out in the following format:<br>
	 * <br>
	 * #	#	#	#	#<br>
	 * #	#	#	#	#<br>
	 * #	#	#	#	#<br>
	 * ...
	 */
	public void print()
	{
		// Print the contents of the int list, five values per line
		for (int index = 0; index < listSize; index++)
		{
			// Add the newline for each new row
			if (index % 5 == 0)
				System.out.println();
			
			// Print the numbers with indents afterwards
			System.out.print(intList[index] + "\t");
		}
		
		// Leave a blank space when the full table is printed
		System.out.println();
	}
}