//wes allen
package Lcr;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LCR extends JFrame
{
	JMenuBar mainBar = new JMenuBar();
	JMenu menu1 = new JMenu("Menu");
	JMenuItem newgame = new JMenuItem("New Game");
	JMenuItem rules = new JMenuItem("Rules");
	Icon l = new ImageIcon(getClass().getResource("L.png"));
	Icon c = new ImageIcon(getClass().getResource("C.png"));
	Icon r = new ImageIcon(getClass().getResource("R.png"));
	Icon dot = new ImageIcon(getClass().getResource("dot.png"));
	Icon black = new ImageIcon(getClass().getResource("201bk.png"));
	Icon blue = new ImageIcon(getClass().getResource("201bl.png"));
	Icon green = new ImageIcon(getClass().getResource("201gr.png"));
	Icon red = new ImageIcon(getClass().getResource("201rd.png"));
	Icon lcr1 = new ImageIcon(getClass().getResource("lcr1.jpg"));
	Icon lcr2 = new ImageIcon(getClass().getResource("lotsdice.jpg"));
	Icon lcr3 = new ImageIcon(getClass().getResource("waterdice.jpg"));
	public JTextField field1 = new JTextField("Player 1");
	public JTextField field2 = new JTextField("Player 2");
	public JTextField field3 = new JTextField("Player 4");
	public JTextField field4 = new JTextField("Player 3");
	public JLabel label1 = new JLabel("Player 1");
	public JLabel label2 = new JLabel("Player 2");
	public JLabel label3 = new JLabel("Player 4");
	public JLabel label4 = new JLabel("Player 3");
	public JLabel label5 = new JLabel(l);
	public JLabel label6 = new JLabel(c);
	public JLabel label7 = new JLabel(r);
	public JLabel label8 = new JLabel(dot);
	public JLabel label9 = new JLabel(black);
	public JLabel label10 = new JLabel(black);
	public JLabel label11 = new JLabel(black);
	public JLabel label12 = new JLabel(black);
	public JLabel label13 = new JLabel(black);
	public JLabel label14 = new JLabel(blue);
	public JLabel label15 = new JLabel(blue);
	public JLabel label16 = new JLabel(blue);
	public JLabel label17 = new JLabel(blue);
	public JLabel label18 = new JLabel(blue);
	public JLabel label19 = new JLabel(green);
	public JLabel label20 = new JLabel(green);
	public JLabel label21 = new JLabel(green);
	public JLabel label22 = new JLabel(green);
	public JLabel label23 = new JLabel(green);
	public JLabel label24 = new JLabel(red);
	public JLabel label25 = new JLabel(red);
	public JLabel label26 = new JLabel(red);
	public JLabel label27 = new JLabel(red);
	public JLabel label28 = new JLabel(red);
	public JLabel label29 = new JLabel(lcr1);
	public JLabel label30 = new JLabel(lcr2);
	public JLabel label31 = new JLabel(lcr3);
	public JButton button1 = new JButton("Roll Player 1");
	public JButton button2 = new JButton("Roll Player 2");
	public JButton button3 = new JButton("Roll Player 3");
	public JButton button4 = new JButton("Roll Player 4");
	JPanel panel1 = new JPanel(new FlowLayout());
	JPanel panel2 = new JPanel(new FlowLayout());
	JPanel panel3 = new JPanel(new FlowLayout());
	JPanel panel4 = new JPanel(new FlowLayout());
	JPanel panel5 = new JPanel(new FlowLayout());
	JPanel panel6 = new JPanel(new FlowLayout());
	JPanel panel7 = new JPanel(new GridLayout(4, 2));
	JPanel panel8 = new JPanel(new FlowLayout());
	JPanel panel9 = new JPanel(new FlowLayout());
	int x = 0;
	public LCR()
	{
		super("Left Center Right");
		setJMenuBar(mainBar);
		mainBar.add(menu1);
		menu1.add(newgame);
		menu1.add(rules);
		setLayout(new GridLayout(3, 3));
		button2.setEnabled(false);
		button3.setEnabled(false);
		button4.setEnabled(false);
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		add(panel5);
		add(panel6);
		add(panel7);
		add(panel8);
		add(panel9);
		panel1.add(label29);
		panel3.add(label30);
		panel9.add(label31);
		panel2.add(field1);
		panel2.add(label9);
		panel2.add(label10);
		panel2.add(label11);
		panel2.add(label12);
		panel2.add(label13);
		panel4.add(field2);
		panel4.add(label14);
		panel4.add(label15);
		panel4.add(label16);
		panel4.add(label17);
		panel4.add(label18);
		panel6.add(field3);
		panel6.add(label19);
		panel6.add(label20);
		panel6.add(label21);
		panel6.add(label22);
		panel6.add(label23);
		panel8.add(field4);
		panel8.add(label24);
		panel8.add(label25);
		panel8.add(label26);
		panel8.add(label27);
		panel8.add(label28);
		panel7.add(button1);
		panel7.add(label5);
		panel7.add(button2);
		panel7.add(label6);
		panel7.add(button3);
		panel7.add(label7);
		panel7.add(button4);
		panel7.add(label8);
		Thehandler handler = new Thehandler();
		button1.addActionListener(handler);
		button2.addActionListener(handler);
		button3.addActionListener(handler);
		button4.addActionListener(handler);
		newgame.addActionListener(handler);
		rules.addActionListener(handler);
	}
	public class Thehandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if(event.getSource() == button1)
			{
				Die d1 = new Die();
				if(d1.getdots() == 1)
				{
					label5.setIcon(l);
					if(label9.getParent() == panel2)
					{
						panel2.remove(label9);
						panel6.add(label9);
						panel2.revalidate();
						panel6.revalidate();
						panel6.repaint();
						panel2.repaint();
					} 
					else if(label10.getParent() == panel2)
					{
						panel2.remove(label10);
						panel6.add(label10);
						panel2.revalidate();
						panel6.revalidate();
						panel6.repaint();
						panel2.repaint();
					} 
					else if(label11.getParent() == panel2)
					{
						panel2.remove(label11);
						panel6.add(label11);
						panel2.revalidate();
						panel6.revalidate();
						panel6.repaint();
						panel2.repaint();
					} 
					else if(label12.getParent() == panel2)
					{
						panel2.remove(label12);
						panel6.add(label12);
						panel2.revalidate();
						panel6.revalidate();
						panel6.repaint();
						panel2.repaint();
					} 
					else if(label13.getParent() == panel2)
					{
						panel2.remove(label13);
						panel6.add(label13);
						panel2.revalidate();
						panel6.revalidate();
						panel6.repaint();
						panel2.repaint();
					} 
					else if(label14.getParent() == panel2)
					{
						panel2.remove(label14);
						panel6.add(label14);
						panel2.revalidate();
						panel6.revalidate();
						panel6.repaint();
						panel2.repaint();
					} 
					else if(label15.getParent() == panel2)
					{
						panel2.remove(label15);
						panel6.add(label15);
						panel2.revalidate();
						panel6.revalidate();
						panel6.repaint();
						panel2.repaint();
					} 
					else if(label16.getParent() == panel2)
					{
						panel2.remove(label16);
						panel6.add(label16);
						panel2.revalidate();
						panel6.revalidate();
						panel6.repaint();
						panel2.repaint();
					} 
					else if(label17.getParent() == panel2)
					{
						panel2.remove(label17);
						panel6.add(label17);
						panel2.revalidate();
						panel6.revalidate();
						panel6.repaint();
						panel2.repaint();
					} 
					else if(label18.getParent() == panel2)
					{
						panel2.remove(label18);
						panel6.add(label18);
						panel2.revalidate();
						panel6.revalidate();
						panel6.repaint();
						panel2.repaint();
					} 
					else if(label19.getParent() == panel2)
					{
						panel2.remove(label19);
						panel6.add(label19);
						panel2.revalidate();
						panel6.revalidate();
						panel6.repaint();
						panel2.repaint();
					} 
					else if(label20.getParent() == panel2)
					{
						panel2.remove(label20);
						panel6.add(label20);
						panel2.revalidate();
						panel6.revalidate();
						panel6.repaint();
						panel2.repaint();
					}
					else if(label21.getParent() == panel2)
					{
						panel2.remove(label21);
						panel6.add(label21);
						panel2.revalidate();
						panel6.revalidate();
						panel6.repaint();
						panel2.repaint();
					} 
					else if(label22.getParent() == panel2)
					{
						panel2.remove(label22);
						panel6.add(label22);
						panel2.revalidate();
						panel6.revalidate();
						panel6.repaint();
						panel2.repaint();
					}
					else if(label23.getParent() == panel2)
					{
						panel2.remove(label23);
						panel6.add(label23);
						panel2.revalidate();
						panel6.revalidate();
						panel6.repaint();
						panel2.repaint();
					}
					else if(label24.getParent() == panel2)
					{
						panel2.remove(label24);
						panel6.add(label24);
						panel2.revalidate();
						panel6.revalidate();
						panel6.repaint();
						panel2.repaint();
					}
					else if(label25.getParent() == panel2)
					{
						panel2.remove(label25);
						panel6.add(label25);
						panel2.revalidate();
						panel6.revalidate();
						panel6.repaint();
						panel2.repaint();
					}
					else if(label26.getParent() == panel2)
					{
						panel2.remove(label26);
						panel6.add(label26);
						panel2.revalidate();
						panel6.revalidate();
						panel6.repaint();
						panel2.repaint();
					}
					else if(label27.getParent() == panel2)
					{
						panel2.remove(label27);
						panel6.add(label27);
						panel2.revalidate();
						panel6.revalidate();
						panel6.repaint();
						panel2.repaint();
					}
					else if(label28.getParent() == panel2)
					{
						panel2.remove(label28);
						panel6.add(label28);
						panel2.revalidate();
						panel6.revalidate();
						panel6.repaint();
						panel2.repaint();
					}
				}
				else if(d1.getdots() == 2)
				{
					label5.setIcon(c);
					if(label9.getParent() == panel2)
					{
						panel2.remove(label9);
						panel5.add(label9);
						panel2.revalidate();
						panel5.revalidate();
						panel5.repaint();
						panel2.repaint();
					} 
					else if(label10.getParent() == panel2)
					{
						panel2.remove(label10);
						panel5.add(label10);
						panel2.revalidate();
						panel5.revalidate();
						panel5.repaint();
						panel2.repaint();
					} 
					else if(label11.getParent() == panel2)
					{
						panel2.remove(label11);
						panel5.add(label11);
						panel2.revalidate();
						panel5.revalidate();
						panel5.repaint();
						panel2.repaint();
					} 
					else if(label12.getParent() == panel2)
					{
						panel2.remove(label12);
						panel5.add(label12);
						panel2.revalidate();
						panel5.revalidate();
						panel5.repaint();
						panel2.repaint();
					} 
					else if(label13.getParent() == panel2)
					{
						panel2.remove(label13);
						panel5.add(label13);
						panel2.revalidate();
						panel5.revalidate();
						panel5.repaint();
						panel2.repaint();
					} 
					else if(label14.getParent() == panel2)
					{
						panel2.remove(label14);
						panel5.add(label14);
						panel2.revalidate();
						panel5.revalidate();
						panel5.repaint();
						panel2.repaint();
					} 
					else if(label15.getParent() == panel2)
					{
						panel2.remove(label15);
						panel5.add(label15);
						panel2.revalidate();
						panel5.revalidate();
						panel5.repaint();
						panel2.repaint();
					} 
					else if(label16.getParent() == panel2)
					{
						panel2.remove(label16);
						panel5.add(label16);
						panel2.revalidate();
						panel5.revalidate();
						panel5.repaint();
						panel2.repaint();
					} 
					else if(label17.getParent() == panel2)
					{
						panel2.remove(label17);
						panel5.add(label17);
						panel2.revalidate();
						panel5.revalidate();
						panel5.repaint();
						panel2.repaint();
					} 
					else if(label18.getParent() == panel2)
					{
						panel2.remove(label18);
						panel5.add(label18);
						panel2.revalidate();
						panel5.revalidate();
						panel5.repaint();
						panel2.repaint();
					} 
					else if(label19.getParent() == panel2)
					{
						panel2.remove(label19);
						panel5.add(label19);
						panel2.revalidate();
						panel5.revalidate();
						panel5.repaint();
						panel2.repaint();
					} 
					else if(label20.getParent() == panel2)
					{
						panel2.remove(label20);
						panel5.add(label20);
						panel2.revalidate();
						panel5.revalidate();
						panel5.repaint();
						panel2.repaint();
					}
					else if(label21.getParent() == panel2)
					{
						panel2.remove(label21);
						panel5.add(label21);
						panel2.revalidate();
						panel5.revalidate();
						panel5.repaint();
						panel2.repaint();
					} 
					else if(label22.getParent() == panel2)
					{
						panel2.remove(label22);
						panel5.add(label22);
						panel2.revalidate();
						panel5.revalidate();
						panel5.repaint();
						panel2.repaint();
					}
					else if(label23.getParent() == panel2)
					{
						panel2.remove(label23);
						panel5.add(label23);
						panel2.revalidate();
						panel5.revalidate();
						panel5.repaint();
						panel2.repaint();
					}
					else if(label24.getParent() == panel2)
					{
						panel2.remove(label24);
						panel5.add(label24);
						panel2.revalidate();
						panel5.revalidate();
						panel5.repaint();
						panel2.repaint();
					}
					else if(label25.getParent() == panel2)
					{
						panel2.remove(label25);
						panel5.add(label25);
						panel2.revalidate();
						panel5.revalidate();
						panel5.repaint();
						panel2.repaint();
					}
					else if(label26.getParent() == panel2)
					{
						panel2.remove(label26);
						panel5.add(label26);
						panel2.revalidate();
						panel5.revalidate();
						panel5.repaint();
						panel2.repaint();
					}
					else if(label27.getParent() == panel2)
					{
						panel2.remove(label27);
						panel5.add(label27);
						panel2.revalidate();
						panel5.revalidate();
						panel5.repaint();
						panel2.repaint();
					}
					else if(label28.getParent() == panel2)
					{
						panel2.remove(label28);
						panel5.add(label28);
						panel2.revalidate();
						panel5.revalidate();
						panel5.repaint();
						panel2.repaint();
					}
				}
				else if(d1.getdots() == 3)
				{
					label5.setIcon(r);
					if(label9.getParent() == panel2)
					{
						panel2.remove(label9);
						panel4.add(label9);
						panel2.revalidate();
						panel4.revalidate();
						panel4.repaint();
						panel2.repaint();
					} 
					else if(label10.getParent() == panel2)
					{
						panel2.remove(label10);
						panel4.add(label10);
						panel2.revalidate();
						panel4.revalidate();
						panel4.repaint();
						panel2.repaint();
					} 
					else if(label11.getParent() == panel2)
					{
						panel2.remove(label11);
						panel4.add(label11);
						panel2.revalidate();
						panel4.revalidate();
						panel4.repaint();
						panel2.repaint();
					} 
					else if(label12.getParent() == panel2)
					{
						panel2.remove(label12);
						panel4.add(label12);
						panel2.revalidate();
						panel4.revalidate();
						panel4.repaint();
						panel2.repaint();
					} 
					else if(label13.getParent() == panel2)
					{
						panel2.remove(label13);
						panel4.add(label13);
						panel2.revalidate();
						panel4.revalidate();
						panel4.repaint();
						panel2.repaint();
					} 
					else if(label14.getParent() == panel2)
					{
						panel2.remove(label14);
						panel4.add(label14);
						panel2.revalidate();
						panel4.revalidate();
						panel4.repaint();
						panel2.repaint();
					} 
					else if(label15.getParent() == panel2)
					{
						panel2.remove(label15);
						panel4.add(label15);
						panel2.revalidate();
						panel4.revalidate();
						panel4.repaint();
						panel2.repaint();
					} 
					else if(label16.getParent() == panel2)
					{
						panel2.remove(label16);
						panel4.add(label16);
						panel2.revalidate();
						panel4.revalidate();
						panel4.repaint();
						panel2.repaint();
					} 
					else if(label17.getParent() == panel2)
					{
						panel2.remove(label17);
						panel4.add(label17);
						panel2.revalidate();
						panel4.revalidate();
						panel4.repaint();
						panel2.repaint();
					} 
					else if(label18.getParent() == panel2)
					{
						panel2.remove(label18);
						panel4.add(label18);
						panel2.revalidate();
						panel4.revalidate();
						panel4.repaint();
						panel2.repaint();
					} 
					else if(label19.getParent() == panel2)
					{
						panel2.remove(label19);
						panel4.add(label19);
						panel2.revalidate();
						panel4.revalidate();
						panel4.repaint();
						panel2.repaint();
					} 
					else if(label20.getParent() == panel2)
					{
						panel2.remove(label20);
						panel4.add(label20);
						panel2.revalidate();
						panel4.revalidate();
						panel4.repaint();
						panel2.repaint();
					}
					else if(label21.getParent() == panel2)
					{
						panel2.remove(label21);
						panel4.add(label21);
						panel2.revalidate();
						panel4.revalidate();
						panel4.repaint();
						panel2.repaint();
					} 
					else if(label22.getParent() == panel2)
					{
						panel2.remove(label22);
						panel4.add(label22);
						panel2.revalidate();
						panel4.revalidate();
						panel4.repaint();
						panel2.repaint();
					}
					else if(label23.getParent() == panel2)
					{
						panel2.remove(label23);
						panel4.add(label23);
						panel2.revalidate();
						panel4.revalidate();
						panel4.repaint();
						panel2.repaint();
					}
					else if(label24.getParent() == panel2)
					{
						panel2.remove(label24);
						panel4.add(label24);
						panel2.revalidate();
						panel4.revalidate();
						panel4.repaint();
						panel2.repaint();
					}
					else if(label25.getParent() == panel2)
					{
						panel2.remove(label25);
						panel4.add(label25);
						panel2.revalidate();
						panel4.revalidate();
						panel4.repaint();
						panel2.repaint();
					}
					else if(label26.getParent() == panel2)
					{
						panel2.remove(label26);
						panel4.add(label26);
						panel2.revalidate();
						panel4.revalidate();
						panel4.repaint();
						panel2.repaint();
					}
					else if(label27.getParent() == panel2)
					{
						panel2.remove(label27);
						panel4.add(label27);
						panel2.revalidate();
						panel4.revalidate();
						panel4.repaint();
						panel2.repaint();
					}
					else if(label28.getParent() == panel2)
					{
						panel2.remove(label28);
						panel4.add(label28);
						panel2.revalidate();
						panel4.revalidate();
						panel4.repaint();
						panel2.repaint();
					}
				}
				else
				{
					label5.setIcon(dot);
				}
				if(panel4.getComponentCount() >= 2)
				{
					button2.setEnabled(true);
					button1.setEnabled(false);
				}
				else if(panel8.getComponentCount() >= 2)
				{
					button3.setEnabled(true);
					button1.setEnabled(false);
				}
				else if(panel6.getComponentCount() >= 2)
				{
					button4.setEnabled(true);
					button1.setEnabled(false);
				}
				if(panel4.getComponentCount() < 2 && panel6.getComponentCount() < 2 && panel8.getComponentCount() < 2)
				{
					JOptionPane.showMessageDialog(null, "Player 1 is the winner.");
				}
			}
			if(event.getSource() == button2)
			{
				Die d2 = new Die();
				if(d2.getdots() == 1)
				{
					label6.setIcon(l);
					if(label9.getParent() == panel4)
					{
						panel4.remove(label9);
						panel2.add(label9);
						panel2.revalidate();
						panel4.revalidate();
						panel2.repaint();
						panel4.repaint();
					} 
					else if(label10.getParent() == panel4)
					{
						panel4.remove(label10);
						panel2.add(label10);
						panel2.revalidate();
						panel4.revalidate();
						panel2.repaint();
						panel4.repaint();
					} 
					else if(label11.getParent() == panel4)
					{
						panel4.remove(label11);
						panel2.add(label11);
						panel2.revalidate();
						panel4.revalidate();
						panel2.repaint();
						panel4.repaint();
					} 
					else if(label12.getParent() == panel4)
					{
						panel4.remove(label12);
						panel2.add(label12);
						panel2.revalidate();
						panel4.revalidate();
						panel2.repaint();
						panel4.repaint();
					} 
					else if(label13.getParent() == panel4)
					{
						panel4.remove(label13);
						panel2.add(label13);
						panel2.revalidate();
						panel4.revalidate();
						panel2.repaint();
						panel4.repaint();
					} 
					else if(label14.getParent() == panel4)
					{
						panel4.remove(label14);
						panel2.add(label14);
						panel2.revalidate();
						panel4.revalidate();
						panel2.repaint();
						panel4.repaint();
					} 
					else if(label15.getParent() == panel4)
					{
						panel4.remove(label15);
						panel2.add(label15);
						panel2.revalidate();
						panel4.revalidate();
						panel2.repaint();
						panel4.repaint();
					} 
					else if(label16.getParent() == panel4)
					{
						panel4.remove(label16);
						panel2.add(label16);
						panel2.revalidate();
						panel4.revalidate();
						panel2.repaint();
						panel4.repaint();
					} 
					else if(label17.getParent() == panel4)
					{
						panel4.remove(label17);
						panel2.add(label17);
						panel2.revalidate();
						panel4.revalidate();
						panel2.repaint();
						panel4.repaint();
					} 
					else if(label18.getParent() == panel4)
					{
						panel4.remove(label18);
						panel2.add(label18);
						panel2.revalidate();
						panel4.revalidate();
						panel2.repaint();
						panel4.repaint();
					} 
					else if(label19.getParent() == panel4)
					{
						panel4.remove(label19);
						panel2.add(label19);
						panel2.revalidate();
						panel4.revalidate();
						panel2.repaint();
						panel4.repaint();
					} 
					else if(label20.getParent() == panel4)
					{
						panel4.remove(label20);
						panel2.add(label20);
						panel2.revalidate();
						panel4.revalidate();
						panel2.repaint();
						panel4.repaint();
					}
					else if(label21.getParent() == panel4)
					{
						panel4.remove(label21);
						panel2.add(label21);
						panel2.revalidate();
						panel4.revalidate();
						panel2.repaint();
						panel4.repaint();
					} 
					else if(label22.getParent() == panel4)
					{
						panel4.remove(label22);
						panel2.add(label22);
						panel2.revalidate();
						panel4.revalidate();
						panel2.repaint();
						panel4.repaint();
					}
					else if(label23.getParent() == panel4)
					{
						panel4.remove(label23);
						panel2.add(label23);
						panel2.revalidate();
						panel4.revalidate();
						panel2.repaint();
						panel4.repaint();
					}
					else if(label24.getParent() == panel4)
					{
						panel4.remove(label24);
						panel2.add(label24);
						panel2.revalidate();
						panel4.revalidate();
						panel2.repaint();
						panel4.repaint();
					}
					else if(label25.getParent() == panel4)
					{
						panel4.remove(label25);
						panel2.add(label25);
						panel2.revalidate();
						panel4.revalidate();
						panel2.repaint();
						panel4.repaint();
					}
					else if(label26.getParent() == panel4)
					{
						panel4.remove(label26);
						panel2.add(label26);
						panel2.revalidate();
						panel4.revalidate();
						panel2.repaint();
						panel4.repaint();
					}
					else if(label27.getParent() == panel4)
					{
						panel4.remove(label27);
						panel2.add(label27);
						panel2.revalidate();
						panel4.revalidate();
						panel2.repaint();
						panel4.repaint();
					}
					else if(label28.getParent() == panel4)
					{
						panel4.remove(label28);
						panel2.add(label28);
						panel2.revalidate();
						panel4.revalidate();
						panel2.repaint();
						panel4.repaint();
					}
				}
				else if(d2.getdots() == 2)
				{
					label6.setIcon(c);
					if(label9.getParent() == panel4)
					{
						panel4.remove(label9);
						panel5.add(label9);
						panel5.revalidate();
						panel4.revalidate();
						panel5.repaint();
						panel4.repaint();
					} 
					else if(label10.getParent() == panel4)
					{
						panel4.remove(label10);
						panel5.add(label10);
						panel5.revalidate();
						panel4.revalidate();
						panel5.repaint();
						panel4.repaint();
					} 
					else if(label11.getParent() == panel4)
					{
						panel4.remove(label11);
						panel5.add(label11);
						panel5.revalidate();
						panel4.revalidate();
						panel5.repaint();
						panel4.repaint();
					} 
					else if(label12.getParent() == panel4)
					{
						panel4.remove(label12);
						panel5.add(label12);
						panel5.revalidate();
						panel4.revalidate();
						panel5.repaint();
						panel4.repaint();
					} 
					else if(label13.getParent() == panel4)
					{
						panel4.remove(label13);
						panel5.add(label13);
						panel5.revalidate();
						panel4.revalidate();
						panel5.repaint();
						panel4.repaint();
					} 
					else if(label14.getParent() == panel4)
					{
						panel4.remove(label14);
						panel5.add(label14);
						panel5.revalidate();
						panel4.revalidate();
						panel5.repaint();
						panel4.repaint();
					} 
					else if(label15.getParent() == panel4)
					{
						panel4.remove(label15);
						panel5.add(label15);
						panel5.revalidate();
						panel4.revalidate();
						panel5.repaint();
						panel4.repaint();
					} 
					else if(label16.getParent() == panel4)
					{
						panel4.remove(label16);
						panel5.add(label16);
						panel5.revalidate();
						panel4.revalidate();
						panel5.repaint();
						panel4.repaint();
					} 
					else if(label17.getParent() == panel4)
					{
						panel4.remove(label17);
						panel5.add(label17);
						panel5.revalidate();
						panel4.revalidate();
						panel5.repaint();
						panel4.repaint();
					} 
					else if(label18.getParent() == panel4)
					{
						panel4.remove(label18);
						panel5.add(label18);
						panel5.revalidate();
						panel4.revalidate();
						panel5.repaint();
						panel4.repaint();
					} 
					else if(label19.getParent() == panel4)
					{
						panel4.remove(label19);
						panel5.add(label19);
						panel5.revalidate();
						panel4.revalidate();
						panel5.repaint();
						panel4.repaint();
					} 
					else if(label20.getParent() == panel4)
					{
						panel4.remove(label20);
						panel5.add(label20);
						panel5.revalidate();
						panel4.revalidate();
						panel5.repaint();
						panel4.repaint();
					}
					else if(label21.getParent() == panel4)
					{
						panel4.remove(label21);
						panel5.add(label21);
						panel5.revalidate();
						panel4.revalidate();
						panel5.repaint();
						panel4.repaint();
					} 
					else if(label22.getParent() == panel4)
					{
						panel4.remove(label22);
						panel5.add(label22);
						panel5.revalidate();
						panel4.revalidate();
						panel5.repaint();
						panel4.repaint();
					}
					else if(label23.getParent() == panel4)
					{
						panel4.remove(label23);
						panel5.add(label23);
						panel5.revalidate();
						panel4.revalidate();
						panel5.repaint();
						panel4.repaint();
					}
					else if(label24.getParent() == panel4)
					{
						panel4.remove(label24);
						panel5.add(label24);
						panel5.revalidate();
						panel4.revalidate();
						panel5.repaint();
						panel4.repaint();
					}
					else if(label25.getParent() == panel4)
					{
						panel4.remove(label25);
						panel5.add(label25);
						panel5.revalidate();
						panel4.revalidate();
						panel5.repaint();
						panel4.repaint();
					}
					else if(label26.getParent() == panel4)
					{
						panel4.remove(label26);
						panel5.add(label26);
						panel5.revalidate();
						panel4.revalidate();
						panel5.repaint();
						panel4.repaint();
					}
					else if(label27.getParent() == panel4)
					{
						panel4.remove(label27);
						panel5.add(label27);
						panel5.revalidate();
						panel4.revalidate();
						panel5.repaint();
						panel4.repaint();
					}
					else if(label28.getParent() == panel4)
					{
						panel4.remove(label28);
						panel5.add(label28);
						panel5.revalidate();
						panel4.revalidate();
						panel5.repaint();
						panel4.repaint();
					}
				}
				else if(d2.getdots() == 3)
				{
					label6.setIcon(r);
					if(label9.getParent() == panel4)
					{
						panel4.remove(label9);
						panel8.add(label9);
						panel8.revalidate();
						panel4.revalidate();
						panel8.repaint();
						panel4.repaint();
					} 
					else if(label10.getParent() == panel4)
					{
						panel4.remove(label10);
						panel8.add(label10);
						panel8.revalidate();
						panel4.revalidate();
						panel8.repaint();
						panel4.repaint();
					} 
					else if(label11.getParent() == panel4)
					{
						panel4.remove(label11);
						panel8.add(label11);
						panel8.revalidate();
						panel4.revalidate();
						panel8.repaint();
						panel4.repaint();
					} 
					else if(label12.getParent() == panel4)
					{
						panel4.remove(label12);
						panel8.add(label12);
						panel8.revalidate();
						panel4.revalidate();
						panel8.repaint();
						panel4.repaint();
					} 
					else if(label13.getParent() == panel4)
					{
						panel4.remove(label13);
						panel8.add(label13);
						panel8.revalidate();
						panel4.revalidate();
						panel8.repaint();
						panel4.repaint();
					} 
					else if(label14.getParent() == panel4)
					{
						panel4.remove(label14);
						panel8.add(label14);
						panel8.revalidate();
						panel4.revalidate();
						panel8.repaint();
						panel4.repaint();
					} 
					else if(label15.getParent() == panel4)
					{
						panel4.remove(label15);
						panel8.add(label15);
						panel8.revalidate();
						panel4.revalidate();
						panel8.repaint();
						panel4.repaint();
					} 
					else if(label16.getParent() == panel4)
					{
						panel4.remove(label16);
						panel8.add(label16);
						panel8.revalidate();
						panel4.revalidate();
						panel8.repaint();
						panel4.repaint();
					} 
					else if(label17.getParent() == panel4)
					{
						panel4.remove(label17);
						panel8.add(label17);
						panel8.revalidate();
						panel4.revalidate();
						panel8.repaint();
						panel4.repaint();
					} 
					else if(label18.getParent() == panel4)
					{
						panel4.remove(label18);
						panel8.add(label18);
						panel8.revalidate();
						panel4.revalidate();
						panel8.repaint();
						panel4.repaint();
					} 
					else if(label19.getParent() == panel4)
					{
						panel4.remove(label19);
						panel8.add(label19);
						panel8.revalidate();
						panel4.revalidate();
						panel8.repaint();
						panel4.repaint();
					} 
					else if(label20.getParent() == panel4)
					{
						panel4.remove(label20);
						panel8.add(label20);
						panel8.revalidate();
						panel4.revalidate();
						panel8.repaint();
						panel4.repaint();
					}
					else if(label21.getParent() == panel4)
					{
						panel4.remove(label21);
						panel8.add(label21);
						panel8.revalidate();
						panel4.revalidate();
						panel8.repaint();
						panel4.repaint();
					} 
					else if(label22.getParent() == panel4)
					{
						panel4.remove(label22);
						panel8.add(label22);
						panel8.revalidate();
						panel4.revalidate();
						panel8.repaint();
						panel4.repaint();
					}
					else if(label23.getParent() == panel4)
					{
						panel4.remove(label23);
						panel8.add(label23);
						panel8.revalidate();
						panel4.revalidate();
						panel8.repaint();
						panel4.repaint();
					}
					else if(label24.getParent() == panel4)
					{
						panel4.remove(label24);
						panel8.add(label24);
						panel8.revalidate();
						panel4.revalidate();
						panel8.repaint();
						panel4.repaint();
					}
					else if(label25.getParent() == panel4)
					{
						panel4.remove(label25);
						panel8.add(label25);
						panel8.revalidate();
						panel4.revalidate();
						panel8.repaint();
						panel4.repaint();
					}
					else if(label26.getParent() == panel4)
					{
						panel4.remove(label26);
						panel8.add(label26);
						panel8.revalidate();
						panel4.revalidate();
						panel8.repaint();
						panel4.repaint();
					}
					else if(label27.getParent() == panel4)
					{
						panel4.remove(label27);
						panel8.add(label27);
						panel8.revalidate();
						panel4.revalidate();
						panel8.repaint();
						panel4.repaint();
					}
					else if(label28.getParent() == panel4)
					{
						panel4.remove(label28);
						panel8.add(label28);
						panel8.revalidate();
						panel4.revalidate();
						panel8.repaint();
						panel4.repaint();
					}
				}
				else 
				{
					label6.setIcon(dot);
				}
				if(panel8.getComponentCount() >= 2)
				{
					button3.setEnabled(true);
					button2.setEnabled(false);
				}
				else if(panel6.getComponentCount() >= 2)
				{
					button4.setEnabled(true);
					button2.setEnabled(false);
				}
				else if(panel2.getComponentCount() >= 2)
				{
					button1.setEnabled(true);
					button2.setEnabled(false);
				}
				if(panel2.getComponentCount() < 2 && panel6.getComponentCount() < 2 && panel8.getComponentCount() < 2)
				{
					JOptionPane.showMessageDialog(null, "Player 2 is the winner.");
				}
			}
			if(event.getSource() == button3)
			{
				Die d3 = new Die();
				if(d3.getdots() == 1)
				{
					label7.setIcon(l);
					if(label9.getParent() == panel8)
					{
						panel8.remove(label9);
						panel4.add(label9);
						panel4.revalidate();
						panel8.revalidate();
						panel4.repaint();
						panel8.repaint();
					} 
					else if(label10.getParent() == panel8)
					{
						panel8.remove(label10);
						panel4.add(label10);
						panel4.revalidate();
						panel8.revalidate();
						panel4.repaint();
						panel8.repaint();
					} 
					else if(label11.getParent() == panel8)
					{
						panel8.remove(label11);
						panel4.add(label11);
						panel4.revalidate();
						panel8.revalidate();
						panel4.repaint();
						panel8.repaint();
					} 
					else if(label12.getParent() == panel8)
					{
						panel8.remove(label12);
						panel4.add(label12);
						panel4.revalidate();
						panel8.revalidate();
						panel4.repaint();
						panel8.repaint();
					} 
					else if(label13.getParent() == panel8)
					{
						panel8.remove(label13);
						panel4.add(label13);
						panel4.revalidate();
						panel8.revalidate();
						panel4.repaint();
						panel8.repaint();
					} 
					else if(label14.getParent() == panel8)
					{
						panel8.remove(label14);
						panel4.add(label14);
						panel4.revalidate();
						panel8.revalidate();
						panel4.repaint();
						panel8.repaint();
					} 
					else if(label15.getParent() == panel8)
					{
						panel8.remove(label15);
						panel4.add(label15);
						panel4.revalidate();
						panel8.revalidate();
						panel4.repaint();
						panel8.repaint();
					} 
					else if(label16.getParent() == panel8)
					{
						panel8.remove(label16);
						panel4.add(label16);
						panel4.revalidate();
						panel8.revalidate();
						panel4.repaint();
						panel8.repaint();
					} 
					else if(label17.getParent() == panel8)
					{
						panel8.remove(label17);
						panel4.add(label17);
						panel4.revalidate();
						panel8.revalidate();
						panel4.repaint();
						panel8.repaint();
					} 
					else if(label18.getParent() == panel8)
					{
						panel8.remove(label18);
						panel4.add(label18);
						panel4.revalidate();
						panel8.revalidate();
						panel4.repaint();
						panel8.repaint();
					} 
					else if(label19.getParent() == panel8)
					{
						panel8.remove(label19);
						panel4.add(label19);
						panel4.revalidate();
						panel8.revalidate();
						panel4.repaint();
						panel8.repaint();
					} 
					else if(label20.getParent() == panel8)
					{
						panel8.remove(label20);
						panel4.add(label20);
						panel4.revalidate();
						panel8.revalidate();
						panel4.repaint();
						panel8.repaint();
					}
					else if(label21.getParent() == panel8)
					{
						panel8.remove(label21);
						panel4.add(label21);
						panel4.revalidate();
						panel8.revalidate();
						panel4.repaint();
						panel8.repaint();
					} 
					else if(label22.getParent() == panel8)
					{
						panel8.remove(label22);
						panel4.add(label22);
						panel4.revalidate();
						panel8.revalidate();
						panel4.repaint();
						panel8.repaint();
					}
					else if(label23.getParent() == panel8)
					{
						panel8.remove(label23);
						panel4.add(label23);
						panel4.revalidate();
						panel8.revalidate();
						panel4.repaint();
						panel8.repaint();
					}
					else if(label24.getParent() == panel8)
					{
						panel8.remove(label24);
						panel4.add(label24);
						panel4.revalidate();
						panel8.revalidate();
						panel4.repaint();
						panel8.repaint();
					}
					else if(label25.getParent() == panel8)
					{
						panel8.remove(label25);
						panel4.add(label25);
						panel4.revalidate();
						panel8.revalidate();
						panel4.repaint();
						panel8.repaint();
					}
					else if(label26.getParent() == panel8)
					{
						panel8.remove(label26);
						panel4.add(label26);
						panel4.revalidate();
						panel8.revalidate();
						panel4.repaint();
						panel8.repaint();
					}
					else if(label27.getParent() == panel8)
					{
						panel8.remove(label27);
						panel4.add(label27);
						panel4.revalidate();
						panel8.revalidate();
						panel4.repaint();
						panel8.repaint();
					}
					else if(label28.getParent() == panel8)
					{
						panel8.remove(label28);
						panel4.add(label28);
						panel4.revalidate();
						panel8.revalidate();
						panel4.repaint();
						panel8.repaint();
					}
				}
				else if(d3.getdots() == 2)
				{
					label7.setIcon(c);
					if(label9.getParent() == panel8)
					{
						panel8.remove(label9);
						panel5.add(label9);
						panel5.revalidate();
						panel8.revalidate();
						panel5.repaint();
						panel8.repaint();
					} 
					else if(label10.getParent() == panel8)
					{
						panel8.remove(label10);
						panel5.add(label10);
						panel5.revalidate();
						panel8.revalidate();
						panel5.repaint();
						panel8.repaint();
					} 
					else if(label11.getParent() == panel8)
					{
						panel8.remove(label11);
						panel5.add(label11);
						panel5.revalidate();
						panel8.revalidate();
						panel5.repaint();
						panel8.repaint();
					} 
					else if(label12.getParent() == panel8)
					{
						panel8.remove(label12);
						panel5.add(label12);
						panel5.revalidate();
						panel8.revalidate();
						panel5.repaint();
						panel8.repaint();
					} 
					else if(label13.getParent() == panel8)
					{
						panel8.remove(label13);
						panel5.add(label13);
						panel5.revalidate();
						panel8.revalidate();
						panel5.repaint();
						panel8.repaint();
					} 
					else if(label14.getParent() == panel8)
					{
						panel8.remove(label14);
						panel5.add(label14);
						panel5.revalidate();
						panel8.revalidate();
						panel5.repaint();
						panel8.repaint();
					} 
					else if(label15.getParent() == panel8)
					{
						panel8.remove(label15);
						panel5.add(label15);
						panel5.revalidate();
						panel8.revalidate();
						panel5.repaint();
						panel8.repaint();
					} 
					else if(label16.getParent() == panel8)
					{
						panel8.remove(label16);
						panel5.add(label16);
						panel5.revalidate();
						panel8.revalidate();
						panel5.repaint();
						panel8.repaint();
					} 
					else if(label17.getParent() == panel8)
					{
						panel8.remove(label17);
						panel5.add(label17);
						panel5.revalidate();
						panel8.revalidate();
						panel5.repaint();
						panel8.repaint();
					} 
					else if(label18.getParent() == panel8)
					{
						panel8.remove(label18);
						panel5.add(label18);
						panel5.revalidate();
						panel8.revalidate();
						panel5.repaint();
						panel8.repaint();
					} 
					else if(label19.getParent() == panel8)
					{
						panel8.remove(label19);
						panel5.add(label19);
						panel5.revalidate();
						panel8.revalidate();
						panel5.repaint();
						panel8.repaint();
					} 
					else if(label20.getParent() == panel8)
					{
						panel8.remove(label20);
						panel5.add(label20);
						panel5.revalidate();
						panel8.revalidate();
						panel5.repaint();
						panel8.repaint();
					}
					else if(label21.getParent() == panel8)
					{
						panel8.remove(label21);
						panel5.add(label21);
						panel5.revalidate();
						panel8.revalidate();
						panel5.repaint();
						panel8.repaint();
					} 
					else if(label22.getParent() == panel8)
					{
						panel8.remove(label22);
						panel5.add(label22);
						panel5.revalidate();
						panel8.revalidate();
						panel5.repaint();
						panel8.repaint();
					}
					else if(label23.getParent() == panel8)
					{
						panel8.remove(label23);
						panel5.add(label23);
						panel5.revalidate();
						panel8.revalidate();
						panel5.repaint();
						panel8.repaint();
					}
					else if(label24.getParent() == panel8)
					{
						panel8.remove(label24);
						panel5.add(label24);
						panel5.revalidate();
						panel8.revalidate();
						panel5.repaint();
						panel8.repaint();
					}
					else if(label25.getParent() == panel8)
					{
						panel8.remove(label25);
						panel5.add(label25);
						panel5.revalidate();
						panel8.revalidate();
						panel5.repaint();
						panel8.repaint();
					}
					else if(label26.getParent() == panel8)
					{
						panel8.remove(label26);
						panel5.add(label26);
						panel5.revalidate();
						panel8.revalidate();
						panel5.repaint();
						panel8.repaint();
					}
					else if(label27.getParent() == panel8)
					{
						panel8.remove(label27);
						panel5.add(label27);
						panel5.revalidate();
						panel8.revalidate();
						panel5.repaint();
						panel8.repaint();
					}
					else if(label28.getParent() == panel8)
					{
						panel8.remove(label28);
						panel5.add(label28);
						panel5.revalidate();
						panel8.revalidate();
						panel5.repaint();
						panel8.repaint();
					}
				}
				else if(d3.getdots() == 3)
				{
					label7.setIcon(r);
					if(label9.getParent() == panel8)
					{
						panel8.remove(label9);
						panel6.add(label9);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					} 
					else if(label10.getParent() == panel8)
					{
						panel8.remove(label10);
						panel6.add(label10);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					} 
					else if(label11.getParent() == panel8)
					{
						panel8.remove(label11);
						panel6.add(label11);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					} 
					else if(label12.getParent() == panel8)
					{
						panel8.remove(label12);
						panel6.add(label12);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					} 
					else if(label13.getParent() == panel8)
					{
						panel8.remove(label14);
						panel6.add(label14);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					} 
					else if(label14.getParent() == panel8)
					{
						panel8.remove(label14);
						panel6.add(label14);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					} 
					else if(label15.getParent() == panel8)
					{
						panel8.remove(label15);
						panel6.add(label15);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					} 
					else if(label16.getParent() == panel8)
					{
						panel8.remove(label16);
						panel6.add(label16);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					} 
					else if(label17.getParent() == panel8)
					{
						panel8.remove(label17);
						panel6.add(label17);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					} 
					else if(label18.getParent() == panel8)
					{
						panel8.remove(label18);
						panel6.add(label18);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					} 
					else if(label19.getParent() == panel8)
					{
						panel8.remove(label19);
						panel6.add(label19);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					} 
					else if(label20.getParent() == panel8)
					{
						panel8.remove(label20);
						panel6.add(label20);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					}
					else if(label21.getParent() == panel8)
					{
						panel8.remove(label21);
						panel6.add(label21);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					} 
					else if(label22.getParent() == panel8)
					{
						panel8.remove(label22);
						panel6.add(label22);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					}
					else if(label23.getParent() == panel8)
					{
						panel8.remove(label23);
						panel6.add(label23);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					}
					else if(label24.getParent() == panel8)
					{
						panel8.remove(label24);
						panel6.add(label24);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					}
					else if(label25.getParent() == panel8)
					{
						panel8.remove(label25);
						panel6.add(label25);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					}
					else if(label26.getParent() == panel8)
					{
						panel8.remove(label26);
						panel6.add(label26);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					}
					else if(label27.getParent() == panel8)
					{
						panel8.remove(label27);
						panel6.add(label27);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					}
					else if(label28.getParent() == panel8)
					{
						panel8.remove(label28);
						panel6.add(label28);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					}
				}
				else 
				{
					label7.setIcon(dot);
				}
				if(panel6.getComponentCount() >= 2)
				{
					button4.setEnabled(true);
					button3.setEnabled(false);
				}
				else if(panel2.getComponentCount() >= 2)
				{
					button1.setEnabled(true);
					button3.setEnabled(false);
				}
				else if(panel4.getComponentCount() >= 2)
				{
					button2.setEnabled(true);
					button3.setEnabled(false);
				}
				if(panel4.getComponentCount() < 2 && panel6.getComponentCount() < 2 && panel2.getComponentCount() < 2)
				{
					JOptionPane.showMessageDialog(null, "Player 3 is the winner.");
				}
			}
			if(event.getSource() == button4)
			{
				Die d4 = new Die();
				if(d4.getdots() == 1)
				{
					label8.setIcon(l);
					if(label9.getParent() == panel6)
					{
						panel6.remove(label9);
						panel8.add(label9);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					} 
					else if(label10.getParent() == panel6)
					{
						panel6.remove(label10);
						panel8.add(label10);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					} 
					else if(label11.getParent() == panel6)
					{
						panel6.remove(label11);
						panel8.add(label11);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					} 
					else if(label12.getParent() == panel6)
					{
						panel6.remove(label12);
						panel8.add(label12);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					} 
					else if(label13.getParent() == panel6)
					{
						panel6.remove(label13);
						panel8.add(label13);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					} 
					else if(label14.getParent() == panel6)
					{
						panel6.remove(label14);
						panel8.add(label14);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					} 
					else if(label15.getParent() == panel6)
					{
						panel6.remove(label15);
						panel8.add(label15);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					} 
					else if(label16.getParent() == panel6)
					{
						panel6.remove(label16);
						panel8.add(label16);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					} 
					else if(label17.getParent() == panel6)
					{
						panel6.remove(label17);
						panel8.add(label17);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					} 
					else if(label18.getParent() == panel6)
					{
						panel6.remove(label18);
						panel8.add(label18);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					} 
					else if(label19.getParent() == panel6)
					{
						panel6.remove(label19);
						panel8.add(label19);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					} 
					else if(label20.getParent() == panel6)
					{
						panel6.remove(label20);
						panel8.add(label20);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					}
					else if(label21.getParent() == panel6)
					{
						panel6.remove(label21);
						panel8.add(label21);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					} 
					else if(label22.getParent() == panel6)
					{
						panel6.remove(label22);
						panel8.add(label22);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					}
					else if(label23.getParent() == panel6)
					{
						panel6.remove(label23);
						panel8.add(label23);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					}
					else if(label24.getParent() == panel6)
					{
						panel6.remove(label24);
						panel8.add(label24);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					}
					else if(label25.getParent() == panel6)
					{
						panel6.remove(label25);
						panel8.add(label25);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					}
					else if(label26.getParent() == panel6)
					{
						panel6.remove(label26);
						panel8.add(label26);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();;
					}
					else if(label27.getParent() == panel6)
					{
						panel6.remove(label27);
						panel8.add(label27);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					}
					else if(label28.getParent() == panel6)
					{
						panel6.remove(label28);
						panel8.add(label28);
						panel6.revalidate();
						panel8.revalidate();
						panel6.repaint();
						panel8.repaint();
					}
				}
				else if(d4.getdots() == 2)
				{
					label8.setIcon(c);
					if(label9.getParent() == panel6)
					{
						panel6.remove(label9);
						panel5.add(label9);
						panel6.revalidate();
						panel5.revalidate();
						panel6.repaint();
						panel5.repaint();
					} 
					else if(label10.getParent() == panel6)
					{
						panel6.remove(label10);
						panel5.add(label10);
						panel6.revalidate();
						panel5.revalidate();
						panel6.repaint();
						panel5.repaint();
					} 
					else if(label11.getParent() == panel6)
					{
						panel6.remove(label11);
						panel5.add(label11);
						panel6.revalidate();
						panel5.revalidate();
						panel6.repaint();
						panel5.repaint();
					} 
					else if(label12.getParent() == panel6)
					{
						panel6.remove(label12);
						panel5.add(label12);
						panel6.revalidate();
						panel5.revalidate();
						panel6.repaint();
						panel5.repaint();
					} 
					else if(label13.getParent() == panel6)
					{
						panel6.remove(label13);
						panel5.add(label13);
						panel6.revalidate();
						panel5.revalidate();
						panel6.repaint();
						panel5.repaint();
					} 
					else if(label14.getParent() == panel6)
					{
						panel6.remove(label14);
						panel5.add(label14);
						panel6.revalidate();
						panel5.revalidate();
						panel6.repaint();
						panel5.repaint();
					} 
					else if(label15.getParent() == panel6)
					{
						panel6.remove(label15);
						panel5.add(label15);
						panel6.revalidate();
						panel5.revalidate();
						panel6.repaint();
						panel5.repaint();
					} 
					else if(label16.getParent() == panel6)
					{
						panel6.remove(label16);
						panel5.add(label16);
						panel6.revalidate();
						panel5.revalidate();
						panel6.repaint();
						panel5.repaint();
					} 
					else if(label17.getParent() == panel6)
					{
						panel6.remove(label17);
						panel5.add(label17);
						panel6.revalidate();
						panel5.revalidate();
						panel6.repaint();
						panel5.repaint();
					} 
					else if(label18.getParent() == panel6)
					{
						panel6.remove(label18);
						panel5.add(label18);
						panel6.revalidate();
						panel5.revalidate();
						panel6.repaint();
						panel5.repaint();
					} 
					else if(label19.getParent() == panel6)
					{
						panel6.remove(label19);
						panel5.add(label19);
						panel6.revalidate();
						panel5.revalidate();
						panel6.repaint();
						panel5.repaint();
					} 
					else if(label20.getParent() == panel6)
					{
						panel6.remove(label20);
						panel5.add(label20);
						panel6.revalidate();
						panel5.revalidate();
						panel6.repaint();
						panel5.repaint();
					}
					else if(label21.getParent() == panel6)
					{
						panel6.remove(label21);
						panel5.add(label21);
						panel6.revalidate();
						panel5.revalidate();
						panel6.repaint();
						panel5.repaint();
					} 
					else if(label22.getParent() == panel6)
					{
						panel6.remove(label22);
						panel5.add(label22);
						panel6.revalidate();
						panel5.revalidate();
						panel6.repaint();
						panel5.repaint();
					}
					else if(label23.getParent() == panel6)
					{
						panel6.remove(label23);
						panel5.add(label23);
						panel6.revalidate();
						panel5.revalidate();
						panel6.repaint();
						panel5.repaint();
					}
					else if(label24.getParent() == panel6)
					{
						panel6.remove(label24);
						panel5.add(label24);
						panel6.revalidate();
						panel5.revalidate();
						panel6.repaint();
						panel5.repaint();
					}
					else if(label25.getParent() == panel6)
					{
						panel6.remove(label25);
						panel5.add(label25);
						panel6.revalidate();
						panel5.revalidate();
						panel6.repaint();
						panel5.repaint();
					}
					else if(label26.getParent() == panel6)
					{
						panel6.remove(label26);
						panel5.add(label26);
						panel6.revalidate();
						panel5.revalidate();
						panel6.repaint();
						panel5.repaint();
					}
					else if(label27.getParent() == panel6)
					{
						panel6.remove(label27);
						panel5.add(label27);
						panel6.revalidate();
						panel5.revalidate();
						panel6.repaint();
						panel5.repaint();
					}
					else if(label28.getParent() == panel6)
					{
						panel6.remove(label28);
						panel5.add(label28);
						panel6.revalidate();
						panel5.revalidate();
						panel6.repaint();
						panel5.repaint();
					}
				}
				else if(d4.getdots() == 3)
				{
					label8.setIcon(r);
					if(label9.getParent() == panel6)
					{
						panel6.remove(label9);
						panel2.add(label9);
						panel6.revalidate();
						panel2.revalidate();
						panel6.repaint();
						panel2.repaint();
					} 
					else if(label10.getParent() == panel6)
					{
						panel6.remove(label10);
						panel2.add(label10);
						panel6.revalidate();
						panel2.revalidate();
						panel6.repaint();
						panel2.repaint();
					} 
					else if(label11.getParent() == panel6)
					{
						panel6.remove(label11);
						panel2.add(label11);
						panel6.revalidate();
						panel2.revalidate();
						panel6.repaint();
						panel2.repaint();
					} 
					else if(label12.getParent() == panel6)
					{
						panel6.remove(label12);
						panel2.add(label12);
						panel6.revalidate();
						panel2.revalidate();
						panel6.repaint();
						panel2.repaint();
					} 
					else if(label13.getParent() == panel6)
					{
						panel6.remove(label13);
						panel2.add(label13);
						panel6.revalidate();
						panel2.revalidate();
						panel6.repaint();
						panel2.repaint();
					} 
					else if(label14.getParent() == panel6)
					{
						panel6.remove(label14);
						panel2.add(label14);
						panel6.revalidate();
						panel2.revalidate();
						panel6.repaint();
						panel2.repaint();
					} 
					else if(label15.getParent() == panel6)
					{
						panel6.remove(label15);
						panel2.add(label15);
						panel6.revalidate();
						panel2.revalidate();
						panel6.repaint();
						panel2.repaint();
					} 
					else if(label16.getParent() == panel6)
					{
						panel6.remove(label16);
						panel2.add(label16);
						panel6.revalidate();
						panel2.revalidate();
						panel6.repaint();
						panel2.repaint();
					} 
					else if(label17.getParent() == panel6)
					{
						panel6.remove(label17);
						panel2.add(label17);
						panel6.revalidate();
						panel2.revalidate();
						panel6.repaint();
						panel2.repaint();
					} 
					else if(label18.getParent() == panel6)
					{
						panel6.remove(label18);
						panel2.add(label18);
						panel6.revalidate();
						panel2.revalidate();
						panel6.repaint();
						panel2.repaint();
					} 
					else if(label19.getParent() == panel6)
					{
						panel6.remove(label19);
						panel2.add(label19);
						panel6.revalidate();
						panel2.revalidate();
						panel6.repaint();
						panel2.repaint();
					} 
					else if(label20.getParent() == panel6)
					{
						panel6.remove(label20);
						panel2.add(label20);
						panel6.revalidate();
						panel2.revalidate();
						panel6.repaint();
						panel2.repaint();
					}
					else if(label21.getParent() == panel6)
					{
						panel6.remove(label21);
						panel2.add(label21);
						panel6.revalidate();
						panel2.revalidate();
						panel6.repaint();
						panel2.repaint();
					} 
					else if(label22.getParent() == panel6)
					{
						panel6.remove(label22);
						panel2.add(label22);
						panel6.revalidate();
						panel2.revalidate();
						panel6.repaint();
						panel2.repaint();
					}
					else if(label23.getParent() == panel6)
					{
						panel6.remove(label23);
						panel2.add(label23);
						panel6.revalidate();
						panel2.revalidate();
						panel6.repaint();
						panel2.repaint();
					}
					else if(label24.getParent() == panel6)
					{
						panel6.remove(label24);
						panel2.add(label24);
						panel6.revalidate();
						panel2.revalidate();
						panel6.repaint();
						panel2.repaint();
					}
					else if(label25.getParent() == panel6)
					{
						panel6.remove(label25);
						panel2.add(label25);
						panel6.revalidate();
						panel2.revalidate();
						panel6.repaint();
						panel2.repaint();
					}
					else if(label26.getParent() == panel6)
					{
						panel6.remove(label26);
						panel2.add(label26);
						panel6.revalidate();
						panel2.revalidate();
						panel6.repaint();
						panel2.repaint();
					}
					else if(label27.getParent() == panel6)
					{
						panel6.remove(label27);
						panel2.add(label27);
						panel6.revalidate();
						panel2.revalidate();
						panel6.repaint();
						panel2.repaint();
					}
					else if(label28.getParent() == panel6)
					{
						panel6.remove(label28);
						panel2.add(label28);
						panel6.revalidate();
						panel2.revalidate();
						panel6.repaint();
						panel2.repaint();
					}
				}
				else 
				{
					label8.setIcon(dot);
				}
				if(panel2.getComponentCount() >= 2)
				{
					button1.setEnabled(true);
					button4.setEnabled(false);
				}
				else if(panel4.getComponentCount() >= 2)
				{
					button2.setEnabled(true);
					button4.setEnabled(false);
				}
				else if(panel8.getComponentCount() >= 2)
				{
					button3.setEnabled(true);
					button4.setEnabled(false);
				}
				if(panel4.getComponentCount() < 2 && panel2.getComponentCount() < 2 && panel8.getComponentCount() < 2)
				{
					JOptionPane.showMessageDialog(null, "Player 4 is the winner.");
				}
				
			}
			if(event.getSource() == newgame)
			{
				panel2.removeAll();
				panel4.removeAll();
				panel6.removeAll();
				panel8.removeAll();
				panel5.removeAll();
				panel2.add(field1);
				panel2.add(label9);
				panel2.add(label10);
				panel2.add(label11);
				panel2.add(label12);
				panel2.add(label13);
				panel4.add(field2);
				panel4.add(label14);
				panel4.add(label15);
				panel4.add(label16);
				panel4.add(label17);
				panel4.add(label18);
				panel6.add(field3);
				panel6.add(label19);
				panel6.add(label20);
				panel6.add(label21);
				panel6.add(label22);
				panel6.add(label23);
				panel8.add(field4);
				panel8.add(label24);
				panel8.add(label25);
				panel8.add(label26);
				panel8.add(label27);
				panel8.add(label28);
				field1.setText("Player 1");
				field2.setText("Player 2");
				field3.setText("Player 4");
				field4.setText("Player 3");
				panel2.revalidate();
				panel4.revalidate();
				panel6.revalidate();
				panel8.revalidate();
				panel5.revalidate();
				panel2.repaint();
				panel4.repaint();
				panel6.repaint();
				panel8.repaint();
				panel5.repaint();
			}
			if(event.getSource() == rules)
			{
				JOptionPane.showMessageDialog(null, "Each player starts with 5 chips.\nA special dice is rolled with L, C, and R each on a side, the other three sides all have dots.\nPlayers take turns rolling the dice, play procedes counter clockwise.\nIf a player rolls a L they pass one of their chips to the player on the left.\nIf a player rolls a R they pass one of their chips to the player on the right\nIf a player rolls a C they pass one of their chips to the pot in the center.\nIf a player rolls a dot they keep their chips.\nIf a player has no chips their turn is skipped, but they are not out, they can get back in if they are passed another chip.\nThe game procedes until only one player has any chips left, that player then wins.");
			}
		}
	}
}