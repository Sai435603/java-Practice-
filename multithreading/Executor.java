import java.util.concurrent.*;
class Executo{
     public static void main(String[] args){
          ExecutorService executor =  Executors.newFixedThreadPool(5);
          Callable<Integer> task = ()->{
            Thread.sleep(2000);
            return 20;
          };
          Future<Integer> future = executor.submit(task);
          try{
          Integer result = future.get();
             System.out.println("Result: " + result);
          }
          catch(Exception e){
              System.out.println("Error");
          }
          finally{
              executor.shutdown();
          }
     }
}