public class DataTypes {


    // primitives 
    byte agentAge = 15;
    char agentGender='M';
    short numberofMilesTravelled = 6574;
    String agentName= "Alex Rider";
    float agentHeight = 5.7f;

    int numberOfCopieSold = 8234685;
    long numOfWordsWritten = 47385748674967L;
    double moneyEarnedByNovelSeries = 293474754.455;
    boolean forTeens = true;


    public static void main(String[] args) {
    
        DataTypes dataTypes = new DataTypes();

        dataTypes.printPrimitives();

        
    }





    private void printPrimitives() {

        /*
            byte agentAge = 15;
    char agentGender='M';
    short numberofMilesTravelled = 6574;
    String agentName= "Alex Rider";
    float agentHeight = 5.7f;

    int numberOfCopieSold = 8234685;
    long numOfWordsWritten = 47385748674967L;
    double moneyEarnedByNovelSeries = 293474754.455;
    boolean forTeens = true;

 
        */
        System.out.println("String - Agent Name :: " + agentName);
        System.out.println("byte - Agent Age:: " + agentAge);
        System.out.println("char - Gender:: " + agentGender);
        System.out.println("Short - Miles Travelled:: " + numberofMilesTravelled);
        System.out.println("int - Copies Sold" + numberOfCopieSold);
        System.out.println("long - Num of Words Written:: " + numOfWordsWritten);
        System.out.println("double - Money Earned :: $" + moneyEarnedByNovelSeries);
        System.out.println("is for Teens:: " +forTeens);
    
    }
    
}
