
// 1. Print() 
// 2. Submit()
class Printer{
     private boolean hasJob = false;
     synchronized void print(){
        try{
            System.out.println("Printer is waiteng for the job...");
            while(!hasJob){ // if there is no job printer should wait for the job
                wait();
            }
            System.out.println("Document is printed :)");
            isPrinterWaiting = false;
        }
        catch(Exception e){
             Thread.currentThread().interrupt();
        }
     }     

    void submit(){
        try{
            System.out.println("Document Submission Scheduled...");
            Thread.sleep(2000);
            synchronized(this){
                hasJob = true;
                System.out.println("Document is submitted...");
                notify();
            }
        }
        catch(Exception e){
             Thread.currentThread().interrupt();
        }
     }
}

class Main{
     public static void main(String[] args){
         Printer printer = new Printer();
         Thread thread1 = new Thread(()->{
             printer.submit();
         });
         // implementing the run method from runnable interface //functional interface (interface with single function)
         Thread thread2 = new Thread(()->{
             printer.print();
         });
         thread1.start();
         thread2.start(); 
     }
}