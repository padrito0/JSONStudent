public class Student {
    private int id;
    private String name;
    private int age;
    private String grade;

    // Getters (needed for Gson)
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGrade() { return grade; }

    // Method to display student details
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("----------------------");
    }
}
