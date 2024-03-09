package Coding_Ninja;

//https://www.codingninjas.com/studio/problems/find-character-case_58513?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
import java.util.Scanner;

public class Find_Character_Case {
      public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
        if(ch >= 'a' && ch <= 'z')
        {
            System.out.println(0);
        }
        else if(ch >= 'A' && ch <= 'Z')
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(-1);
        }
    }
}
