package Coding_Ninja;
//https://www.codingninjas.com/studio/problems/sum-of-even-odd_624650?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
import java.util.Scanner;

public class Sum_of_even_odd {
    public static void main(String[] args) {
        int even_sum = 0;
        int odd_sum = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        while (n > 0) {
            int digit = n % 10;
            if ((digit & 1) == 1) // Checking if the digit is odd
                odd_sum += digit;
            else
                even_sum += digit;
            n /= 10;
        }

        System.out.println(even_sum + "  " + odd_sum);
    }
}
