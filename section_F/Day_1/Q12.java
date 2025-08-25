package section_F.Day_1;
class Attempt {
    static int count = 0; 
    
    void setCount(int value) {
        count = value;
    }

    void showCount() {
        System.out.println("Count = " + count);
    }
}

public class Q12 {
    public static void main(String[] args) {
        Attempt obj1 = new Attempt();
        Attempt obj2 = new Attempt();

        obj1.showCount(); 
        obj1.setCount(10);
        obj2.showCount();
        obj2.setCount(25); 
        obj1.showCount();
    }
}