package lab_ch11_darvis;

public class Ex11_21_ExceptionsUsingOuterScopes {
    public static void main(String[] args) {
        try {
            Math("53");
            Math("-");
            Math("0");
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException:main");
        }
    }

    public static void Math(String num) {
        try {
            int number = Integer.parseInt(num);

            System.out.println(100 / number);
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException:Math");
        }
    }

}
