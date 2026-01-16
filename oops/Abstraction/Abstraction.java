// can be achieved by 
//    Abstract classes 
//    Interfaces


abstract class Vehicle{
     abstract void start();
     void fuel(){
         System.out.println("fuel is needed");
     }
}

class Car extends Vehicle{
     @Override
     void start(){
         System.out.println("Car starts");
     }

     public static void main(String[] args){
          Car car = new Car();
          car.fuel();
          car.start();
     }
}
