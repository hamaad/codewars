public class TortoiseRacing {
    public static int[] race(int v1, int v2, int g) {
        // your code
        if (v1 >= v2)
          return null;

        int diff = v2 - v1;
        double total = ((double)g / diff) * 3600;
        System.out.println(total);
        int seconds = (int)Math.abs(total);
        int mod = seconds % 60;
        int[] hourMinSec = {0, 0, 0};
        if (mod != seconds)
        {
          hourMinSec[2] = mod;
          seconds -= mod;
          seconds = seconds / 60;
          mod = seconds % 60;
          hourMinSec[1] = mod;
          seconds -= mod;
          seconds = seconds / 60;
          hourMinSec[0] = seconds;
        }
        else
          hourMinSec[2] = mod;

        System.out.println(hourMinSec[0] + " " + hourMinSec[1] + " " + hourMinSec[2]);

        return hourMinSec;

    }
}
