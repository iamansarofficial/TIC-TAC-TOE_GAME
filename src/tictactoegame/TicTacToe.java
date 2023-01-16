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
		
		firstTurn();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i=0;i<9;i++) {
			if(e.getSource()==buttons[i]) {
				if(firstplayer_turn) {
					if(buttons[i].getText()=="") {
						buttons[i].setForeground(new Color(255,0,0));
						buttons[i].setText("X");
						firstplayer_turn=false;
						textfield.setText("O turn");
						check();
					}
				}else {
					if(buttons[i].getText()=="") {
						buttons[i].setForeground(new Color(0,0,255));
						buttons[i].setText("O");
						firstplayer_turn=true;
						textfield.setText("X turn");
						check();
				}
			}
		}
	}	
		
	}
	
    public void firstTurn(){
    	for (int i=0;i<9;i++) {
			buttons[i].setEnabled(false);
		}
    	
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	for (int i=0;i<9;i++) {
			buttons[i].setEnabled(true);
		}

    	if(random.nextInt(2)==0) {
    		firstplayer_turn=true;
    		textfield.setText("X-TURN");
    	}else {
    		firstplayer_turn=false;
    		textfield.setText("O-TURN");
    	}
   
		
	}
	
	public void check() {
		//check x win condition
		if((buttons[0].getText()=="X")&&
		  (buttons[1].getText()=="X")&&
		  (buttons[2].getText()=="X")){
			xWins(0,1,2);
		}
		if((buttons[3].getText()=="X")&&
				  (buttons[4].getText()=="X")&&
				  (buttons[5].getText()=="X")){
					xWins(3,4,5);
				}
		if((buttons[6].getText()=="X")&&
				  (buttons[7].getText()=="X")&&
				  (buttons[8].getText()=="X")){
					xWins(6,7,8);
				}
		if((buttons[0].getText()=="X")&&
				  (buttons[3].getText()=="X")&&
				  (buttons[6].getText()=="X")){
					xWins(0,3,6);
				}
		if((buttons[1].getText()=="X")&&
				  (buttons[4].getText()=="X")&&
				  (buttons[7].getText()=="X")){
					xWins(1,4,7);
				}
		if((buttons[2].getText()=="X")&&
				  (buttons[5].getText()=="X")&&
				  (buttons[8].getText()=="X")){
					xWins(2,5,8);
				}
		if((buttons[0].getText()=="X")&&
				  (buttons[4].getText()=="X")&&
				  (buttons[8].getText()=="X")){
					xWins(0,4,8);
				}
		if((buttons[2].getText()=="X")&&
				  (buttons[4].getText()=="X")&&
				  (buttons[6].getText()=="X")){
					xWins(2,4,6);
				}
		
		// check o win condition
		
		if((buttons[0].getText()=="O")&&
				  (buttons[1].getText()=="O")&&
				  (buttons[2].getText()=="O")){
					xWins(0,1,2);
				}
				if((buttons[3].getText()=="O")&&
						  (buttons[4].getText()=="O")&&
						  (buttons[5].getText()=="O")){
							oWins(3,4,5);
						}
				if((buttons[6].getText()=="O")&&
						  (buttons[7].getText()=="O")&&
						  (buttons[8].getText()=="O")){
							oWins(6,7,8);
						}
				if((buttons[0].getText()=="O")&&
						  (buttons[3].getText()=="O")&&
						  (buttons[6].getText()=="O")){
							oWins(0,3,6);
						}
				if((buttons[1].getText()=="O")&&
						  (buttons[4].getText()=="O")&&
						  (buttons[7].getText()=="O")){
							oWins(1,4,7);
						}
				if((buttons[2].getText()=="O")&&
						  (buttons[5].getText()=="O")&&
						  (buttons[8].getText()=="O")){
							oWins(2,5,8);
						}
				if((buttons[0].getText()=="O")&&
						  (buttons[4].getText()=="O")&&
						  (buttons[8].getText()=="O")){
							oWins(0,4,8);
						}
				if((buttons[2].getText()=="O")&&
						  (buttons[4].getText()=="O")&&
						  (buttons[6].getText()=="O")){
							oWins(2,4,6);
						}
		
		
		
	}
	public void xWins(int a,int b, int c) {
		buttons[a].setBackground(Color.GREEN);
		buttons[b].setBackground(Color.GREEN);
		buttons[c].setBackground(Color.GREEN);
		
		for (int i=0;i<9;i++) {
			buttons[i].setEnabled(false);
		}
	}
	public void oWins(int a,int b,int c) {
		buttons[a].setBackground(Color.GREEN);
		buttons[b].setBackground(Color.GREEN);
		buttons[c].setBackground(Color.GREEN);
		
		for (int i=0;i<9;i++) {
			buttons[i].setEnabled(false);
		}
	}
	

}
