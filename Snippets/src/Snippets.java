import java.util.Scanner;

public class Snippets {

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        //Run a class method
        MyScanner.ScanThisInput();

        //Run a local method
        ScanThisInput();
    }

    //Self contained scanner method
    public static void ScanThisInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("My local method question");
        String myVarible = input.next();
        System.out.println(myVarible);
    }

    //toString
    //String builder example

    public void toStringMethod(){
        MyToString frog1 = new Frog(1, "John");
        //Frog frog2 = new Frog(4, "Will");
        System.out.println(frog1);
    }



}



