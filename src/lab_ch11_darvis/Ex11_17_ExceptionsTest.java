package lab_ch11_darvis;

import javax.swing.*;
import java.io.IOException;

public class Ex11_17_ExceptionsTest {
    public static void main(String[] args) {
        try {
            throw new ExceptionA("Exception A");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        try {
            throw new ExceptionB("Exception B");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        try {
            throw new NullPointerException();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }

        try {
            throw new IOException();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }

    }
}
