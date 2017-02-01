public class CompareStringsBySumOfChars
{
  public static Boolean compare(String s1, String s2)
  {

    if (s1 == null || s2 == null)
      return true;
    else if (s1.length() == 0 || s2.length() == 0)
      return true;

    int sum1 = 0, sum2 = 0;
    s1 = s1.toUpperCase();
    s2 = s2.toUpperCase();

    for (int i = 0; i < s1.length(); i++)
    {
      sum1 += ((int) s1.charAt(i));
      if ((int) s1.charAt(i) < 65 || (int) s1.charAt(i) > 122)
        return true;
    }
    for (int i = 0; i < s2.length(); i++)
    {
       sum2 += ((int) s2.charAt(i));
       if ((int) s2.charAt(i) < 65 || (int) s2.charAt(i) > 122)
         return true;
    }
    return (sum1 == sum2) ? true : false;
  }
}
