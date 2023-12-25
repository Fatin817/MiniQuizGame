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
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class History implements ActionListener{
	
	String[] questions = {"Ke Ajke trt dibe?","Kothay dibe?","Ki dibe?","Agami 1 week ke trt dibe?"};
	String[][] options = {{"Sabab","Sabab","Sabab","Sabab"},{"Kuddos","Chesse bite","Pizzaburg","KFC"},{"sub","Burger","Pizza","Fried Chiken"},{"Sabab Jobs","Sabab Gates","Sabab Zuckerburg","Sabab Kader"}};
	char[] answers ={'A','A','A','B'};
	char guess;
	char answer;
	int index;
	int correct_guesses=0;
	int total_questions = questions.length;
	int result;
	int seconds=15;
	
	JFrame frame = new JFrame();
	JTextField textfield = new JTextField();
	JTextArea textarea = new JTextArea();
	JButton buttonA = new JButton();
	JButton buttonB = new JButton();
	JButton buttonC = new JButton();
	JButton buttonD = new JButton();
	JLabel answer_labelA = new JLabel();
	JLabel answer_labelB = new JLabel();
	JLabel answer_labelC = new JLabel();
	JLabel answer_labelD = new JLabel();
	JLabel time_label = new JLabel();
	JLabel seconds_left = new JLabel();
	JTextField number_right = new JTextField();
	
	
	Timer timer = new Timer(1000, new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			seconds--;
			seconds_left.setText(String.valueOf(seconds));
			if(seconds==0) {
				displayAnswer();
			}
			}
		});
	
	public History() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650,650);
		frame.getContentPane().setBackground(new Color(255,255,255));
		frame.setLayout(null);
		frame.setResizable(false);
		
		textfield.setBounds(0,0,650,50);
		textfield.setBackground(new Color(255,255,255));
		textfield.setForeground(new Color(25,25,25));
		textfield.setFont(new Font("Areial",Font.PLAIN,30));
		textfield.setBorder(BorderFactory.createBevelBorder(3, Color.black, Color.black));
		textfield.setHorizontalAlignment(JTextField.CENTER);
		textfield.setEditable(false);
		
		textarea.setBounds(0,50,650,50);
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		textarea.setBackground(new Color(255,255,255));
		textarea.setForeground(new Color(25,25,25));
		textarea.setFont(new Font("Areial",Font.BOLD,35));
		textarea.setEditable(false);
		
		buttonA.setBounds(0,110,72,72);
		buttonA.setFont(new Font("Areial",Font.BOLD,25));
		buttonA.setFocusable(false);
		buttonA.addActionListener(this);
		buttonA.setText("A");
		
		buttonB.setBounds(0,210,72,72);
		buttonB.setFont(new Font("Areial",Font.BOLD,25));
		buttonB.setFocusable(false);
		buttonB.addActionListener(this);
		buttonB.setText("B");
		
		buttonC.setBounds(0,310,72,72);
		buttonC.setFont(new Font("Areial",Font.BOLD,25));
		buttonC.setFocusable(false);
		buttonC.addActionListener(this);
		buttonC.setText("C");
		
		buttonD.setBounds(0,410,72,72);
		buttonD.setFont(new Font("Areial",Font.BOLD,25));
		buttonD.setFocusable(false);
		buttonD.addActionListener(this);
		buttonD.setText("D");
		
		answer_labelA.setBounds(85,95,500,100);
		answer_labelA.setForeground(new Color(25,25,25));
		answer_labelA.setFont(new Font("Areial",Font.PLAIN,35));
		
		answer_labelB.setBounds(85,195,500,100);
		answer_labelB.setForeground(new Color(25,25,25));
		answer_labelB.setFont(new Font("Areial",Font.PLAIN,35));
		
		answer_labelC.setBounds(85,295,500,100);
		answer_labelC.setForeground(new Color(25,25,25));
		answer_labelC.setFont(new Font("Areial",Font.PLAIN,35));
		
		answer_labelD.setBounds(85,395,500,100);
		answer_labelD.setForeground(new Color(25,25,25));
		answer_labelD.setFont(new Font("Areial",Font.PLAIN,35));
		
		seconds_left.setBounds(535,510,100,100);
		seconds_left.setBackground(new Color(25,25,25));
		seconds_left.setForeground(new Color(255,255,255));
		seconds_left.setFont(new Font("Areial",Font.BOLD,60));
		seconds_left.setBorder(BorderFactory.createBevelBorder(1));
		seconds_left.setOpaque(true);
		seconds_left.setHorizontalAlignment(JTextField.CENTER);
		seconds_left.setText(String.valueOf(seconds));
		
		time_label.setBounds(535,475,100,25);
		time_label.setForeground(new Color(25,25,25));
		time_label.setFont(new Font("Areial",Font.PLAIN,16));
		time_label.setHorizontalAlignment(JTextField.CENTER);
		time_label.setText("Timer");
		
		number_right.setBounds(225,225,200,100);
		number_right.setForeground(new Color(25,25,25));
		number_right.setFont(new Font("Areial",Font.BOLD,50));
		number_right.setBorder(BorderFactory.createBevelBorder(1, Color.black, Color.black));
		number_right.setHorizontalAlignment(JTextField.CENTER);
		number_right.setEditable(false);
		
		frame.add(time_label);
		frame.add(seconds_left);
		frame.add(answer_labelA);
		frame.add(answer_labelB);
		frame.add(answer_labelC);
		frame.add(answer_labelD);
		frame.add(buttonA);
		frame.add(buttonB);
		frame.add(buttonC);
		frame.add(buttonD);
		frame.add(textarea);
		frame.add(textfield);
		frame.setVisible(true);
		
		nextQuestion();
	}
	public void nextQuestion() {
		
		if(index>=total_questions) {
			results();
		}
		else {
			textfield.setText("Question "+(index+1));
			textarea.setText(questions[index]);
			answer_labelA.setText(options[index][0]);
			answer_labelB.setText(options[index][1]);
			answer_labelC.setText(options[index][2]);
			answer_labelD.setText(options[index][3]);
			timer.start();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
			buttonA.setEnabled(false);
			buttonB.setEnabled(false);
			buttonC.setEnabled(false);
			buttonD.setEnabled(false);
			
			if(e.getSource()==buttonA) {
				answer= 'A';
				if(answer == answers[index]) {
					correct_guesses++;
				}
			}
			if(e.getSource()==buttonB) {
				answer= 'B';
				if(answer == answers[index]) {
					correct_guesses++;
				}
			}
			if(e.getSource()==buttonC) {
				answer= 'C';
				if(answer == answers[index]) {
					correct_guesses++;
				}
			}
			if(e.getSource()==buttonD) {
				answer= 'D';
				if(answer == answers[index]) {
					correct_guesses++;
				}
			}
			displayAnswer();
	}
	public void displayAnswer() {
		
		timer.stop();
		
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		if(answers[index] != 'A')
                {answer_labelA.setForeground(new Color(255,0,0));}
               
		if(answers[index] != 'B')
                {answer_labelB.setForeground(new Color(255,0,0));}
               
		if(answers[index] != 'C')
                {answer_labelC.setForeground(new Color(255,0,0));}
              
		if(answers[index] != 'D')
                {answer_labelD.setForeground(new Color(255,0,0));}
              
		
		Timer pause = new Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				answer_labelA.setForeground(new Color(25,25,25));
				answer_labelB.setForeground(new Color(25,25,25));
				answer_labelC.setForeground(new Color(25,25,25));
				answer_labelD.setForeground(new Color(25,25,25));
				answer = ' ';
				seconds=15;
				seconds_left.setText(String.valueOf(seconds));
				buttonA.setEnabled(true);
				buttonB.setEnabled(true);
				buttonC.setEnabled(true);
				buttonD.setEnabled(true);
				index++;
				nextQuestion();
			}
		});
		pause.setRepeats(false);
		pause.start();
	}
	public void results(){
		
		buttonA.setVisible(false);
		buttonB.setVisible(false);
		buttonC.setVisible(false);
		buttonD.setVisible(false);
		result = (int)((correct_guesses/(double)total_questions));
		
		textfield.setText("RESULTS");
		textarea.setText("");
		answer_labelA.setText("");
		answer_labelB.setText("");
		answer_labelC.setText("");
		answer_labelD.setText("");

		number_right.setText("("+correct_guesses+"/"+total_questions+")");
		
		frame.add(number_right);
		
		
	}
}