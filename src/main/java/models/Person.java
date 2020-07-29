package models;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String role;

    public Person(String name, int age, String gender, String role) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getRole() {
        return role;
    }
}
