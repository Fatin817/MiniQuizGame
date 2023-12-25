/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.game;

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
public class Option2 implements ActionListener {
    JFrame frame = new JFrame();
        JButton buttonA = new JButton();
	JButton buttonB = new JButton();
	JButton buttonC = new JButton();
	JButton buttonD = new JButton();
	JLabel answer_labelA = new JLabel();
        JLabel answer_labelB = new JLabel();
        JLabel answer_labelC = new JLabel();
        public Option2() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650,650);
		frame.getContentPane().setBackground(new Color(255,255,255));
		frame.setLayout(null);
		frame.setResizable(false);
		
		
		buttonA.setBounds(200,200,200,50);
		buttonA.setFont(new Font("Areial",Font.BOLD,25));
		buttonA.setFocusable(false);
		buttonA.addActionListener(this);
		buttonA.setText("Politices");
		
		buttonB.setBounds(200,300,200,50);
		buttonB.setFont(new Font("Areial",Font.BOLD,25));
		buttonB.setFocusable(false);
		buttonB.addActionListener(this);
		buttonB.setText("Arts");
		
		buttonC.setBounds(200,400,200,50);
		buttonC.setFont(new Font("Areial",Font.BOLD,25));
		buttonC.setFocusable(false);
		buttonC.addActionListener(this);
		buttonC.setText("History");
		
		buttonD.setBounds(200,500,200,50);
		buttonD.setFont(new Font("Areial",Font.BOLD,25));
		buttonD.setFocusable(false);
		buttonD.addActionListener(this);
		buttonD.setText("Sports");
		
		answer_labelA.setBounds(170,100,500,100);
		answer_labelA.setForeground(new Color(25,25,25));
		answer_labelA.setFont(new Font("Areial",Font.PLAIN,35));
		answer_labelA.setText("Choose an option");
                
                answer_labelB.setBounds(110,0,500,100);
		answer_labelB.setForeground(new Color(25,25,25));
		answer_labelB.setFont(new Font("Areial",Font.PLAIN,35));
		answer_labelB.setText("Name");
                
               answer_labelC.setBounds(25,0,500,100);
		answer_labelC.setForeground(new Color(25,25,25));
		answer_labelC.setFont(new Font("Areial",Font.PLAIN,35));
		answer_labelC.setText("Hello");
		
		
		
		
		frame.add(answer_labelA);
                frame.add(answer_labelB);
                frame.add(answer_labelC);
		frame.add(buttonA);
		frame.add(buttonB);
		frame.add(buttonC);
		frame.add(buttonD);
		frame.setVisible(true);
		
		
	}
        
        @Override
	public void actionPerformed(ActionEvent e) {

			if(e.getSource()==buttonA) {
                
                            Politices politices = new Politices();
                             frame.dispose();
				
			}
			if(e.getSource()==buttonB) {
				Arts arts = new Arts();
                                frame.dispose();
			}
			if(e.getSource()==buttonC) {
			      History history = new History();
                              frame.dispose();
			}
			if(e.getSource()==buttonD) {
				Sports sp= new Sports();
                                frame.dispose();
			}
			
	}
        
         
        
    

////////////////////////////////////////////////////////////////////////////




}


        
        

