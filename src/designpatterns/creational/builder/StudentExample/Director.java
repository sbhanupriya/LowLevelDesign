package designpatterns.creational.builder.StudentExample;

public class Director {
    private StudentBuilder studentBuilder;
    public Director(StudentBuilder builder){
        this.studentBuilder = builder;
    }

    public Student createStudent(){
        if(studentBuilder instanceof EngineeringStudent)
            return createEngineer();
        else if(studentBuilder instanceof  MbaStudent)
            return createMba();
        else
            return null;
    }
    private Student createEngineer(){
        return studentBuilder.setRollNumber(1).setName("Bhanu").setSubjects().build();
    }
    private Student createMba(){
        return studentBuilder.setRollNumber(1).setName("Kajal").setSubjects().build();
    }
}
