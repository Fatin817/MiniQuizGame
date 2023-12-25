/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.game;

/**
 *
 * @author Tamim
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;
import java.awt.*;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.*;


/**
 *
 * @author Tamim
 */
public class Login2 implements ActionListener {
    JFrame frame = new JFrame();
        JButton buttonA = new JButton();
	JButton buttonB = new JButton();
	JButton buttonC = new JButton();
	JLabel answer_labelA = new JLabel();
        JLabel answer_labelB = new JLabel();
        JLabel answer_labelC = new JLabel();
        JLabel answer_labelD = new JLabel();
        JTextField email = new JTextField ();
        JTextField name = new JTextField ();
        
        public Login2() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650,650);
		frame.getContentPane().setBackground(new Color(255,255,255));
		frame.setLayout(null);
		frame.setResizable(false);
		
                email.setBounds(230,280,300,50);
		email.setFont(new Font("Areial",Font.BOLD,25));
                
                name.setBounds(230,180,300,50);
		name.setFont(new Font("Areial",Font.BOLD,25));
		
		buttonA.setBounds(230,380,100,50);
		buttonA.setFont(new Font("Areial",Font.BOLD,25));
		buttonA.setFocusable(false);
		buttonA.addActionListener(this);
		buttonA.setText("Male");
		
		buttonB.setBounds(380,380,150,50);
		buttonB.setFont(new Font("Areial",Font.BOLD,25));
		buttonB.setFocusable(false);
		buttonB.addActionListener(this);
		buttonB.setText("Female");
		
		buttonC.setBounds(500,550,100,50);
		buttonC.setFont(new Font("Areial",Font.BOLD,25));
		buttonC.setFocusable(false);
		buttonC.addActionListener(this);
		buttonC.setText("Next");
		
		
		
		answer_labelA.setBounds(150,35,500,100);
		answer_labelA.setForeground(new Color(25,25,25));
		answer_labelA.setFont(new Font("Areial",Font.BOLD,65));
		answer_labelA.setText("Information");
                
                answer_labelB.setBounds(30,155,500,100);
		answer_labelB.setForeground(new Color(25,25,25));
		answer_labelB.setFont(new Font("Areial",Font.PLAIN,45));
		answer_labelB.setText("Name");
                
                answer_labelC.setBounds(30,255,500,100);
		answer_labelC.setForeground(new Color(25,25,25));
		answer_labelC.setFont(new Font("Areial",Font.PLAIN,45));
		answer_labelC.setText("Email");
                
                answer_labelD.setBounds(30,355,500,100);
		answer_labelD.setForeground(new Color(25,25,25));
		answer_labelD.setFont(new Font("Areial",Font.PLAIN,45));
		answer_labelD.setText("Gender");
		
		
		
		frame.add(answer_labelA);
                frame.add(answer_labelB);
                frame.add(answer_labelC);
                frame.add(answer_labelD);
		frame.add(buttonA);
		frame.add(buttonB);
		frame.add(buttonC);
		frame.add(name);
                frame.add(email);
		frame.setVisible(true);
		
		
	}
        
        
        @Override
	public void actionPerformed(ActionEvent e) {

			if(e.getSource()==buttonA) {
			}
			if(e.getSource()==buttonB) {	
			}
			if(e.getSource()==buttonC) {
           
			     Option2 option = new Option2();
                             option.answer_labelB.setText(name.getText());
                             
                              frame.dispose();
			}
			
			
	}
        
         
        
    

////////////////////////////////////////////////////////////////////////////

   



}