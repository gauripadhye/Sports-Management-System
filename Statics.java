import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Statics extends JFrame{
	private Whole whole;
	private JButton back;
	private JButton blogout;
	private JLabel odi;
	private JLabel t20;
	private JLabel test;
	private String value[][]=new String[3][11];
	private String modi,mt20,mtest;
	
	public Statics(Whole w){
	
	super("Statics");
	this.whole=w;
	
	
	odi=new JLabel(" ");
	t20=new JLabel(" ");
	test=new JLabel(" ");
	back= new JButton("Back");
	blogout=new JButton("Log Out");
	
	
	
	
	odi.setBounds(50,50,200,200);
	t20.setBounds(300,50,200,200);
	test.setBounds(550,50,200,200);
	back.setBounds(20,350,100,40);
	blogout.setBounds(750,350,120,40);
	
	
	add(odi);
	add(t20);
	add(test);
	add(back);
	add(blogout);
	
		
		
		blogout.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			whole.login.logid = null;
			
			whole.first.setVisible(true);
			whole.statics.setVisible(false);
		
		}
		});
		
		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			whole.home.setVisible(true);
			whole.statics.setVisible(false);
		
		}
		});
	
	
	
	
	
	
	setSize(900,440);
	setLocation(100,100);
	setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	
	}
	
	public void set(String id) throws SQLException{
		DataAccess da=new DataAccess();
		ResultSet rs=da.getData("SELECT * FROM `odi` WHERE `ID` = "+id );
		ResultSet ds=da.getData("SELECT * FROM `t20` WHERE `ID` = "+id );
		ResultSet es=da.getData("SELECT * FROM `test` WHERE `ID` = "+id );
		int i=0;
		while(rs.next()){
			
			value[0][i++]=String.valueOf(rs.getInt("MATCHES"));
			value[0][i++]=String.valueOf(rs.getInt("RUNS"));
			value[0][i++]=String.valueOf(rs.getInt("50s"));
			value[0][i++]=String.valueOf(rs.getInt("100s"));
			value[0][i++]=String.valueOf(rs.getInt("HIGHEST SCORE"));
			value[0][i++]=String.valueOf(rs.getInt("INNINGS"));
			value[0][i++]=String.valueOf(rs.getInt("WICKETS"));
			value[0][i++]=rs.getString("BEST FIGURE");
			value[0][i++]=String.valueOf(rs.getInt("5W"));
			value[0][i++]=String.valueOf(rs.getFloat("ECO RATE"));
			value[0][i++]=String.valueOf(rs.getInt("CATCHES"));
			
			
		}
		i=0;
		while(ds.next()){
			
			value[1][i++]=String.valueOf(ds.getInt("MATCHES"));
			value[1][i++]=String.valueOf(ds.getInt("RUNS"));
			value[1][i++]=String.valueOf(ds.getInt("50s"));
			value[1][i++]=String.valueOf(ds.getInt("100s"));
			value[1][i++]=String.valueOf(ds.getInt("HIGHEST SCORE"));
			value[1][i++]=String.valueOf(ds.getInt("INNINGS"));
			value[1][i++]=String.valueOf(ds.getInt("WICKETS"));
			value[1][i++]=ds.getString("BEST FIGURE");
			value[1][i++]=String.valueOf(ds.getInt("5W"));
			value[1][i++]=String.valueOf(ds.getFloat("ECO RATE"));
			value[1][i++]=String.valueOf(ds.getInt("CATCHES"));
			
			
		}
		i=0;
		while(es.next()){
			
			value[2][i++]=String.valueOf(es.getInt("MATCHES"));
			value[2][i++]=String.valueOf(es.getInt("RUNS"));
			value[2][i++]=String.valueOf(es.getInt("50s"));
			value[2][i++]=String.valueOf(es.getInt("100s"));
			value[2][i++]=String.valueOf(es.getInt("HIGHEST SCORE"));
			value[2][i++]=String.valueOf(es.getInt("INNINGS"));
			value[2][i++]=String.valueOf(es.getInt("WICKETS"));
			value[2][i++]=es.getString("BEST FIGURE");
			value[2][i++]=String.valueOf(es.getInt("5W"));
			value[2][i++]=String.valueOf(es.getFloat("ECO RATE"));
			value[2][i++]=String.valueOf(es.getInt("CATCHES"));
			
			
		}
		
		modi="<html>ODI <br/> MATCHES : "+value [0][0]+"<br/> RUNS : "+value [0][1]+"<br/> 50s : "+value [0][2]+"<br/> 100s : "+value [0][3]+"<br/> HIGHEST SCORE : "+value [0][4]+"<br/> INNINGS : "+value [0][5]+"<br/> WICKETS : "+value [0][6]+"<br/> BEST FIGURE : "+value [0][7]+"<br/> 5W : "+value [0][8]+"<br/> ECO RATE : "+value [0][9]+"<br/> CATCHES : "+value [0][10]+"</html>";
		
		odi.setText(modi);
		
		mt20="<html>T20 <br/> MATCHES : "+value [1][0]+"<br/> RUNS : "+value [1][1]+"<br/> 50s : "+value [1][2]+"<br/> 100s : "+value [1][3]+"<br/> HIGHEST SCORE : "+value [1][4]+"<br/> INNINGS : "+value [1][5]+"<br/> WICKETS : "+value [1][6]+"<br/> BEST FIGURE : "+value [1][7]+"<br/> 5W : "+value [1][8]+"<br/> ECO RATE : "+value [1][9]+"<br/> CATCHES : "+value [1][10]+"</html>";
		
		t20.setText(mt20);
		
		mtest="<html>TEST <br/> MATCHES : "+value [2][0]+"<br/> RUNS : "+value [2][1]+"<br/> 50s : "+value [2][2]+"<br/> 100s : "+value [2][3]+"<br/> HIGHEST SCORE : "+value [2][4]+"<br/> INNINGS : "+value [2][5]+"<br/> WICKETS : "+value [2][6]+"<br/> BEST FIGURE : "+value [2][7]+"<br/> 5W : "+value [2][8]+"<br/> ECO RATE : "+value [2][9]+"<br/> CATCHES : "+value [2][10]+"</html>";
		
		test.setText(mtest);
	}
}
	
	
	
	