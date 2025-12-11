import java.time.LocalDate;

public class passport {
    public static void main(String[] args) {
        my_passport xaynnsPassport = new my_passport("0987", "Nigeria",LocalDate.of(2027, 1, 7));
        my_passport innisPassport = new my_passport("0564", "Nigeria",LocalDate.of(2027, 1, 7));
    }
    static class my_passport{
        String number;
        String country;
        LocalDate expiryDate;
        
        my_passport(String number, String country, LocalDate expiryDate){
            this.number = number;
            this.country = country;
            this.expiryDate = expiryDate;
        }
    }
}
