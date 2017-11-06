package YouTubeLessons;

public class Enum {
    enum CoffeSize {SMALL(100), MEDIUM(250), BIG(500){
        String CoffeClass(){
            return "A";
        }
    };
        String CofeeClass;
        int mililiters;
        CoffeSize(int mililiters){
            this.mililiters = mililiters;
        }
        int getMililiters(){
            return mililiters;
        }
        String getCofeeClas(){
            return CofeeClass;
        }
    }
    /*
    Можно определить в классе и за его пределами. Но нельзя определить enum  в методе
     */

    public static void main(String[] args) {
        CoffeSize coffeSize = CoffeSize.BIG;
        System.out.println("Размер кофе : " + coffeSize);
        System.out.println("Количество милилитров : " + coffeSize.getMililiters());
    }
}
