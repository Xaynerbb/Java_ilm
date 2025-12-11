import java.util.Date;
import java.time.LocalDate;



public class newDate {
    public static void main (String args[]){
        Date my_Date = new Date();
        LocalDate myLocalDate = LocalDate.now();
        java.sql.Date sqlDate = new java.sql.Date(1);
        System.out.println(my_Date);
        System.out.println(myLocalDate);
        System.out.println(sqlDate);
    }
}
