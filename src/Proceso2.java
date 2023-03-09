public class Proceso2 implements Runnable{
    @Override
    public void run() {
        int i;
        for(i=0;i<=5;i++) {
            System.out.println("proceso 2");
        }
    }
}
