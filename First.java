import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class First extends JFrame implements  ActionListener
{
	private Whole whole;
	private JButton blogin;
	private JButton babout;
	private JButton bground;
	private JLabel background;
	private JLabel note1,note2;
	
	public First (Whole w)
	{
		super("Welcome page");
		this.whole=w;
		
		blogin=new JButton("Login");
		babout= new JButton("About Us");
		bground= new JButton("Ground Booking");
		
		note1=new JLabel("<html><p>Welcome to Scorpion Cricket club. We aim to provide the greatest player. Wanna sharpen your skill ?<p><html>");
		note2= new JLabel("Come join with us");
		
		background=new JLabel(new ImageIcon("C:\\Users\\astha\\OneDrive\\Pictures\\java-main\\java-main\\welcome.jpg"));

		babout.setBounds(250,300,100,30);
		blogin.setBounds(350,300,100,30);
		bground.setBounds(450,300,130,30);
		background.setBounds(0,0,800,400);
		note1.setBounds(125,0,650,100);
		note2.setBounds(300,250,250,50);
		
		note1.setFont(new Font("Serif",Font.ITALIC,20));
		note2.setFont(new Font("Serif",Font.BOLD,30));
		note1.setForeground(Color.BLACK);
		note2.setForeground(Color.RED);
		
		add(note1);
		add(note2);
		add(babout);
		add(blogin);
		add(bground);
		add(background);
		
		blogin.addActionListener(this);
		bground.addActionListener(this);
		babout.addActionListener(this);

        setSize(800,400);
		setLocation(100,100);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s=e.getActionCommand();
		int l=0;
		if(s.equals("Login"))
		{
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
			whole.first.setVisible(false);
			whole.login.setVisible(true);
		}
		else
		{
			if(s.equals("About Us"))
			{
				whole.first.setVisible(false);
				whole.about.setVisible(true);
			}
			else if(s.equals("Ground Booking"))
			{
				whole.first.setVisible(false);
				whole.ground.setVisible(true);
			}
		}
	}
}
