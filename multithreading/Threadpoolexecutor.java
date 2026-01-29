import java.util.concurrent.*;
class Threadpoolexecutor{
     public static void main(String[] args){
         ThreadPoolExecutor ex = new ThreadPoolExecutor(5,10,2,TimeUnit.SECONDS,new LinkedBlockingQueue<>());
         Callable<Integer> task = ()->{
            Thread.sleep(2000);
            return 20;  
         };
         Future<Integer> f1 = ex.submit(task);
         Future<Integer> f2 = ex.submit(task);
         Future<Integer> f3 = ex.submit(task);
         Future<Integer> f4 = ex.submit(task);
         Future<Integer> f5 = ex.submit(task);
         Future<Integer> f6 = ex.submit(task);
         try{
         System.out.println(Thread.currentThread().getId()+" "+f1.get());
         System.out.println(Thread.currentThread().getId()+" "+f2.get());
         System.out.println(Thread.currentThread().getId()+" "+f3.get());
         System.out.println(Thread.currentThread().getId()+" "+f4.get());
         System.out.println(Thread.currentThread().getId()+" "+f5.get());
         System.out.println(Thread.currentThread().getId()+" "+f6.get());
         }
         catch(Exception e){
            // e.printStackTrace(); 
            System.out.println(e.getCause());
         }
         finally{
            ex.shutdown();
         }
     }
}