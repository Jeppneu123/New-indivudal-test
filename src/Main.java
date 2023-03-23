import assignment1.LogicsAndNumbersStuff;
import assignment1.StringHandler;

public class Main {
    public static void main(String[] args) {
        // Assignment1
            // LogicsAndNumbersStuff
                // - 1
        int diffmMultipliedByC = LogicsAndNumbersStuff.diffMultipliedByC(10,5,2);
        System.out.println(diffmMultipliedByC);

                // - 2
        boolean canSleepIn = LogicsAndNumbersStuff.canYouStayInBed(false, false);
        System.out.println(canSleepIn);

                // - 3
        int sumOfArray = LogicsAndNumbersStuff.sumOfNumbers(new int[]{1, 2, 3, 4});
        System.out.println(sumOfArray);

                // - 4
        double AverageOfArray = LogicsAndNumbersStuff.averageOfNumber(new int []{7,2,15,22});

        System.out.println(AverageOfArray);
        // Ved ikke hvorfor den ikke printer i decimaler, når det er en double jeg har som return værdi.

                // - 5
        double mostOccurrences = LogicsAndNumbersStuff.numberWithMostOccurrences(new int []{7,2,15,22,7,15,15});
        System.out.println(mostOccurrences);

            // StringHandler

                // - 1
        String replaceCWithS = StringHandler.stringManipulation("Citron");
        System.out.println(replaceCWithS);
    }

}
