package in.aj7parihar.lld218072024.lld2class3.basicbuilderdesign;

public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phone;
    private String email;
    private int rollNum;
    private String courseName;
    private double psp;

    public Student(StudentBuilder builder) {
        // Validations
        if(builder.getAge() < 18){
            throw new RuntimeException("Age must be at least 18");
        }
        if(!builder.getCourseName().equals("Academy - Software Engineering")){
            throw new RuntimeException("Not a valid course");
        }

        // initialization
        this.id = builder.getId();
        this.name = builder.getName();
        this.age = builder.getAge();
        this.gender = builder.getGender();
        this.address = builder.getAddress();
        this.phone = builder.getPhone();
        this.email = builder.getEmail();
        this.rollNum = builder.getRollNum();
        this.courseName = builder.getCourseName();
        this.psp = builder.getPsp();
    }
}
