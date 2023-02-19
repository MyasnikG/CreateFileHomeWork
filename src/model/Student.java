package model;

public class Student {

    private String name;
    private int age;

    public Student (String fileInfo){
        String [] s = fileInfo.split("-");
        name = s[0];
        age = Integer.parseInt(s[1]);
    }

    @Override
    public String toString() {
        return name + ", " + age;
    }

}
