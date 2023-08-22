public class Student {
    String name;
    String email;

    public Student() {

    }

    public String getEmail() {
        return email;
    }

    public  String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args) {

    Student stu = new Student();
    stu.setEmail("example@gmail.com");
    stu.setName("Someone");
        System.out.println("This is email : " + stu.getEmail());
        System.out.println("This is name : " + stu.getName());

    }

}
