import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AplayingXI extends JFrame {
	private Whole whole;
	private JLabel notice;
	private JLabel lid1;
	private JLabel lid2;
	private JLabel lid3;
	private JLabel lid4;
	private JLabel lid5;
	private JLabel lid6;
	private JLabel lid7;
	private JLabel lid8;
	private JLabel lid9;
	private JLabel lid10;
	private JLabel lid11;
	private JTextField tid1;
	private JTextField tid2;
	private JTextField tid3;
	private JTextField tid4;
	private JTextField tid5;
	private JTextField tid6;
	private JTextField tid7;
	private JTextField tid8;
	private JTextField tid9;
	private JTextField tid10;
	private JTextField tid11;
	private JButton bback,confirm;
	private JButton bdelete;
    private JLabel lsugg;
	private String msg[]=new String[11];
    private JButton logout;	
	
	public AplayingXI (Whole w){
		super("Set XI");
		this.whole=w;
		//background=new background();
		lid1=new JLabel("PLAYER 1");
		lid2=new JLabel("PLAYER 2");
		lid3=new JLabel("PLAYER 3");
		lid4=new JLabel("PLAYER 4");
		lid5=new JLabel("PLAYER 5");
		lid6=new JLabel("PLAYER 6");
		lid7=new JLabel("PLAYER 7");
		lid8=new JLabel("PLAYER 8");
		lid9=new JLabel("PLAYER 9");
		lid10=new JLabel("PLAYER 10");
		lid11=new JLabel("PLAYER 11");
		tid1=new JTextField();
		tid2=new JTextField();
		tid1=new JTextField();
		tid2=new JTextField();
		tid3=new JTextField();
		tid4=new JTextField();
		tid5=new JTextField();
		tid6=new JTextField();
		tid7=new JTextField();
		tid8=new JTextField();
		tid9=new JTextField();
		tid10=new JTextField();
		tid11=new JTextField();
		bback=new JButton("Back");
		confirm=new JButton("Confirm");
		bdelete=new JButton("Delete Sugg.");
		lsugg=new JLabel(" *** ");
		logout=new JButton("Log out");
		
		lid1.setBounds(65,40,100,40);
		lid2.setBounds(65,90,100,40);
		lid3.setBounds(65,140,100,40);
		lid4.setBounds(65,190,100,40);
		lid5.setBounds(65,240,100,40);
		lid6.setBounds(65,290,100,40);
		lid7.setBounds(65,340,100,40);
		lid8.setBounds(65,390,100,40);
		lid9.setBounds(65,440,100,40);
		lid10.setBounds(65,490,100,40);
		lid11.setBounds(65,540,100,40);
		
		tid1.setBounds(160,50,250,30);
		tid2.setBounds(160,100,250,30);
		tid3.setBounds(160,150,250,30);
		tid4.setBounds(160,200,250,30);
		tid5.setBounds(160,250,250,30);
		tid6.setBounds(160,300,250,30);
		tid7.setBounds(160,350,250,30);
		tid8.setBounds(160,400,250,30);
		tid9.setBounds(160,450,250,30);
		tid10.setBounds(160,500,250,30);
		tid11.setBounds(160,550,250,30);
		bback.setBounds(30,600,100,30);
		confirm.setBounds(300,600,100,30);
		bdelete.setBounds(650,550,120,30);
		lsugg.setBounds(430,40,200,600);
		logout.setBounds(600,600,150,40);
		
		
		
		
		
		
		
		
		
		add(confirm);
		add(lid1);
		add(lid2);
		add(lid3);
		add(lid4);
		add(lid5);
		add(bback);
		add(lid6);
		add(lid7);
		add(lid8);
	    add(lid9);
		add(lid10);
		add(lid11);
		add(tid1);
		add(tid2);
		add(tid3);
		add(tid4);
		add(tid5);
		add(tid6);
		add(tid7);
		add(tid8);
		add(tid9);
		add(tid10);
		add(tid11);
		add(bdelete);
		add(lsugg);
		add(logout);
		
		bback.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			whole.admin.setVisible(true);
			whole.aplayingxi.setVisible(false);
		
		}
		});
		
		confirm.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			if(tid1.getText().isEmpty() || tid2.getText().isEmpty() || tid3.getText().isEmpty() || tid4.getText().isEmpty() || tid5.getText().isEmpty() || tid6.getText().isEmpty() || tid7.getText().isEmpty() || tid8.getText().isEmpty() || tid9.getText().isEmpty() || tid10.getText().isEmpty() || tid11.getText().isEmpty()){
			
			JOptionPane.showMessageDialog(null,"sorry,a field is empty!try again");
			
			}
			else
			{
				DataAccess da=new DataAccess();
				msg[0]="UPDATE `playingxi` SET `X_Data` = '"+tid1.getText()+"' WHERE `playingxi`.`X_id` = 1;";
				msg[1]="UPDATE `playingxi` SET `X_Data` = '"+tid2.getText()+"' WHERE `playingxi`.`X_id` = 2;";
				msg[2]="UPDATE `playingxi` SET `X_Data` = '"+tid3.getText()+"' WHERE `playingxi`.`X_id` = 3;";
				msg[3]="UPDATE `playingxi` SET `X_Data` = '"+tid4.getText()+"' WHERE `playingxi`.`X_id` = 4;";
				msg[4]="UPDATE `playingxi` SET `X_Data` = '"+tid5.getText()+"' WHERE `playingxi`.`X_id` = 5;";
				msg[5]="UPDATE `playingxi` SET `X_Data` = '"+tid6.getText()+"' WHERE `playingxi`.`X_id` = 6;";
				msg[6]="UPDATE `playingxi` SET `X_Data` = '"+tid7.getText()+"' WHERE `playingxi`.`X_id` = 7;";
				msg[7]="UPDATE `playingxi` SET `X_Data` = '"+tid8.getText()+"' WHERE `playingxi`.`X_id` = 8;";
				msg[8]="UPDATE `playingxi` SET `X_Data` = '"+tid9.getText()+"' WHERE `playingxi`.`X_id` = 9;";
				msg[9]="UPDATE `playingxi` SET `X_Data` = '"+tid10.getText()+"' WHERE `playingxi`.`X_id` = 10;";
				msg[10]="UPDATE `playingxi` SET `X_Data` = '"+tid11.getText()+"' WHERE `playingxi`.`X_id` = 11;";
				for(int i=0;i<11;i++)
				{
					try{
					da.updateDB(msg[i]);
					}
					catch(Exception ex){ ex.printStackTrace(); }
					
				}
				JOptionPane.showMessageDialog(null,"Player list has updated");
				try{
					set();
					}
					catch(Exception ex){ ex.printStackTrace(); }
			}
			
			}
		});
		
		bdelete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					DataAccess da=new DataAccess();
					try{
					da.updateDB("delete from suggest");
					}
					catch(Exception ex){ ex.printStackTrace(); }
					lsugg.setText("");
					
		
		    
		
				}
				});
				
				
		logout.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			  JOptionPane.showMessageDialog(null,"Logging out from Admin.If you have changed/add/delete any data it would be wise to restart the software");
			  whole.first.setVisible(true);
			  whole.aplayingxi.setVisible(false);
		
		    }
		    });		
		
		setSize(800,700);
		setLocation(100,100);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}
	
	
	public void set()throws SQLException{
		DataAccess da=new DataAccess();
		ResultSet rs=da.getData("SELECT * FROM `playingxi`");
		String data[]=new String[11];
		int i=0;
		while(rs.next())
		{
			data[i++]=String.valueOf(rs.getInt("X_Data"));
		}
		
		tid1.setText(data[0]);
		tid2.setText(data[1]);
		tid3.setText(data[2]);
		tid4.setText(data[3]);
		tid5.setText(data[4]);
		tid6.setText(data[5]);
		tid7.setText(data[6]);
		tid8.setText(data[7]);
		tid9.setText(data[8]);
		tid10.setText(data[9]);
		tid11.setText(data[10]);
		
		
	
	
	
	    ResultSet es=da.getData("select * from suggest");
		String msg2="<html> ";
		while(es.next())
		{int sid,pid;
	        pid=es.getInt("Sugg_p");
			sid=es.getInt("Sugg_by");

			msg2=msg2+pid+" sugggested by "+sid+"<br/>";



			
			
		}
		msg2=msg2+"</html>";
		lsugg.setText(msg2);
    }
	
	private void delete(){
		
	}
}
		
		
		
		
		
		
		
		
		
		
	