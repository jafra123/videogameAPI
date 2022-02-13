package restAssuredUdemyProjectPOJO;

public class GetCourse {

   private  String instructor;
   private   String url;
   private String services;
   private  String expertise;
   private Courses Courses;
   private String Linktext;
	
   
   public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getServices() {
		return services;
	}
	public void setServices(String services) {
		this.services = services;
	}
	
	public String getExpertise() {
		return expertise;
	}
	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}
	

	
	public restAssuredUdemyProjectPOJO.Courses getCourses() {
		return Courses;
	}
	public void setCourses(restAssuredUdemyProjectPOJO.Courses courses) {
		Courses = courses;
	}
	
	
	
	
	public String getLinktext() {
		return Linktext;
	}
	public void setLinktext(String linktext) {
		Linktext = linktext;
	}
    
	
}
