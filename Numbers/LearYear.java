
//  Check if given year is leap year
import java.util.*;

public class LearYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int year = sc.nextInt();
            boolean res = checkLeapYear(year);
            if (res) {
                System.out.println(year + " --> YES a leap year");
            } else {
                System.out.println(year + " --> NOT a leap year ");
            }
        }
    }

    private static boolean checkLeapYear(int n) {
        if (n % 400 == 0 || n % 100 != 0 && n % 4 == 0) {
            return true;
        }

        return false;
    }

}
