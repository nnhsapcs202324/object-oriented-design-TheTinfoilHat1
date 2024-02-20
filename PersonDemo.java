import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.util.*;


/**
 * Test class for Coin class
 *
 * @author gcschmit
 * @version 19 June 2019
 */
public class PersonDemo
{
    /**
     * Tests the Coin class' implementation of the Comparable interface.
     */
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Person arr[] = new Person[10];
        
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Enter a name: ");
            String name = s.nextLine();
            System.out.println("Enter an age: ");
            int age = s.nextInt();
            s.nextLine();
            arr[i] = new Person(name, age);
        }
        
        Arrays.sort(arr);
        for(Person person : arr)
        {
            System.out.println(person);
        }
    }
}