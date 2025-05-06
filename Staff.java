public class Staff{
    private int id;
	private String name;
    private String nationality;
	private String time;
	private String experience;
	private String speciality;
	private String DOB;
	private String salary;
	private String password;
	
	
	 public Staff()
	 {}
	 public Staff(int i, String n, String na, String e,String t, String sp, String D, String s, String p){
		 setId(i);
		 setName(n); 
		 setNationality(na);
		 setExperience(e);
		 setTime(t); 
		 setSpeciality(sp);
		 setDOB(D);
		 setSalary(s); 
		 setPassword(p);
	 }
	
	
	public void setId(int id){
		 this.id=id;
	}
	public void setName(String name){
		 this.name=name;
	 }
	  public void setNationality(String nationality){
		 this.nationality=nationality;
    }
	public void setTime(String time){
		 this.time=time;
		 }
	 public void setExperience(String experience){
		 this.experience=experience;
	}
	 public void setSpeciality(String speciality){
		this.speciality=speciality;
    }
	public void setDOB(String DOB){
		 this.DOB=DOB;
    }
	public void setSalary(String salary){
		this.salary=salary;
    }
	public void setPassword(String password){
		 this.password=password;
    }
	
	public int getId(){
		 return id;
	 }
	 public String getName(){
		 return name;
	 }
		
	 	 public String getNationality(){
		 return nationality;
	 }
	 	 
	 public String getExperience(){
		 return experience;
	 }
	 public String getTime(){
		 return time;
	 }
	 public String getSpeciality(){
		 return speciality;
	 }
	 public String getDOB(){
		 return DOB;
	 }
	 public String getSalary(){
		 return salary;
	 }
	 public String getPass(){
		 return password;
	 }	 
	 
	 
	
	 
}
