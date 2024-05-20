import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Employee {
    private Logger logger = Logger.getLogger(Employee.class.getName());
    private String firstName;
    private String secondName;
    private String serName;
    private String position;

    public Employee() {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя сотрудника:");
        this.firstName = in.nextLine();
        logger.log(Level.INFO, "Имя сотрудника введено", this.firstName);

        System.out.println("Введите фамилию сотрудника:");
        this.secondName = in.nextLine();
        logger.log(Level.INFO, "Фамилия сотрудника введена", this.secondName);

        System.out.println("Введите отчество сотрудника:");
        this.serName = in.nextLine();
        logger.log(Level.INFO, "Отчество сотрудника введено", this.serName);

        System.out.println("Введите должность сотрудника:");
        this.position = in.nextLine();
        logger.log(Level.INFO, "Должность сотрудника введена", this.position);
    }


}
