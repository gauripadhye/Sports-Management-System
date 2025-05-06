import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Staffinfo extends JFrame{
	private Whole whole;
	private JButton back;
	private JButton blogout;
	private JTable jstaff;
	private JScrollPane sstaff;

	
	
	
	
	
		 
	public Staffinfo (Whole w){
		super("Staff Info");
		this.whole=w;
		try{
			 whole.bufferstaff.loadstaff();
		 }
		 
		 catch(Exception ex){ex.printStackTrace();}
		 
		 int total=whole.bufferstaff.totalstaff;
		String value[][]=new String[total][7];
		String column[]={"ID","NAME","NATIONALITY","DOB","EXPERIENCE","TIME","SPECIALITY"};
	
		
		for(int i=0;i<total;i++){
			value[i][0]=String.valueOf(whole.bufferstaff.staff[i].getId());
			value[i][1]=whole.bufferstaff.staff[i].getName();	
			value[i][2]=whole.bufferstaff.staff[i].getNationality();
			value[i][3]=whole.bufferstaff.staff[i].getDOB();
			value[i][4]=String.valueOf(whole.bufferstaff.staff[i].getExperience());
			value[i][5]=whole.bufferstaff.staff[i].getTime();
			value[i][6]=whole.bufferstaff.staff[i].getSpeciality();

			
		}
		
		back=new JButton("Back");
		blogout=new JButton("Logout");
		jstaff=new JTable(value,column);
		
		jstaff.setRowHeight(100);
		
		jstaff.getColumnModel().getColumn(0).setMinWidth(50); 
		 jstaff.getColumnModel().getColumn(0).setMaxWidth(50);
		 jstaff.getColumnModel().getColumn(0).setPreferredWidth(50);
		
		jstaff.getColumnModel().getColumn(4).setMinWidth(200); 
		 jstaff.getColumnModel().getColumn(4).setMaxWidth(200);
		 jstaff.getColumnModel().getColumn(4).setPreferredWidth(200);
		
		sstaff=new JScrollPane(jstaff);
		
		
			
		
		
		sstaff.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		//sstaff.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		sstaff.setBounds(0,0,880,340);
		back.setBounds(10,340,80,40);
		blogout.setBounds(760,340,100,40);
		
		
		
		
		add(back);
		add(sstaff);
		add(blogout);
		
		
		blogout.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			whole.login.logid = null;	
			whole.first.setVisible(true);
			whole.staffinfo.setVisible(false);
		
		}
		});
		
		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			whole.home.setVisible(true);
			whole.staffinfo.setVisible(false);
		
		}
		});
		
		
	
		setSize(900,440);
		setLocation(100,100);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
}