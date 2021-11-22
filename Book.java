public class Book
  
{
  //Fields/Instance Data
  private String title;
  private String author;
  private int year;
  private int numPages;
  private boolean hardCover;

  //Constructor
  public Book(String t, String a, int y, int n, boolean h)
  {
    title = t;
    author = a;
    year = y;
    numPages = n;
    hardCover = h;
  }
  //Accessor Methods
  public  String getTitle()
  {
    return title;
  }

  public  String getAuthor()
  {
    return author;
  }

  public int getYear()
  {
    return year;
  }

  public int getNumPages()
  {
    return numPages;
  }
  
  public  boolean getHardCover()
  {
    return hardCover;
  }
  //Mutator Methods - setter Methods
  public void setTitle(String s)
  {
    title=s;
  }

  public void setAuthor(String a)
  {
    author=a;
  }

  public void setYear(int y)
  {
    year=y;
  }

  public void setNumPages(int n)
  {
    numPages=n;
  }

  public void setHardCover(boolean h)
  {
    hardCover=h;
  }

//other Methods
public boolean equals(Book b)
{
  if(this.getTitle().equals(b.getTitle()))
  {
    return true;
  
  }
  else
  {
    return false;
  }
}

  //what prints for our object
  public String toString()
  {
    String str="";
    str="\nTitle: "+title+"\nAuthor: "+author+"\nYear Published: "+year;
    str=str+"\nNumber of Pages: "+numPages+"\nHardCover: "+hardCover;
    return str;
  }
  
  
}
