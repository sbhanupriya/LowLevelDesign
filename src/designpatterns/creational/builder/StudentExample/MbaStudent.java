package designpatterns.creational.builder.StudentExample;

import java.util.ArrayList;
import java.util.List;

public class MbaStudent extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("Economics");
        subjects.add("Statistics");
        subjects.add("Operations Management");
        this.subjects = subjects;
        return this;
    }
}
