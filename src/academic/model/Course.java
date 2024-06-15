package academic.model;

/**
 * @author NIM Nama
 */

public class Course {
    private String code;
    private String name;
    private int credit;
    private String passingGrade;

    public Course(String code, String name, int credit, String passingGrade) {
        this.code = code;
        this.name = name;
        this.credit = credit;
        this.passingGrade = passingGrade;
    }

    @Override
    public String toString() {
        return code + "|" + name + "|" + credit + "|" + passingGrade;
    }
}
