package BuiltIn_Functions.PS1;
import java.time.*;
import java.util.*;
public class Q2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter date (yyyy-MM-dd): ");
        String input=sc.nextLine();
        LocalDate date=LocalDate.parse(input);

        LocalDate result=date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        System.out.println("Original Date: "+date);
        System.out.println("Modified Date: "+result);
        sc.close();
    }
}
