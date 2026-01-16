interface PremiumUser {
    // empty
}
class User {
    String name;
}

class PaidUser extends User implements PremiumUser {

}

public class Test{
    public static void main(String[] args){

        User u1 = new User();
        User u2 = new PaidUser();

        checkAccess(u1);
        checkAccess(u2);
    }

    static void checkAccess(User user){
        if(user instanceof PremiumUser){
            System.out.println("Premium features unlocked");
        } 
        else{
            System.out.println("Normal access only");
        }
    }
}

