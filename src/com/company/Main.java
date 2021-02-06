package com.company;

import java.util.Scanner;

public class Main {

   private static int number;

    public static void main(String[] args) {
        Sorting();
    }
        public static boolean Scan() {
            Scanner kb = new Scanner(System.in);
            System.out.print("Enter integer number: ");
            while (true)
                try {
                    number = Integer.parseInt(kb.nextLine());
                    break;
                } catch (NumberFormatException nfe) {
                    System.out.print("Try again: ");
                }
            return true;

    }

    public static void Sorting()
    {
        Scan();
        try
        {
            if (number >= 66)
            System.out.println( "Input " + number + " is between 66 and infinity");
            try
            {
                if (number >= 18 && number <= 65)
                System.out.println("Input " + number + " is between 18 and 65");
                try
                {
                    if (number >= 0 && number <= 17)
                    System.out.println("Input " + number + " is between 0 and 17");
                    try
                    {
                        if (number <=0)
                            System.out.println("It seems like You've entered negative number.");
                    }
                    catch (Exception e0)
                    {
                        //я не понял чем заполнить этот catch;
                    }
                }
                        catch (Exception e1)
                        {
                           //я не понял чем заполнить этот catch;
                        }
            }
                            catch (Exception e2)
                            {
                               //я не понял чем заполнить этот catch;
                            }
        }
                                      catch (Exception e3)
                                        {
                                            //я не понял чем заполнить этот catch;
                                        }

    }
}

