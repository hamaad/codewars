public class DeodorantEvaporator { 

	public static int evaporator(double content, double evap_per_day, double threshold) {
    // your code
    double targetContent = threshold/100.00 * content;
    System.out.println("Content " + content + " evap_per_day " + evap_per_day + " threshold: " + threshold + "\nTarget Content: " + targetContent);
    int days = 0;
    while (targetContent < content)
    {
      content = content - (content * evap_per_day/100);
      days++;
      System.out.println("New Content Value: " + content + " days: " + days);
    }
		return days;
	}
}
