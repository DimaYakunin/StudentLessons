package YouTubeLessons;

public class Exeption extends Throwable {
    public static void main(String[] args) {
        new Exeption().someMethod();
    }

    void someMethod() {
        try {
            System.out.println("try");
            Object o = null;
            o.hashCode();
            //throw new Exception();
        } catch (NullPointerException e) {
            System.out.println("catch");
            e.printStackTrace();
            /*
            можно отправить себе стак ошибок себе на почту
            и исправить баги программы и исправить их в следующей
            версии
             */

        }finally {
            System.out.println("finally");
        }
    }
}
