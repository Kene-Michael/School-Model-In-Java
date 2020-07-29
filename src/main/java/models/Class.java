package models;

public class Class {
    private String classId;
    private String className;

    public Class(String classId, String className) {
        this.classId = classId;
        this.className = className;
    }

    public String getClassId() {
        return classId;
    }

    public String getClassName() {
        return className;
    }
}
