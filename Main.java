import java.io.*;

public class Main
{
  public static void main (String[]args) throws Exception
  {
    InputStreamReader input = new InputStreamReader (System.in);
    BufferedReader br = new BufferedReader (input);

    String name, address, section, course, contact;
      System.out.println ("Enter your Name:");
      name = br.readLine ();
      System.out.println ("Enter your Address:");
      address = br.readLine ();
      System.out.println ("Enter your Section:");
      section = br.readLine ();
      System.out.println ("Enter your Course:");
      course = br.readLine ();
      System.out.println ("Enter your Contact Number:");
      contact = br.readLine ();


      System.out.println ("Hi! My name is " + name + ", I live at " +
			  address);
      System.out.println ("My Course and Section is " + section + " " +
			  course);
      System.out.println ("My contact number is " + contact);
  }
}
