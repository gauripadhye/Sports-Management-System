public class Coach{
    private int id;
	private String name;
    private String nationality;
	private int experience;
	private String time;
	private String careerinfo;
	private String speciality;
	private String DOB;
	private String salary;
	private String password;
	
	 public Coach()
	 {
	 }
	public Coach(int i, String n, String na, int e,String t, String c, String sp, String D, String s, String p){
		 setId(i);
		 setName(n); 
		 setNationality(na);
		 setExperience(e);
		 setTime(t); 
		 setCareerinfo(c);
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
	 public void setExperience(int experience){
		 this.experience=experience;
	}
	public void setTime(String time){
		 this.time=time;
		 }
		 public void setCareerinfo(String careerinfo){
		 this.careerinfo=careerinfo;
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
	 	 
	 public int getExperience(){
		 return experience;
	 }
	 public String getTime(){
		 return time;
	 }
	 public String getCareerinfo(){
		 return careerinfo;
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