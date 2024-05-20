
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Выберите опцию:");
        System.out.println("1. Добавить сотрудника");
        System.out.println("2. Выбрать место");
        System.out.println("3. Очистить место");
        System.out.println("4. Похороны");

        Logger logger = Logger.getLogger(Main.class.getName());
        Scanner in = new Scanner(System.in);
        int opt = in.nextInt();
        logger.log(Level.INFO, "Выбрана опция:" + opt);
        if(opt ==1){
            Employee employee = new Employee();
        }
        else if(opt ==2){
            int[][] bron_place = new int[10][10];
            PlaceSelection placeSelection = new PlaceSelection(bron_place);
            placeSelection.choosePlace();
        }
        else if (opt == 3){
            int[][] bron_place = new int[10][10];
            PlaceSelection placeSelection = new PlaceSelection(bron_place);
            placeSelection.deletePlace();
        }
        else if(opt==4){
            int[][] bron = new int[12][31];
            List<Integer> trupsId = new ArrayList<>();
            ArrayList<Object> trupsInfo = new ArrayList<>();

            Funeral funeral = new Funeral(bron, trupsId, trupsInfo);
            funeral.addTrup();
            System.out.println("Похороны созданы");
        }
    }
}
class PlaceSelection {
    private Logger logger = Logger.getLogger(PlaceSelection.class.getName());
    private int[][] bron_place;

    public PlaceSelection(int[][] bron_place) {
        this.bron_place = bron_place;
    }

    public void choosePlace() {
        Scanner in = new Scanner(System.in);
        int a = 1;
        int vvod_raw, vvod_column;

        while (a == 1) {
            System.out.println("Введите номер ряда:");
            vvod_raw = in.nextInt();
            logger.log(Level.INFO, "Ряд:" + vvod_raw);
            System.out.println("Введите номер колонны:");
            vvod_column = in.nextInt();
            logger.log(Level.INFO, "Колонна:" + vvod_column);

            if (bron_place[vvod_raw][vvod_column] == 0) {
                bron_place[vvod_raw][vvod_column] = 1;
                System.out.printf("Вы забронировали %d-ряд и колонна- %d\n", vvod_raw, vvod_column);
                a = 0;
            } else {
                System.out.printf("Данный %d-ряд и колонна- %d уже забронированы, выберите другую дату\n", vvod_raw, vvod_column);
            }
        }
    }

    public void deletePlace() {
        Scanner in = new Scanner(System.in);
        int a = 1;
        int vvod_raw, vvod_column;

        while (a == 1) {
            System.out.println("Введите номер ряда:");
            vvod_raw = in.nextInt();
            logger.log(Level.INFO, "Ряд:" + vvod_raw);
            System.out.println("Введите номер колонны:");
            vvod_column = in.nextInt();
            logger.log(Level.INFO, "Колонна:" + vvod_column);

            if (bron_place[vvod_raw][vvod_column] == 0) {
                bron_place[vvod_raw][vvod_column] = 0;
                System.out.printf("Вы убрали труп из %d-ряда и колонна- %d\n", vvod_raw, vvod_column);
                a = 0;
            } else {
                System.out.printf("Данный %d-ряд и колонна- %d уже пусты\n", vvod_raw, vvod_column);
            }
        }
    }
}
