package assignment;

public class findMinMax 
{

	class pair
	{
		int min ;
		int max;
	}
	
	
	public int[] FindMinMax(int arr[] )
	{
		
		pair minmax=new pair();
		int i;
		
		int []a=new int [2];
		
		 if (arr[0] > arr[1])
		 {
	            minmax.max = arr[0];
	            minmax.min = arr[1];
	     } 
		 else 
		 {
	            minmax.max = arr[1];
	            minmax.min = arr[0];
	     }
	 
	        for (i = 2; i < arr.length; i++) 
	        {
	            if (arr[i] > minmax.max)
	            {
	                minmax.max = arr[i];
	            }
	            else if (arr[i] < minmax.min) 
	            {
	                minmax.min = arr[i];
	            }
	        }	
	        a[0]=minmax.min;
	        a[1]=minmax.max;
	        
	        return a;
		
	}


	
	

}
