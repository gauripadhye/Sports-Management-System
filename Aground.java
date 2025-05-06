import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Aground extends JFrame{
	private Whole whole; 
	private JButton bapprove,bdelete,bdeleteall,bback,blogout;
	private JTextField japprove,jdelete;
	private JScrollPane pane;
	private JTable table;
	private DefaultTableModel model;
	private String data[],value[][];
	private String[] column={"Serial","Name","Phone","Email","Time"};
	private int total;
	
	public Aground(Whole w){
		super("Accept Ground Request");
		this.whole=w;
		
		table=new JTable();
		pane=new JScrollPane(table);
		model=new DefaultTableModel();
		japprove=new JTextField();
		jdelete=new JTextField();
		bback=new JButton("Back");
		blogout=new JButton("Logout");
		bapprove=new JButton("Approve");
		bdelete=new JButton("Delete");
		bdeleteall=new JButton("Delete All");
		
		
		bdeleteall.setBackground(Color.RED);
		
		
		model.setColumnIdentifiers(column);
		table.setModel(model);
		//table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		table.setRowHeight(50);
		
		
		
		
		pane.setBounds(0,0,650,250);
		bback.setBounds(10,390,120,40);
		blogout.setBounds(500,390,150,40);
		japprove.setBounds(5,300,100,40);
		bapprove.setBounds(110,300,120,40);
		jdelete.setBounds(240,300,100,40);
		bdelete.setBounds(345,300,130,40);
		bdeleteall.setBounds(500,300,150,40);
		
		
		
		
		add(pane);
		add(bback);
		add(blogout);
		add(bapprove);
		add(bdelete);
		add(bdeleteall);
		add(japprove);
		add(jdelete);
		
		
		bapprove.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			boolean flag=false;
			int index=0;
			for(int l=0;l<total;l++)
			{
				if((japprove.getText()).equals(value[l][0]))
				{flag=true;
				index=l;
				 break;}
			}
			
			if(flag){
				    
					DataAccess da=new DataAccess();
					JOptionPane.showMessageDialog(null,"Ground booking for "+value[index][1]+" Confirmed.A email will be sent to "+value[index][3]);

					
				try{
					da.updateDB("DELETE FROM `tground` WHERE `tground`.`G_id` ="+japprove.getText());
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
		
		
		
		
		bdelete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			boolean flag=false;
			for(int l=0;l<total;l++)
			{
				if((jdelete.getText()).equals(value[l][0]))
				{flag=true;
				 break;}
			}
			
			if(flag){
				
					DataAccess da=new DataAccess();
				try{
					da.updateDB("DELETE FROM `tground` WHERE `tground`.`G_id` ="+jdelete.getText());
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
					da.updateDB("delete from tground");
					}
					catch(Exception ex){ ex.printStackTrace(); }
		    
			 
					try{
					set();
					}
					catch(Exception ex){ ex.printStackTrace(); }
				}
		    });
			
		
		
		bback.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			whole.aground.setVisible(false);
			whole.admin.setVisible(true);
		
		    }
		    });
		
		blogout.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			  JOptionPane.showMessageDialog(null,"Logging out from Admin.If you have changed/add/delete any data it would be wise to restart the software");
			  whole.first.setVisible(true);
			  whole.aground.setVisible(false);
		
		    }
		    });	
		
		setSize(680,500);
		setLocation(100,100);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void set()throws SQLException{
		DataAccess da=new DataAccess();
		ResultSet rs=da.getData("SELECT * FROM `tground`");
		ResultSet es=da.getData("SELECT * FROM `tground`");
		
		model.setRowCount(0);		
		
		while(rs.next())
		{
			total++;
		}
		//System.out.println("total"+total);
		value=new String[total][5];
		data=new String[5];
		
		int i=0,j=0;
		
		while(es.next())
		{j=0;
			value[i][j]=data[j++]=String.valueOf(es.getInt("G_id"));
			value[i][j]=data[j++]=es.getString("G_Name");
			value[i][j]=data[j++]=es.getString("G_Phone");
			value[i][j]=data[j++]=es.getString("G_Email");
			value[i][j]=data[j++]=es.getString("G_Time");

			i++;
			model.addRow(data);
			
		}
		
		japprove.setText("Serial to accept");
		jdelete.setText("Serial to Delete");
	
	
	}

}
	