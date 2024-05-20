import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Funeral {
    private Logger logger = Logger.getLogger(Funeral.class.getName());
    private int[][] bron;
    private List<Integer> trupsId;
    private ArrayList<Object> trupsInfo;

    public Funeral(int[][] bron, List<Integer> trupsId, ArrayList<Object> trupsInfo) {
        this.bron = bron;
        this.trupsId = trupsId;
        this.trupsInfo = trupsInfo;
    }

    public void addTrup() {
        int idTrup = trupsId.isEmpty() ? 1 : trupsId.get(trupsId.size() - 1) + 1;
        trupsId.add(idTrup);
        Scanner in = new Scanner(System.in);
        logger.log(Level.INFO, "Позиция ноиер:" + idTrup);

        System.out.println("Введите имя:");
        String firstName = in.nextLine();
        logger.log(Level.INFO, "Имя:" + firstName);

        System.out.println("Введите фамилию:");
        String secondName = in.nextLine();
        logger.log(Level.INFO, "Фамилия:" + secondName);

        System.out.println("Введите отчество:");
        String serName = in.nextLine();
        logger.log(Level.INFO, "Отчество:" + serName);

        System.out.println("Введите причину смерти:");
        String whyHeDeth = in.nextLine();
        logger.log(Level.INFO, "Причина смерти:" + whyHeDeth);


        int metod = choiceMetodOdFun();
        List<Integer> monfFur = choiceDataOfFuniral();
    }

    private int choiceMetodOdFun() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите метод захоронения:");
        System.out.println("1. Кремация");
        System.out.println("2. Земля родимая");
        System.out.println("3. Мумификация");
        System.out.println("4. Скормить некрофилам");
        int vvodMetod = in.nextInt();
        logger.log(Level.INFO, "Метод выбран;" + vvodMetod);
        return vvodMetod;
    }

    private List<Integer> choiceDataOfFuniral() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите месяц:");
        int vvodManth = in.nextInt();
        logger.log(Level.INFO, "Месяц:" + vvodManth);
        System.out.println("Введите день:");
        int vvodDay = in.nextInt();
        logger.log(Level.INFO, "День:" + vvodDay);
        return List.of(vvodManth, vvodDay);
    }
}
