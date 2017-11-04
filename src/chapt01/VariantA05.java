package chapt01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Создать программу ввода целых чисел как аргументов командной стро-ки, подсчета их суммы и вывода результата на консоль.
 */
public class VariantA05 {
    public static void main(String[] args) throws IOException {

        int summ = 0;
        while(true){
            String str = new BufferedReader(new InputStreamReader(System.in)).readLine();
            if (str.equals("exit")){
                break;
            }
            int num = Integer.parseInt(str);
            summ =+ num;
        }
        System.out.println("Сумма = " + summ);
    }
}
