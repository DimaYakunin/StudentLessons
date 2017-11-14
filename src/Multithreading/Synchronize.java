package Multithreading;

public class Synchronize {
    public static void main(String[] args) throws Exception {
        Resourse resourse = new Resourse();
        resourse.setI(5);
        MyThread1 myThread1 = new MyThread1();
        MyThread1 myThread2 = new MyThread1();
        myThread1.setResours(resourse);
        myThread2.setResours(resourse);
        myThread1.start();
        myThread2.start();
        myThread1.join();
        myThread2.join();
        System.out.println(resourse.getI());


    }
}

class MyThread1 extends Thread{
    Resourse resourse;

    public void setResours(Resourse resours) {
        this.resourse = resours;
    }

    @Override
    public void run(){
        resourse.changeI();
    }
}

class Resourse{
    private int i;
        /*
        когда в двух и более потоках используеться один и тот же обьект
        его желаельно синхронизировать
         */
    public synchronized void changeI(){
        int i = this.i;
        i++;
        this.i = i;
    }

    public int getI() {

        return i;
    }

    public synchronized void setI(int i) {
        this.i = i;
    }



}