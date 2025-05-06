import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Delete extends JFrame{
	private Whole whole;
	private JTextField jdelete;
	private  JButton back,logout,bcoach,bstaff,bplayer;
	private JLabel msg,background;
	
	
	public Delete (Whole w){
		super("Delete");
		this.whole=w;
		
		jdelete=new JTextField();
		bplayer=new JButton("Player");
		bcoach=new JButton("Coach");
		bstaff=new JButton("Staff");
		back=new JButton("Back");
		logout=new JButton("Logout");
		msg=new JLabel("Type the Id and then click the 'type' button");
		background=new JLabel(new ImageIcon("C:\\Users\\astha\\OneDrive\\Pictures\\java-main\\java-main\\delete.jpg"));

		msg.setForeground(Color.RED);
		msg.setFont(new Font("Serif",Font.BOLD,20));
		
		
		
		
		msg.setBounds(10,40,400,200);
		
		jdelete.setBounds(75,250,250,40);
		bcoach.setBounds(35,300,100,40);
		bplayer.setBounds(145,300,100,40);
		bstaff.setBounds(250,300,100,40);
		back.setBounds(5,370,100,40);
		logout.setBounds(250,370,120,40);
		background.setBounds(0,0,400,600);
		
		
		add(msg);
		add(jdelete);
		add(bcoach);
		add(bplayer);
		add(bstaff);
		add(back);
		add(logout);
		add(background);
		
		
		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jdelete.setText("");
				whole.admin.setVisible(true);
				whole.delete.setVisible(false);
			  
		
		    }
		    });
			
			
		logout.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			  JOptionPane.showMessageDialog(null,"Logging out from Admin.If you have changed/add/delete any data it would be wise to restart the software");
			  whole.first.setVisible(true);
			  whole.delete.setVisible(false);
		
		    }
		    });	
			
			
		bcoach.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(jdelete.getText().isEmpty())
			    JOptionPane.showMessageDialog(null,"Field is empty");
				else{
					int index=whole.buffercoach.getcid(jdelete.getText());
					if(index==999)
						JOptionPane.showMessageDialog(null,"No such id found.Check if it Start with 1,four carecter long and is a integer");
					else{
						JOptionPane.showMessageDialog(null,"Deleting coach ID : "+jdelete.getText()+" Name: "+whole.buffercoach.coach[index].getName());
						DataAccess da=new DataAccess();
						         
								 
						         try{
							        da.updateDB("DELETE FROM `coach` WHERE `coach`.`C_id` = "+jdelete.getText());
									da.updateDB("DELETE FROM `odi` WHERE `odi`.`ID` = "+jdelete.getText());
									da.updateDB("DELETE FROM `t20` WHERE `t20`.`ID` = "+jdelete.getText());
									da.updateDB("DELETE FROM `test` WHERE `test`.`ID` = "+jdelete.getText());

									whole.buffercoach.loadcoach();
									}
								catch(Exception ex){ ex.printStackTrace();}
								jdelete.setText("");
						
					}
					
				}

		
		    }
		    });
			

		bplayer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(jdelete.getText().isEmpty())
			    JOptionPane.showMessageDialog(null,"Field is empty");
				else{
					int index=whole.bufferplayer.getpid(jdelete.getText());
					if(index==999)
						JOptionPane.showMessageDialog(null,"No such id found.Check if it Start with 2,four carecter long and is a integer");
					else{
						JOptionPane.showMessageDialog(null,"Deleting player ID : "+jdelete.getText()+" Name: "+whole.bufferplayer.player[index].getName());
						DataAccess da=new DataAccess();
						         
								 
						         try{
							        da.updateDB("DELETE FROM `player` WHERE `player`.`P_id` = "+jdelete.getText());
									da.updateDB("DELETE FROM `odi` WHERE `odi`.`ID` = "+jdelete.getText());
									da.updateDB("DELETE FROM `t20` WHERE `t20`.`ID` = "+jdelete.getText());
									da.updateDB("DELETE FROM `test` WHERE `test`.`ID` = "+jdelete.getText());

									whole.bufferplayer.loadplayer();
									}
								catch(Exception ex){ ex.printStackTrace();}
								jdelete.setText("");
						
					}
					
				}

		
		    }
		    });


		bstaff.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(jdelete.getText().isEmpty())
			    JOptionPane.showMessageDialog(null,"Field is empty");
				else{
					int index=whole.bufferstaff.getsid(jdelete.getText());
					if(index==999)
						JOptionPane.showMessageDialog(null,"No such id found.Check if it Start with 3,four carecter long and is a integer");
					else{
						JOptionPane.showMessageDialog(null,"Deleting Staff ID : "+jdelete.getText()+" Name: "+whole.bufferstaff.staff[index].getName());
						DataAccess da=new DataAccess();
						         
								 
						         try{
							        da.updateDB("DELETE FROM `staff` WHERE `staff`.`S_id` = "+jdelete.getText());

									whole.bufferstaff.loadstaff();
									}
								catch(Exception ex){ ex.printStackTrace();}
								jdelete.setText("");
						
					}
					
				}

		
		    }
		    });			
		
		setSize(400,600);
		setLocation(100,100);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}