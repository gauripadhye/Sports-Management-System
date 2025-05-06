import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ground extends JFrame implements  ActionListener
{
	private Whole whole;
	private JLabel lname;
	private  JLabel lemail;
	private JLabel lphone;
	private JLabel lcost;
	private JLabel ltime;
	private JTextField tname;
	private  JTextField temail;
	private JTextField tphone;
	private JTextField ttime;
	private JButton confirm;
	private JButton back;
	private JLabel notice;
	private JLabel background;

	public Ground(Whole w)
	{
		super("Ground Booking");
		this.whole=w;
	
		lname=new JLabel ("Name");
		lemail=new JLabel("Email");
		lphone=new JLabel("Phone");
		lcost=new  JLabel("*Fee= 200 rupees/hr*");
		ltime=new JLabel("Time");
		confirm=new JButton("Confirm");
		back=new JButton("Back");
		tname=new JTextField();
		temail=new JTextField();
		tphone=new JTextField();
		ttime=new JTextField();
		notice=new JLabel();
		background=new JLabel(new ImageIcon("C:\\Users\\astha\\OneDrive\\Pictures\\java-main\\java-main\\ground.jpg"));
	
		lcost.setForeground(Color.RED);
    	notice.setForeground(Color.WHITE);
		notice.setFont(new Font("Serif",Font.BOLD, 13));

		lname.setBounds(100,50,40,40);
		lemail.setBounds(100,100,40,40);
		lphone.setBounds(100,150,40,40);
		ltime.setBounds(100,200,40,40);
		lcost.setBounds(350,10,250,30);
		tname.setBounds(140,50,250,40);
		temail.setBounds(140,100,250,40);
		tphone.setBounds(140,150,250,40);
		ttime.setBounds(140,200,250,40);
		confirm.setBounds(200,250,100,40);
		notice.setBounds(100,300,400,40);
		back.setBounds(10,300,70,40);
		background.setBounds(0,0,800,400);

		confirm.addActionListener(this);
		back.addActionListener(this);

		add(notice);
		add(lname);
		add(lemail);
		add(lphone);
		add(lcost);
		add(ltime);
		add(confirm);
		add(temail);
		add(tname);
		add(tphone);
		add(ttime);
		add(back);
		add(background);

		setSize(500,400);
		setLocation(100,100);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String s=e.getActionCommand();
		if(e.getActionCommand()=="Confirm")
		{
			DataAccess da=new DataAccess();
			if(!tname.getText().isEmpty() && !tphone.getText().isEmpty() && !temail.getText().isEmpty() && !ttime.getText().isEmpty())
			{
				String sql="INSERT INTO tground ('G_Name', 'G_Phone', 'G_Email', 'G_Time') VALUES ('"+tname.getText()+"', '"+tphone.getText()+"','"+temail.getText()+"','"+ttime.getText()+"')";
				//System.out.println(sql);
				whole.first.setVisible(true);
				whole.ground.setVisible(false);
				notice.setText("");
				try
				{
					da.updateDB(sql);
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
			else
				notice.setText("*You haven't typed anything in one/more fields, kindly fill it*");
		}
		else
		{
			if(e.getActionCommand()=="Back")
			{
				whole.first.setVisible(true);
				whole.ground.setVisible(false);
				notice.setText("");
			}
			//else{}
		}
	}
}