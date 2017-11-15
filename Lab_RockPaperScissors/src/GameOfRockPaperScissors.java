import javax.swing.plaf.synth.SynthTextAreaUI;

/**
 *
 * This class will have the details and logic associated with playing a game of
 * rock/paper/scissors
 *
 * @author BJ MacLean
 * @since Nov 17, 2014
 */
public class GameOfRockPaperScissors {

    //attributes
    private int player1Choice, player2Choice;
    private String resultDescription = "";
    private int winner = TIE;
    public static final int ROCK = 1;
    public static final int PAPER = 2;
    public static final int SCISSORS = 3;
    public static final int TIE = -1;

    /**
     * default constructor. This will handle playing the game overall. It will
     * prompt for the input, determine the winner.
     *
     * @since 20141117
     * @author BJ
     */
    public GameOfRockPaperScissors() {

        getChoices();
        getResult();

    }

    public void getChoices() {
        Menu newMenu = new Menu("Enter Your Choice\n",
                "1=Rock\n2=paper\n3=Scissors",
                "123");
        System.out.println("*** Player 1 ****");
        player1Choice = Integer.parseInt(newMenu.show());
        System.out.println("*** Player 2 ****");
        player2Choice = Integer.parseInt(newMenu.show());
    }

    /**
     * The logic will be contained in this method. It will use a compount
     * conditions to determine the winner based on rock beats scissors, scissors
     * beats paper, and paper beats rock.
     *
     * @since 20141117
     * @author BJ
     */
    public void getResult() {

        if (player1Choice != player2Choice) {
            winner = 1;
            switch (player1Choice) {
                case ROCK:
                    if (player2Choice == PAPER) {
                        winner = 2;
                    }
                    break;
                case PAPER:
                    if (player2Choice == SCISSORS) {
                        winner = 2;
                    }
                    break;
                case SCISSORS:
                    if (player2Choice == ROCK) {
                        winner = 2;
                    }
                    break;
            }
        }

    }

    /**
     * This method will show the results of the game
     *
     * @since 20141117
     * @author BJ/Stephane
     */
    @Override
    public String toString() {
        String output = "Player 1 chose " +
                getChoiceDescription(player1Choice) +
                " and player 2 chose " +
                getChoiceDescription(player2Choice) +
                " Player " +
                "(";
        if (winner != TIE) {
            if (winner == 1) {
                output += "Player 1 wins!" +
                        getChoiceDescription(player1Choice) +
                        " beats " +
                        getChoiceDescription(player2Choice) +
                        ")";
            } else {
                output += "Player 2 wins!" +
                        getChoiceDescription(player2Choice) +
                        " beats " +
                        getChoiceDescription(player1Choice) +
                        ")";
            }
        } else {
            output += "Game TIED)";
        }



       
        //Add the ROCK beats SCISSORS, etc... to the output. 
        
        return output;

    }

    /**
     * This method will convert their int choice to a String version of it. For
     * example 1=Rock
     *
     * @param choiceInt
     * @since 20141117
     * @author BJ
     */
    public String getChoiceDescription(int choiceInt) {
        String choiceDescription = "";
        if (choiceInt == 1)  choiceDescription = "ROCK";
        if (choiceInt == 2)  choiceDescription = "PAPER";
        if (choiceInt == 3)  choiceDescription = "SCISSORS";
        return choiceDescription;

    }

}
