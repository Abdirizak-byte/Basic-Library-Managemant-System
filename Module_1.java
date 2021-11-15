public class Module_1 {
	
	String name,Lname,uni_id,uid;
	String sem;
	
	public void getdata( String name, String Lname, String uni_id, String uid, String sem) {
		
		this.name = name;
		this.Lname = Lname;
		this.uni_id = uni_id;
		this.uid = uid;
		this.sem = sem;
	}
	
	public void setdata() {
		
		System.out.println("First name" +name);
		System.out.println("Last name: " +Lname);
		System.out.println("Student ID: " +uni_id);
		System.out.println("Uesr ID: " +uid);
		System.out.println("Semester:" +sem);
	}
}
