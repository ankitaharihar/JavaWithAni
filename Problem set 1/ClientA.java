import java.util.ArrayList;

public class ClientA {
    public static void main(String[] args) {
        Studentarr s1 = new Studentarr(1, "Ani", "CS", "XYZ University", 3.8);
        Studentarr s2 = new Studentarr(2, "Rani", "MTech", "XYZ University", 0.8); 
        Studentarr s3 = new Studentarr(3, "Veda", "CS", "XYZ University", 7.8); 
        Studentarr s4 = new Studentarr(4, "Shital", "CS", "XYZ University", 6.8); 
        Studentarr s5 = new Studentarr(5, "Shruti", "CS", "XYZ University", 2.8);
        Studentarr s6 = new Studentarr(6, "Vittal", "CS", "XYZ University", 9.8); 
        Studentarr s7 = new Studentarr(7, "Aditya", "CS", "XYZ University", 4.8);
        ArrayList<Studentarr> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        for(int i = 0; i < students.size(); ++i){
            Studentarr student = students.get(i);
            if (student.cgpa > 3.0){
                System.out.println(student);
            }
        }
    }
    
}
