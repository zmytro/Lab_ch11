package lab_ch11_darvis;

public class Ex11_16_ExceptionsTest {
    public static void main(String[] args) {
        try {
            throw new ExceptionB("Exception B");
        } catch (ExceptionA e) {
            System.out.println(e.getMessage());
        }

        try {
            throw new ExceptionC("Exception C");
        } catch (ExceptionA e) {
            System.out.println(e.getMessage());
        }
    }
}
