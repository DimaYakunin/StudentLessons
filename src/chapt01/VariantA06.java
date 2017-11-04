package chapt01;

import java.util.Calendar;

/*
Создать приложение, выводящее фамилию разработчика, дату и время получения задания,
а также дату и время сдачи задания. Для получения последней даты
и времени использовать класс Calendar из пакета java.util.
 */
public class VariantA06 {
    public static void main(String[] args) {
        Calendar calendar;
        calendar = Calendar.getInstance();
        System.out.println("Время получения задания: " + calendar.getTime());
        String firstName = "Dima", lastName = "Yakunin";
        System.out.println("Имя: " + firstName + "\n" + "Фамилия: " + lastName);
        System.out.println("Время сдачи задания: " + calendar.getTime());

    }
}

