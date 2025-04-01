package designpatterns.creational.builder.StudentExample;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudent extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("OS");
        subjects.add("Networking");
        subjects.add("OOPS");
        this.subjects = subjects;
        return this;
    }
}
