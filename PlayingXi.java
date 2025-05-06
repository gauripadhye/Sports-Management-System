import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PlayingXi extends JFrame{
	private JLabel xi;
	private String msg;
	private Whole whole;
	private int xid[]=new int[11];
	private int xdata[]=new int[11];
	private JButton bback;
	private JButton blogout;
	
	
	public PlayingXi(Whole w){
		super("PlayingXi");
		this.whole=w;
		
		xi=new JLabel(" ");
		bback=new JButton("Back");
		blogout=new JButton("Log Out");

		
		xi.setBounds(0,0,300,400);
		bback.setBounds(10,400,80,30);
		blogout.setBounds(560,400,80,30);
		xi.setBounds(250,50,400,300);
		xi.setFont(new Font("ARIAL",Font.ITALIC,20));
		
		add(xi);
		add(bback);
		add(blogout);
		
			
		 blogout.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			whole.login.logid = null;	
			whole.first.setVisible(true);
			whole.playingxi.setVisible(false);
		
		}

	});
	
	bback.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){	
			whole.home.setVisible(true);
			whole.playingxi.setVisible(false);
		
		}
	});
		
	
	
		setSize(700,500);
		setLocation(100,100);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}
	
	public void set() throws SQLException{
		DataAccess da=new DataAccess();
		ResultSet rs=da.getData("select * from playingxi");
		int i=0;
		while(rs.next()){
			xid[i]=rs.getInt("X_id");
			xdata[i++]=rs.getInt("X_Data");
		}
		
		msg="<html> Serial : Player Id <br/>"+xid[0]+"---------"+xdata[0]+"<br/>"+xid[1]+"---------"+xdata[1]+"<br/>"+xid[2]+"---------"+xdata[2]+"<br/>"+xid[3]+"---------"+xdata[3]+"<br/>"+xid[4]+"---------"+xdata[4]+"<br/>"+xid[5]+"---------"+xdata[5]+"<br/>"+xid[6]+"---------"+xdata[6]+"<br/>"+xid[7]+"---------"+xdata[7]+"<br/>"+xid[8]+"---------"+xdata[8]+"<br/>"+xid[9]+"---------"+xdata[9]+"<br/>"+xid[10]+"---------"+xdata[10]+"</html>";
		xi.setText(msg);
		
		
		
	
	
	
	}
	



}	
		
		