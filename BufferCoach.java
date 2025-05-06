import java.sql.ResultSet;
import java.sql.SQLException;
public class BufferCoach
{
	public Coach coach[];
	public int totalcoach;
	public int index,idx;
	
	public void loadcoach()throws SQLException{
		DataAccess da=new DataAccess();
		ResultSet rs=da.getData("select * from coach");
		ResultSet R=da.getData("select * from coach");
		Coach c=null;
		coach=null;
		totalcoach=0;
		
		
		 int id;
	 String name;
     String nationality;
	 int experience;
	 String time;
	 String careerinfo;
	 String speciality;
	 String DOB;
	 String salary;
	 String password;
	 
		
		
		
		
		while(rs.next()){
			totalcoach++;
		}
		coach=new Coach[totalcoach];
		
		while (R.next()){
					id=R.getInt("C_id");
					name=R.getString("C_Name");
					nationality=R.getString("C_Nationality");
					experience =R.getInt("C_Experience");
					time=R.getString("C_Time");
					careerinfo=R.getString("C_Careerinfo");
					speciality=R.getString("C_Speciality");
					DOB=R.getString("C_DOB");
                    salary=R.getString("C_Salary");
                    password=R.getString("C_Password");

                    c=new Coach(id,name,nationality,experience,time,careerinfo,speciality,DOB,salary,password);
                   addCoach(c);
         }
	}
	
	private void addCoach(Coach c){
		for(int i=0;i<coach.length;i++){
			if(coach[i]==null){
				coach[i]=c;break;
			}
		}
	}
	
	
	
	public boolean cauth(String id,String pass)
	{	String a;
		for(int i=0;i<coach.length;i++)
		{
			a=String.valueOf(coach[i].getId());
			if(a.equals(id) && (coach[i].getPass()).equals(pass))
			{
				index=i;
				return true;
			}
		}
		return false;
	}
	
	
	public int getcid(String id){
		boolean flag=false;
		for(int i=0;i<coach.length;i++){
			if (id.equals(String.valueOf(coach[i].getId())))
               {idx= i;
			flag=true;
			}
				
		}
		if(flag==false)
			idx=999;
		return idx;
	}
	
	
	
}