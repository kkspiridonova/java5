import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funeral {
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
        System.out.println("Введите имя:");
        String firstName = in.nextLine();
        System.out.println("Введите фамилию:");
        String secondName = in.nextLine();
        System.out.println("Введите отчество:");
        String serName = in.nextLine();
        System.out.println("Введите причину смерти:");
        String whyHeDeth = in.nextLine();

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
        return vvodMetod;
    }

    private List<Integer> choiceDataOfFuniral() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите месяц:");
        int vvodManth = in.nextInt();
        System.out.println("Введите день:");
        int vvodDay = in.nextInt();
        return List.of(vvodManth, vvodDay);
    }
}
