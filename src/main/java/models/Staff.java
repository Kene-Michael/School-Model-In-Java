package models;

public abstract class Staff extends Person{
    private final int staffId;

    public Staff(String name, int age, String gender, int staffId, String role) {
        super(name, age, gender, role);
        this.staffId = staffId;
    }

    public int getStaffId() {
        return staffId;
    }
}
