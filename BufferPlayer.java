import java.sql.ResultSet;
import java.sql.SQLException;
public class BufferPlayer{
	public Player player[];
	public int totalplayer;
	public int index,idx;
	public void loadplayer()throws SQLException{
		DataAccess da=new DataAccess();
		ResultSet rs=da.getData("select * from player");
		ResultSet R=da.getData("select * from player");
		player=null;
		Player p=null;
		totalplayer=0;
		
	 int id;
	 String name;
     String nationality;
	 String height;
	 int weight;
	 String time;
	 String batstyle;
	 String bowlstyle;
	 String speciality;
	 String DOB;
	 String type;
	 String salary;
	 String password;
	
		
		while(rs.next()){
			totalplayer++;
		}
		
		player=new Player[totalplayer];
		
		while(R.next()){
			id=R.getInt("P_id");
			name=R.getString("P_Name");
			nationality=R.getString("P_Nationality");
			height=R.getString("P_Height");
			weight=R.getInt("P_Weight");
			time=R.getString("P_Time");
			batstyle=R.getString("P_Batstyle");
			bowlstyle=R.getString("P_Bowlstyle");
			speciality=R.getString("P_speciality");
			DOB=R.getString("P_DOB");
			type=R.getString("P_type");
			salary=R.getString("P_Salary");
			password=R.getString("P_Password");
			
			p=new Player(id,name,nationality,height,weight,time,batstyle,bowlstyle,speciality,DOB,type,salary,password);
			addPlayer(p);
		}
	}
	
	private void addPlayer(Player p){
		for(int i=0;i<player.length;i++){
			if(player[i]==null){
				player[i]=p;break;
			}
		}
	}
	
	
	public boolean pauth(String id,String pass)
	{String a;
		for(int i=0;i<player.length;i++){
			
			a=String.valueOf(player[i].getId());
			
			if(a.equals(id) && (player[i].getPass()).equals(pass))
			{index=i;
				return true;
			}
		}
		return false;
		
		
	}
	
	
	public int getpid(String id){
		boolean flag=false;
		for(int i=0;i<player.length;i++){
			if (id.equals(String.valueOf(player[i].getId())))
			  {idx= i;
			flag=true;
			}
				
		}
		if(flag==false)
			idx=999;
		return idx;
	}
	
	
}