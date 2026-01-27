
// 1. Print() 
// 2. Submit()
class Printer{
     private boolean hasJob = false;
     private boolean isPrinterWaiting = false;
     synchronized void print(){
        try{
            System.out.println("Printer is waiteng for the job...");
            isPrinterWaiting = true;
            notify();
            while(!hasJob){
                wait();
            }
            System.out.println("Document is printed :)");
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
                System.out.println("Document is submitted...");
                hasJob = true;
                while(!isPrinterWaiting){ // printer is not waiting 
                    wait();
                }
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

         Thread thread2 = new Thread(()->{
             printer.print();
         });
         thread1.start();
         thread2.start(); 
     }
}