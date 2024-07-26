package in.aj7parihar.lld218072024.lld2class3.basicbuilderdesign;

public class Client {
    public static void main(String[] args) {
        demoBuilderDesignPattern();
    }
    public static void demoBuilderDesignPattern() {
        StudentBuilder builder = new StudentBuilder();
        builder.setId(1);
        builder.setName("Ajay");
        builder.setAge(29);
        builder.setGender("Male");
        builder.setAddress("Unknown House 123");
        builder.setPhone("+91734687373");
        builder.setEmail("success@success.com");
        builder.setRollNum(7);
        builder.setCourseName("Academy - Software Engineering");

        Student student = new Student(builder);

        System.out.println("Debug to see what objet is created");
    }
}
