import java.util.Scanner;

public class Employee {
    private String firstName;
    private String secondName;
    private String serName;
    private String position;

    public Employee() {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя сотрудника:");
        this.firstName = in.nextLine();

        System.out.println("Введите фамилию сотрудника:");
        this.secondName = in.nextLine();

        System.out.println("Введите отчество сотрудника:");
        this.serName = in.nextLine();

        System.out.println("Введите должность сотрудника:");
        this.position = in.nextLine();
    }


}
