public class logicalOperators {
    public static void main(String[] args){
        //Logical Operators
        boolean isAdult = false;
        boolean isStudent = true;
        boolean isAmigoscodeMember = true;
        System.out.println(isAdult && isStudent);
        System.out.println((isAdult || !isStudent) && isAmigoscodeMember);
    }
}
