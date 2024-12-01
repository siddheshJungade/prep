

public class Student{
    private String name;
    private String rollNo;
    private String className;
    private String section;
    private String address;
    private String phone;
    private String email;
    private String dob;
    private String fatherName;
    private String motherName;
    private String fatherPhone;
    private String motherPhone;
    private String fatherEmail;
    private String motherEmail;
    private String fatherOccupation;
    private String motherOccupation;
    private String fatherIncome;

    public Student(StudentBuilder builder) {
        this.name = builder.name;
        this.rollNo = builder.rollNo;
        this.className = builder.className;
        this.section = builder.section;
        this.address = builder.address;
        this.phone = builder.phone;
        this.email = builder.email;
        this.dob = builder.dob;
        this.fatherName = builder.fatherName;
        this.motherName = builder.motherName;
        this.fatherPhone = builder.fatherPhone;
        this.motherPhone = builder.motherPhone;
        this.fatherEmail = builder.fatherEmail;
        this.motherEmail = builder.motherEmail;
        this.fatherOccupation = builder.fatherOccupation;
        this.motherOccupation = builder.motherOccupation;
        this.fatherIncome = builder.fatherIncome;
    }
}

// builder
public abstract class StudentBuilder{
    private String name;
    private String rollNo;
    private String className;
    private String section;
    private String address;
    private String phone;
    private String email;
    private String dob;
    private String fatherName;
    private String motherName;
    private String fatherPhone;
    private String motherPhone;
    private String fatherEmail;
    private String motherEmail;
    private String fatherOccupation;
    private String motherOccupation;
    private String fatherIncome;

    public StudentBuilder className(String className) {
        this.className = className;
        return this;
    }

    public StudentBuilder section(String section) {
        this.section = section;
        return this;
    }

    public StudentBuilder address(String address) {
        this.address = address;
        return this;
    }

    public StudentBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }

    public StudentBuilder email(String email) {
        this.email = email;
        return this;
    }

    public StudentBuilder dob(String dob) {
        this.dob = dob;
        return this;
    }

    public StudentBuilder fatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder motherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public StudentBuilder fatherPhone(String fatherPhone) {
        this.fatherPhone = fatherPhone;
        return this;
    }

    public StudentBuilder motherPhone(String motherPhone) {
        this.motherPhone = motherPhone;
        return this;
    }

    public StudentBuilder fatherEmail(String fatherEmail) {
        this.fatherEmail = fatherEmail;
        return this;
    }

    public StudentBuilder motherEmail(String motherEmail) {
        this.motherEmail = motherEmail;
        return this;
    }

    public StudentBuilder fatherOccupation(String fatherOccupation) {
        this.fatherOccupation = fatherOccupation;
        return this;
    }

    public StudentBuilder motherOccupation(String motherOccupation) {
        this.motherOccupation = motherOccupation;
        return this;
    }

    public StudentBuilder fatherIncome(String fatherIncome) {
        this.fatherIncome = fatherIncome;
        return this;
    }

    public abstract setSubject(String subject);

    public Student build()

}



public class ScienceStudentBuilder extends StudentBuilder{
    private String subject;

    public ScienceStudentBuilder setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public Student build() {
        return new Student(this);
    }
}


public class CommerceStudentBuilder extends StudentBuilder{
    private String subject;

    public CommerceStudentBuilder setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public Student build() {
        return new Student(this);
    }
}


public class Main{
    public static void main(String[] args) {
        // director 
        Student scienceStudent = new ScienceStudentBuilder()
            .className("XII")
            .section("A")
            .address("Delhi")
            .phone("1234567890")
            .email("sid@gmail.com").dob("01-01-2000")
            .fatherName("Mr. Sharma")
            .motherName("Mrs. Sharma")
            .fatherPhone("1234567890")
            .motherPhone("1234567890")
            .fatherEmail("de@gmal.com")
            .motherEmail("dee@gmal.de")
            .fatherOccupation("Business")
            .motherOccupation("Housewife")
            .fatherIncome("1000000")
            .setSubject("Physics")
            .build();
        
            
        }
}