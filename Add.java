import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Add extends JFrame{
	private Whole whole;
	private JButton coach,staff,back,logout;
	private JLabel background;
	
	public Add(Whole w){
		super("Add Page");
		this.whole=w;
		
		coach=new JButton("Coach");
		staff=new JButton("Staff");
		back=new JButton("Back");
		logout=new JButton("Logout");
		background=new JLabel(new ImageIcon("C:\\Users\\astha\\OneDrive\\Pictures\\java-main\\java-main\\add.jpg"));
		
		coach.setBounds(200,100,180,40);
		staff.setBounds(200,200,180,40);
		back.setBounds(10,400,100,40);
		logout.setBounds(460,400,120,40);
		background.setBounds(0,0,600,500);
		
		add(back);
		add(logout);
		add(coach);
		add(staff);
		add(background);
		
		
		
		
		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			
			whole.add.setVisible(false);
			whole.admin.setVisible(true);
		
		    }
		    });
			
		
		logout.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			  JOptionPane.showMessageDialog(null,"Logging out from Admin.If you have changed/add/delete any data it would be wise to restart the software");
			  whole.first.setVisible(true);
			  whole.add.setVisible(false);
		
		    }
		    });	
			
		coach.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			  whole.acoach.setVisible(true);
			  whole.add.setVisible(false);
		
		    }
		    });	
			
			
		staff.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			 whole.astaff.setVisible(true);
			 whole.add.setVisible(false);
		
		    }
		    });	
		
		
		
		setSize(600,500);
		setLocation(100,100);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
		
	
	
	