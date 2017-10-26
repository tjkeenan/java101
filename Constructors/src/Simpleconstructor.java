class MyConstructor {

    String model;
    String name;
    double cost;
    int quanity;


    //CONSTRUCTOR
    //Constructors is a type of method that runs automatically every time you create an instance
    //it does not have a return type (this is unique to constructors)
    //constructors must have the same name as the class (remember to match letter cases!)
    public MyConstructor(){
        //You can set default values by calling an overloaded constructor like this
        //THIS(values go here)
        this("No name", 0);
        //Values are not over written unless this constructor is called out of order
        System.out.println("1st constructor run \n ");
    }

    public MyConstructor(String name){
        this.name = name;
        System.out.println("2nd String constructor run \n ");
    }

    public MyConstructor(String name, double cost){
        this.name = name;
        this.cost = cost;
        System.out.println("3rd Overloaded constructor run \n ");
    }
}

public class Simpleconstructor{
    public static void main(String[] args) {

        //Invoke without instance name like this;
        new MyConstructor();

        //Invoke with an instance name like this;
        MyConstructor builder1 = new MyConstructor();

        MyConstructor builder2 = new MyConstructor("bob the builder");

        MyConstructor builder3 = new MyConstructor("bob the builder", 22.2);

    }

}