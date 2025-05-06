import java.sql.ResultSet;
import java.sql.SQLException;
public class BufferStaff{
	public Staff staff[];
	public int totalstaff;
	public int index,idx;
	public void loadstaff()throws SQLException{
		DataAccess da=new DataAccess();
		ResultSet rs=da.getData("select * from staff");
		ResultSet R=da.getData("select * from staff");
		Staff s=null;
		totalstaff=0;
		staff=null;
		
		 int id;
		String name;
		String nationality;
		String time;
		String experience;
		String speciality;
		String DOB;
		String salary;
		String password;
		
		
		while(rs.next()){
			totalstaff++;
		}
		
		staff=new Staff[totalstaff];
		
		while (R.next()){
						id=R.getInt("S_id");
						name=R.getString("S_Name");
						nationality=R.getString("S_Nationality");
						experience =R.getString("S_Experience");
						time=R.getString("S_Time");
						speciality=R.getString("S_Speciality");
						DOB=R.getString("S_DOB");
						salary=R.getString("S_Salary");
						password=R.getString("S_Password");

					s=new Staff(id,name,nationality,experience,time,speciality,DOB,salary,password);
					addStaff(s);
}
		
	}
	
	private void addStaff(Staff s){
		for(int i=0;i<staff.length;i++){
			if(staff[i]==null){
				staff[i]=s;break;
			}
		}
	}
	
	
	public boolean sauth(String id,String pass)
	{String a;
		for(int i=0;i<staff.length;i++){
			
			a=String.valueOf(staff[i].getId());
			
			if(a.equals(id) && (staff[i].getPass()).equals(pass))
			{index=i;
				return true;
			}
		}
		return false;
		
		
	}
	
	public int getsid(String id){
		boolean flag=false;
		for(int i=0;i<staff.length;i++){
			if (id.equals(String.valueOf(staff[i].getId())))
			{idx= i;
			flag=true;
			}
				
		}
		if(flag==false)
			idx=999;
		return idx;
		
	}
}