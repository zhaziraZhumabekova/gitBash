public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Zhazira");
        student.setSurName("Zhumabekova");
        student.setEmail("Zhazira6574@gmail.com");
        student.setAgeCheck(-9);

        System.out.println(student.getName());
        System.out.println(student.getAgeCheck());
    }
}