import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Home extends JFrame{
	private Whole whole;
	private JLabel background;
	private JButton bcoachinfo;
	private JButton bplayerinfo;
	private JButton bstaffinfo;
	private JButton bback;
	private JButton blogout;
	private JButton bsearch;
	private JTextField tsearch;
	private JButton bsettings;
	private JButton bnotice;
	public String ssearch;
	
	private JButton bplayingxi;
	
	public Home (Whole w){
		super("Home");
		this.whole=w;
		bcoachinfo=new JButton("Coach Info");
		bplayerinfo= new JButton("player Info");
		bstaffinfo= new JButton("Staff Info");
		bback=new JButton("Back");
		blogout=new JButton("Log Out");
		bnotice=new JButton();
		tsearch=new JTextField();
		bsearch=new JButton(new ImageIcon("C:\\Users\\astha\\OneDrive\\Pictures\\java-main\\java-main\\image.png"));
		bnotice= new JButton(new ImageIcon("C:\\Users\\astha\\OneDrive\\Pictures\\java-main\\java-main\\download.png"));
		bsettings=new JButton(new ImageIcon("C:\\Users\\astha\\OneDrive\\Pictures\\java-main\\java-main\\settings.png"));
		bplayingxi=new JButton("Playing XI");
		background=new JLabel(new ImageIcon("C:\\Users\\astha\\OneDrive\\Pictures\\java-main\\java-main\\scorpion.jpg"));
		bback=new JButton("Back");
		
		
		bcoachinfo.setBounds(300,100,200,50);
		bplayerinfo.setBounds(300,170,200,50);
		bstaffinfo.setBounds(300,240,200,50);
		bplayingxi.setBounds(300,310,200,50);
		bback.setBounds(20,400,70,30);
		blogout.setBounds(680,400,80,30);
		tsearch.setBounds(280,50,200,30);
		bsearch.setBounds(480,50,50,30);
		bnotice.setBounds(700,0,30,20);
		bsettings.setBounds(740,0,30,20);
		background.setBounds(0,0,800,500);
		
		
		
		
		

		
		
		add(background);
		add(bcoachinfo);
		add(bplayerinfo);
		add(bstaffinfo);
		add(bsearch);
		add(tsearch);
		add(bback);
		add(blogout);
		add(bnotice);
		add(bplayingxi);
	    add(bsettings);
		add(background);
		
		
		blogout.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			whole.login.logid = null;	
			whole.first.setVisible(true);
			whole.home.setVisible(false);
		
		}
		});
		
		bsearch.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			if(tsearch.getText().isEmpty())
				JOptionPane.showMessageDialog(null,"search Field is empty");
			else{
			whole.search.setsid(tsearch.getText());
			tsearch.setText("");
			whole.home.setVisible(false);
			whole.search.setVisible(true);
			}
		
		}
		});
		
		bnotice.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			whole.home.setVisible(false);
			whole.notice.setVisible(true);
		
		}
		});
		
		bsettings.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println(whole.login.logid);
			if((whole.login.logid).equals("Admin"))
				JOptionPane.showMessageDialog(null,"Sorry settings is not for Admin");
			else{
			whole.settings.setinfo();
			whole.home.setVisible(false);
			whole.settings.setVisible(true);
			}
		}
		});
		
		bstaffinfo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			whole.home.setVisible(false);
			whole.staffinfo.setVisible(true);
		
		}
		});
		
		
		bplayerinfo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				whole.home.setVisible(false);
			    whole.playerinfo.setVisible(true);
			
		
		}
		});
		
		bcoachinfo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			whole.coachinfo.setVisible(true);
			whole.home.setVisible(false);
		
		}
		});
		
		bplayingxi.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			try{
			whole.playingxi.set();
			}
			catch(Exception ex){ex.printStackTrace();}
			whole.playingxi.setVisible(true);
			whole.home.setVisible(false);
		
		}
		});
		
		bback.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
			if((whole.login.logid).equals("Admin")){	
			whole.home.setVisible(false);
			whole.admin.setVisible(true);
			}
			else{
			JOptionPane.showMessageDialog(null,"This is the 1st page.Do you want to Logout?");
			}
		}
		});
		
		
		
		
		setSize(800,500);
		setLocation(100,100);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}
	
}