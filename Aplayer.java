import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Aplayer extends JFrame{
	private Whole whole;
	private JLabel jmsg;
	private JButton back,badd,bdelete,bdeleteall;
	private JTextField tadd,tdelete,tid,tpass;
	private JTable table;
	private JScrollPane pane;
	private DefaultTableModel model;
	private int total;
	private String data[],value[][];
	private String[] column={"Serial","Name","Nationality","Height","Weight","Time","Batstyle","Bowlstyle","Speciality","DOB"};
    private JButton logout;	
	
	
	public Aplayer(Whole w){
		super("Accept Player Request");
		this.whole=w;
		
		jmsg=new JLabel("");
		table=new JTable();
		pane=new JScrollPane(table);
		model=new DefaultTableModel();
		tadd=new JTextField();
		tdelete=new JTextField();
		back=new JButton("Back");
		badd=new JButton("Add");
		bdelete=new JButton("Delete");
		bdeleteall=new JButton("Delete All");
		tid=new JTextField();
		tpass=new JTextField();
		logout=new JButton("Log out");
		
		bdeleteall.setBackground(Color.RED);
		
		
		model.setColumnIdentifiers(column);
		table.setModel(model);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		table.setRowHeight(50);
		
		
		
		pane.setBounds(0,0,650,250);
		tadd.setBounds(20,300,100,40);
		badd.setBounds(125,300,80,40);
		tdelete.setBounds(240,300,100,40);
		bdelete.setBounds(345,300,130,40);
		bdeleteall.setBounds(500,300,150,40);
		tid.setBounds(20,340,100,40);
		tpass.setBounds(125,340,80,40);
		back.setBounds(10,390,120,40);
		logout.setBounds(500,390,150,40);
		
		//add(jmsg);
		add(pane);
		add(back);
		add(badd);
		add(tadd);
		add(tdelete);
		add(bdelete);
		add(bdeleteall);
		add(tid);
		add(tpass);
		add(logout);
		
		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			
			tadd.setText("Serial to add");
			tdelete.setText("Serial to delete");
			tid.setText("New user id");
			tpass.setText("User pass");
			whole.aplayer.setVisible(false);
			whole.admin.setVisible(true);
		
		    }
		    });
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		badd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			boolean flag=false,number=false;
			int index=0;
			for(int l=0;l<total;l++)
			{
				if((tadd.getText()).equals(value[l][0]))
				{flag=true;
					index=l;
				 break;}
			}
			
			
			try  
			{  
			int s=Integer.parseInt(tid.getText());
			    number=true;
			}  
			catch(NumberFormatException nfe)  
			{ System.out.println("String");  }  
			
			
			
			if(tid.getText().isEmpty() || tpass.getText().isEmpty())
			{
			   JOptionPane.showMessageDialog(null,"Id and password field cant be empty");	
			}
			
			else{
				if(flag)
				 {  
					if( !((tid.getText()).substring(0,1)).equals("2") || (tid.getText()).length()!=4 || !number )
							JOptionPane.showMessageDialog(null,"Id for player must be like 2xxx and all integer value"); 
					
						else
						{  int chck=whole.bufferplayer.getpid(tid.getText());
						      if( chck!=999)
							   {
								   JOptionPane.showMessageDialog(null,"Id for player already exist");
							   }
							   else
							   { DataAccess da=new DataAccess();
						         
								 
						         try{
							        da.updateDB("INSERT INTO `player` (`P_id`, `P_Name`, `P_Nationality`, `P_Height`, `P_Weight`, `P_Time`, `P_Batstyle`, `P_Bowlstyle`, `P_speciality`, `P_DOB`, `P_type`, `P_Salary`, `P_Password`) VALUES ('"+tid.getText()+"', '"+value[index][1]+"', '"+value[index][2]+"', '"+value[index][3]+"', '"+value[index][4]+"', '"+value[index][5]+"', '"+value[index][6]+"', '"+value[index][7]+"', '"+value[index][8]+"', '"+value[index][9]+"', 'trainee', '00', '"+tpass.getText()+"')");
									da.updateDB("INSERT INTO `odi` (`ID`, `MATCHES`, `RUNS`, `50s`, `100s`, `HIGHEST SCORE`, `INNINGS`, `WICKETS`, `BEST FIGURE`, `5W`, `ECO RATE`, `CATCHES`) VALUES ('"+tid.getText()+"', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0')");
									da.updateDB("INSERT INTO `t20` (`ID`, `MATCHES`, `RUNS`, `50s`, `100s`, `HIGHEST SCORE`, `INNINGS`, `WICKETS`, `BEST FIGURE`, `5W`, `ECO RATE`, `CATCHES`) VALUES ('"+tid.getText()+"', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0')");
									da.updateDB("INSERT INTO `test` (`ID`, `MATCHES`, `RUNS`, `50s`, `100s`, `HIGHEST SCORE`, `INNINGS`, `WICKETS`, `BEST FIGURE`, `5W`, `ECO RATE`, `CATCHES`) VALUES ('"+tid.getText()+"', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0')");
									da.updateDB("DELETE FROM `temp_player` WHERE `temp_player`.`P_id` ="+tadd.getText());
									whole.bufferplayer.loadplayer();
									set();
									}
								catch(Exception ex){ ex.printStackTrace(); }

							   }								   
						
						
						
						}
						
					
					
					
					
					
				 }
				 else
					JOptionPane.showMessageDialog(null,"Typed value doesnt match with Serial.Check if is empty or try again"); 
				
				
				
			}
			
			
		
		    }
		    });
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
				
		bdelete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			boolean flag=false;
			for(int l=0;l<total;l++)
			{
				if((tdelete.getText()).equals(value[l][0]))
				{flag=true;
				 break;}
			}
			
			if(flag){
				
					DataAccess da=new DataAccess();
				try{
					da.updateDB("DELETE FROM `temp_player` WHERE `temp_player`.`P_id` ="+tdelete.getText());
					}
					catch(Exception ex){ ex.printStackTrace(); }
					
					try{
					set();
					}
					catch(Exception ex){ ex.printStackTrace(); }
					
			}
			
			else
				JOptionPane.showMessageDialog(null,"Typed value doesnt match with Serial.Check if is empty or try again");
		
		    }
			
		    });
			
			
		bdeleteall.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			DataAccess da=new DataAccess();
					try{
					da.updateDB("delete from temp_player ");
					}
					catch(Exception ex){ ex.printStackTrace(); }
		    
			 
					try{
					set();
					}
					catch(Exception ex){ ex.printStackTrace(); }
				}
		    });
			
			
			
			
			
		logout.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			  JOptionPane.showMessageDialog(null,"Logging out from Admin.If you have changed/add/delete any data it would be wise to restart the software");
			  whole.first.setVisible(true);
			  whole.aplayer.setVisible(false);
		
		    }
		    });	
		
		
		
		setSize(680,500);
		setLocation(100,100);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public void set()throws SQLException{
		DataAccess da=new DataAccess();
		ResultSet rs=da.getData("SELECT * FROM `temp_player`");
		ResultSet es=da.getData("SELECT * FROM `temp_player`");
		
		/*while (model.getRowCount() > 0) {
                 model.removeRow(0);
				}*/
		model.setRowCount(0);		
		
		while(rs.next())
		{
			total++;
		}
		//System.out.println("total"+total);
		value=new String[total][10];
		data=new String[10];
		
		int i=0,j=0;
		
		while(es.next())
		{j=0;
			value[i][j]=data[j++]=String.valueOf(es.getInt("P_id"));
			value[i][j]=data[j++]=es.getString("P_Name");
			value[i][j]=data[j++]=es.getString("P_Nationality");
			value[i][j]=data[j++]=es.getString("P_Height");
			value[i][j]=data[j++]=String.valueOf(es.getInt("P_Weight")); 
			value[i][j]=data[j++]=es.getString("P_Time");
			value[i][j]=data[j++]=es.getString("P_Batstyle");
			value[i][j]=data[j++]=es.getString("P_Bowlstyle");
			value[i][j]=data[j++]=es.getString("P_Speciality");
			value[i][j]=data[j++]=es.getString("P_DOB");
			i++;
			model.addRow(data);
			
		}
		tadd.setText("Serial to add");
		tdelete.setText("Serial to delete");
		tid.setText("New user id");
		tpass.setText("User pass");
		
		
		
	}
}

		
		
		
		
		
	