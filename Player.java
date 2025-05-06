
public class Player{
    private int id;
	private String name;
    private String nationality;
	private String height;
	private int weight;
	private String time;
	private String batstyle;
	private String bowlstyle;
	private String speciality;
	private String DOB;
	private String type;
	private String salary;
	private String password;
	
	public Player()
	 {
	 
	 }
	 public Player(int i, String n, String na, String h, int w,String t, String b, String bo,String sp,String D, String ty, String s, String p){
		 setId(i);
		 setName(n); 
		 setNationality(na);
		 setHeight(h);
		 setWeight(w);
		 setTime(t); 
		 setBatsyle(b);
		 setBowlstyle(bo);
		 setSpeciality(sp);
		 setDOB(D);
	     setType(ty);
	     setSalary(s); 
	     setPassword(p);
	 }
	
	 
	 public void setName(String name){
		 this.name=name;
	 }
	  public void setId(int id){
		 this.id=id;
	}
	public void setNationality(String nationality){
		 this.nationality=nationality;
}
	public void setHeight(String height){
		 this.height=height;
}	
	public void setWeight(int weight){
		 this.weight=weight;
}
	public void setTime(String time){
		 this.time=time;
		 }
	public void setBatsyle(String batstyle){
		 this.batstyle=batstyle;
}
	public void setBowlstyle(String bowlstyle){
		 this.bowlstyle=bowlstyle;
}
	public void setSpeciality(String speciality){
		this.speciality=speciality;
}
	public void setDOB(String DOB){
		 this.DOB=DOB;
}
	public void setType(String type){
		 this.type=type;
}
	public void setSalary(String salary){
		this.salary=salary;
}
	public void setPassword(String password){
		 this.password=password;
}		 
	 public String getName(){
		 return name;
	 }
			 
	 public int getId(){
		 return id;
	 }
	 	 
	 public String getNationality(){
		 return nationality;
	 }
	 	 
	 public String getHeight(){
		 return height;
	 }
	 	 
	 public int getWeight(){
		 return weight;
	 }
	 	 
	 public String getTime(){
		 return time;
	 }
	 	 
	 public String getBatstyle(){
		 return batstyle;
	 }
	 	 
	 public String getBowlstyle(){
		 return bowlstyle;
	 }
	 	 
	 public String getSpeciality(){
		 return speciality;
	 }
	 	 
	 public String getDOB(){
		 return DOB;
	 }
	 	 
	 public String getType(){
		 return type;
	
	 }
	 
	 public String getSalary(){
		 return salary;
	 }
	 
	 public String getPass(){
		 return password;
	 }	 
	 
		
		
		
	}