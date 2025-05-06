import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Coachinfo extends JFrame implements  ActionListener{
	private Whole whole;
	private JButton back;
	private JButton blogout;
	private JTable jcoach;
	private JScrollPane scoach;
	private JButton bsee;
	private JTextField tsearch;

	
	
	
	
	
		 
	public Coachinfo (Whole w){
		super("Coach Info");
		this.whole=w;
		try{
			 whole.buffercoach.loadcoach();
		 }
		 
		 catch(Exception ex){ex.printStackTrace();}
		int total=whole.buffercoach.totalcoach;
		String value[][]=new String[total][8];
		String column[]={"ID","NAME","EXPERIENCE","NATIONALITY","CAREERINFO","AGE","TIME","SPECIALITY"};
	
		
		for(int i=0;i<total;i++){
			value[i][0]=String.valueOf(whole.buffercoach.coach[i].getId());
			value[i][1]=whole.buffercoach.coach[i].getName();
			value[i][2]=String.valueOf(whole.buffercoach.coach[i].getExperience());
			value[i][3]=whole.buffercoach.coach[i].getNationality();
			value[i][4]=new String ("<html>"+whole.buffercoach.coach[i].getCareerinfo()+"<html>");
			value[i][5]=whole.buffercoach.coach[i].getDOB();
			value[i][6]=whole.buffercoach.coach[i].getTime();
			value[i][7]=whole.buffercoach.coach[i].getSpeciality();

		}
		
		
		back=new JButton("Back");
		blogout=new JButton("Logout");
		jcoach=new JTable(value,column);
		bsee= new JButton("See");
		tsearch=new JTextField("Type C_ID To See Statistics");
		
		jcoach.setRowHeight(100);
		
	     jcoach.getColumnModel().getColumn(4).setMinWidth(220); 
		 jcoach.getColumnModel().getColumn(4).setMaxWidth(220);
		 jcoach.getColumnModel().getColumn(4).setPreferredWidth(220);
		 
		
		
		
		scoach=new JScrollPane(jcoach);
		
		
			
		
		
		scoach.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		//scoach.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		
		
		
		scoach.setBounds(0,0,880,340);
		back.setBounds(10,340,80,40);
		blogout.setBounds(760,340,100,40);
		tsearch.setBounds(100,340,200,40);
		bsee.setBounds(300,340,60,40);
		
		
		
		
		add(back);
		add(scoach);
		add(blogout);
		add(bsee);
		add(tsearch);
		
		
		blogout.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			whole.login.logid = null;	
			whole.first.setVisible(true);
			whole.coachinfo.setVisible(false);
		
		}
		});
		
		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			whole.home.setVisible(true);
			whole.coachinfo.setVisible(false);
		
		}
		});
		
		bsee.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int id=whole.buffercoach.getcid(tsearch.getText());
			if(id!=999){
			try{
			whole.statics.set(tsearch.getText());
			}
		 
			catch(Exception ex){ex.printStackTrace();}
				
			whole.coachinfo.setVisible(false);
			whole.statics.setVisible(true);
			tsearch.setText("Type C_ID To See Statistics");
		
			}
			
			
			else
				 JOptionPane.showMessageDialog(null,"Sorry, Id not found or doesnt exist");
				
			
			}
		});
		
		
		
	
		setSize(900,440);
		setLocation(100,100);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
	}
	
	public void actionPerformed(ActionEvent e){}
}

			
		 
		 
		 
		 