import java.util.Random;
import java.util.Scanner;


public class Lab09Arrays
{
    public static void main(String[] args)
    {
        Random rnd = new Random();
        int[] dataPoints = new int[100];

        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }
        for (int i = 0; i < dataPoints.length; i++)
        {
            System.out.println(dataPoints[i]);
        }

        for (int i = 0; i < dataPoints.length; i++)
        {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1)
            {
                System.out.printf(" | ");
            }
        }
        System.out.println();
        int sum = 0;
        for(int i = 0; i < dataPoints.length; i++)
        {
            sum += dataPoints[i];
        }
        double average = (double) sum/dataPoints.length;
        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);

        Scanner pipe = new Scanner (System.in);
        int userNum = SafeInput.getRangedInt(pipe, "Enter an integer between 1 and 100", 1, 100);
        int count = 0;
        for(int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == userNum)
            {
                count++;
            }
        }
        System.out.println("The value " + userNum + " was found " + count + " times in the dataPoints array.");

        int searchValue = SafeInput.getRangedInt(pipe,"Enter another integer between 1 and 100", 1, 100);
        boolean found = false;
        for(int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints [i] == searchValue)
            {
                found = true;
                System.out.println("The value " + searchValue  + " was found at array index " + i + ".");
                break;
            }
        }
        if (!found)
        {
            System.out.println("The value " + searchValue  + " was not found in the dataPoints array.");
        }

        int min = dataPoints[0];
        int max = dataPoints [0];
        for(int i = 1; i < dataPoints.length; i++)
        {
            if (dataPoints [i] < min)
            {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max)
            {
                max = dataPoints[i];
            }
            }
        System.out.println("The minimum value in dataPoints is: " + min);
        System.out.println("The maximum value in dataPoints is: " + max);

    }
}
