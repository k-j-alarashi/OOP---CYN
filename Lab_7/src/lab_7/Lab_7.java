package lab_7;

public class Lab_7 {
    public static void main(String[] args) {
        Student s = new Student(1, "Ahmed", 23, "CYN");
        Teacher t = new Teacher(100, "Mohammed", 30, 100000);
        
        System.out.println("==========Student===========");
        System.out.println(s.toString());
        System.out.println("==========Teacher===========");
        System.out.println(t.toString());
    }
}
