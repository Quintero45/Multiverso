public class Proceso1 extends Thread{
    @Override
    public void run(){
        int i;
        for(i=0;i<=5;i++) {
            System.out.println("proceso 1");
        }
    }
}
