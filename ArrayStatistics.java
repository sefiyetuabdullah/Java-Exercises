import java.util.*;
import java.lang.*;
import java.io.*;

class ArrayStatistics
{
	public static void main (String[] args) 
	{
    //user input the number of array values
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter number of array values: ");
    //number of array values saved as "value"
	  int value = input.nextInt();
		//initialize array
    int [] array = new int[value];
    //initialize the number,count and total
    int number = 0;
		int count = 0;
		double total = 0;
    //double variance;
		//number that will end the loop
    final int QUIT = 999;
    //Ask the user  to enter the first number or QUIT to quit
		System.out.print("Enter first number or " + QUIT + " to quit: ");
		number = input.nextInt();
    //unless the user enters QUIT, add the number into the respective spot in the array, then add the number to the total. 
		while(number !=QUIT)
		{
		  array[count] = number;
		  total += array[count];
		  ++count;
      //if the number of values entered equals the max number of values in the array, end the loop
		  if(count == value)
		  number = QUIT;
      //or ask for the next number
		  else
		  {
		    System.out.print("Enter next number or " + QUIT + " to quit: ");
		    number = input.nextInt();
		  }
		}
    //print the values that were entered into the array
		System.out.print("\nThe values entered were: ");
	  for(int x = 0; x< count; ++x)
		System.out.print(array[x] + " ");
 
    //print the total
    System.out.println("\nThe total is " + total);
 
    //call the method that computes the Mean
		computeMean(total, array, value);
    
    //call the method that computes the Median
    computeMedian(array);

    //call the method that computes the Mode
    mode(array);
    //call the method that computes the standard deviation and print it to 3 decimal places.
    System.out.print("\nThe standard deviation is ");
    System.out.printf("%.3f",(standardDeviation(array,value)));
	}

  //this method computes the mean, by adding each array value and dividing it by the length of the array.
  public static void computeMean(double total, int [] array, int value)
  {
    double mean;
    double sum = 0; 
    for (int i = 0; i < value; i++) 
    sum += array[i]; 
    mean = sum/value;
    System.out.print("\nThe mean is ");
    System.out.printf("%.3f",mean);
  }

  //this method computes the median of the array by sorting the array
  //if the number of values in the array is divisible by 2 with no remainder, the median will be the value in the middle of the array, plus the value to the right of it, all divided by two.
  //if the number of values in the array  is not divisible by two, the median will be in the middle of the array 
  public static void computeMedian(int [] array)
  {
    Arrays.sort(array);
    int median;
    if (array.length % 2 == 0)
    median = (array[array.length/2] + array[array.length/2 - 1])/2;
    else
    median = array[array.length/2];
    System.out.print("\nThe median is " + median);
  }
 
 //this method calculates the variance for the standard deviation. 
 //this method finds the mean of the array
 //then finds the square by taking the array values and subtracting the mean, then squaring the result.
 //the variance is the "Sval" divided by the length of the array
  public static double computeVariance(int [] array, int value) 
  { 
    double sum = 0;
    for (int i = 0; i < value; i++) 
    sum += array[i]; 
    double mean = sum /(double)value;
    double sval = 0; 
    for (int i = 0; i < value; i++)  
    sval += (array[i] - mean) * (array[i] - mean);  
    double variance = (double)sval / value; 
    return variance; 
  } 

 //this method calculates the standardDeviation by taking the square root of the variance.     
  public static double standardDeviation(int [] array, int value) 
  { 
    return Math.sqrt(computeVariance(array,value));
  }  

//this method calculates the mode. 
//it calculates the values that are the same and counts them. if the count is greater than 0, the max count is the number of similar values and the maxValue is the mode.
//if there are no similar values, print there is no mode.
  public static void mode(int [] array) 
  {
    int maxValue = 0, maxCount = 0;

    mode:
    for (int i = 0; i < array.length; ++i) {
        int count = 0;
       for (int j = 0; j < array.length; ++j) {
          if (array[j] == array[i])
            ++count;
         }
         if (count > maxCount) {
            maxCount = count;
            maxValue = array[i];
         }
         if (count == 0)
         {
           System.out.println("There is no mode");
           break mode;
         }
      }
      System.out.println("\nThe mode is " + maxValue);
  }
}
