package Coding_Ninja;
//https://www.codingninjas.com/studio/problems/switch-case-statement_8357244?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class Switch_Case_statement {
    public static void main(String[] args) {

    }
    public static double areaSwitchCase(int ch, double []a) {
        double ans = 0;
        switch(ch)
        {
            case 1 ->{
                ans = Math.PI*Math.pow(a[0], 2);
            }
            case 2 ->{
                ans = a[0]*a[1];
            }
        }
        return ans;
    }
}
