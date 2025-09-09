package Constructor.Level1;

public class Q2 {
    double radius;

    Q2() {
        this(1.0); 
    }

    Q2(double radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println("Circle radius: " + radius);
        System.out.println("Area: " + (Math.PI * radius * radius));
        System.out.println("Circumference: " + (2 * Math.PI * radius));
    }

    public static void main(String[] args) {
        Q2 c1 = new Q2();      
        c1.display();

        System.out.println();

        Q2 c2 = new Q2(5.5);  
        c2.display();
    }
}
