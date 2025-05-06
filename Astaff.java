import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Astaff extends JFrame{
	private Whole whole;
	private JLabel notice,jid,jname,jexp,jnation,jdob,jtime,jspe,jsal,jpass;
	private JTextField 	tid,tname,texp,tnation,tdob,ttime,tspe,tsal,tpass;
    private JButton back,logout,confirm;
	
	public Astaff(Whole w){
		super("Add Staff");
		this.whole=w;
		
		tid=new JTextField();
		tname=new JTextField();
		texp=new JTextField();
		tnation=new JTextField();
		tdob=new JTextField();
		ttime=new JTextField();
		tspe=new JTextField();
		tsal=new JTextField();
		tpass=new JTextField();
		
		jid=new JLabel("ID");
		jname=new JLabel("Name");
		jexp=new JLabel("Experience");
		jnation=new JLabel("Nationality");
		jdob=new JLabel("DOB");
		jtime=new JLabel("Time");
		jspe=new JLabel("Speciality");
		jsal=new JLabel("Salary");
		jpass=new JLabel("Pass");
		back=new JButton("Back");
		logout=new JButton("Logout");
		confirm=new JButton("Confirm");
		
		jid.setBounds(10,10,150,40);
		jname.setBounds(10,60,150,40);
		jexp.setBounds(10,110,150,40);
		jnation.setBounds(10,160,150,40);
		jdob.setBounds(10,210,150,40);
		jtime.setBounds(10,260,150,40);
		jspe.setBounds(10,310,150,40);
		jsal.setBounds(10,360,150,40);
		jpass.setBounds(10,410,150,40);
		
		tid.setBounds(170,10,250,40);
		tname.setBounds(170,60,250,40);
		texp.setBounds(170,110,250,40);
		tnation.setBounds(170,160,250,40);
		tdob.setBounds(170,210,250,40);
		ttime.setBounds(170,260,250,40);
		tspe.setBounds(170,310,250,40);
		tsal.setBounds(170,360,250,40);
		tpass.setBounds(170,410,250,40);
		confirm.setBounds(200,460,150,40);
		back.setBounds(10,510,100,40);
		logout.setBounds(370,510,120,40);
		
	   
	   
	   
	   add(jid);
	   add(jname);
	   add(jexp);
	   add(jnation);
	   add(jtime);
	   add(jdob);
	   add(jspe);
	   add(jsal);
	   add(jpass);
	   
	   add(tid);
	   add(tname);
	   add(texp);
	   add(tnation);
	   add(ttime);
	   add(tdob);
	   add(tspe);
	   add(tsal);
	   add(tpass);
	   add(confirm);
	   add(back);
	   add(logout);
	   
	   
	   
	   
	   back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			tid.setText("");
			tname.setText("");
			texp.setText("");
			tnation.setText("");
			tdob.setText("");
			ttime.setText("");
			tspe.setText("");
			tsal.setText("");
			tpass.setText("");
			whole.astaff.setVisible(false);
			whole.add.setVisible(true);
		
		    }
		    });
			
		
	   logout.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			  JOptionPane.showMessageDialog(null,"Logging out from Admin.If you have changed/add/delete any data it would be wise to restart the software");
			  tid.setText("");
				tname.setText("");
				texp.setText("");
				tnation.setText("");
				tdob.setText("");
				ttime.setText("");
				tspe.setText("");
				tsal.setText("");
				tpass.setText("");
			  whole.first.setVisible(true);
			  whole.astaff.setVisible(false);
		
		    }
		    });


		confirm.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
			boolean flag=false,number=false;
			int index=0;
			
			try  
			{  
			int s=Integer.parseInt(tid.getText());
			    number=true;
			}  
			catch(NumberFormatException nfe)  
			{ System.out.println("String");  }

				
			if(tid.getText().isEmpty() || tname.getText().isEmpty() || texp.getText().isEmpty() || tnation.getText().isEmpty() || tdob.getText().isEmpty() || ttime.getText().isEmpty() || tspe.getText().isEmpty() || tsal.getText().isEmpty() || tpass.getText().isEmpty())
			    JOptionPane.showMessageDialog(null,"A Field is Empry try again!");	

			else{
			    if(!number || !((tid.getText()).substring(0,1)).equals("3") || (tid.getText()).length()!=4)
			        JOptionPane.showMessageDialog(null,"Staff id must be a integer and four length long and Start with 3. (ex:3xxx)");	
				else
				{
					int chck=whole.bufferstaff.getsid(tid.getText());
						      if( chck!=999)
							   {
								   JOptionPane.showMessageDialog(null,"Id for staff already exist");
							   }
							   else
							   { DataAccess da=new DataAccess();
						         
								 
						         try{
							        da.updateDB("INSERT INTO `staff` (`S_id`, `S_Name`, `S_Experience`, `S_Nationality`, `S_DOB`, `S_Time`, `S_Speciality`, `S_Salary`, `S_Password`) VALUES ('"+tid.getText()+"', '"+tname.getText()+"', '"+texp.getText()+"', '"+tnation.getText()+"', '"+tdob.getText()+"', '"+ttime.getText()+"', '"+tspe.getText()+"', '"+tsal.getText()+"', '"+tpass.getText()+"');");
									System.out.println("ok");
									whole.bufferstaff.loadstaff();
									}
								catch(Exception ex){ ex.printStackTrace();}
								tid.setText("");
								tname.setText("");
								texp.setText("");
								tnation.setText("");
								tdob.setText("");
								ttime.setText("");
								tspe.setText("");
								tsal.setText("");
								tpass.setText("");
							    JOptionPane.showMessageDialog(null,"Done!");

								}
				}
			}
				
				
				
		    }
		    });	



		setSize(540,620);
		setLocation(100,100);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
 
	}

}

	   