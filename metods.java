

public class metods {
    public static void main(String[] args) {
        String brand = "Samsung";
        System.out.println(brand.startsWith("S"));
        System.out.println(brand.endsWith("g"));

        char [] letters = {'A', 'A', 'B', 'V', 'D', 'D'};
        int count = countOccurences(letters, searchLetter: 'V');
        System.out.println(count);
         
    }
    
}
public static int countOccurences(char [] letters, char searchLetter){
        int count = 0;
     for (char letter : letters) {
        if (letter == searchLetter){
            count++;
        }
     }
     return count;
    }