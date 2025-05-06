import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Search extends JFrame{
      private Whole whole;
	  private String id,msg;
	  private JLabel notice;
	  private JButton bback;
	  private JButton blogout;
	  //private JTable jnotice;
	  //private JScrollPane pane;
	  private int idx;
	  private String value[][];
	  private String column[];
	  
	  public Search (Whole w){
		  super("Search");
		    this.whole=w;
			  
			   
			  
			
			notice=new JLabel(" *");
			bback=new JButton("Back");
			blogout=new JButton("Log Out");
			//bsearch=new JButton("search");
			//jnotice=new JTable(value,column);
				
			
			//pane=new JScrollPane(jnotice);
			
			//pane.setBounds(0,0,800,300);
			notice.setBounds(40,0,600,200);
			bback.setBounds(10,400,80,30);
		    blogout.setBounds(560,400,80,30);
		
		notice.setFont(new Font("ARIAL",Font.ITALIC,15));
		
			//add(pane);
			add(notice);
			add(bback);
		    add(blogout);
			
			
		 blogout.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			whole.login.logid = null;	
			whole.first.setVisible(true);
			whole.search.setVisible(false);
		
		}
	});
	
	bback.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){	
			whole.home.setVisible(true);
			whole.search.setVisible(false);
		
		}
	});
			
			
			setSize(700,500);
		setLocation(100,100);
		
		
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
			
	  }
	  
	  
	  
	  
	  
	  
	 public void setsid (String idl)
	 {
		 id=idl;
		
		if(id!=null){	  
			  
		if((id.substring(0,1)).equals("1")){
			idx=whole.buffercoach.getcid(id);
			System.out.println(idx);
			  if(idx==999)
				  msg="Search Result wasnt found";
			  else{
				      column=new String[8];
					  value=new String[1][8];
				       
					   column[0]="ID";
					   column[1]="NAME";
					   column[2]="EXPERIENCE";
					   column[3]="NATIONALITY";
					   column[4]="CAREERINFO";
					   column[5]="AGE";
					   column[6]="TIME";
					   column[7]="SPECIALITY";
					   
					  
					  
					  
					  value[0][0]=String.valueOf(whole.buffercoach.coach[idx].getId());
					  value[0][1]=whole.buffercoach.coach[idx].getName();
					  value[0][2]=String.valueOf(whole.buffercoach.coach[idx].getExperience());
					  value[0][3]=whole.buffercoach.coach[idx].getNationality();
					  value[0][4]=new String ("<html>"+whole.buffercoach.coach[idx].getCareerinfo()+"<html>");
			          value[0][5]=whole.buffercoach.coach[idx].getDOB();
			          value[0][6]=whole.buffercoach.coach[idx].getTime();
			          value[0][7]=whole.buffercoach.coach[idx].getSpeciality();
					  
					  msg="<html>ID : "+value[0][0]+"<br/> NAME : "+value[0][1]+"<br/> EXPERIENCE : "+value[0][2]+"<br/> NATIONALITY : "+value[0][3]+"<br/> CAREERINFO : "+value[0][4]+"<br/> AGE : "+value[0][5]+"<br/> TIME : "+value[0][6]+"<br/> SPECIALITY : "+value[0][7]+"</html>";
					  
					 // jnotice=new JTable(value,column);
					 // jnotice.setRowHeight(100);
					  //pane=new JScrollPane(jnotice);
						
			      }
			
			
		}
		else {if((id.substring(0,1)).equals("2")){
			idx=whole.bufferplayer.getpid(id);
			System.out.println("p"+idx);
			       if(idx==999)
				       msg="Search Result wasnt found";
			       else{
				        column=new String[9];
					    value=new String[1][9];
				        
						
						
						column[0]="ID";
						column[1]="NAME";
						column[2]="NATIONALITY";
						column[3]="HEIGHT";
						column[4]="WEIGHT";
						column[5]="BATSTYLE";
						column[6]="BOWLSTYLE";
						column[7]="SPECIALITY";
						column[8]="DOB";
						
						
						
						value[0][0]=String.valueOf(whole.bufferplayer.player[idx].getId());
						value[0][1]=whole.bufferplayer.player[idx].getName();	
						value[0][2]=whole.bufferplayer.player[idx].getNationality();
						value[0][3]=whole.bufferplayer.player[idx].getHeight();
						value[0][4]=String.valueOf(whole.bufferplayer.player[idx].getWeight());
						value[0][5]=whole.bufferplayer.player[idx].getBatstyle();
						value[0][6]=whole.bufferplayer.player[idx].getBowlstyle();
						value[0][7]=whole.bufferplayer.player[idx].getSpeciality();
						value[0][8]=whole.bufferplayer.player[idx].getDOB();
						
						//jnotice=new JTable(value,column);
						//jnotice.setRowHeight(100);
						//pane=new JScrollPane(jnotice);
						
						
						msg="<html>ID : "+value[0][0]+"<br/> NAME : "+value[0][1]+"<br/> NATIONALITY : "+value[0][2]+"<br/> HEIGHT : "+value[0][3]+"<br/> WEIGHT : "+value[0][4]+"<br/> BATSTYLE : "+value[0][5]+"<br/> BOWLSTYLE : "+value[0][6]+"<br/> SPECIALITY : "+value[0][7]+"<br/> DOB : "+value[0][8]+"</html>";
						
						
			       }
		}
		     else{if((id.substring(0,1)).equals("3")){
		        idx=whole.bufferstaff.getsid(id);
				System.out.println(idx);
			      if(idx==999)
				  msg="Search Result wasnt found";
			      else{
				        column=new String[7];
					     value=new String[1][7];
						 
						 
							column[0]="ID";
							column[1]="NAME";
							column[2]="NATINALITY";
							column[3]="DOB";
							column[4]="EXPERIENCE";
							column[5]="TIME";
							column[6]="SPECIALITY";
						  
						    value[0][0]=String.valueOf(whole.bufferstaff.staff[idx].getId());
							value[0][1]=whole.bufferstaff.staff[idx].getName();	
							value[0][2]=whole.bufferstaff.staff[idx].getNationality();
							value[0][3]=whole.bufferstaff.staff[idx].getDOB();
							value[0][4]=String.valueOf(whole.bufferstaff.staff[idx].getExperience());
							value[0][5]=whole.bufferstaff.staff[idx].getTime();
							value[0][6]=whole.bufferstaff.staff[idx].getSpeciality();

							//jnotice=new JTable(value,column);
							//jnotice.setRowHeight(100);
							//pane=new JScrollPane(jnotice);
							
							
							
							msg="<html>ID : "+value[0][0]+"<br/> NAME : "+value[0][1]+"<br/> NATIONALITY : "+value[0][2]+"<br/> DOB : "+value[0][3]+"<br/> EXPERIENCE : "+value[0][4]+"<br/> TIME : "+value[0][5]+"<br/> SPECIALITY : "+value[0][6]+"</html>";
							
						 
			         }
			
		      }
			  else
				  msg="No such Value Found";
			  
					 
				
		  }
		}
	 
	 
	 
	 }
      else{
				     msg="No INPUT";
					 
	  }
	 
	 
	 notice.setText(msg);
	 }
	  
}

