//import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gallery extends JFrame implements  ActionListener
{
	private JLabel one;
	private JLabel two;
	private JButton back;
	private JLabel three;
	private JLabel four;
	private JLabel five;
	private JLabel six;
	//private JLabel background;
	private Whole whole;
	public Gallery(Whole w)
	{
		super("About Us > Gallery");
		this.whole=w;

		one=new JLabel(new ImageIcon("C:\\Users\\Kaushal\\Downloads\\java-main\\java-main\\1.jpg"));
		two=new JLabel(new ImageIcon("C:\\Users\\Kaushal\\Downloads\\java-main\\java-main\\2.jpg"));
		three=new JLabel(new ImageIcon("C:\\Users\\Kaushal\\Downloads\\java-main\\java-main\\3.jpg"));
		four=new JLabel(new ImageIcon("C:\\Users\\Kaushal\\Downloads\\java-main\\java-main\\4.jpg"));
		five=new JLabel(new ImageIcon("C:\\Users\\Kaushal\\Downloads\\java-main\\java-main\\5.jpg"));
		six=new JLabel(new ImageIcon("C:\\Users\\Kaushal\\Downloads\\java-main\\java-main\\6.jpg"));
		//background=new JLabel(new ImageIcon("C:\\Users\\Kaushal\\Downloads\\java-main\\java-main\\images (1).jpeg"));
		back =new JButton ("Back");

		one.setText("Certification trophy");
		one.setHorizontalTextPosition(JLabel.CENTER);
		one.setVerticalTextPosition(JLabel.BOTTOM);

		two.setText("Inter Dhaka Championship");
		two.setHorizontalTextPosition(JLabel.CENTER);
	    two.setVerticalTextPosition(JLabel.BOTTOM);

		three.setText("Bd U-19 Champion");
		three.setHorizontalTextPosition(JLabel.CENTER);
	    three.setVerticalTextPosition(JLabel.BOTTOM);

		four.setText("West Bengal Champion");
		four.setHorizontalTextPosition(JLabel.CENTER);
	    four.setVerticalTextPosition(JLabel.BOTTOM);

		five.setText("Clemon Dhaka Hunt Champion");
		five.setHorizontalTextPosition(JLabel.CENTER);
	    five.setVerticalTextPosition(JLabel.BOTTOM);

		six.setText("Frooto Runner Up");
		six.setHorizontalTextPosition(JLabel.CENTER);
	    six.setVerticalTextPosition(JLabel.BOTTOM);

		add(one);
		add(two);
		add(three);
		add(four);
		add(five);
		add(six);
		add(back);
		//add(background);

		back.setBounds(10,600,70,30);
		one.setBounds(20,20,200,240);
		two.setBounds(320,20,200,240);
		three.setBounds(620,20,200,240);
		four.setBounds(20,320,200,240);
		five.setBounds(320,320,200,240);
		six.setBounds(620,320,200,240);
		//background.setBounds(0, 0, 530, 640);

		back.addActionListener(this);

		setSize(850,680);
		setLocation(100,100);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		whole.about.setVisible(true);
		whole.gallery.setVisible(false);
	}
}


