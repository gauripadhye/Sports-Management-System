import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Unotice extends JFrame implements  ActionListener{
	private Whole whole;
	private JLabel lid;
	private JLabel lnotice;
	private JLabel ldate;
	private JButton bback; 
	private JButton bconfirm;
	private JTextField tid;
    private JTextField tnotice;
    private JTextField tdate;
    private JButton logout;	
	
	public Unotice (Whole w){
	    super("Update Notice");
		this.whole=w;
	lid=new JLabel("Notice ID");
	lnotice=new JLabel("Notice");
	ldate=new JLabel("Date");
	bback=new JButton("Back");
    bconfirm=new JButton("Confirm!");
	tid=new JTextField();
	tnotice=new JTextField();
	tdate=new JTextField();
	logout=new JButton("Log out");
	
	
	lid.setBounds(40,50,100,40);
	lnotice.setBounds(40,110,100,40);
	ldate.setBounds(40,280,100,40);
	tid.setBounds(100,50,250,40);
	tnotice.setBounds(100,110,250,150);
	tdate.setBounds(100,280,250,40);
	bback.setBounds(20,400,70,30);
	bconfirm.setBounds(250,330,100,40);
	logout.setBounds(350,400,150,40);
	
	
	
	add(lid);
	add(lnotice);
	add(ldate);
	add(tid);
	add(tnotice);
	add(tdate);
	add(bback);
	add(bconfirm);
	add(logout);


		bback.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			whole.admin.setVisible(true);
			whole.unotice.setVisible(false);
		
		}
		});	
		
		bconfirm.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			if(tid.getText().isEmpty() || tnotice.getText().isEmpty() || tdate.getText().isEmpty())
			{
				JOptionPane.showMessageDialog(null,"sorry,a field is empty!try again");
			}
			else{
			    DataAccess da=new DataAccess();
				try{
					da.updateDB("INSERT INTO `notice` (`N_Id`, `N_Message`, `N_Time`) VALUES ('"+tid.getText()+"', '"+tnotice.getText()+"', '"+tdate.getText()+"');");
					}
					catch(Exception ex){ ex.printStackTrace(); }
					JOptionPane.showMessageDialog(null,"Notice inserted you can go back or update a new one");
					tid.setText(" ");
					tnotice.setText(" ");
					tdate.setText(" ");
					
			
			}
		
		}
		});	
		
		
		
		logout.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			  JOptionPane.showMessageDialog(null,"Logging out from Admin.If you have changed/add/delete any data it would be wise to restart the software");
			  whole.first.setVisible(true);
			  whole.unotice.setVisible(false);
		
		    }
		    });
			
		setSize(550,500);
		setLocation(100,100);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}
	public void actionPerformed(ActionEvent e){
	}
}
		
	