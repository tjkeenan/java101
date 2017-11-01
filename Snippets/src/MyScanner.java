import java.util.Scanner;

public class MyScanner {
    static Scanner input = new Scanner(System.in);

    public static void ScanThisInput(){
        System.out.println("My question");
        String myVarible = input.next();
        System.out.println(myVarible);
    }

    public static void ScanThisInput(String myQuestion){
        System.out.println(myQuestion);
        String myVarible = input.next();
        System.out.println(myVarible);
    }

}

