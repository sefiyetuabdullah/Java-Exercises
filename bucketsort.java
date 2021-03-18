public class Main
{
	
	// Main function
	public static void main (String[] args) {
		// Create an array named data with 20 integer numbers. 
		// The numbers should be within the range between 0 and 19.
    int[] data = {1, 4, 7, 4, 5, 9, 10, 15, 19, 11, 3, 12, 17, 3, 5, 6, 12, 14, 2, 3};
   
		// Use sortData method to sort the given data array in descending order
    sortData(data);

		
	} // end of main()

  public static void sortData (int[]data)
  {
    //new bucket array for sorting
    int [] Buckets = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19}; 
    //initialize new count array for the number of values in each bucket
    int[]count = new int[20];

    for (int i=0; i<data.length; i++)
    {
      //if value in data array is the same as the position in the array buckets. 
      if (data[i] == Buckets[data[i]])
      {
      //if the number of values in the bucket is less than one, add one.
      if(count[data[i]] < 1)
      {
        count[data[i]] = 1;
      }
      else
      //if the number of values in the bucket is more than one, add one to the existing number.   
      count[data[i]] = count[data[i]]+1;
      }
    }

    //As long as there are values in a given bucket, print the index of the count array, as many times as the number of values in the bucket.
    for(int i=0; i<count.length;i++)
    {
    if (count[i]>0)
    {
    for(int j=0;j<count[i];j++)
    System.out.println(i);
    }
    }
  }//end of sortData

}// end of BucketSort class
