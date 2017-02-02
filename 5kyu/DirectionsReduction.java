public class DirectionsReduction {
    public static String[] dirReduc(String[] arr) {
        // Your code here.
        for (int i = 0; i < arr.length-1; i++)
        {
          System.out.println(i + arr[i] + arr[i+1]);
          if (arr[i].length() == arr[i+1].length() && arr[i].equals(arr[i+1]) == false)
          {
            arr[i] = "";
            arr[i+1] = "";
            arr = cleanArray(arr);
            i = -1;
          }
        }
        return arr;
    }

    public static String[] cleanArray(String[] originalArr)
    {
        int count = 0;
        for (int i = 0; i < originalArr.length; i++)
        {
          if (originalArr[i].length() != 0)
          {
            count++;
          }
        }

        String[] newArr = new String[count];
        count = 0;
        for (int i = 0; i < originalArr.length; i++)
        {
          if (originalArr[i].length() != 0)
          {
            newArr[count] = originalArr[i];
            count++;
          }
        }
        return newArr;
    }
}
