
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Xayynn {
    public static void main(String[] args) {
        // System.out.println("Xaynerbb is a good gurlll");
        int number = 100;
        System.out.println(number);
        Date date = new Date();
        long theLong = 78_339_578_028_475L;
        System.out.println(theLong);
        LocalDate now = LocalDate.now();
        System.out.println(now.getMonth());
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        String name = new String("Amigoscode"); 
        System.out.println(name.toUpperCase());
        Person alex = new Person("alexander");
        Person xaynnn = alex;
        System.out.println("Before changing alex");
        System.out.println(alex.name + " " + xaynnn.name);
        xaynnn.name = "xaynnnerb";
        System.out.println("After changing alex");
        System.out.println(alex.name + " " + xaynnn.name);
        //InnerXayynn eight = new InnerXayynn("eighteen");
        InnerXayynn thusYear = new InnerXayynn("twenty-two", 19);
        // System.out.println(eight.age);
        System.out.println(thusYear.age);
        System.out.println(thusYear.year);
    }
    static class Person{
            String name;
            Person(String name){
                this.name = name;
            }
        }

    static class InnerXayynn {
            String age;
            int year;
            InnerXayynn(String age, int year){
                this.age = age;
                this.year = year;
            }
            
        }
}
