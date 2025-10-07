import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args)
    {

        double celsius = 0.0;
        double fahrenheit = 0.0; // (celsius * 9/5) + 32;
        Scanner in = new Scanner(System.in);
        boolean done = false;
        String trash = "";
        do {
            System.out.print("Enter a temperature in Celsius: ");
            if (in.hasNextDouble())
            {
                celsius = in.nextDouble();
                in.nextLine(); //clear the newline from the buffer
                fahrenheit = (celsius * 9 / 5) + 32;
                done = true;
                System.out.printf("%.1f degrees Celsis %.1f Fahrenheit. ", celsius, fahrenheit);
            } else
            {
                trash = in.nextLine();
                System.out.print("Enter a valid input: " + trash);
            }
        } while(!done);

    }
} 