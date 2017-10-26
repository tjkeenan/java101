// DEMO ONLY NOT USED BY THIS PACKAGE

public class GetterSetters {
    String model;
    String name;
    double cost;
    int quanity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //THIS.name references the instance variable using the variable defined within this overall class
        //= NAME references the value passed to this method in this case (String name)
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    //THIS.variable doesn't need to be used everywhere in the method below
    //variables can be passed and then call the existing setters
    public void setInfo(String name, double cost){
        //This will take passed variables and create an instance using\
        //the existing setters. Getter is unnecessary in this case.
        setName(name);
        setCost(cost);
    }
}
