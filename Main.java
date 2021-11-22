import java.io.*;
import java.util.*;

import static java.lang.System.*;
class Main {
  public static void main(String[] args) {

Scanner it=new Scanner(System.in);
 Book b = new Book("I am Malala", "Malala Yousafzai", 2013, 288, true);
  Book b2 = new Book("I am Malala", "Malala ", 453354, 28458, false);

System.out.println(b);
System.out.println("Is Malala hardcover: "+b.getHardCover());


Book g = new Book("All the Bright Places", "Jennifer Niven", 2015, 388, false);
System.out.println(g);

System.out.println("NumPages of All the Bright Places: "+g.getNumPages());
System.out.println("Is Malala hardcover: "+b.getHardCover());

System.out.println("Enter new number of pages for Malala: ");
int np=it.nextInt();
b.setNumPages(np);
System.out.println(b);
Scanner it2=new Scanner(System.in);
System.out.println("Change Author for All the Bright Places: ");
String a=it2.nextLine();
g.setAuthor(a);
System.out.println(g);

System.out.println("Are the books equal?"+b.equals(b2));
System.out.println("Are the books equal?"+b.equals(g));

  }
}