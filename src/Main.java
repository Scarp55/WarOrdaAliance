import java.util.Random;

class Main {
    public static final int HUMANS_COUNT = 6;
    public static final Human[] HUMANS = new Human[HUMANS_COUNT];
    public static final int START_HUMAN_HEALTH = 100;
    public static final int START_HUMAN_HITS = 20;

    public static final int ORCS_COUNT = 3;
    public static final Orc[] ORCS = new Orc[ORCS_COUNT];
    public static final int START_ORC_HEALTH = 180;
    public static final int START_ORC_HITS = 30;

    private static final Random RANDOM = new Random();

    public static void main(String[] args) throws Exception {

        //Устанавливаем войска альянса
        for (int i = 0; i < HUMANS.length; i++) {
            HUMANS[i] = new Human("Чел" + (i + 1), START_HUMAN_HEALTH, START_HUMAN_HITS);
        }

        //Устанавливаем войска орды
        for (int i = 0; i < HUMANS.length; i++) {
            ORCS[i] = new Orc("Орк" + (i + 1), START_ORC_HEALTH, START_ORC_HITS);
        }
    }
}