class Main {
  public static void main(String[] args) {

    FoodItem ketchup=new FoodItem("Catchup", 2.89, 125, 9, false);
    FoodItem friedrice=new FoodItem("Fried Rice", 3.00, 150, 7, false);

    System.out.println(ketchup);
    System.out.println(friedrice);
    System.out.println(ketchup.getPrice());

  }
}