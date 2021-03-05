import java.awt.event.*;  
import javax.swing.*;  
import java.awt.*;

public class Main {

    static JFrame f;
    static JTextField tf, tf2, tf3, tf4, tf5;
    static JButton b;
    static JLabel il;
    static Menu myMenu;

  public static void main(String[] args) {
      myMenu=new Menu();
      f=new JFrame("enter food item");
      f.setSize(500,500);

     il=new JLabel("Enter food item");  
     il.setFont(new Font("Verdana", Font.PLAIN, 18));
     il.setBounds(10,10,150,20); 

     tf=new JTextField();
     tf.setBounds(50,50,150,20); 
     tf2=new JTextField();
     tf2.setBounds(50,100,150,20); 
     tf3=new JTextField();
     tf3.setBounds(50,150,150,20); 
     tf4=new JTextField();
     tf4.setBounds(50,200,150,20); 
     tf5=new JTextField();
     tf5.setBounds(50,250,150,20); 

    b=new JButton("Enter Food Item");
    b.setBounds(50,300,150,20); 
    b.addActionListener(new ActionListener()
  	{  
  		public void actionPerformed(ActionEvent e){  
  			  String n="";
  		    double price=0;
  		    int calories=0;
  		    int rating=0;
  		    boolean containsNuts=false;

  		    n=tf.getText();
  		    price= Double.parseDouble(tf2.getText());
  		    calories=Integer.valueOf( tf3.getText());
  		    rating=Integer.valueOf( tf4.getText());
  		    containsNuts=Boolean.valueOf(tf5.getText());
  		    FoodItem item1 = new FoodItem(n, price, calories, rating, containsNuts);
  		    
  		    if(myMenu.add(item1)){
            tf.setText("");
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
            tf5.setText("");
            il.setText("Enter another?");
          }

  		    System.out.println(myMenu);
  			
  		}  
  	});


     f.add(il);
     f.add(tf);
     f.add(tf2);
     f.add(tf3);
     f.add(tf4);
     f.add(tf5);
     f.add(b);

     f.setLayout(null);  
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     f.setVisible(true);

  }
}
