class Student{
     private String name;
     private int rollNumber;

     //Setter
     public void studentSetter(String name, int rollNumber){
         this.name = name;
         this.rollNumber = rollNumber;
     }

     //getter fro name
     public String getStudentName(){
         return this.name;
     }

     //getter for rollnumber
     int getStudentRollNumber(){
         return this.rollNumber;
     }

     public static void main(String[] args){
         Student  student = new Student();
         student.studentSetter("Sai", 93);
         System.out.println(student.getStudentName()+" "+student.getStudentRollNumber());
     }

}