/**
 * Selects a random student from an array.
 *
 * @author APCS-A @ HB
 * @version 2019-01
 */

import java.util.Scanner;

public class StudentList
{
    private String[] names= {"Angela", "Ella", "Emily", "Kat", 
         "Katrina", "Kim", "Linda", "Meredith", "Patty", "Ryan"};

    public String getRandomName()
    {
        int n = (int)(Math.random() * names.length);
        return names[n];
    }
    

    public static void main (String[] args)
    {
        StudentList apcsa = new StudentList();
        
        Scanner kboard = new Scanner (System.in);
        System.out.println ("Press <ENTER> for a random student.");
        System.out.println ("Enter x to end the program.");
        String input = kboard.nextLine();
        
        while (!input.equals("x"))
        {
            System.out.println (apcsa.getRandomName());
            input = kboard.nextLine();
        }
    }
}
