public class BeginnerSeriesSumOfNumbers
{
   public int GetSum(int a, int b)
   {
    //Good luck!
    if (a == b)
      return a;
    if (a > b)
    {
      int temp = a;
      a = b;
      b = temp;
    }
    int sum = 0;
    for (int i = a; i <= b; i++)
    {
      sum += i;
    }
    return sum;
   }
}
