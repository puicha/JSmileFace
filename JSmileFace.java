/* JSmileFace Application
   An application that displays a yellow smiling face on the screen. */
   
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
public class JSmileFace extends JFrame  
{ 
   // Add a constructor to set the default close operation
   public JSmileFace()
   {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
   }
   
   /* Add the paint() method that calls the super() method and uses a Graphics object with setColor(),fillOval()
      and drawArc() methods to make a yellow smiling face on the screen. */
   public void paint(Graphics smile)
   {
      super.paint(smile);
      smile.setColor(Color.YELLOW);
      smile.fillOval(100,100,300,300);
      smile.setColor(Color.BLACK);
      smile.fillOval(200,200,10,20);
      smile.setColor(Color.BLACK);
      smile.fillOval(300,200,10,20);
      smile.setColor(Color.BLACK);
      smile.drawArc(200,250,100,100,0,-180);           
   }
   
   // Add a main() method that instantiates a JSmileFace object and sets its size and visibility
   public static void main(String[] args)
   {  
      JSmileFace frame = new JSmileFace();
      frame.setSize(500,500);
      frame.setVisible(true);     
   }
}