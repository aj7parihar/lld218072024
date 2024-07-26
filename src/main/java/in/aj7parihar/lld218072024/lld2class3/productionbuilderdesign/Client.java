package in.aj7parihar.lld218072024.lld2class3.productionbuilderdesign;

public class Client {
    public static void main(String[] args) {
        demoBuilderDesignPattern();
    }
    public static void demoBuilderDesignPattern() {

        Student.StudentBuilder builder = Student.getBuilder();
//        builder.setId(1);
//        builder.setName("Ajay");
//        builder.setAge(23);
//        builder.setGender("Male");
//        builder.setAddress("Unknown House 123");
//        builder.setPhone("+91734687373");
//        builder.setEmail("success@success.com");
//        builder.setRollNum(7);
//        builder.setCourseName("Academy - Software Engineering");
//
//        Student student = builder.build();

        Student student = builder.setId(1)
                .setName("Ajay")
                .setAge(29)
                .setGender("Male")
                .setAddress("Unknown House 123")
                .setPhone("+91763576283")
                .setCourseName("Academy - Software Engineering")
                .build();

        System.out.println("Debug to see the object created");
    }
}
