public class PersonHealth {
    int dailyDiet;
    int activityLevel;
    int sleepAmount;

    //
    final int DIET_TERRIBLE = 1;
    final int DIET_OK = 2;
    final int DIET_GREAT = 3;
    final int ACTIVITY_NO = 1;
    final int ACTIVITY_SOME = 2;
    final int ACTIVITY_ACTIVE = 3;
    final int SLEEP_LITTLE = 1;
    final int SLEEP_SOME = 2;
    final int SLEEP_LOTS = 3;


    public PersonHealth(int dailyDiet,int activityLevel, int sleepAmount){
        this.dailyDiet = dailyDiet;
        this.activityLevel = activityLevel;
        this.sleepAmount = sleepAmount;
        analyzePersonHealth();

    }

    private void analyzePersonHealth(){
        if ((this.dailyDiet == DIET_TERRIBLE || dailyDiet == DIET_OK)
                && activityLevel == ACTIVITY_NO) {
                System.out.println("I am sluggish");
        }
    }
}
