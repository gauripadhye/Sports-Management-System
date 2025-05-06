import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Notice extends JFrame{
	private Whole whole;
	private JButton back;
	private JButton blogout;
	private JTable jnotice;
	private JScrollPane snotice;
	private String value[][];
	
	
	
	
	
	
		 
	public Notice (Whole w) {
		super("Notice");
		this.whole=w;
		
		try{loadnotice();}
		catch(Exception ex){ex.printStackTrace();}
		String column[]={"SERIAL","MESSAGE","TIME"};
		
		jnotice=new JTable(value,column);
		back=new JButton("Back");
		blogout=new JButton("Logout");
		
		jnotice.setRowHeight(140);
		
		snotice=new JScrollPane(jnotice);
		
		snotice.setBounds(0,0,900,300);
		back.setBounds(10,320,100,40);
		blogout.setBounds(760,320,150,40);
		
		snotice.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		snotice.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		
		add(snotice);
		add(back);
		add(blogout);
		
		
		
		blogout.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			whole.login.logid = null;	
			whole.first.setVisible(true);
			whole.notice.setVisible(false);
		
		}
		});
		
		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			whole.home.setVisible(true);
			whole.notice.setVisible(false);
		
		}
		});
		
		setSize(940,440);
		setLocation(100,100);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
		
	}
	
	
	
	public void loadnotice()throws SQLException{
		
        DataAccess da=new DataAccess();
		ResultSet rs=da.getData("SELECT * FROM `notice`");
		ResultSet R=da.getData("SELECT * FROM `notice`");
		int total=0;
		while(rs.next())
		{
			total++;
		}
		
		 
		 value=new String[total][3]; 
		 int i=0;
		 while (R.next())
		   {int j=0;
	         value[i][j++]=String.valueOf(R.getInt("N_Id"));
			 value[i][j++]=R.getString("N_Message");
			 value[i++][j++]=R.getString("N_Time");

		   }
		   
	}		   
}