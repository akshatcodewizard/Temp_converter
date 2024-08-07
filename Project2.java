// 3. *Temperature Converter*: Build a program that converts temperatures between Celsius, Fahrenheit, and Kelvin. This project can help you practice input/output operations and basic calculations.

import java.util.*;

public class Project2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temprature ??");
        float tem = sc.nextInt();// to get the data from user??

        System.out.println("Choose the tem result you want in Celcius ' C ' or Fahrenheit ' F ' ");
        char sym = sc.next().charAt(0);

        if (sym == 'c' || sym == 'C') {

            double change_temp = (tem * 9 / 5) + 32;
            System.out.println("The temperature is: " + change_temp);
        }

        else if (sym == 'f' || sym == 'F') {

            double change_temp = (tem - 32) * 9 / 5;
            System.out.println("The temperature is: " + change_temp);
        }

        else {
            System.out.println("System error !");
        }

    }
}