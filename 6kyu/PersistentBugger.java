class PersistentBugger {
	public static int persistence(long n) {


    String numberString = Long.toString(n);

    if (numberString.length() == 1)
    {
    	return 0;
    }

    int totalMultiply = 0;

    while(numberString.length() > 1)
    {
      System.out.println(numberString);
      int sumOfNumbers = 0;

      byte[] numberArray = new byte[19];

      for(int x = 0; x < numberString.length(); x++)
      {
        numberArray[x] = (byte)Character.getNumericValue(numberString.charAt(x));
      }

      sumOfNumbers = (int)numberArray[0];

      for(int i = 1; i < numberString.length(); i++)
      {
        sumOfNumbers = sumOfNumbers * (int)numberArray[i];
      } // 999.

      totalMultiply += 1;

      numberString = Integer.toString(sumOfNumbers);

    }

    return totalMultiply;
	}
}
