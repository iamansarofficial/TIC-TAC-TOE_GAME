package tictactoegame;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener {
	Random random=new Random();
	JFrame frame=new JFrame();
	JPanel titlep=new JPanel();
	JPanel buttonp=new JPanel();
	JLabel textfield=new JLabel();
	JButton[] buttons=new JButton[9];
	boolean firstplayer_turn;
	
	TicTacToe(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.setSize(800,800);
		frame.getContentPane().setBackground(new Color(50,50,50));
		frame.setTitle("TIC-TAC-TOE GAME");
		
		
		textfield.setBackground(new Color(25,25,25));
		textfield.setForeground(new Color(25,255,0));
		textfield.setFont(new Font("Ink free",Font.BOLD,75));
		textfield.setHorizontalAlignment(JLabel.CENTER);
		textfield.setText("Tic-Tac-Toe");
		textfield.setOpaque(true);
		
		titlep.setLayout(new BorderLayout());
		titlep.setBounds(0, 0,800, 100);
		
		buttonp.setLayout(new GridLayout(3,3));
		buttonp.setBackground(new Color(150,150,150));
		
		for (int i=0;i<9;i++) {
			buttons[i]=new JButton();
			buttonp.add(buttons[i]);
			buttons[i].setFont(new Font("MV Boli",Font.BOLD,120));
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
		}
		titlep.add(textfield);
		frame.add(buttonp);
		frame.add(titlep,BorderLayout.NORTH);
		frame.setVisible(true);
		
	}
	
	public void first() {
		
	}
	
	public void second() {
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
