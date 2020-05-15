/*
 *  - Program Information:
 *    ~ Developer: Niklaus Newport
 *    ~ Website: Https://NiklausNewport.dev/
 *    ~ Contact Me: me@niklausnewport.dev
 *      |Please only contact me for programming/development related inquires. All else WILL be ignored|
 *    ~ Program Name: Average Blood Pressure Calculator
 *    ~ Development Date(s): 10 May 2020
 *    ~ Program Function:
 *      1. Prompts the user to enter the desired number of blood pressure records to be inputted.
 *      2. Retrieves the Systolic (Upper Number) from the user.
 *      3. Retrieves the Diastolic (Lower Number) from the user.
 *      4. Calculates the average Systolic (Upper Number) using the averageSystolic method.
 *      5. Calculates the average Diastolic (Lower Number) using the averageDiastolic method.
 *      6. Displays the average blood pressure.
 *      7. Exits the program.
 */

// Import the Scanner
import java.util.Scanner;

public class AverageBPCalc {

    public static double averageSystolic(double[] sysNum) {

        // Compute the Result
        double result = 0;
        for (int i = 0; i < sysNum.length; i++) {

            // Add Each Number Inputted in sysNum Together
            result = result + sysNum[i];

        } // End of For Loop
        result = result / sysNum.length;

        // Return the Result
        return result;

    } // End of the averageSystolic Method

    public static double averageDiastolic(double[] diaNum) {

        // Compute the Result
        double result = 0;
        for (int i = 0; i < diaNum.length; i++) {

            // Add Each Number Inputted in sysNum Together
            result = result + diaNum[i];

        } // End of For Loop
        result = result / diaNum.length;

        // Return the Result
        return result;

    } // End of the averageDiastolic Method

    public static void main(String[] args) {

        // Declare the Scanner
        Scanner uInput = new Scanner(System.in);

        // Prompt the User to Enter the Number of Blood Pressures to Average Out
        System.out.println("Hi, how many Blood Pressures need to be averaged out?");
        System.out.print("User: ");
        int numOfBP = uInput.nextInt();

        // Check for Error and if None then Continue
        double[] sysNum;
        if (numOfBP > 1) {

            // Declare the Arrays
            sysNum = new double[numOfBP];
            double[] diaNum = new double[numOfBP];

            // Retrieve All of the Systolic (Upper Numbers) from the User
            for (int i = 0; i < sysNum.length; i++) {

                // Prompt the User and Retrieve Input
                int corNum = i + 1;
                String corSuf;
                if (corNum == 1) {

                    corSuf = "st";

                } else if (corNum == 2) {

                    corSuf = "nd";

                } else if (corNum == 3) {

                    corSuf = "rd";

                } else {

                    corSuf = "th";

                } // End of If-Else Statement
                System.out.println("What is the " + corNum + corSuf + " Systolic number?");
                sysNum[i] = uInput.nextDouble();

            } // End of For Loop

            // Retrieve All of the Diastolic (Lower Numbers) from the User
            for (int i = 0; i < diaNum.length; i++) {

                // Prompt the User and Retrieve Input
                int corNum = i + 1;
                String corSuf;
                if (corNum == 1) {

                    corSuf = "st";

                } else if (corNum == 2) {

                    corSuf = "nd";

                } else if (corNum == 3) {

                    corSuf = "rd";

                } else {

                    corSuf = "th";

                } // End of If-Else Statement
                System.out.println("What is the " + corNum + corSuf + " Diastolic number?");
                diaNum[i] = uInput.nextDouble();

            } // End of For Loop

            // Compute and Display the Results
            System.out.println("The average Systolic Number (Upper Number) is " + averageSystolic(sysNum));
            System.out.println("The average Diastolic Number (Lower Number) is " + averageDiastolic(diaNum));

        } else {

            // Prompt an Error Message
            System.out.println("Error: An invalid number of Blood Pressures to be averaged has been inputted. Please try again!");

            // Exit the Program
            System.exit(0);

        } // End of If-Else Statement

        // Close the Scanner
        uInput.close();

    } // End of the Main Method

} // End of the Main Class
