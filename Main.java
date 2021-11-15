import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		int choice = 0;
		
		while (choice != 3) {
			System.out.println("Enter 1 For Student Info / Enter 2 for Classes");
			choice = obj.nextInt();
			
			if (choice  == 1) {
			Module_1 obj1 = new Module_1();
				System.out.println("Enter Student's First name");
			obj1.name = obj.nextLine();obj1.name = obj.nextLine();
				System.out.println("Enter Student's Last name");
				obj1.Lname = obj.nextLine();
				System.out.println("Enter Student ID");
				obj1.uni_id = obj.nextLine();
				System.out.println("Enter User ID");
				obj1.uid = obj.nextLine();
				System.out.println("which quarter are you studing?: ");
				obj1.sem = obj.nextLine();
				
				
				obj1.getdata(obj1.name, obj1.Lname, obj1.uni_id, obj1.uid, obj1.sem);
				obj1.setdata();
			}
			
			else if(choice == 2) {
				Module_2 obj2 = new Module_2();
				
				obj2.Chemistry();
				obj2.Physics();
				obj2.Biology();
				
				
			}
		}
		}
		
	}

