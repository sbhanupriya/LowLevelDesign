package designpatterns.creational.builder.StudentExample;

import java.util.List;

public class Student {
    private int rollNumber;
    private int age;
    private String name;
    private String fatherName;
    private String motherName;
    private List<String> subjects;
    private String mobileNumber;

    public Student(StudentBuilder studentBuilder){
        this.age = studentBuilder.age;
        this.rollNumber = studentBuilder.rollNumber;
        this.mobileNumber = studentBuilder.mobileNumber;
        this.motherName = studentBuilder.motherName;
        this.name = studentBuilder.name;
        this.fatherName = studentBuilder.fatherName;
        this.subjects = studentBuilder.subjects;
    }

    @Override
    public String toString(){
        return "Student [name=" + name + "],[age=" + age + "],[rollNumber" + rollNumber + "],[fatherName=" + fatherName + "],[motherName" +
                motherName + "],[Subjects" + subjects + "]";
    }

}
