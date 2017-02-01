public class AveragesOfNumbers
{
  public static double[] averages(int[] numbers)
  {
    if (numbers == null || numbers.length < 2)
    {
      return new double[0];
    }
    double[] averages = new double[numbers.length-1];

    for (int i = 0; i < numbers.length; i++)
    {
      if (i < numbers.length-1)
      {
        averages[i] = (double)(numbers[i] + numbers[i+1]) / (double)2;
      }
    }
    return averages;
  }
}
