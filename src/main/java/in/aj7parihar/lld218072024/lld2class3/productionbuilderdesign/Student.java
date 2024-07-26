    package in.aj7parihar.lld218072024.lld2class3.productionbuilderdesign;

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

    private Student(StudentBuilder builder) {
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
    }

    public static StudentBuilder getBuilder() {
        return new StudentBuilder();
    }

    public static class StudentBuilder {
        private int id;
        private String name;
        private int age;
        private String gender;
        private String address;
        private String phone;
        private String email;
        private int rollNum;
        private String courseName;


        // Getters & Setters
        public int getId() {
            return id;
        }

        public StudentBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getGender() {
            return gender;
        }

        public StudentBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public String getPhone() {
            return phone;
        }

        public StudentBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public int getRollNum() {
            return rollNum;
        }

        public StudentBuilder setRollNum(int rollNum) {
            this.rollNum = rollNum;
            return this;
        }

        public String getCourseName() {
            return courseName;
        }

        public StudentBuilder setCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public Student build(){
            // Validations
            if(this.getAge() < 18){
                throw new RuntimeException("Age must be at least 18");
            }
            if(!this.getCourseName().equals("Academy - Software Engineering")){
                throw new RuntimeException("Not a valid course");
            }
            return new Student(this);
        }
    }
}
