# Java_Hometask_2
**Matriculation Number :7216653**

 **Name : Varsha Vijayan**

**Create class Car: id, Make, Model, Year of manufacture, Color, Price, 
Registration number. Create an array of objects. 
Save to the different files: 
a) a list of cars of a given brand;
b) a list of cars of  a given model that have been in use for more than n years;
c) a list of cars of a given year of manufacture, the price of which is higher than the specified one.**


**Solution:**

1)Created and initialize an array car[] with total 5 set of data.

2)To list the cars for a given brand ,below are the development stages:

  a)Requests for brand or makers name as user input using scanner object and if the user input matches with the array list makers then its corresponding data will be written to a new file named file1.txt using Filewriter option and after that it is being displayed using file scanner Reader.
	 
3) To list the cars of  a given model that have been in use for more than n years;
   
  a)Here have taken models in use for more than 5 years ,initially will fetch the current timestamp's Year and that year minus 5 will be stored to another variable.
  b)Finally checks the condition if the year of manufacture of each car is less than that of year minused.If so ,those details will be written into another file here named as file2.txt and after that it is being displayed using file scanner Reader.
	
4) To list the cars of a given year of manufacture, the price of which is higher than the specified one.
   
  a)Requests for user input asking the year of manufacture and price.
  b)After that it checks  in the array if the  user inputed year equals to the year of manufacture of cars, and if that is true its cheks the next criteria of the price higher that the inputed  price. If both condition gets true those details will be fetched and written to a new file named file3.txt and after that finally its been displayed using file scanner Reader.

**User Inputs :**

1)Enter Brand / Makers name

2)Enter the year of manufacture:

3)Enter the price: 

**Array Consists of below data :**

 setData(int id, String makers,String model,int yom,String color,int price,String reg_no)
 
 arr[0].setData(1, "Honda","Civic",2019,"Black",25000,"KL123");
 
 arr[1].setData(2, "Tata","Nexon",2018,"Red",20000,"AB123");
 
 arr[2].setData(3, "Honda","Thar",2017,"Blue",30000,"KL456");
 
 arr[3].setData(4, "Toyota","Innova",2018,"White",15000,"AB456");
 
 arr[4].setData(5, "Mercedes","Benz",2021,"Black",22000,"ABC123");

 



  
