
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person implements Comparable<Person> 
{
    // instance variables - replace the example below with your own
    private int age;
    private String name;

    /**
     * Constructor for objects of class Person
     */
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age; 
    }
    
    public String toString()
    {
        return "(" + age + "," + name + ")";
    }

    @Override public int compareTo(Person a)
    {
        if (this.name.compareTo(a.name) != 0) {
            return this.name.compareTo(a.name);
        }
        else {
            return this.age - a.age;
        }
    }
}
