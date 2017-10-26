public class MyMethods {

    static String myStringVariable = "bacon";
    static int myIntVariable;


    //Static methods are not instance
    //Meaning they'll never hold more than one instance at a time
    //Non static methods need a instance e.g. ClassName instanceName = new ClassName()
    public static void main(String[] args) {

        System.out.println("String Variable = " + myStringVariable + "\n");


        //Void methods don't return anything.
        //but they can change values of things
        voidMethod();

        singleMethod(myStringVariable);

        mixedMethod(myStringVariable,myIntVariable);

        //overloaded this method with the same name as above uses two ints
        mixedMethod(myIntVariable,myIntVariable);
        //Print a return method
        System.out.println(returnMethod());

        chainedMethod();

    }

    // REMOVE STATIC FOR METHODS USED IN INSTANCES

    //void method
    static void voidMethod() {
        System.out.println("I'm a void method \n");
    }

    //single parameter method
    static void singleMethod(String text){
        text = "cheese";
        System.out.println("I'm a single parameter method String Variable: "+ text +"\n");
    }

    //mixed parameter method
    static void mixedMethod(String text, int value){
        System.out.println("I'm a mixed parameter method String Variable: "+ text + " Int Variable: " + value + "\n");
    }

    //mixed parameter method overloaded
    //overloaded methods share the same name but the method used is determined by the inputs
    static void mixedMethod(int value, int value2){
        System.out.println("I'm a mixed parameter method 1st Variable: "+ value + " 2nd Int Variable: " + value2 + "\n");
    }

    //return a value method
    static String returnMethod(){
        return "cheese \n";
    }

    //chained method
    //a method can call from another method
    static void chainedMethod(){
        System.out.println("Chained Method in action: ");
        System.out.println(returnMethod());
    }





}
