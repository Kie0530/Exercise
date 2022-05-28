package Main.Java;

public class ThreadPractice {
    public static void main(String[] args) {
        ThreadPracticeee thread1 = new ThreadPracticeee();
        Runnable r = new ThreadPracticee();
        Thread thread2 = new Thread(r);
        thread1.start();
        thread2.start();
    }
}
class ThreadPracticeee extends Thread {
    @Override
    public void run() {
        for(int i =0; i<10;i++){
            System.out.println(getName()); // getName() = 쓰레드의 이름 반환
        }
    }
}
class ThreadPracticee implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i<5; i++){
            System.out.println(Thread.currentThread().getName()); // Thread.currentThread() = 현재 실행중인 쓰레드의 참조를 반환
        }
    }
}