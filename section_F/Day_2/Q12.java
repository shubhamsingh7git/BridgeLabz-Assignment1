package section_F.Day_2;
class User {
   
    final int userId;

   
    public User(int userId) {
        this.userId = userId;
    }

    
    public void display() {
        System.out.println("User ID: " + userId);
    }
}

public class Q12 {
    public static void main(String[] args) {
        User u1 = new User(101);
        User u2 = new User(202);

        u1.display();
        u2.display();
    }
}
