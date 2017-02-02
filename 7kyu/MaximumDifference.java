import java.util.Arrays;
public class MaximumDifference {

  public static int maxDiff(int[] lst) {
    if (lst == null || lst.length == 0)
      return 0;
    Arrays.sort(lst);
    return (lst[lst.length-1] - lst[0]);
  }
}
