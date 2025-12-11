import java.util.Arrays;

public class arrays {
    public static void main(String[] args){
        //Arrays
        int [] numbers = new int [7];
        System.out.println(Arrays.toString(numbers));
        numbers[0] = 0;
        numbers[2] = 2;
        numbers[3] = 3;
        numbers[4] = 4;
        numbers[5] = 5;
        numbers[6] = 6;
        numbers[1] = 1;
        System.out.println(Arrays.toString(numbers));
        boolean [] names = {true, false, true};
        System.out.println(Arrays.toString(names));
        String [] me = {"Zainab","Xaynn", "Inikpi","Abdulazeez", "Abubakar"};
       
        System.out.println(me);
        System.out.println(Arrays.toString(me));
        for (int i = numbers.length - 1; i >= 0; i--){
            System.out.println(numbers[i]);
        }
         for(String my_name : me){
            if(my_name.startsWith("A")){
                continue;
            }
            System.out.println(my_name);
        }
        for(int number : numbers){
            System.out.println(number);
        }
       // for (int index = 0; index < inner_expression(array).length; index++) {
            
        //}
       // for (int numbers2 : numbers) {
            
       // }
        Arrays.stream(numbers).forEach(System.out::println);
} 
}