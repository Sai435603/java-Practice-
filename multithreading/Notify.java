class Notify{
    private boolean hasJob = false;
    synchronized void waitThread(){
         try{   
            while(!hasJob){ // waits till there is no job
            System.out.println("Thread started "+Thread.currentThread().getName() + " waiting for the lock...");
                wait();
            }
            System.out.println("Thread Ended "+Thread.currentThread().getName() + "...");
         }
         catch(Exception e){
             System.out.println("Error from WaitThread");
         }
    }     
    void releaseAll(){
        try{
            System.out.println("Waking up all the threades after 3 second...");
            Thread.sleep(3000);
            synchronized(this){
                hasJob = true;
                notifyAll();
            }
        }
        catch(Exception e){
             System.out.println("Error from releaseAll");
        }
    }
    void releaseOne(){
        try{
            System.out.println("Waking one threades after 3 second...");
            Thread.sleep(3000);
            synchronized(this){
                hasJob = true;
                notify();
            }
        }
        catch(Exception e){
             System.out.println("Error from releaseOne");
        }
    }
    
}

class Main{
     public static void main(String[] args){
         Notify notify = new Notify();
        //  Thread thread1 = new Thread(()->{
        //      notify.releaseAll();
        //  });
         
         Thread thread3 = new Thread(()->{
             notify.waitThread();
         });
         Thread thread4 = new Thread(()->{
             notify.waitThread();
         });
         Thread thread5 = new Thread(()->{
             notify.waitThread();
         });
        //  thread1.start();
        try{
         thread3.start();
         thread4.start();
         thread5.start();
         
         for(int i=0;i<3;i++){
             Thread thread2 = new Thread(()->{
                notify.releaseOne();
             });   
             thread2.start(); 
             Thread.sleep(2000);
         }
         
         Thread.sleep(4000);
         System.out.println("Completed and released all...");
        }
        catch(Exception e){
             System.out.println("Error");
        }
     }
}