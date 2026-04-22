public class Studentarr {
    int id;
    String name;
    String course;
    String uni_name;
    double cgpa;

    public Studentarr(int id, String name, String course, String uni_name, double cgpa) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.uni_name = uni_name;
        this.cgpa = cgpa;

    }

    @Override
    public String toString() {
        return "Studentarr{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", uni_name='" + uni_name + '\'' +
                ", cgpa=" + cgpa +
                '}';

    }
}
