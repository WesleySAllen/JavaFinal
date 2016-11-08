//wes allen
package HighLow;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
public class HighLow extends JFrame
{
	JMenuBar mainBar = new JMenuBar();
	JMenu menu1 = new JMenu("Menu");
	JMenuItem newgame = new JMenuItem("New Game");
	JMenuItem rules = new JMenuItem("Rules");
	Icon one = new ImageIcon(getClass().getResource("d1r.png"));
	Icon two = new ImageIcon(getClass().getResource("d2r.png"));
	Icon three = new ImageIcon(getClass().getResource("d3r.png"));
	Icon four = new ImageIcon(getClass().getResource("d4r.png"));
	Icon five = new ImageIcon(getClass().getResource("d5r.png"));
	Icon six = new ImageIcon(getClass().getResource("d6r.png"));
	Icon hl1 = new ImageIcon(getClass().getResource("highlow1.png"));
	Icon hl2 = new ImageIcon(getClass().getResource("up.png"));
	Icon hl3 = new ImageIcon(getClass().getResource("down.png"));
	Icon bg = new ImageIcon(getClass().getResource("bdice.jpg"));
	public JLabel label2 = new JLabel("Player 1");
	public JLabel label3 = new JLabel("Player 2");
	public JLabel label4 = new JLabel(one);
	public JLabel label5 = new JLabel(two);
	public JLabel label6 = new JLabel(hl1);
	public JLabel label7 = new JLabel(hl2);
	public JLabel label8 = new JLabel("Wager $");
	public JLabel label9 = new JLabel("Wager $");
	public JLabel label10 = new JLabel("Bank $");
	public JLabel label11 = new JLabel("Bank $");
	public JLabel label12 = new JLabel(hl3);
	public JLabel label13 = new JLabel("Result: ");
	public JCheckBox box1 = new JCheckBox("High");
	public JCheckBox box2 = new JCheckBox("Low");
	public JCheckBox box3 = new JCheckBox("Even");
	public JCheckBox box4 = new JCheckBox("High");
	public JCheckBox box5 = new JCheckBox("Low");
	public JCheckBox box6 = new JCheckBox("Even");
	public JButton button1 = new JButton("Roll Dice");
	public JButton button2 = new JButton("$10");
	public JButton button3 = new JButton("Clear");
	public JButton button4 = new JButton("$10");
	public JButton button5 = new JButton("Clear");
	public JTextField field1 = new JTextField(5);
	public JTextField field2 = new JTextField(5);
	public JTextField field3 = new JTextField(5);
	public JTextField field4 = new JTextField(5);
	public JTextField field5 = new JTextField(5);
	JPanel panel1 = new JPanel(new FlowLayout());
	JPanel panel2 = new JPanel(new FlowLayout());
	JPanel panel3 = new JPanel(new FlowLayout());
	JPanel panel4 = new JPanel(new FlowLayout());
	JPanel panel5 = new JPanel(new FlowLayout());
	int b1 = 100;
	int b2 = 100;
	int w1 = 0;
	int w2 = 0;
	String bank1 = "100";
	String bank2 = "100";
	String wager1 = "0";
	String wager2 = "0";
	String result = "";
	int r1 = 0;
	public HighLow()
	{
		super("High Low");
		setJMenuBar(mainBar);
		mainBar.add(menu1);
		menu1.add(newgame);
		menu1.add(rules);
		setContentPane(new JLabel(bg));
		setLayout(new GridLayout(5, 1));
		panel1.setOpaque(false);
		panel2.setOpaque(false);
		panel3.setOpaque(false);
		panel4.setOpaque(false);
		panel5.setOpaque(false);
		Font headlinefont = new Font("Arial", Font.BOLD, 28);
		label2.setFont(headlinefont);
		label3.setFont(headlinefont);
		label8.setFont(headlinefont);
		label9.setFont(headlinefont);
		label10.setFont(headlinefont);
		label11.setFont(headlinefont);
		label13.setFont(headlinefont);
		box1.setFont(headlinefont);
		box2.setFont(headlinefont);
		box3.setFont(headlinefont);
		box4.setFont(headlinefont);
		box5.setFont(headlinefont);
		box6.setFont(headlinefont);
		label2.setForeground(Color.RED);
		label3.setForeground(Color.RED);
		label8.setForeground(Color.RED);
		label9.setForeground(Color.RED);
		label10.setForeground(Color.RED);
		label11.setForeground(Color.RED);
		label13.setForeground(Color.RED);
		box1.setForeground(Color.RED);
		box2.setForeground(Color.RED);
		box3.setForeground(Color.RED);
		box4.setForeground(Color.RED);
		box5.setForeground(Color.RED);
		box6.setForeground(Color.RED);
		button1.setForeground(Color.RED);
		button2.setForeground(Color.RED);
		button3.setForeground(Color.RED);
		button4.setForeground(Color.RED);
		button5.setForeground(Color.RED);
		field1.setForeground(Color.RED);
		field2.setForeground(Color.RED);
		field3.setForeground(Color.RED);
		field4.setForeground(Color.RED);
		field5.setForeground(Color.RED);
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		add(panel5);
		field1.setText(bank1);
		field1.setEditable(false);
		field2.setText(wager1);
		field2.setEditable(false);
		field3.setText(bank2);
		field3.setEditable(false);
		field4.setText(wager2);
		field4.setEditable(false);
		field5.setEditable(false);
		box1.setMnemonic(KeyEvent.VK_1);
		box2.setMnemonic(KeyEvent.VK_2);
		box3.setMnemonic(KeyEvent.VK_3);
		box4.setMnemonic(KeyEvent.VK_4);
		box5.setMnemonic(KeyEvent.VK_5);
		box6.setMnemonic(KeyEvent.VK_6);
		panel1.add(label7);
		panel1.add(label6);
		panel1.add(label12);
		panel2.add(label2);
		panel2.add(box1);
		panel2.add(box2);
		panel2.add(box3);
		panel2.add(label10);
		panel2.add(field1);
		panel2.add(label8);
		panel2.add(field2);
		panel2.add(button2);
		panel2.add(button3);
		panel3.add(label3);
		panel3.add(box4);
		panel3.add(box5);
		panel3.add(box6);
		panel3.add(label11);
		panel3.add(field3);
		panel3.add(label9);
		panel3.add(field4);
		panel3.add(button4);
		panel3.add(button5);
		panel4.add(button1);
		panel4.add(label13);
		panel4.add(field5);
		panel5.add(label4);
		panel5.add(label5);
		Thehandler1 handler1 = new Thehandler1();
		box1.addItemListener(handler1);
		box2.addItemListener(handler1);
		box3.addItemListener(handler1);
		box4.addItemListener(handler1);
		box5.addItemListener(handler1);
		box6.addItemListener(handler1);
		Thehandler2 handler2 = new Thehandler2();
		button1.addActionListener(handler2);
		button2.addActionListener(handler2);
		button3.addActionListener(handler2);
		button4.addActionListener(handler2);
		button5.addActionListener(handler2);
		newgame.addActionListener(handler2);
		rules.addActionListener(handler2);
	}
	public class Thehandler1 implements ItemListener
	{
		public void itemStateChanged(ItemEvent Event)
		{
			Object source = Event.getItemSelectable();
			if(source == box1)
			{
				if(box1.isSelected())
				{
					box2.setEnabled(false);
					box3.setEnabled(false);
				}
				else
				{
					box2.setEnabled(true);
					box3.setEnabled(true);
				}
			}
			if(source == box2)
			{
				if(box2.isSelected())
				{
					box1.setEnabled(false);
					box3.setEnabled(false);
				}
				else
				{
					box1.setEnabled(true);
					box3.setEnabled(true);
				}
			}
			if(source == box3)
			{
				if(box3.isSelected())
				{
					box2.setEnabled(false);
					box1.setEnabled(false);
				}
				else
				{
					box2.setEnabled(true);
					box1.setEnabled(true);
				}
			}
			if(source == box4)
			{
				if(box4.isSelected())
				{
					box5.setEnabled(false);
					box6.setEnabled(false);
				}
				else
				{
					box5.setEnabled(true);
					box6.setEnabled(true);
				}
			}
			if(source == box5)
			{
				if(box5.isSelected())
				{
					box4.setEnabled(false);
					box6.setEnabled(false);
				}
				else
				{
					box4.setEnabled(true);
					box6.setEnabled(true);
				}
			}
			if(source == box6)
			{
				if(box6.isSelected())
				{
					box5.setEnabled(false);
					box4.setEnabled(false);
				}
				else
				{
					box5.setEnabled(true);
					box4.setEnabled(true);
				}
			}
		}
	}
	public class Thehandler2 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if(event.getSource() == button1)
			{
				b1 = b1 - w1;
				b2 = b2 - w2;
				Die d1 = new Die();
				Die d2 = new Die();
				if(d1.getdots() == 1)
				{
					label4.setIcon(one);
				}
				else if(d1.getdots() == 2)
				{
					label4.setIcon(two);
				}
				else if(d1.getdots() == 3)
				{
					label4.setIcon(three);
				}
				else if(d1.getdots() == 4)
				{
					label4.setIcon(four);
				}
				else if(d1.getdots() == 5)
				{
					label4.setIcon(five);
				}
				else if(d1.getdots() == 6)
				{
					label4.setIcon(six);
				}
				
				if(d2.getdots() == 1)
				{
					label5.setIcon(one);
				}
				else if(d2.getdots() == 2)
				{
					label5.setIcon(two);
				}
				else if(d2.getdots() == 3)
				{
					label5.setIcon(three);
				}
				else if(d2.getdots() == 4)
				{
					label5.setIcon(four);
				}
				else if(d2.getdots() == 5)
				{
					label5.setIcon(five);
				}
				else if(d2.getdots() == 6)
				{
					label5.setIcon(six);
				}
				r1 = d1.getdots() + d2.getdots();
				if(r1 == 2 || r1 == 3 || r1 == 4 || r1 == 5 || r1 == 6)
				{
					result = Integer.toString(r1);
					field5.setText(result  + " LOW");
					if(box2.isSelected() == true)
					{
						b1 = b1 + (w1 * 2);
					}
					if(box5.isSelected() == true)
					{
						b2 = b2 + (w2 * 2);
					}
				}
				else if(r1 == 8 || r1 == 9 || r1 == 10 || r1 == 11 || r1 == 12)
				{
					result = Integer.toString(r1);
					field5.setText(result  + " HIGH");
					if(box1.isSelected() == true)
					{
						b1 = b1 + (w1 * 2);
					}
					if(box4.isSelected() == true)
					{
						b2 = b2 + (w2 * 2);
					}
				}
				else 
				{
					result = Integer.toString(r1);
					field5.setText(result  + " EVEN");
					if(box3.isSelected() == true)
					{
						b1 = b1 + (w1 * 4);
					}
					if(box6.isSelected() == true)
					{
						b2 = b2 + (w2 * 4);
					}
				}
				bank1 = Integer.toString(b1);
				field1.setText(bank1);
				bank2 = Integer.toString(b2);
				field3.setText(bank2);
			}
			if(event.getSource() == button2)
			{
				w1 = w1 + 10;
				wager1 = Integer.toString(w1);
				field2.setText(wager1);
			}
			if(event.getSource() == button3)
			{
				w1 = 0;
				wager1 = Integer.toString(w1);
				field2.setText(wager1);
			}
			if(event.getSource() == button4)
			{
				w2 = w2 + 10;
				wager2 = Integer.toString(w2);
				field4.setText(wager2);
			}
			if(event.getSource() == button5)
			{
				w2 = 0;
				wager2 = Integer.toString(w2);
				field4.setText(wager2);
			}
			if(event.getSource() == newgame)
			{
				b1 = 100;
				b2 = 100;
				w1 = 0;
				w2 = 0;
				bank1 = Integer.toString(b1);
				field1.setText(bank1);
				bank2 = Integer.toString(b2);
				field3.setText(bank2);
				wager1 = Integer.toString(w1);
				field2.setText(wager1);
				wager2 = Integer.toString(w2);
				field4.setText(wager2);
			}
			if(event.getSource() == rules)
			{
				JOptionPane.showMessageDialog(null, "Two dice are  rolled and added up.\nThe players will choose how much money they are going to wager.\nThe players then chose what they are betting on:\n   High = 8 - 12\n   Even = 7\n   Low = 2 - 6.\nIf the result is high or low, and the player placed their bet on the correct choice, they will win their money back plus the amount the bet.\nIf the result is even, and the player placed their bet on the correct choice, they win their money back plus triple the amount bet.");
			}
		}
	}
}