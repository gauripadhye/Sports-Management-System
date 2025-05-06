import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Settings extends JFrame implements  ActionListener{
	private Whole whole;
	private JLabel background;
	private JLabel header;
	private JLabel lname;
	private JLabel lppass;
	private JLabel lnpass;
	private JLabel lweight;
	private JLabel lheight;
	private JLabel notice;
	private JTextField tname;
	private JTextField tppass;
	private JTextField tnpass;
	private JTextField theight;
	private JTextField tweight;
	private JButton bconfirm;
	private JButton bback;
	private JButton blogout;
	private int idx;
	private String id,tmsg,pass,type;
	private String sqlname,sqlid,sqlpass;


	
	
	public Settings (Whole w){
		super("Settings");
		this.whole=w;
		lname=new JLabel("         Name");
		lppass=new JLabel("Prev. Password");
		lnpass=new JLabel("  Password");
		//lweight=new JLabel("       Weight");
		//lheight=new JLabel("         Height");
        tname=new JTextField();
        tppass=new JTextField();
		tnpass=new JTextField();
		//theight=new JTextField();
		//tweight=new JTextField();
		background=new JLabel();
		bconfirm=new JButton("Confirm!");
		bback=new JButton("Back");
		blogout=new JButton("Log Out");
		header=new JLabel("<html> To change your information clear it & write your new information. <html>");
		notice=new JLabel("");
		
		notice.setForeground(Color.RED);
		
		lppass.setBounds(125,100,100,30);
		lname.setBounds(145,150,100,30);
		lnpass.setBounds(145,200,100,30);
		//lweight.setBounds(145,250,100,30);
		//lheight.setBounds(145,300,80,30);
		tppass.setBounds(230,100,250,30);
		tname.setBounds(230,150,250,30);
	    tnpass.setBounds(230,200,250,30);
		//theight.setBounds(230,250,250,30);
		//tweight.setBounds(230,300,250,30);
		bconfirm.setBounds(375,350,100,50);
		bback.setBounds(20,400,70,30);
		blogout.setBounds(580,400,80,30);
		header.setBounds(50,50,650,30);
		background.setBounds(150,0,200,200);
		notice.setBounds(240,240,200,100);
		
		
		
		tname.setText(tmsg);
		
		header.setFont(new Font("Serif",Font.ITALIC,20));
		header.setForeground(Color.RED);
		add(lppass);
		add(lname);
		//add(lweight);
		//add(lheight);

		add(lnpass);
		add(tname);
		add(tppass);
		add(tnpass);
		//add(theight);
		//add(tweight);
		add(background);
		add(bconfirm);
		add(bback);
		add(blogout);
		add(header);
		add(notice);
		
		
				    
		
		 blogout.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			whole.login.logid = null;	
			whole.first.setVisible(true);
			whole.settings.setVisible(false);
		
		}
	});
	 bback.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){	
			tnpass.setText("");
			tppass.setText("");
			whole.home.setVisible(true);
			whole.settings.setVisible(false);
		
		}
	});
	
	bconfirm.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			if(tname.getText().isEmpty() || tnpass.getText().isEmpty()  || tppass.getText().isEmpty()) 
			notice.setText("*Any field is empty check again");
		      
			  else {if (!(tppass.getText()).equals(pass))
			             notice.setText("previous password does not match");
						 else
						 {
							DataAccess da=new DataAccess();
							//String msg="UPDATE `player` SET `P_Name` = 'Mushfiqur Rahim', `P_Password` = '101010' WHERE `player`.`P_id` = 2222;";
							String msg2="UPDATE `"+type+"` SET `"+sqlname+"` = '"+tname.getText()+"', `"+sqlpass+"` = '"+tnpass.getText()+"' WHERE `"+type+"`.`"+sqlid+"` = "+id+";";
							//System.out.println(msg);
							//System.out.println(msg2);
							String cstring="Your changed is confirmed!Log out to see the change";
							JOptionPane.showMessageDialog(null,cstring);
							try{
									da.updateDB(msg2);
								}
									catch(Exception ex){ ex.printStackTrace(); }
									tnpass.setText("");
									tppass.setText("");
								whole.login.logid = null;	
								whole.first.setVisible(true);
								whole.settings.setVisible(false);	
						 }
			  }              
		}
	});
	
		setSize(700,500);
		setLocation(100,100);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
		
	}
        public void actionPerformed(ActionEvent e){
	}
	
	public void setinfo(){
		id=whole.login.logid;
		System.out.println(id);
		if((id.substring(0,1)).equals("1")){
			idx=whole.buffercoach.getcid(id);
			tmsg=whole.buffercoach.coach[idx].getName();
			tname.setText(tmsg);
			pass=whole.buffercoach.coach[idx].getPass();
			type="coach";
			sqlid="C_id";
			sqlpass="C_Password";
			sqlname="C_Name";
			
			//System.out.println(sql);
		}
		else {if((id.substring(0,1)).equals("2")){
			idx=whole.bufferplayer.getpid(id);
			tmsg=whole.bufferplayer.player[idx].getName();
			tname.setText(tmsg);
			pass=whole.bufferplayer.player[idx].getPass();
			type="player";
			sqlid="P_id";
			sqlpass="P_Password";
			sqlname="P_Name";
			//System.out.println(sql);
		}
		else{
		    idx=whole.bufferstaff.getsid(id);
			tmsg=whole.bufferstaff.staff[idx].getName();		
			tname.setText(tmsg);
			pass=whole.bufferplayer.player[idx].getPass();
			type= "staff";
			sqlid="S_id";
			sqlpass="S_Password";
			sqlname="S_Name";
			//System.out.println(sql);
		  }
		}
		notice.setText(" ");
		}
	}
