public class SumWithoutHighestAndLowestNumber
{
  public static int sum(int[] numbers)
  {
    if (numbers == null)
      return 0; // check for null array

    if (numbers.length < 2)
      return 0; // check for empty array


    int sum = 0, max = -999, min = 999;
    for (int i = 0; i < numbers.length; i++)
    {
      if (numbers[i] < min)
        min = numbers[i];
      if (numbers[i] > max)
        max = numbers[i];
      sum += numbers[i];
    }

    sum = sum - (max + min);


    return sum;
  }
}
