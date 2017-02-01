public class PlayingWithDigits {

	public static long digPow(int n, int p) {
		// your code
    String digits = Integer.toString(n);
    double sum = (double) 0.00;
    System.out.println(n + " " + p + " " + digits);
    for (int i = 0; i < digits.length(); i++)
    {
      if (i < digits.length()-1)
        sum += Math.pow(Integer.parseInt(digits.substring(i, i+1)), p + i);
      else
        sum += Math.pow(Integer.parseInt(digits.substring(i)), p + i);
      System.out.println(sum);
    }
    if (sum % n == 0)
    {
      return (long) sum / n;
    }
    else
      return -1;
	}

}
