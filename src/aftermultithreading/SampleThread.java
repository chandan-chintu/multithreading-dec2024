package aftermultithreading;

public class SampleThread extends Thread{

    SampleThread(){
        start(); // start running the thread
    }

    @Override
    public void run() {
        try{
            System.out.println("thread2 printing numbers in descending order");
            for (int j=10;j>=1;j--){
                System.out.println("j value for thread2 is : "+j);
                Thread.sleep(500); // 0.5 seconds thread will go for sleep state
            }
        } catch (Exception e){
            System.out.println("exception occured : "+e.getMessage());
        }
    }
}
