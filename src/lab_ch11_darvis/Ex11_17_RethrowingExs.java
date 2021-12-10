package lab_ch11_darvis;

public class Ex11_17_RethrowingExs {
    public static void main(String[] args) {

        try {
            someMethodWithException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void someMethodWithException() throws Exception {
        try {
            someMethod2WithException();
        } catch (Exception e) {
            throw new Exception("Исключение в methodWithException");
        }
    }

    public static void someMethod2WithException() throws Exception {
        throw new Exception("Исключение в method2WithException");
    }
}
