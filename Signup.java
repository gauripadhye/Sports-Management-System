import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.SQLException;

public class Signup extends JFrame implements  ActionListener
{
	private Whole whole;
	private JButton sign,back;
	private JLabel jname,jnationality,jheight,jweight,jtime,jbatstyle,jbowlstyle;
	private JLabel jspeciality,jdob,notice,warning;
	private JTextField tname,tnationality,theight,tweight,ttime,tbatstyle,tbowlstyle;
	private JTextField tspeciality,tdob;
	
	public Signup (Whole w)
	{
		super("Welcome page > Login > SignUp");
		this.whole=w;
		
		jname= new JLabel("Name");
		jnationality= new JLabel("Nationality");
		jheight= new JLabel("Height");
		jweight= new JLabel("Weight");
		jtime= new JLabel("Train Time");
		jbatstyle= new JLabel("Bat Style");
		jbowlstyle= new JLabel("Bowl Style");
		jspeciality= new JLabel("Speciality");
		jdob=new JLabel("Date of birth");

		warning=new JLabel();
		notice=new JLabel("*Please follow the instruction and clear text to provide info. Any wrong or miss info may lead to rejection");
		notice.setForeground(Color.YELLOW);
		warning.setForeground(Color.RED);
		notice.setFont(new Font("Serif",Font.BOLD,12));
		
		tname= new JTextField();
		tnationality= new JTextField();
		theight= new JTextField();
		tweight= new JTextField();
		ttime= new JTextField();
		tbatstyle= new JTextField();
		tbowlstyle= new JTextField();
		tspeciality= new JTextField();
		tdob=new JTextField();

		sign=new JButton("Signup");
		back=new JButton("Back");
		
		jname.setBounds(30,40,70,40);
		jnationality.setBounds(30,100,70,40);
		jheight.setBounds(30,160,70,40);
		jweight.setBounds(30,220,70,40);
		jdob.setBounds(30,280,70,40);
		jspeciality.setBounds(30,340,70,40);
		jtime.setBounds(30,400,70,40);
		jbatstyle.setBounds(30,460,70,40);
		jbowlstyle.setBounds(30,520,70,40);
		notice.setBounds(520,5,250,50);
		tname.setBounds(120,40,400,40);
		tnationality.setBounds(120,100,400,40);
		theight.setBounds(120,160,400,40);
		tweight.setBounds(120,220,400,40);
		tdob.setBounds(120,280,400,40);
		tspeciality.setBounds(120,340,400,40);
		ttime.setBounds(120,400,400,40);
		tbatstyle.setBounds(120,460,400,40);
		tbowlstyle.setBounds(120,520,400,40);
		sign.setBounds(440,560,80,40);
		back.setBounds(670,610,80,40);
		warning.setBounds(30,600,600,40);
		
		setdefault();
		
	    add(jname);
		add(jnationality);
		add(jspeciality);
		add(jbatstyle);
		add(jbowlstyle);
		add(jdob);
		add(jtime);
		add(jheight);
		add(jweight);
		add(tname);
		add(tnationality);
		add(tspeciality);
		add(tbatstyle);
		add(tbowlstyle);
		add(tdob);
		add(ttime);
		add(theight);
		add(tweight);
		add(notice);
		add(sign);
		add(back);
		add(warning);
		
		back.addActionListener(this);
		sign.addActionListener(this);
		
		setSize(800,700);
		setLocation(100,100);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void setdefault()
	{
		tname.setText("");
		tnationality.setText("");
		theight.setText("ex - 5-4");
		tweight.setText(" ex-80 (dont need to write kg)");
		tdob.setText("ex- 1-1-1998");
		tspeciality.setText("ex -Batting/Bowler/AllRounder/keeper");
		ttime.setText("ex- 10-12/12-2/2-4/5-6");
		tbatstyle.setText("ex- Right/Left");
		tbowlstyle.setText("ex- Right/left");
	}
	
	public void actionPerformed(ActionEvent e){
					String s=e.getActionCommand();
					if(s.equals("Back")){
						setdefault();
						whole.login.setVisible(true);
			             whole.signup.setVisible(false);
						 setdefault();
						}
					
					else{
						if(s.equals("Signup")){
							if(!tname.getText().isEmpty() && !tnationality.getText().isEmpty() && !tdob.getText().isEmpty() && !ttime.getText().isEmpty() && !tbatstyle.getText().isEmpty() && !tbowlstyle.getText().isEmpty() && !tspeciality.getText().isEmpty() && !theight.getText().isEmpty() && !tweight.getText().isEmpty()){
                                    DataAccess da=new DataAccess();
						            JOptionPane.showMessageDialog(null, "Confirm you are willingly giving this information.You will recieve mail if you are selected.");
						                 String sql=("INSERT INTO `temp_player`(`P_id`,`P_Name`, `P_Nationality`, `P_Height`, `P_Weight`, `P_Time`, `P_Batstyle`, `P_Bowlstyle`, `P_speciality`, `P_DOB`) VALUES (NULL,'"+tname.getText()+"','"+tnationality.getText()+"','"+theight.getText()+"','"+tweight.getText()+"','"+ttime.getText()+"','"+tbatstyle.getText()+"','"+tbowlstyle.getText()+"','"+tspeciality.getText()+"','"+tdob.getText()+"')");       
												try{
		                             	                        da.updateDB(sql);
		                                                    }
		                                                catch(Exception ex){ ex.printStackTrace(); }
		                          setdefault();	
					         	whole.login.setVisible(true);
			                     whole.signup.setVisible(false);
						}
						
					
						else
							warning.setText("*please fill up all the field");
						}
				}
			}		


}