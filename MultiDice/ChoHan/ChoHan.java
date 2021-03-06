//wes allen
package ChoHan;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ChoHan extends JFrame
{
	JMenuBar mainBar = new JMenuBar();
	JMenu menu1 = new JMenu("Menu");
	JMenuItem newgame = new JMenuItem("New Game");
	JMenuItem rules = new JMenuItem("Rules");
	Icon one = new ImageIcon(getClass().getResource("d1.png"));
	Icon two = new ImageIcon(getClass().getResource("d2.png"));
	Icon three = new ImageIcon(getClass().getResource("d3.png"));
	Icon four = new ImageIcon(getClass().getResource("d4.png"));
	Icon five = new ImageIcon(getClass().getResource("d5.png"));
	Icon six = new ImageIcon(getClass().getResource("d6.png"));
	Icon ch = new ImageIcon(getClass().getResource("Cho_han.png"));
	Icon bg = new ImageIcon(getClass().getResource("bluedice.jpg"));
	public JLabel label1 = new JLabel("Cho Han");
	public JLabel label4 = new JLabel(one);
	public JLabel label5 = new JLabel(two);
	public JLabel label6 = new JLabel(three);
	public JLabel label7= new JLabel(four);
	public JLabel label8 = new JLabel(five);
	public JLabel label9 = new JLabel(six);
	public JLabel label10 = new JLabel("Bank $");
	public JLabel label11 = new JLabel("Bank $");
	public JLabel label14 = new JLabel("Bank $");
	public JLabel label15 = new JLabel("Bank $");
	public JLabel label16 = new JLabel("Wager $");
	public JLabel label17 = new JLabel("Wager $");
	public JLabel label18 = new JLabel("Wager $");
	public JLabel label19 = new JLabel("Wager $");
	public JLabel label20 = new JLabel("Result");
	public JLabel label21 = new JLabel(ch);
	public JCheckBox box1 = new JCheckBox("Odd");
	public JCheckBox box2 = new JCheckBox("Even");
	public JCheckBox box3 = new JCheckBox("Odd");
	public JCheckBox box4 = new JCheckBox("Even");
	public JCheckBox box5 = new JCheckBox("Odd");
	public JCheckBox box6 = new JCheckBox("Even");
	public JCheckBox box7 = new JCheckBox("Odd");
	public JCheckBox box8 = new JCheckBox("Even");
	public JButton button1 = new JButton("Roll Dice");
	public JButton button2 = new JButton("$10");
	public JButton button3 = new JButton("Clear");
	public JButton button4 = new JButton("$10");
	public JButton button5 = new JButton("Clear");
	public JButton button6 = new JButton("$10");
	public JButton button7 = new JButton("Clear");
	public JButton button8 = new JButton("$10");
	public JButton button9 = new JButton("Clear");
	public JTextField field1 = new JTextField(5);
	public JTextField field2 = new JTextField(5);
	public JTextField field3 = new JTextField(5);
	public JTextField field4 = new JTextField(5);
	public JTextField field5 = new JTextField(5);
	public JTextField field6 = new JTextField(5);
	public JTextField field7 = new JTextField(5);
	public JTextField field8 = new JTextField(5);
	public JTextField field9 = new JTextField("Player 1");
	public JTextField field10 = new JTextField("Player 2");
	public JTextField field11 = new JTextField("Player 3");
	public JTextField field12 = new JTextField("Player 4");
	public JTextField field13 = new JTextField(5);
	JPanel panel1 = new JPanel(new FlowLayout());
	JPanel panel2 = new JPanel(new FlowLayout());
	JPanel panel3 = new JPanel(new FlowLayout());
	JPanel panel4 = new JPanel(new FlowLayout());
	JPanel panel5 = new JPanel(new GridLayout(1, 6));
	JPanel panel6 = new JPanel(new FlowLayout());
	JPanel panel7 = new JPanel(new FlowLayout());
	int b1 = 100;
	int b2 = 100;
	int b3 = 100;
	int b4 = 100;
	int w1 = 0;
	int w2 = 0;
	int w3 = 0;
	int w4 = 0;
	int r1 = 0;
	String bank1 = "100";
	String bank2 = "100";
	String bank3 = "100";
	String bank4 = "100";
	String wager1 = "0";
	String wager2 = "0";
	String wager3 = "0";
	String wager4 = "0";
	String result = "";
	public ChoHan()
	{
		super("Cho Han");
		setJMenuBar(mainBar);
		mainBar.add(menu1);
		menu1.add(newgame);
		menu1.add(rules);
		setContentPane(new JLabel(bg));
		setLayout(new GridLayout(7, 1));
		field1.setText(bank1);
		field1.setEditable(false);
		field2.setText(wager1);
		field2.setEditable(false);
		field3.setText(bank2);
		field3.setEditable(false);
		field4.setText(wager2);
		field4.setEditable(false);
		field5.setText(bank3);
		field5.setEditable(false);
		field6.setText(wager3);
		field6.setEditable(false);
		field7.setText(bank4);
		field7.setEditable(false);
		field8.setText(wager4);
		field8.setEditable(false);
		field13.setEditable(false);
		panel1.setOpaque(false);
		panel2.setOpaque(false);
		panel3.setOpaque(false);
		panel4.setOpaque(false);
		panel5.setOpaque(false);
		panel6.setOpaque(false);
		panel7.setOpaque(false);
		Font headlinefont = new Font("Arial", Font.BOLD, 28);
		label1.setFont(headlinefont);
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel6);
		add(panel7);
		add(panel4);
		add(panel5);
		box1.setMnemonic(KeyEvent.VK_1);
		box2.setMnemonic(KeyEvent.VK_2);
		box3.setMnemonic(KeyEvent.VK_3);
		box4.setMnemonic(KeyEvent.VK_4);
		box5.setMnemonic(KeyEvent.VK_5);
		box6.setMnemonic(KeyEvent.VK_6);
		box7.setMnemonic(KeyEvent.VK_7);
		box8.setMnemonic(KeyEvent.VK_8);
		panel1.add(label21);
		panel1.add(label1);
		panel2.add(field9);
		panel2.add(box1);
		panel2.add(box2);
		panel2.add(label10);
		panel2.add(field1);
		panel2.add(label16);
		panel2.add(field2);
		panel2.add(button2);
		panel2.add(button3);
		panel3.add(field10);
		panel3.add(box3);
		panel3.add(box4);
		panel3.add(label11);
		panel3.add(field3);
		panel3.add(label17);
		panel3.add(field4);
		panel3.add(button4);
		panel3.add(button5);
		panel6.add(field11);
		panel6.add(box5);
		panel6.add(box6);
		panel6.add(label14);
		panel6.add(field5);
		panel6.add(label18);
		panel6.add(field6);
		panel6.add(button6);
		panel6.add(button7);
		panel7.add(field12);
		panel7.add(box7);
		panel7.add(box8);
		panel7.add(label15);
		panel7.add(field7);
		panel7.add(label19);
		panel7.add(field8);
		panel7.add(button8);
		panel7.add(button9);
		panel4.add(button1);
		panel4.add(label20);
		panel4.add(field13);
		panel5.add(label4);
		panel5.add(label5);
		panel5.add(label6);
		panel5.add(label7);
		panel5.add(label8);
		panel5.add(label9);
		Thehandler1 handler1 = new Thehandler1();
		box1.addItemListener(handler1);
		box2.addItemListener(handler1);
		box3.addItemListener(handler1);
		box4.addItemListener(handler1);
		box5.addItemListener(handler1);
		box6.addItemListener(handler1);
		box7.addItemListener(handler1);
		box8.addItemListener(handler1);
		Thehandler2 handler2 = new Thehandler2();
		button1.addActionListener(handler2);
		button2.addActionListener(handler2);
		button3.addActionListener(handler2);
		button4.addActionListener(handler2);
		button5.addActionListener(handler2);
		button6.addActionListener(handler2);
		button7.addActionListener(handler2);
		button8.addActionListener(handler2);
		button9.addActionListener(handler2);
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
				}
				else
				{
					box2.setEnabled(true);
				}
			}
			if(source == box2)
			{
				if(box2.isSelected())
				{
					box1.setEnabled(false);
				}
				else
				{
					box1.setEnabled(true);
				}
			}
			if(source == box3)
			{
				if(box3.isSelected())
				{
					box4.setEnabled(false);
				}
				else
				{
					box4.setEnabled(true);
				}
			}
			if(source == box4)
			{
				if(box4.isSelected())
				{
					box3.setEnabled(false);
				}
				else
				{
					box3.setEnabled(true);
				}
			}
			if(source == box5)
			{
				if(box5.isSelected())
				{
					box6.setEnabled(false);
				}
				else
				{
					box6.setEnabled(true);
				}
			}
			if(source == box6)
			{
				if(box6.isSelected())
				{
					box5.setEnabled(false);
				}
				else
				{
					box5.setEnabled(true);
				}
			}
			if(source == box7)
			{
				if(box7.isSelected())
				{
					box8.setEnabled(false);
				}
				else
				{
					box8.setEnabled(true);
				}
			}
			if(source == box8)
			{
				if(box8.isSelected())
				{
					box7.setEnabled(false);
				}
				else
				{
					box7.setEnabled(true);
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
				b3 = b3 - w3;
				b4 = b4 - w4; 
				Die d1 = new Die();
				Die d2 = new Die();
				Die d3 = new Die();
				Die d4 = new Die();
				Die d5 = new Die();
				Die d6 = new Die(); 
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
				if(d3.getdots() == 1)
				{
					label6.setIcon(one);
				}
				else if(d3.getdots() == 2)
				{
					label6.setIcon(two);
				}
				else if(d3.getdots() == 3)
				{
					label6.setIcon(three);
				}
				else if(d3.getdots() == 4)
				{
					label6.setIcon(four);
				}
				else if(d3.getdots() == 5)
				{
					label6.setIcon(five);
				}
				else if(d3.getdots() == 6)
				{
					label6.setIcon(six);
				}
				if(d4.getdots() == 1)
				{
					label7.setIcon(one);
				}
				else if(d4.getdots() == 2)
				{
					label7.setIcon(two);
				}
				else if(d4.getdots() == 3)
				{
					label7.setIcon(three);
				}
				else if(d4.getdots() == 4)
				{
					label7.setIcon(four);
				}
				else if(d4.getdots() == 5)
				{
					label7.setIcon(five);
				}
				else if(d4.getdots() == 6)
				{
					label7.setIcon(six);
				}
				if(d5.getdots() == 1)
				{
					label8.setIcon(one);
				}
				else if(d5.getdots() == 2)
				{
					label8.setIcon(two);
				}
				else if(d5.getdots() == 3)
				{
					label8.setIcon(three);
				}
				else if(d5.getdots() == 4)
				{
					label8.setIcon(four);
				}
				else if(d5.getdots() == 5)
				{
					label8.setIcon(five);
				}
				else if(d5.getdots() == 6)
				{
					label8.setIcon(six);
				}
				if(d6.getdots() == 1)
				{
					label9.setIcon(one);
				}
				else if(d6.getdots() == 2)
				{
					label9.setIcon(two);
				}
				else if(d6.getdots() == 3)
				{
					label9.setIcon(three);
				}
				else if(d6.getdots() == 4)
				{
					label9.setIcon(four);
				}
				else if(d6.getdots() == 5)
				{
					label9.setIcon(five);
				}
				else if(d6.getdots() == 6)
				{
					label9.setIcon(six);
				}
				r1 = d1.getdots() + d2.getdots() + d3.getdots() + d4.getdots() + d5.getdots() + d6.getdots();
				if(r1 % 2 == 1)
				{
					result = Integer.toString(r1);
					field13.setText(result  + " ODD");
					if(box1.isSelected() == true)
					{
						b1 = b1 + (w1 * 2);
					}
					if(box3.isSelected() == true)
					{
						b2 = b2 + (w2 * 2);
					}
					if(box5.isSelected() == true)
					{
						b3 = b3 + (w3 * 2);
					}
					if(box7.isSelected() == true)
					{
						b4 = b4 + (w4 * 2);
					}
				}
				else 
				{
					result = Integer.toString(r1);
					field13.setText(result  + " EVEN");
					if(box2.isSelected() == true)
					{
						b1 = b1 + (w1 * 2);
					}
					if(box4.isSelected() == true)
					{
						b2 = b2 + (w2 * 2);
					}
					if(box6.isSelected() == true)
					{
						b3 = b3 + (w3 * 2);
					}
					if(box8.isSelected() == true)
					{
						b4 = b4 + (w4 * 2);
					}
				}
				bank1 = Integer.toString(b1);
				field1.setText(bank1);
				bank2 = Integer.toString(b2);
				field3.setText(bank2);
				bank3 = Integer.toString(b3);
				field5.setText(bank3);
				bank4 = Integer.toString(b4);
				field7.setText(bank4);
				if(b1 <= 0)
				{
					box1.setEnabled(false);
					box2.setEnabled(false);
					button2.setEnabled(false);
					button3.setEnabled(false);
					w1 = 0;
					wager1 = Integer.toString(w1);
					field2.setText(wager1);
					JOptionPane.showMessageDialog(null, "Player 1 is bankrupt.");
				}
				if(b2 <= 0)
				{
					box3.setEnabled(false);
					box4.setEnabled(false);
					button4.setEnabled(false);
					button5.setEnabled(false);
					w2 = 0;
					wager1 = Integer.toString(w2);
					field4.setText(wager2);
					JOptionPane.showMessageDialog(null, "Player 2 is bankrupt.");
				}
				if(b3 <= 0)
				{
					box5.setEnabled(false);
					box6.setEnabled(false);
					button6.setEnabled(false);
					button7.setEnabled(false);
					w3 = 0;
					wager3 = Integer.toString(w3);
					field6.setText(wager3);
					JOptionPane.showMessageDialog(null, "Player 3 is bankrupt.");
				}
				if(b4 <= 0)
				{
					box7.setEnabled(false);
					box8.setEnabled(false);
					button8.setEnabled(false);
					button9.setEnabled(false);
					w4 = 0;
					wager4 = Integer.toString(w4);
					field8.setText(wager4);
					JOptionPane.showMessageDialog(null, "Player 4 is bankrupt.");
				}
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
			if(event.getSource() == button6)
			{
				w3 = w3 + 10;
				wager3 = Integer.toString(w3);
				field6.setText(wager3);
			}
			if(event.getSource() == button7)
			{
				w3 = 0;
				wager3 = Integer.toString(w3);
				field6.setText(wager3);
			}
			if(event.getSource() == button8)
			{
				w4 = w4 + 10;
				wager4 = Integer.toString(w4);
				field8.setText(wager4);
			}
			if(event.getSource() == button9)
			{
				w4 = 0;
				wager4 = Integer.toString(w4);
				field8.setText(wager4);
			}
			if(event.getSource() == newgame)
			{
				w1 = 0;
				w2 = 0;
				w3 = 0;
				w4 = 0;
				b1 = 100;
				b2 = 100;
				b3 = 100;
				b4 = 100;
				wager1 = Integer.toString(w1);
				wager2 = Integer.toString(w2);
				wager3 = Integer.toString(w3);
				wager4 = Integer.toString(w4);
				bank1 = Integer.toString(b1);
				bank2 = Integer.toString(b2);
				bank3 = Integer.toString(b3);
				bank4 = Integer.toString(b4);
				field2.setText(wager1);
				field4.setText(wager2);
				field6.setText(wager3);
				field8.setText(wager4);
				field1.setText(bank1);
				field3.setText(bank2);
				field5.setText(bank3);
				field7.setText(bank4);
				field9.setText("Player 1");
				field10.setText("Player 2");
				field11.setText("Player 3");
				field12.setText("Player 4");
				field13.setText("");
				box1.setSelected(false);
				box2.setSelected(false);
				box3.setSelected(false);
				box4.setSelected(false);
				box5.setSelected(false);
				box6.setSelected(false);
				box7.setSelected(false);
				box8.setSelected(false);
				box1.setEnabled(true);
				box2.setEnabled(true);
				box3.setEnabled(true);
				box4.setEnabled(true);
				box5.setEnabled(true);
				box6.setEnabled(true);
				box7.setEnabled(true);
				box8.setEnabled(true);
			}
			if(event.getSource() == rules)
			{
				JOptionPane.showMessageDialog(null, "Six dice are rolled.\nThe players choose how much they are going to wager.\nThe players choose what they are going to bet on:\n   Odd\n   Even.\nThe six dice are totaled up and the result is odd or even.\nIf the player chooses the correct result they win their money back plus the amount wagered.");
			}
		}
	}
}