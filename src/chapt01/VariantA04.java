package chapt01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Создать приложение для ввода пароля из командной строки и сравне-ния его со строкой-образцом.
 */
public class VariantA04 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter password:");
        String password = new BufferedReader(new InputStreamReader(System.in)).readLine();

        if (password.equals("password")){
            System.out.println("Correct password");
        }else {
            System.out.println("The password is incorect");
        }
    }
}
