//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
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