import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Playerinfo extends JFrame{
	private Whole whole;
	private JButton back;
	private JButton blogout;
	private JTable jplayer;
	private JScrollPane splayer;
	private JButton bsee;
	private JTextField tsearch;
	private JButton bsugg;
	private JTextField tsugg;

	
	
	
	
	
		 
	public Playerinfo (Whole w){
		super("Player Info");
		this.whole=w;
		/* bsee=new JButton("See");
		 tsearch=new JTextField();
		 bsugg=new JButton("suggestion ");
		 tsugg=new JTextField();
		*/
		try{
			 whole.bufferplayer.loadplayer();
		 }
		
		 catch(Exception ex){ex.printStackTrace();}
		 
		 int total=whole.bufferplayer.totalplayer;
		String value[][]=new String[total][9];
		String column[]={"ID","NAME","NATIONALITY","HEIGHT","WEIGHT","BATSTYLE","BOWLSTYLE","SPECIALITY","DOB"};
	
		
		for(int i=0;i<total;i++){
			value[i][0]=String.valueOf(whole.bufferplayer.player[i].getId());
			value[i][1]=whole.bufferplayer.player[i].getName();	
			value[i][2]=whole.bufferplayer.player[i].getNationality();
			value[i][3]=whole.bufferplayer.player[i].getHeight();
			value[i][4]=String.valueOf(whole.bufferplayer.player[i].getWeight());
			value[i][5]=whole.bufferplayer.player[i].getBatstyle();
			value[i][6]=whole.bufferplayer.player[i].getBowlstyle();
			value[i][7]=whole.bufferplayer.player[i].getSpeciality();
			value[i][8]=whole.bufferplayer.player[i].getDOB();

			
		}
		
		back=new JButton("Back");
		blogout=new JButton("Logout");
		jplayer=new JTable(value,column);
		bsee= new JButton("See");
		tsearch=new JTextField("Type P_ID To See Statistics");
		tsugg=new JTextField("Suggestid For Playing XI");
		bsugg=new  JButton("Suggest");
		
		jplayer.setRowHeight(100);
		
			jplayer.getColumnModel().getColumn(3).setMinWidth(50); 
		 jplayer.getColumnModel().getColumn(3).setMaxWidth(50);
		 jplayer.getColumnModel().getColumn(3).setPreferredWidth(50);
		
		jplayer.getColumnModel().getColumn(4).setMinWidth(50); 
		 jplayer.getColumnModel().getColumn(4).setMaxWidth(50);
		 jplayer.getColumnModel().getColumn(4).setPreferredWidth(50);
		 
		 jplayer.getColumnModel().getColumn(1).setMinWidth(120); 
		 jplayer.getColumnModel().getColumn(1).setMaxWidth(120);
		 jplayer.getColumnModel().getColumn(1).setPreferredWidth(120);
		
		
		splayer=new JScrollPane(jplayer);
		
		
			
		
		
		splayer.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		//splayer.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		splayer.setBounds(0,0,880,340);
		back.setBounds(10,340,80,40);
		blogout.setBounds(765,340,100,40);	 
		/*tsearch.setBounds(60,340,150,40);
		bsee.setBounds(230,340,60,40);*/
		tsugg.setBounds(510,340,150,40);
		bsugg.setBounds(665,340,100,40);
		tsearch.setBounds(100,340,200,40);
		bsee.setBounds(300,340,60,40);
		
		
		
		add(back);
		add(splayer);
		add(blogout);
		add(bsee);
		add(tsearch);
		add(bsugg);
		add(tsugg);
		
		
		blogout.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			whole.login.logid = null;	
			whole.first.setVisible(true);
			whole.playerinfo.setVisible(false);
		
		}
		});
		
		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			whole.home.setVisible(true);
			whole.playerinfo.setVisible(false);
		
		}
		});
		
		
		bsee.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			int id=whole.bufferplayer.getpid(tsearch.getText());
			if(id!=999){
			try{
			whole.statics.set(tsearch.getText());
			}
		 
			catch(Exception ex){ex.printStackTrace();}
				
			whole.playerinfo.setVisible(false);
			whole.statics.setVisible(true);
			tsearch.setText("Type P_ID To See Statistics");
		
			}
			
			
			else
				 JOptionPane.showMessageDialog(null,"Sorry, Id not found or doesnt exist");
				
			
			
		
		}
		});
		
		bsugg.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			String id=whole.login.logid;
			   if((id.substring(0,1)).equals("1")){
					DataAccess da=new DataAccess();
					try{
					da.updateDB("INSERT INTO `suggest` (`Sugg_p`, `Sugg_by`, `Serial`) VALUES ('"+tsugg.getText()+"', '"+id+"', NULL);");
					}
					catch(Exception ex){ ex.printStackTrace(); }
					JOptionPane.showMessageDialog(null,"Suggestion done");
					tsugg.setText(" ");
					
			   }
			   else{
				   JOptionPane.showMessageDialog(null,"Sorry, Only a coach can suggest player");
				   tsugg.setText(" ");
			   }
				
			
			
		
		}
		});
		
		
	
		setSize(900,440);
		setLocation(100,100);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
}