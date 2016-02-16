public class Main 
{
	public static void main(String[] args)
	{
		int[] Array1 = {1,2,1};
		int[] Array2 = {4,5,8};
		
		try 
		{
			SumofArrays(Array1, Array2);
		}
		catch (ArraySizeException ex)
		{
			System.out.println("Het is alleen mogelijk arrays op te tellen met hetzelfde formaat!");
		}		
	}
	
	public static String SumofArrays(int[] array1, int[]array2) throws ArraySizeException
	{
		int [] arrayA = array1;
		int [] arrayB = array2;
		int[] arrayTotal = {0,0,0};
		String total = "";
		
		if (arrayA.length == arrayB.length)
		{			
				for(int i = 0; i <arrayA.length; i++)
				{		
					arrayTotal [i] = arrayA[i] + arrayB[i];			
					//int waarde = arrayTotal[i];		
				}			
		}
		else
		{
			throw new ArraySizeException();
		}
		
		for(int i = 0; i <arrayTotal.length; i++)
		{
			total += Integer.toString(arrayTotal[i]) + ", ";
		}
		System.out.println(total);
		return total;		
	}
}
