package Pr_11;

class Student {
    private String name;
    private int IDNumber;

    public Student(String name, int IDNumber) {
        this.name = name;
        this.IDNumber = IDNumber;
    }

    public String getName() {
        return name;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", IDNumber=" + IDNumber + '}';
    }
}
