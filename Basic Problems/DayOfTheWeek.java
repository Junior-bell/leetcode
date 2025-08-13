import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;
public class DayOfTheWeek {
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the day month & year");

        int day=sc.nextInt(); int month=sc.nextInt();int year= sc.nextInt();
        
        LocalDate date= LocalDate.of(year,month,day);

        DayOfWeek dow=date.getDayOfWeek();

        System.out.println("The day of the week is "+dow);

        System.out.println(dow.getValue()%7);
        sc.close();



    }
}
