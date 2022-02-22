
public class Student {
	// three data fields mentioned in the question
        String name;
        int id;
        double cgpa;
       static  int counter = 0;
      Student(){// No-Argument Constructor or Default Constructor
	   counter++;
 }
   // Argument Constructor or Parameter wised Constructor
    Student(String name, int id, double cgpa){
	    this.name = name;
	    this.id = id;
	    this.cgpa = cgpa;
	    counter++;
 }
   // methods
        void StudentInfo() {
	   System.out.println(" Student Name: "+name);
	   System.out.println(" Student ID: "+id);
	   System.out.println(" Student CGPA: "+cgpa);
	   System.out.println();
   }
}
