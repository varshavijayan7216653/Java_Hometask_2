import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.time.LocalDate;
class CarService
{
	public static void main(String args[])
	{
 Car[] arr;
 arr= new Car[5];
 arr[0] = new Car();
 arr[1] = new Car();
 arr[2] = new Car();
 arr[3] = new Car();
 arr[4] = new Car();

    //array of objects
    
 arr[0].setData(1, "Honda","Civic",2019,"Black",25000,"KL123");
 arr[1].setData(2, "Tata","Nexon",2018,"Red",20000,"AB123");
 arr[2].setData(3, "Honda","Thar",2017,"Blue",30000,"KL456");
 arr[3].setData(4, "Toyota","Innova",2018,"White",15000,"AB456");
 arr[4].setData(5, "Mercedes","Benz",2021,"Black",22000,"ABC123");
 
    System.out.println("Enter Brand / Makers name");
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    String brand = myObj.nextLine();
    
//list of cars of given brand method calling   
    
 for(int i=0;i<5;i++)
 {
    if(arr[i].makers().equals(brand))
    {
        arr[i].display();
    }
 }
 
 
// list of cars of a given brand use for more than n years
 System.out.println("Car makers, their models , and Year of manufacture that have been in use for more than 5 years ");
 for(int i=0;i<5;i++)
 {
     arr[i].model();
 }

  //a list of cars of a given year of manufacture, the price of which is higher than the specified one.
    
  System.out.println("Enter the year of manufacture: ");
  Scanner scanner = new Scanner(System.in);
   if (scanner.hasNextInt()) {
  int year = scanner.nextInt();
  System.out.println("Enter the price: ");
   if (scanner.hasNextInt()) {
  int price = scanner.nextInt();
  for (int i = 0; i < 5; i++) {
        if (arr[i].getYear() == year) 
        {
                if (arr[i].getPrice() > price)
                {
                    arr[i].list();
                }
          }
  }
   }
}
}
}

class Car
{
int id;
String makers;
String model;
int yom;
String color;
int price;
String reg_no;

 public void setData(int id, String makers,String model,int yom,String color,int price,String reg_no)
    {
        this.id = id;
        this.makers = makers;
        this.model = model;
        this.yom = yom;
        this.color = color;
        this.price = price;
        this.reg_no=reg_no;
    }
    
    public String makers() {
        return makers;
    }
      public int getYear() {
        return yom;
    }
 
   public int getPrice() {
        return price;
    }
    
 public void model()
 {
     try {
      FileWriter myWriter = new FileWriter("file2.txt");
      LocalDate currentDate = LocalDate.now();
      int currentYear = currentDate.getYear();
      // Subtract 5 years from the current year
      int yearMinus5 = currentYear - 5;
      if(yom<yearMinus5)
      {
     //System.out.println(" model that have been in use for more than 5 years:\n"+model);
      myWriter.write(makers+" --- "+model+"---"+yom);
      myWriter.close();
     //System.out.println("Successfully wrote to the file.");
      }
      } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
      }
      
    try {
      File myObj = new File("file2.txt");
      Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
      } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
      }       
 }
    
    public void display()
    {
      try {
      FileWriter myWriter = new FileWriter("file1.txt");
      myWriter.write(makers + "-" +model+"-"+yom+"-"+color+"-"+price+"-"+reg_no);
      myWriter.close();
       //System.out.println("Successfully wrote to the file.");
      } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
      }
    try {
      File myObj = new File("file1.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
      } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }   
  } 
    public void list()
      {        
         try {
      FileWriter myWriter = new FileWriter("file3.txt");
      myWriter.write(makers+"-"+model+"-"+yom + "-" +price);
      myWriter.close();
     //System.out.println("Successfully wrote to the file.");
      } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
      }   
        try {
        File myObj = new File("file3.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
        }
      myReader.close();
        } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
      }
    }
}
 

