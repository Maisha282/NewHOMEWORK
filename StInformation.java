
public class StInformation {

	public static void main(String[] args) {
		// Creating an object of Student Class
		Student s1 = new Student();
		s1.name = "Maisha Rahman";
		s1.id = 2122153642;
		s1.cgpa = 3.7;
		s1.StudentInfo();	
		Student s2 = new Student();
		s2.name = "X Khan";
		s2.id = 2122255642;
		s2.cgpa = 3.5;
		s2.StudentInfo();

		System.out.println(Student.counter);
		
		
	}

}
