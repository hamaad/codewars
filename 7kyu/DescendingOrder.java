public class DescendingOrder {
  public static int sortDesc(final int num) {
    //Your code
    int finalNumber;
    String numberString = Integer.toString(num);
    char[] numberArray = numberString.toCharArray();

    char temp = 'a';
    // bubble sort again, could use array sort alternatively
    for (int i = 0; i < numberArray.length; i++)
    {
      for (int j = i+1; j < numberArray.length; j++)
      {
        if (numberArray[i] < numberArray[j])
        {
          temp = numberArray[i];
          numberArray[i] = numberArray[j];
          numberArray[j] = temp;
        }
      }
    }

    numberString = String.valueOf(numberArray);
    finalNumber = Integer.parseInt(numberString);
    return finalNumber;

  }
}
