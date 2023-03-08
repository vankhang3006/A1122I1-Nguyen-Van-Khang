package Bai2;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(this.name);
    }

    public void setClasses(String classes) {
        this.classes = classes;
        System.out.println(this.classes);
    }

}
