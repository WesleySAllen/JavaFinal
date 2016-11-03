//wes allen
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import Pig.*;
import Lcr.*;
import HighLow.*;
import CrownandAnchor.*;
import ChoHan.*;
public class MainMenu extends JFrame
{
	public JComboBox gamebox;
	public String games[] = {"Choose A Game", "LCR", "Pig", "Crown & Anchor", "Cho Han", "High Low"};
	public JLabel item1;
	public JButton custom;
	public MainMenu()
	{
		super("MultiDiceGames");
		setLayout(new FlowLayout());
		Icon b = new ImageIcon(getClass().getResource("PlayButtonRed.png"));
		Icon c = new ImageIcon(getClass().getResource("dicelogo.png"));
		Icon d = new ImageIcon(getClass().getResource("playbutton.png"));
		item1 = new JLabel("My Menu", c, 2);
		add(item1);
		gamebox = new JComboBox(games);
		add(gamebox);
		custom = new JButton(b);
		custom.setRolloverIcon(d);
		custom.setBorder(null);
		add(custom);
		Thehandler2 handler2 = new Thehandler2();
		custom.addActionListener(handler2);
	}
	public class Thehandler2 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if(event.getSource() == custom)
			{
				if(gamebox.getSelectedItem() == "Pig")
				{
					Pig p1 = new Pig();
					p1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					p1.setSize(711, 400);
					p1.setVisible(true);
				}
				else if(gamebox.getSelectedItem() == "Crown & Anchor")
				{
					CrownAndAnchor ca1 = new CrownAndAnchor();
					ca1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					ca1.setSize(650, 400);
					ca1.setVisible(true);
				}
				else if(gamebox.getSelectedItem() == "Cho Han")
				{
					ChoHan ch1 = new ChoHan();
					ch1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					ch1.setSize(650, 400);
					ch1.setVisible(true);
				}
				else if(gamebox.getSelectedItem() == "LCR")
				{
					LCR lcr1 = new LCR();
					lcr1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					lcr1.setSize(650, 650);
					lcr1.setVisible(true);
				}
				else if(gamebox.getSelectedItem() == "High Low")
				{
					HighLow hl1 = new HighLow();
					hl1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					hl1.setSize(675, 425);
					hl1.setVisible(true);
				}
			}
		}
	}
}