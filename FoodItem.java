import java.util.Date;

public class FoodItem{

//properties or class instance variables
  private double price=0;
  private String name="";
  private int calories=0;
  private int rating=0;
  private Date expDate;
  private boolean containsNuts=false;
//constructors 

public FoodItem(String n, double p, int c, int r, boolean cn){

name=n;
price=p;
calories=c;
rating=r;
expDate=new Date();
containsNuts=cn;

}
public String toString(){
  return "The item name is " + name + " with a cost of " + price;
}
public double getPrice(){
  return price;
}
public int getCalories(){
  return calories;
}
public boolean hasNuts(){
  return containsNuts;
}


}
