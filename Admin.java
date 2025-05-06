import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*import java.sql.ResultSet;
import java.sql.SQLException;*/

public class Admin extends JFrame{
	private Whole whole;
	//private JComboBox jcapprove;
	private JButton bdelete;
	private JButton bseeinfo;
	private JButton bupnotice;
	private JButton bsetxi;
	private JButton badd;
	private JButton bgbook;
	private JButton bprequests;
	private JButton bupplayerstat;
	private JButton logout;
	private JLabel background;

	public Admin (Whole w)
	{
		super("Admin");
		this.whole=w;
		bdelete=new JButton("Delete");
		bseeinfo= new JButton("See Info");
		bupnotice= new JButton("Update Notice");
		bsetxi= new JButton("Set XI");
		badd= new JButton("Add");
		bgbook=new JButton("Ground Booking");
		bprequests=new JButton("New Player Req");
		bupplayerstat= new JButton("Update Info");
		logout=new JButton("Log out");
		background=new JLabel(new ImageIcon("C:\\Users\\astha\\OneDrive\\Pictures\\java-main\\java-main\\admin.jpg"));

		bprequests.setBounds(150,50,130,40);
		bgbook.setBounds(300,50,130,40);
		bsetxi.setBounds(150,120,130,40);
		bupnotice.setBounds(300,120,130,40);
		badd.setBounds(150,190,130,40);
		bseeinfo.setBounds(300,190,130,40);
		bdelete.setBounds(150,250,130,40);
		bupplayerstat.setBounds(300,250,130,40);
		logout.setBounds(400,300,150,40);
		background.setBounds(0,0,600,400);

		add(bdelete);
		add(bsetxi);
		add(bprequests);
		add(bseeinfo);
		add(bupnotice);
		add(bgbook);
		add(badd);
		add(bupplayerstat);
		add(logout);
		add(background);
		
		
			bsetxi.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			try{
			 whole.aplayingxi.set();
		     }
		 
		     catch(Exception ex){ex.printStackTrace();}	
			whole.aplayingxi.setVisible(true);
			whole.admin.setVisible(false);
		
		    }
		    });
		
			bupnotice.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			
			whole.unotice.setVisible(true);
			whole.admin.setVisible(false);
		
		    }
		    });
			
			badd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			
			whole.add.setVisible(true);
			whole.admin.setVisible(false);
		
		    }
		    });
			
			
			bprequests.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			try{
			 whole.aplayer.set();
		     }
		 
		     catch(Exception ex){ex.printStackTrace();}	
			 whole.aplayer.setVisible(true);
			 whole.admin.setVisible(false);
			
		
		    }
		    });
			
			
			
			bgbook.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
               try{
			 whole.aground.set();
		     }
		 
		     catch(Exception ex){ex.printStackTrace();}
			  whole.aground.setVisible(true);
			  whole.admin.setVisible(false);
		
		    }
		    });
			
			
			
			bseeinfo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
               
			  whole.home.setVisible(true);
			  whole.admin.setVisible(false);
		
		    }
		    });
			
			
			logout.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			  JOptionPane.showMessageDialog(null,"Logging out from Admin.If you have changed/add/delete any data it would be wise to restart the software");
			  whole.first.setVisible(true);
			  whole.admin.setVisible(false);
		
		    }
		    });
			
			
			bupplayerstat.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					ImageIcon icon=new ImageIcon("C:\\Users\\Kaushal\\Downloads\\java-main\\java-main\\image.png");
					JOptionPane.showMessageDialog(null,"Sorry too lazy to work on this one.Have some amazing idea for this, BTW","SORRY!!!",JOptionPane.INFORMATION_MESSAGE,icon);
				}
		    });
			
			
			
			bdelete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				whole.delete.setVisible(true);
				whole.admin.setVisible(false);
			  
		
		    }
		    });
			
			
		setSize(600,400);
		setLocation(100,100);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}
	
	
}
		
	
	