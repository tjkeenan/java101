/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jdkitson
 */
public class Seller {

    // Variables Part 1
    private String name;
    private int numBars;
    private int numMags;
    // Constants Part 4
    final double BAR_PRICE = 2.50;
    final double MAG_PRICE = 5.00;

    /**
     * Custom constructor part 2
     *
     * @param sellerName
     * @param sellerNumBars
     * @param sellerNumMags
     */
    public Seller(String sellerName, int sellerNumBars, int sellerNumMags) {

        this.name = sellerName;
        this.numBars = sellerNumBars;
        this.numMags = sellerNumMags;
    }

    /**
     * Default constructor
     */
   /*public Seller() {
        this.name = "Steve";
        this.numBars = 0;
        this.numMags = 0;
    }
     */
    /**
     * Custom constructor part 3
     *
     * @param name
     */
    public Seller(String name) {
        this.name = name;
        this.numBars = 0;
        this.numMags = 0;
    }

    /**
     * Part 5
     *
     * @return
     */
    public double getTotalSales() {
        double total = (this.numBars * this.BAR_PRICE) + (this.numMags * this.MAG_PRICE);
        return total;
    }

    @Override
    public String toString() {
        return "\nName: " + this.name + "\n"
                + "Number of Bars: " + this.numBars + "($" + this.BAR_PRICE + " each)" + "\n"
                + "Number of Magazines: " + this.numMags + "($" + this.MAG_PRICE + " each)" + "\n"
                + "Total Sales: $" + this.getTotalSales();
    }

    /**
     * @return the student
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the student to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the numBars
     */
    public int getNumBars() {
        return numBars;
    }

    /**
     * @param numBars the numBars to set
     */
    public void setNumBars(int numBars) {
        this.numBars = numBars;
    }

    /**
     * @return the numMags
     */
    public int getNumMags() {
        return numMags;
    }

    /**
     * @param numMags the numMags to set
     */
    public void setNumMags(int numMags) {
        this.numMags = numMags;
    }

}
