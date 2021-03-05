public class Menu{
  private FoodItem[] menu;
  private int counter=0;

  public Menu(){
    menu=new FoodItem [20];
  }
public boolean add(FoodItem x){
  menu[counter]=x;
  counter++;
  return true;
  }
public void remove(int index){
  for(int i=index; i < counter; i++){
     menu[i]=menu[i+1];
  }
  counter--;
}

public String toString(){
  String combination="";
  for (int i=0; i < counter; i++){
    combination+=menu[i]+ " ";
  }
  return combination;
  }

}
