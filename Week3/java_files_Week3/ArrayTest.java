public class ArrayTest
{

	public static void main(String[] args)
	{
		String[] array = new String[3];
		
		array[0] = "apple";
		array[1] = "banana";
		array[2] = "pear";
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i].charAt(0));
		}
		
		int[] numbers = new int[30];
		
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = i;
		}
		
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i]++;
		}
		
		
		for(int i = 0; i < numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}
		
		int sum = 0;
		for(int i = 0; i < numbers.length; i++)
		{
			sum = sum + numbers[i];
		}
		System.out.println("The sum is " + sum);
		
	
	}
	
}
