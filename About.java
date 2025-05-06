import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class About extends JFrame implements  ActionListener
{
	private Whole whole;
	private JLabel description;
	private JLabel heading;
	private JButton back;
	private JButton gallery;
	private JLabel background;
	int p,c,s;
	public About (Whole w)
	{
		super("About Us");
		this.whole=w;
		
		back =new JButton ("Back");
		gallery=new JButton("Gallery");
		background=new JLabel(new ImageIcon("C:\\Users\\astha\\OneDrive\\Pictures\\java-main\\java-main\\aboutus.png"));
		
		heading=new JLabel("About Us");
        try
		{
			whole.bufferplayer.loadplayer();
			whole.buffercoach.loadcoach();
			whole.bufferstaff.loadstaff();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

		p=whole.bufferplayer.totalplayer;
	    c=whole.buffercoach.totalcoach;
	    s=whole.bufferstaff.totalstaff;
		
		description=new JLabel("<html>Scorpion Cricket Club is renowned club of Bangladesh, situated at 12/2 Pallabi Dhaka-1216. It has been operating for past 20 years. Many local and foreign player have built their career from here, and in future we hope to build more quality players. To improve players performance, we hired local and international coach along with some expert staff. Here, professional player along with trainee play together to sharpen their skills. Currently, <html>"+p+"<html> player and <html>"+c+"<html> Coach along with <html>"+s+"<html> Staff are present in Club.<html>");
		
		heading.setForeground(Color.RED);
		description.setForeground(Color.YELLOW);
		
		heading.setFont(new Font("Serif",Font.BOLD,30));
		description.setFont(new Font("Serif",Font.BOLD,20));

		heading.setBounds(350,20,170,30);
		description.setBounds(30,30,750,300);
		gallery.setBounds(700,10,80,30);
		back.setBounds(10,320,70,30);
		background.setBounds(0,0,800,400);
		
		add(heading);
		add(description);
		add(back);
		add(gallery);
		add(background);
		
		back.addActionListener(this);
		gallery.addActionListener(this);
		
	    setSize(800,400);
		setLocation(100,100);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String s=e.getActionCommand();
		if(s.equals("Back"))
		{
			whole.about.setVisible(false);
			whole.first.setVisible(true);
		}
		else
		{
			if(s.equals("Gallery"))
			{
				whole.about.setVisible(false);
				whole.gallery.setVisible(true);
			}
		}
	}
}