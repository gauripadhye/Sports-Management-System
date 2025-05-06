import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements  ActionListener
{
	private Whole whole;
	private JLabel lid;
	private JLabel lpass;
	private JTextField tid;
	private JPasswordField tpass;
	private JButton blogin;
	private JButton bsignup;
	private JButton back;
	public String logid;
	private JLabel notice;
	private String msg;
	private JLabel background;

	public Login (Whole w)
	{
		super("Welcome page > Login");
		this.whole=w;
		
		back =new JButton ("Back");
		lid=new JLabel("ID");
		lpass=new JLabel("Password");
		tid=new JTextField(10);
		tpass=new JPasswordField();
		blogin=new JButton("Login");
		bsignup=new JButton("Signup");
		notice=new JLabel("*Notice Label*");
		background=new JLabel(new ImageIcon("C:\\Users\\astha\\OneDrive\\Pictures\\java-main\\java-main\\logo.png"));
		
		notice.setForeground(Color.RED);

		lid.setBounds(110,175,40,30);
		lpass.setBounds(90,225,60,30);
		tid.setBounds(150,175,200,30);
		tpass.setBounds(150,225,200,30);
		blogin.setBounds(280,275,70,30);
		bsignup.setBounds(190,275,80,30);
		back.setBounds(10,320,70,30);
		notice.setBounds(180,300,300,60);
		background.setBounds(150,0,200,200);

		add(back);
		add(tid);
		add(tpass);
		add(lid);
		add(lpass);
		add(blogin);
		add(bsignup);
		add(notice);
		add(background);

		back.addActionListener(this);
		blogin.addActionListener(this);
		bsignup.addActionListener(this);

		setSize(500,400);
		setLocation(100,100);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String s=e.getActionCommand();
		if(s.equals("Login"))
		{
			if(tid.getText().isEmpty() || tpass.getPassword().length == 0)
			{
				notice.setText("*Password or Id is empty*");
			}
			else
			{
				String id=tid.getText();
				String pass=new String(tpass.getPassword());
				if((id.substring(0,1)).equals("1"))
				{
					boolean b=whole.buffercoach.cauth(id,pass);
			    	if(b)
					{
						logid=id;
						msg=new String("Welcome "+whole.buffercoach.coach[whole.buffercoach.index].getName()+"In Scorpion Cricket club, we are still in development phase so if you find any error plz be patient and report to us");
				    	JOptionPane.showMessageDialog(null,msg);
						notice.setText("");
						tid.setText("");
						tpass.setText("");
					   	whole.home.setVisible(true);
					   	whole.login.setVisible(false);
					}
				   else
					   notice.setText("*Wrong Id or Password try again*");
				}
				else
				{
					if((id.substring(0,1)).equals("2"))
					{
			        	boolean c=whole.bufferplayer.pauth(id,pass);
			        	if(c)
						{
					    	logid=id;
							msg=new String("Welcome "+whole.bufferplayer.player[whole.bufferplayer.index].getName()+"In Scorpion Cricket club, we are still in development phase so if you find any error plz be patient and report to us");
							JOptionPane.showMessageDialog(null,msg);
							notice.setText("");
					    	tid.setText("");
					    	tpass.setText("");
							whole.home.setVisible(true);
							whole.login.setVisible(false);
				        }
						else
					    	notice.setText("*Wrong Id or Password try again");
					}
			    	else
					{
						if((id.substring(0,1)).equals("3"))
						{
			            	boolean d=whole.bufferstaff.sauth(id,pass);
			                if(d)
				            {
					        	logid=id;
								msg=new String("Welcome "+whole.bufferstaff.staff[whole.bufferstaff.index].getName()+"In Scorpion Cricket club, we are still in development phase so if you find any error plz be patient and report to us");
								JOptionPane.showMessageDialog(null,msg);
								notice.setText("");
								tid.setText("");
								tpass.setText("");
								whole.home.setVisible(true);
					            whole.login.setVisible(false);
							}
				            else
					        	notice.setText("*Wrong Id or Password try again");
						}
			            else
						{
							if(id.equals("Admin") && pass.equals("Admin"))
							{
								logid="Admin";
							    notice.setText("");
							    tid.setText("");
							    tpass.setText("");
							    whole.login.setVisible(false);
							    whole.admin.setVisible(true);
							}
			                else
								notice.setText("*Wrong Id or Password try again");
						}
					}
				}
			}
		}
		else
		{
			if(s.equals("Signup"))
			{
		    	notice.setText("");
		    	tid.setText("");
		    	tpass.setText("");
				whole.login.setVisible(false);
				whole.signup.setVisible(true);
			}
			else
			{
				if(s.equals("Back"))
				{
					notice.setText("");
		        	tid.setText("");
		        	tpass.setText("");
					whole.first.setVisible(true);
			    	whole.login.setVisible(false);
				}
			}
		}
	}
}