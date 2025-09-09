package Constructor.Level1;

public class Q3 {
    String name;
    int age;

    Q3() {
        this.name = "Unknown";
        this.age = 0;
    }

    Q3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Q3(Q3 other) {
        this.name = other.name;
        this.age = other.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Q3 p1 = new Q3("Shubham", 21);  
        Q3 p2 = new Q3(p1);           

        System.out.println("Original Person:");
        p1.display();

        System.out.println("Cloned Person:");
        p2.display();
    }
}
