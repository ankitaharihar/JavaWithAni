package demo;
import java.util.ArrayList;

public class Cilent {
  public static void main(String[] args) {
	  Student s1 = new Student(101,"Ani",7.5,"ME");
	  Student s2 = new Student(102,"Rani",3.8,"BE");
	  Student s3 = new Student(103,"Vitthal",2.9,"BE");
	  Student s4 = new Student(104,"Shruti",9.7,"ME");
	  Student s5 = new Student(105,"Aditya",7.6,"ME");
	  Student s6 = new Student(106,"Vedantika",8.4,"BE");
	  
	  ArrayList<Student> list = new ArrayList<>();
	  list.add(s1);
	  list.add(s2);
	  list.add(s3);
	  list.add(s4);
	  list.add(s5);
	  list.add(s6);
	  
	  for (Student s : list) {
		  System.out.println(s);
			
		}
	 
	  
	  for (Student s : list) {
		  if(s.course.equals("BE")) {
			  System.out.println(s.name);
		  }
	  }
		 
	  for (Student s : list) {
		  if(s.cgpa > 7) {
			  System.out.println(s.cgpa + ":" + s.name);
		  }
	  }
	  
	  
	  
	  for (Student s : list) {
		  if(s.cgpa > 7) {
			  System.out.println(s.cgpa + ":" + s.name);
		  }
	  }
		 
		 
	  
			
}
}
