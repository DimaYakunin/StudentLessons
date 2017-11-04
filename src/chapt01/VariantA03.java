package chapt01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Создать приложение, выводящее n строк с переходом и без перехода на новую строку.
 */
public class VariantA03 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите количество строк");
        int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Строка");
        }for (int i = 0; i < n; i++) {
            System.out.print("Строка");
        }
    }
}
