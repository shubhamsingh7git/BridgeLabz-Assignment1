package BuiltIn_Functions.PS1;
import java.time.*;
import java.time.format.*;
public class Q3 {
    public static void main(String[] args){
        LocalDate today=LocalDate.now();
        DateTimeFormatter f1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter f2=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter f3=DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Format 1: "+today.format(f1));
        System.out.println("Format 2: "+today.format(f2));
        System.out.println("Format 3: "+today.format(f3));
    }
}
