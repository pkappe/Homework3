
package homework3;

import java.util.Scanner;

/**
 * Many programs require data to be “cleaned” before it is used. Read three
 * lines of data (each line having a first name, an age, and a date); capitalize
 * all the letters in the first name, calculate the sum of the digits in the
 * age, and change the slashes in the date to hyphens. Output the original 3
 * lines of data as a table and then output the cleaned 3 lines of data as a
 * separate table. Of course, each table should have a descriptive header.
 *
 * @author Phil Kappe
 */
public class Homework3
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a first name: ");
        String firstName = scan.nextLine();

        System.out.print("Please enter an age: ");
        String age = scan.nextLine();

        System.out.print("Please enter a date: ");
        String date = scan.nextLine();

        System.out.println("Name\tAge\tDate");
        System.out.println("------------------------");
        System.out.println(firstName + "\t" + age + "\t" + date);

        System.out.println();
        System.out.println("Name\tAge Sum\tDate");
        System.out.println("------------------------");
        System.out.println(firstName.toUpperCase() + "\t" + ageSum(age)
                + "\t" + date.replace('/', '-'));
    }

    public static int ageSum(String age)
    {
        Integer intAge = Integer.parseInt(age);
        int firstNum = 0;
        if (intAge >= 10)
        {
            firstNum = intAge%100/10;
        } 
        int secondNum = intAge%10;
        
        return firstNum + secondNum;
    }

}
