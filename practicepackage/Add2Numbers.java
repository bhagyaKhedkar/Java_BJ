package practicepackage;
public class Add2Numbers {
    public static void main(String[] args) {
        int number = 123;
        String strNumber = String.valueOf(number); // Converts int to String
        System.out.println("String representation of number: " + strNumber);

        boolean flag = true;
        String strFlag = String.valueOf(flag); // Converts boolean to String
        System.out.println("String representation of flag: " + strFlag);
    }
}