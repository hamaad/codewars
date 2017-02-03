public class TwoToOne {

    public static String longest (String s1, String s2) {
        // your code
        String unique = "";
        for (int i = 0; i < s1.length(); i++)
        {
          if (unique.indexOf(s1.charAt(i)) == -1)
          {
            unique += Character.toString(s1.charAt(i));
          }
        }
        for (int i = 0; i < s2.length(); i++)
        {
          if (unique.indexOf(s2.charAt(i)) == -1)
          {
            unique += Character.toString(s2.charAt(i));
          }
        }

        char[] uniqueArray = unique.toCharArray();
        char temp = 'a';

        for (int i = 0; i < uniqueArray.length; i++) // yay bubble sort
        {
          for (int j = i+1; j < uniqueArray.length; j++)
          {
            if (uniqueArray[i] > uniqueArray[j])
            {
              temp = uniqueArray[i];
              uniqueArray[i] = uniqueArray[j];
              uniqueArray[j] = temp;
            }
          }
        }
        unique = String.valueOf(uniqueArray);
        return unique;
    }
}
