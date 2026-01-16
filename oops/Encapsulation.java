class Student {
    private int marks;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
    }
}

//immutable classes
final class User {
    private final String userName, password;
    User(String userName, String password){
         this.userName = userName;
         this.password = password;
    }
    public String getUserName(){
         return this.userName;
    }
    public String getPassword(){
         return this.password;
    }
    public static void main(String[] args){
         User user = new User("sai", "123");
         System.out.println(user.getUserName()+" "+user.getPassword());
    }
} 