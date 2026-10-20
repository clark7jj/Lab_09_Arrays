import java.util.Random;

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
    }
}
