//wes allen
package CrownandAnchor;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CrownAndAnchor extends JFrame
{
	JMenuBar mainBar = new JMenuBar();
	JMenu menu1 = new JMenu("Menu");
	JMenuItem newgame = new JMenuItem("New Game");
	JMenuItem rules = new JMenuItem("Rules");
	Icon a = new ImageIcon(getClass().getResource("anchor.png"));
	Icon cl = new ImageIcon(getClass().getResource("club.png"));
	Icon h = new ImageIcon(getClass().getResource("heart.png"));
	Icon d = new ImageIcon(getClass().getResource("diamond.png"));
	Icon s = new ImageIcon(getClass().getResource("spade.png"));
	Icon cr = new ImageIcon(getClass().getResource("crown.png"));
	Icon l1 = new ImageIcon(getClass().getResource("calogo.png"));
	Icon l2 = new ImageIcon(getClass().getResource("calogo2.png"));
	Icon bg = new ImageIcon(getClass().getResource("bg.jpg"));
	Icon catext = new ImageIcon(getClass().getResource("CAtext.png"));
	public JLabel label1 = new JLabel(catext);
	public JLabel label2 = new JLabel("Bet on");
	public JLabel label3 = new JLabel("Wager Amount");
	public JLabel label4 = new JLabel("Bank");
	public JLabel label5 = new JLabel("Result");
	public JLabel label6 = new JLabel(a);
	public JLabel label7 = new JLabel(cr);
	public JLabel label8 = new JLabel(a);
	public JLabel label9 = new JLabel("");
	public JLabel label10 = new JLabel("");
	public JLabel label11 = new JLabel("");
	public JLabel label12 = new JLabel(l1);
	public JLabel label13 = new JLabel(l2);
	public JCheckBox box1 = new JCheckBox("Hearts");
	public JCheckBox box2 = new JCheckBox("Spades");
	public JCheckBox box3 = new JCheckBox("Diamonds");
	public JCheckBox box4 = new JCheckBox("Clubs");
	public JCheckBox box5 = new JCheckBox("Crowns");
	public JCheckBox box6 = new JCheckBox("Anchors");
	public JTextField field1 = new JTextField(5);
	public JTextField field2 = new JTextField(5);
	public JTextField field3 = new JTextField(5);
	public JButton button1 = new JButton("Roll Dice");
	public JButton button2 = new JButton("$1");
	public JButton button3 = new JButton("$5");
	public JButton button4 = new JButton("$10");
	public JButton button5 = new JButton("$100");
	public JButton button6 = new JButton("Clear");
	JPanel panel1 = new JPanel(new FlowLayout());
	JPanel panel2 = new JPanel(new GridLayout(6, 2));
	JPanel panel3 = new JPanel(new GridLayout(7, 1));
	JPanel panel4 = new JPanel(new GridLayout(1, 3));
	JPanel panel5 = new JPanel(new FlowLayout());
	String wager = "$0";
	String bank = "$1000";
	int w = 0;
	int b = 1000;
	int correct = 0;
	int payout = 0;
	public CrownAndAnchor()
	{
		super("Crown and Anchor");
		setJMenuBar(mainBar);
		mainBar.add(menu1);
		menu1.add(newgame);
		menu1.add(rules);
		setContentPane(new JLabel(bg));
		setLayout(new BorderLayout());
		field1.setText(wager);
		field1.setEditable(false);
		field2.setText(bank);
		field2.setEditable(false);
		field3.setText("0 correct");
		field3.setEditable(false);
		box1.setMnemonic(KeyEvent.VK_1);
		box2.setMnemonic(KeyEvent.VK_2);
		box3.setMnemonic(KeyEvent.VK_3);
		box4.setMnemonic(KeyEvent.VK_4);
		box5.setMnemonic(KeyEvent.VK_5);
		box6.setMnemonic(KeyEvent.VK_6);
		panel1.setOpaque(false);
		panel2.setOpaque(false);
		panel3.setOpaque(false);
		panel4.setOpaque(false);
		panel5.setOpaque(false);
		add(panel1, BorderLayout.NORTH);
		add(panel2, BorderLayout.WEST);
		add(panel3, BorderLayout.EAST);
		add(panel4, BorderLayout.SOUTH);
		add(panel5, BorderLayout.CENTER);
		panel1.add(label12);
		panel1.add(label1);
		panel1.add(label13);
		panel2.add(label3);
		panel2.add(field1);
		panel2.add(button6);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(label9);
		panel2.add(label4);
		panel2.add(field2);
		panel2.add(button1);
		panel3.add(label2);
		panel3.add(box1);
		panel3.add(box2);
		panel3.add(box3);
		panel3.add(box4);
		panel3.add(box5);
		panel3.add(box6);
		panel4.add(label6);
		panel4.add(label7);
		panel4.add(label8);
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
		button6.addActionListener(handler2);
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
					box4.setEnabled(false);
					box5.setEnabled(false);
					box6.setEnabled(false);
				}
				else
				{
					box2.setEnabled(true);
					box3.setEnabled(true);
					box4.setEnabled(true);
					box5.setEnabled(true);
					box6.setEnabled(true);
				}
			}
			if(source == box2)
			{
				if(box2.isSelected())
				{
					box1.setEnabled(false);
					box3.setEnabled(false);
					box4.setEnabled(false);
					box5.setEnabled(false);
					box6.setEnabled(false);
				}
				else
				{
					box1.setEnabled(true);
					box3.setEnabled(true);
					box4.setEnabled(true);
					box5.setEnabled(true);
					box6.setEnabled(true);
				}
			}
			if(source == box3)
			{
				if(box3.isSelected())
				{
					box2.setEnabled(false);
					box1.setEnabled(false);
					box4.setEnabled(false);
					box5.setEnabled(false);
					box6.setEnabled(false);
				}
				else
				{
					box2.setEnabled(true);
					box1.setEnabled(true);
					box4.setEnabled(true);
					box5.setEnabled(true);
					box6.setEnabled(true);
				}
			}
			if(source == box4)
			{
				if(box4.isSelected())
				{
					box2.setEnabled(false);
					box3.setEnabled(false);
					box1.setEnabled(false);
					box5.setEnabled(false);
					box6.setEnabled(false);
				}
				else
				{
					box2.setEnabled(true);
					box3.setEnabled(true);
					box1.setEnabled(true);
					box5.setEnabled(true);
					box6.setEnabled(true);
				}
			}
			if(source == box5)
			{
				if(box5.isSelected())
				{
					box2.setEnabled(false);
					box3.setEnabled(false);
					box4.setEnabled(false);
					box1.setEnabled(false);
					box6.setEnabled(false);
				}
				else
				{
					box2.setEnabled(true);
					box3.setEnabled(true);
					box4.setEnabled(true);
					box1.setEnabled(true);
					box6.setEnabled(true);
				}
			}
			if(source == box6)
			{
				if(box6.isSelected())
				{
					box2.setEnabled(false);
					box3.setEnabled(false);
					box4.setEnabled(false);
					box5.setEnabled(false);
					box1.setEnabled(false);
				}
				else
				{
					box2.setEnabled(true);
					box3.setEnabled(true);
					box4.setEnabled(true);
					box5.setEnabled(true);
					box1.setEnabled(true);
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
				correct = 0;
				b = b - w;
				Die d1 = new Die();
				Die d2 = new Die();
				Die d3 = new Die();
				if(d1.getdots() == 1)
				{
					label6.setIcon(h);
				}
				else if(d1.getdots() == 2)
				{
					label6.setIcon(s);
				}
				else if(d1.getdots() == 3)
				{
					label6.setIcon(d);
				}
				else if(d1.getdots() == 4)
				{
					label6.setIcon(cl);
				}
				else if(d1.getdots() == 5)
				{
					label6.setIcon(cr);
				}
				else if(d1.getdots() == 6)
				{
					label6.setIcon(a);
				}
				if(d2.getdots() == 1)
				{
					label7.setIcon(h);
				}
				else if(d2.getdots() == 2)
				{
					label7.setIcon(s);
				}
				else if(d2.getdots() == 3)
				{
					label7.setIcon(d);
				}
				else if(d2.getdots() == 4)
				{
					label7.setIcon(cl);
				}
				else if(d2.getdots() == 5)
				{
					label7.setIcon(cr);
				}
				else if(d2.getdots() == 6)
				{
					label7.setIcon(a);
				}
				if(d3.getdots() == 1)
				{
					label8.setIcon(h);
				}
				else if(d3.getdots() == 2)
				{
					label8.setIcon(s);
				}
				else if(d3.getdots() == 3)
				{
					label8.setIcon(d);
				}
				else if(d3.getdots() == 4)
				{
					label8.setIcon(cl);
				}
				else if(d3.getdots() == 5)
				{
					label8.setIcon(cr);
				}
				else if(d3.getdots() == 6)
				{
					label8.setIcon(a);
				}
				if (box1.isSelected() == true) 
				{
					if(d1.getdots() == 1)
					{
						correct += 1;
					}
					if(d2.getdots() == 1)
					{
						correct += 1;
					}
					if(d3.getdots() == 1)
					{
						correct += 1;
					}
				}
				else if (box2.isSelected() == true) 
				{
					if(d1.getdots() == 2)
					{
						correct += 1;
					}
					if(d2.getdots() == 2)
					{
						correct += 1;
					}
					if(d3.getdots() == 2)
					{
						correct += 1;
					}
				}
				else if (box3.isSelected() == true) 
				{
					if(d1.getdots() == 3)
					{
						correct += 1;
					}
					if(d2.getdots() == 3)
					{
						correct += 1;
					}
					if(d3.getdots() == 3)
					{
						correct += 1;
					}
				}
				else if (box4.isSelected() == true) 
				{
					if(d1.getdots() == 4)
					{
						correct += 1;
					}
					if(d2.getdots() == 4)
					{
						correct += 1;
					}
					if(d3.getdots() == 4)
					{
						correct += 1;
					}
				}
				else if (box5.isSelected() == true) 
				{
					if(d1.getdots() == 5)
					{
						correct += 1;
					}
					if(d2.getdots() == 5)
					{
						correct += 1;
					}
					if(d3.getdots() == 5)
					{
						correct += 1;
					}
				}
				else if (box6.isSelected() == true) 
				{
					if(d1.getdots() == 6)
					{
						correct += 1;
					}
					if(d2.getdots() == 6)
					{
						correct += 1;
					}
					if(d3.getdots() == 6)
					{
						correct += 1;
					}
				}
				if(correct == 1)
				{
					payout = w * 2;
				}
				else if(correct == 2)
				{
					payout = w * 3;
				}
				else if(correct == 3)
				{
					payout = w * 5;
				}
				else if(correct == 0)
				{
					payout = 0;
				}
				b = b + payout;
				bank = Integer.toString(b);
				field2.setText("$" + bank);
				if(b <= 0)
				{
					box1.setSelected(false);
					box2.setSelected(false);
					box3.setSelected(false);
					box4.setSelected(false);
					box5.setSelected(false);
					box6.setSelected(false);
					box1.setEnabled(false);
					box2.setEnabled(false);
					box3.setEnabled(false);
					box4.setEnabled(false);
					box5.setEnabled(false);
					box6.setEnabled(false);
					button1.setEnabled(false);
					button2.setEnabled(false);
					button3.setEnabled(false);
					button4.setEnabled(false);
					button5.setEnabled(false);
					button6.setEnabled(false);
					JOptionPane.showMessageDialog(null, "You are bankrupt.");
				}
			}
			if(event.getSource() == button2)
			{
				w += 1;
				wager = Integer.toString(w);
				field1.setText("$" + wager);
			}
			if(event.getSource() == button3)
			{
				w += 5;
				wager = Integer.toString(w);
				field1.setText("$" + wager);
			}
			if(event.getSource() == button4)
			{
				w += 10;
				wager = Integer.toString(w);
				field1.setText("$" + wager);
			}
			if(event.getSource() == button5)
			{
				w += 100;
				wager = Integer.toString(w);
				field1.setText("$" + wager);
			}
			if(event.getSource() == button6)
			{
				w = 0;
				wager = Integer.toString(w);
				field1.setText("$" + wager);
			}
			if(event.getSource() == newgame)
			{
				w = 0;
				b = 1000;
				wager = Integer.toString(w);
				bank = Integer.toString(b);
				field1.setText("$" + wager);
				field2.setText("$" + bank);
				box1.setSelected(false);
				box2.setSelected(false);
				box3.setSelected(false);
				box4.setSelected(false);
				box5.setSelected(false);
				box6.setSelected(false);
				box1.setEnabled(true);
				box2.setEnabled(true);
				box3.setEnabled(true);
				box4.setEnabled(true);
				box5.setEnabled(true);
				box6.setEnabled(true);
			}
			if(event.getSource() == rules)
			{
				JOptionPane.showMessageDialog(null, "Three dice are rollec.\nA player chooses how much they are going to wager,\nA player then chooses what they are going to bet on\n   Hearts\n   Clubs\n   Diamonds\n   Spades\n   Crowns\n   Anchors.\nIf one of the rolled dice equals the players choice they win their money back plus the amount wagered.\nIf two of the rolled dice equals the players choice they win their money back plus double the amount wagered.\nif three of the rolled eice equals the players choice they win their money back plus quadruple the amount wagered.");
			}
		}
	}
}