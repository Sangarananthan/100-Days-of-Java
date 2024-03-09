package Coding_Ninja;
//https://www.codingninjas.com/studio/problems/data-type_8357232?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
public class Data_Type {
    public static void main(String[] args) {

    }
    public static int dataTypes(String type) {
        switch (type) {
            case "Integer" -> {
                return 4;
            }
            case "Long" -> {
                return 8;
            }
            case "Float" -> {
                return 4;
            }
            case "Double" -> {
                return 8;
            }
            case "Character" -> {
                return 1;
            }
            default -> {
                return -1; // Handle the case when the input type is not recognized
            }
        }
    }
}
