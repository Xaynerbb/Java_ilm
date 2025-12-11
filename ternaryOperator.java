public class ternaryOperator {
    public static void main(String[] args) {
        //Ternary Operator
        int age = 19;
        String message = age >= 18?
            "Yayyy.... I am an adult": "I am not an adult yet..";
        System.out.println(message);    


        String gender  =  "Male";
        switch (gender) {
            case "Female":
                System.out.println("I am a gurllll");
                break;
            case "Male":
                System.out.println("I am a man");
                break;
            case "Prefer_not_to_say":
                System.out.println("None of your business ");
                break;
        
            default:
                break;
        }
    }
}
