public class KeypadTextEntry {
  public static int presses(String phrase) {
    phrase = phrase.toUpperCase();
    int totalPresses = 0;
    String[] keypad = { "1", "ABC2", "DEF3", "GHI4", "JKL5", "MNO6", "PQRS7", "TUV8", "WXYZ9", "*", " 0", "#"};
    System.out.println(phrase);

    for (int i = 0; i < phrase.length(); i++)
    {
      for (int x = 0; x < keypad.length; x++)
      {
        for (int y = 0; y < keypad[x].length(); y++)
        {
          if ((int)phrase.charAt(i) == (int)keypad[x].charAt(y))
          {
            totalPresses += (y+1);
            System.out.println(phrase.charAt(i) + " takes " + (y+1) + " keypresses.");
          }
        }
      }
    }
    return totalPresses;
  }
}
