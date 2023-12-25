
import java.awt.event.ActionListener;

public class Main {

 public static void main(String[] args) {
  
  LaunchPage launchPage = new LaunchPage();

 }
}
// **********************************************
import java.awt.event.*;
import javax.swing.*;

public class LaunchPage implements ActionListener{
 
 JFrame frame = new JFrame();
 JButton myButton = new JButton("New Window");
 
 LaunchPage(){
  
  myButton.setBounds(100,160,200,40);
  myButton.setFocusable(false);
  myButton.addActionListener(this);
  
  frame.add(myButton);
  
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(420,420);
  frame.setLayout(null);
  frame.setVisible(true);
  
 }

 @Override
 public void actionPerformed(ActionEvent e) {
  
  if(e.getSource()==myButton) {
   frame.dispose();
   NewWindow myWindow = new NewWindow();
  }
 }
}
// **********************************************
import java.awt.*;
import javax.swing.*;
public class NewWindow {

 JFrame frame = new JFrame();
 JLabel label = new JLabel("Hello!");
 
 NewWindow(){
  
  label.setBounds(0,0,100,50);
  label.setFont(new Font(null,Font.PLAIN,25));
  
  frame.add(label);
  
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(420,420);
  frame.setLayout(null);
  frame.setVisible(true);
 }
}
