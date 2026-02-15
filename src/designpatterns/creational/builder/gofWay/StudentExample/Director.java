package designpatterns.creational.builder.gofWay.StudentExample;

public class Director {
    private StudentBuilder studentBuilder;
    public Director(StudentBuilder builder){
        this.studentBuilder = builder;
    }

    public Student createStudent(int roll, String name) {
        return studentBuilder.setRollNumber(roll).setName(name).setSubjects().build();
    }
}
