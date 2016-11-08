//wes allen
package Pig;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Pig extends JFrame
{
	JMenuBar mainBar = new JMenuBar();
	JMenu menu1 = new JMenu("Menu");
	JMenuItem newgame = new JMenuItem("New Game");
	JMenuItem rules = new JMenuItem("Rules");
	Icon one = new ImageIcon(getClass().getResource("d1b.png"));
	Icon two = new ImageIcon(getClass().getResource("d2b.png"));
	Icon three = new ImageIcon(getClass().getResource("d3b.png"));
	Icon four = new ImageIcon(getClass().getResource("d4b.png"));
	Icon five = new ImageIcon(getClass().getResource("d5b.png"));
	Icon six = new ImageIcon(getClass().getResource("d6b.png"));
	Icon pig1 = new ImageIcon(getClass().getResource("pig1.png"));
	Icon pig2 = new ImageIcon(getClass().getResource("pig2.png"));
	Icon bg = new ImageIcon(getClass().getResource("pigbg.jpg"));
	public JLabel label1 = new JLabel(pig2);
	public JLabel label11 = new JLabel(pig1);
	public JLabel label2 = new JLabel("Player1");
	public JLabel label3 = new JLabel("Player2");
	public JLabel label4 = new JLabel("Winner");
	public JLabel label5 = new JLabel("Round Score: ");
	public JLabel label6 = new JLabel("Round Score: ");
	public JLabel label7 = new JLabel(one);
	public JLabel label8 = new JLabel(six);
	public JLabel label9 = new JLabel("Bank Score: ");
	public JLabel label10 = new JLabel("Bank Score: ");
	public JLabel label12 = new JLabel("");
	public JLabel label13 = new JLabel("");
	public JLabel label14 = new JLabel("");
	public JButton button1 = new JButton("Roll Player 1");
	public JButton button2 = new JButton("Roll Player 2");
	public JButton button3 = new JButton("Bank Player 1");
	public JButton button4 = new JButton("Bank Player 2");
	JScrollPane scroll1;
	public JTextArea area1;
	JScrollPane scroll2;
	public JTextArea area2;
	public JTextField field1 = new JTextField(5);
	public JTextField field2 = new JTextField(5);
	public JTextField field3 = new JTextField(5);
	public JTextField field4 = new JTextField(5);
	JPanel panel1 = new JPanel(new GridLayout(5,2));
	JPanel panel2 = new JPanel(new GridLayout(6,1));
	JPanel panel3 = new JPanel(new GridLayout(6,1));
	String score1 = "0";
	String score2 = "0";
	String bank1 = "0";
	String bank2 = "0";
	int sc1 = 0;
	int b1 = 0;
	int b2 = 0;
	int sc2 = 0;
	int check1 = 0;
	int check2 = 0;
	public Pig()
	{
		super("Pig");
		setJMenuBar(mainBar);
		mainBar.add(menu1);
		menu1.add(newgame);
		menu1.add(rules);
		setContentPane(new JLabel(bg));
		setLayout(new GridLayout(1, 3));
		panel1.setOpaque(false);
		panel2.setOpaque(false);
		panel3.setOpaque(false);
		Font headlinefont = new Font("Arial", Font.BOLD, 28);
		label2.setFont(headlinefont);
		label3.setFont(headlinefont);
		label5.setFont(headlinefont);
		label6.setFont(headlinefont);
		label9.setFont(headlinefont);
		label10.setFont(headlinefont);
		area1 = new JTextArea();
		scroll1 = new JScrollPane(area1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll1.setPreferredSize(new Dimension(150, 300));
		area2 = new JTextArea();
		scroll2 = new JScrollPane(area2,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll2.setPreferredSize(new Dimension(150, 300));
		button1 = new JButton("Roll Player 1");
		button2 = new JButton("Roll Player 2");
		field1.setText(score1);
		field1.setEditable(false);
		field2.setText(bank1);
		field2.setEditable(false);
		field3.setText(score2);
		field3.setEditable(false);
		field4.setText(bank2);
		field4.setEditable(false);
		button2.setEnabled(false);
		button4.setEnabled(false);
		add(panel1);
		add(panel2);
		add(panel3);
		panel1.add(label1);
		panel1.add(label11);
		panel1.add(button1);
		panel1.add(button3);
		panel1.add(label7);
		panel1.add(label12);
		panel1.add(button2);
		panel1.add(button4);
		panel1.add(label8);
		panel1.add(label13);
		panel2.add(label2);
		panel2.add(scroll1);
		panel2.add(label5);
		panel2.add(field1);
		panel2.add(label9);
		panel2.add(field2);
		panel3.add(label3);
		panel3.add(scroll2);
		panel3.add(label6);
		panel3.add(field3);
		panel3.add(label10);
		panel3.add(field4);
		Thehandler1 handler1 = new Thehandler1();
		button1.addActionListener(handler1);
		button2.addActionListener(handler1);
		button3.addActionListener(handler1);
		button4.addActionListener(handler1);
		newgame.addActionListener(handler1);
		rules.addActionListener(handler1);
	}
	public class Thehandler1 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if(event.getSource() == button1)
			{
				Die d1 = new Die();
				if(d1.getdots() == 1)
				{
					label7.setIcon(one);
					area1.append("1\n");
					sc1 = 0;
					score1 = Integer.toString(sc1);
					field1.setText(score1);
					b1 = b1 + 0;
					bank1 = Integer.toString(b1);
					field2.setText(bank1);
					button1.setEnabled(false);
					button2.setEnabled(true);
					button3.setEnabled(false);
					button4.setEnabled(true);
				}
				else if(d1.getdots() == 2)
				{
					label7.setIcon(two);
					area1.append("2\n");
					sc1 += 2;
					score1 = Integer.toString(sc1);
					field1.setText(score1);
				}
				else if(d1.getdots() == 3)
				{
					label7.setIcon(three);
					area1.append("3\n");
					sc1 += 3;
					score1 = Integer.toString(sc1);
					field1.setText(score1);
				}
				else if(d1.getdots() == 4)
				{
					label7.setIcon(four);
					area1.append("4\n");
					sc1 += 4;
					score1 = Integer.toString(sc1);
					field1.setText(score1);
				}
				else if(d1.getdots() == 5)
				{
					label7.setIcon(five);
					area1.append("5\n");
					sc1 += 5;
					score1 = Integer.toString(sc1);
					field1.setText(score1);
				}
				else if(d1.getdots() == 6)
				{
					label7.setIcon(six);
					area1.append("6\n");
					sc1 += 6;
					score1 = Integer.toString(sc1);
					field1.setText(score1);
				}
			}
			if(event.getSource() == button2)
			{
				Die d2 = new Die();
				if(d2.getdots() == 1)
				{
					label8.setIcon(one);
					area2.append("1\n");
					sc2 = 0;
					score2 = Integer.toString(sc1);
					field3.setText(score2);
					b2 = b2 + 0;
					bank2 = Integer.toString(b2);
					field4.setText(bank2);
					button1.setEnabled(true);
					button2.setEnabled(false);
					button3.setEnabled(true);
					button4.setEnabled(false);
				}
				else if(d2.getdots() == 2)
				{
					label8.setIcon(two);
					area2.append("2\n");
					sc2 += 2;
					score2 = Integer.toString(sc1);
					field3.setText(score2);
				}
				else if(d2.getdots() == 3)
				{
					label8.setIcon(three);
					area2.append("3\n");
					sc2 += 3;
					score2 = Integer.toString(sc1);
					field3.setText(score2);
				}
				else if(d2.getdots() == 4)
				{
					label8.setIcon(four);
					area2.append("4\n");
					sc2 += 4;
					score2 = Integer.toString(sc1);
					field3.setText(score2);
				}
				else if(d2.getdots() == 5)
				{
					label8.setIcon(five);
					area2.append("5\n");
					sc2 += 5;
					score2 = Integer.toString(sc1);
					field3.setText(score2);
				}
				else if(d2.getdots() == 6)
				{
					label8.setIcon(six);
					area2.append("6\n");
					sc2 += 6;
					score2 = Integer.toString(sc1);
					field3.setText(score2);
				}
			}
			if(event.getSource() == button3)
			{
				b1 = b1 + sc1;
				bank1 = Integer.toString(b1);
				field2.setText(bank1);
				button1.setEnabled(false);
				button2.setEnabled(true);
				button3.setEnabled(false);
				button4.setEnabled(true);
				sc1 = 0;
				if(b1 >= 100)
				{
					JOptionPane.showMessageDialog(null, "Player 1 is the winner");
					button2.setEnabled(false);
					button4.setEnabled(false);
				}
			}
			if(event.getSource() == button4)
			{
				b2 = b2 + sc2;
				bank2 = Integer.toString(b2);
				field4.setText(bank2);
				button1.setEnabled(true);
				button2.setEnabled(false);
				button3.setEnabled(true);
				button4.setEnabled(false);
				sc2 = 0;
				if(b1 >= 100)
				{
					JOptionPane.showMessageDialog(null, "Player 2 is the winner");
					button1.setEnabled(false);
					button3.setEnabled(false);
				}
			}
			if(event.getSource() == newgame)
			{
				sc1 = 0;
				sc2 = 0;
				b1 = 0;
				b2 = 0;
				area1.setText("");
				area2.setText("");
				score1 = Integer.toString(sc1);
				score2 = Integer.toString(sc2);
				bank1 = Integer.toString(b1);
				bank2 = Integer.toString(b2);
				field1.setText(score1);
				field3.setText(score2);
				field2.setText(bank1);
				field4.setText(bank2);
				button1.setEnabled(true);
				button2.setEnabled(false);
				button3.setEnabled(true);
				button4.setEnabled(false);
			}
			if(event.getSource() == rules)
			{
				JOptionPane.showMessageDialog(null, "Objective - roll the dice to add up to a total of 100.\nPlay - If you roll a 2 through 6 the number on the dice is added to your score for the round.\n   You then have the option to bank your score for that round, or press your luck and roll again to try and increase your score for the round.\n   If you bank your points for the round are safe and your turn is over.\n   If you roll a 1 your score for the round becomes 0 and your turn is over.\nWinner - The first player to bank 100 points wins.");
			}
		}
	}
}