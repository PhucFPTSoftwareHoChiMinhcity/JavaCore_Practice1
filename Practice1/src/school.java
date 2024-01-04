import java.util.Scanner;

public class school {
    public static void main(String[] args) {
        // create a java programming allow input school,name,age,gender of yourself and display
        // input: scanner
        Scanner scanner = new Scanner(System.in);
        String school;
        String name;
        int age;
        String gender;
        System.out.println("Enter School: ");
        school = scanner.nextLine();
        System.out.println("Enter Name: ");
        name = scanner.next();
        System.out.println("Enter Age: ");
        age = scanner.nextInt();
        System.out.println("Enter Gender: ");
        gender = scanner.next();
        System.out.println("School: " + school);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}
