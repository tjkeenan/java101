public class BabySittingJob {
    private int numJob;
    private int numCode;
    private int numChild;
    private int numHours;
    private int rate;
    private int rateChild;
    private int rateTotal;
    String name;

    public BabySittingJob(int numJob, int numCode, int numChild, int numHours){
        this.numChild = numChild;
        this.rate = rate;
        this.numHours = numHours;
        this.numJob = numJob;
        this.numCode = numCode;

        switch (numCode){
            case 1:
                rate = 7;
                rateChild = 7;
                this.name = "Cindy";
                break;
            case 2:
                this.rate = 9;
                this.rateChild = 4;
                this.name = "Greg";
                break;
            case 3:
                rate = 9;
                rateChild = 4;
                this.name = "Marcia";
                break;
            default:
                rate = 0;
                break;
        }
        this.rate = ((numHours * rate)+(rateChild * numChild * numHours));
        this.toString();
    }

    @Override
    public String toString() {
        return name + "\n"
                + "Hours worked: " + numHours + "\n"
                + "Number of Kids: " + numChild + "\n"
                + "Pay: $" + rate + "\n" +
                System.lineSeparator();


        /*return super.toString();*/
    }
}
