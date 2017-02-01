public class CountingSheep {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    // TODO May the force be with you
    int total = 0;
    if (arrayOfSheeps == null)
      return 0;
    if (arrayOfSheeps.length == 0)
      return 0;
    for (int i = 0; i < arrayOfSheeps.length; i++)
    {
      if (arrayOfSheeps[i] == null)
        total += 0;
      else if (arrayOfSheeps[i] == true)
        total += 1;
    }
    return total;
  }
}
