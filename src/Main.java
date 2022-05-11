import java.util.Random;

class Main {
    public static final int HUMANS_COUNT = 2;
    public static final Human[] HUMANS = new Human[HUMANS_COUNT];
    public static final int START_HUMAN_HEALTH = 100;
    public static final int START_HUMAN_HITS = 15;

    public static final int ORCS_COUNT = 2;
    public static final Orc[] ORCS = new Orc[ORCS_COUNT];
    public static final int START_ORC_HEALTH = 200;
    public static final int START_ORC_HITS = 30;

    private static final Random RANDOM = new Random();

    public static void main(String[] args) throws Exception {

        //Устанавливаем войска альянса
        for (int i = 0; i < HUMANS.length; i++) {
            HUMANS[i] = new Human("Чел" + (i + 1), START_HUMAN_HEALTH, START_HUMAN_HITS);
        }

        //Устанавливаем войска орды
        for (int i = 0; i < ORCS.length; i++) {
            ORCS[i] = new Orc("Орк" + (i + 1), START_ORC_HEALTH, START_ORC_HITS);
        }

        //бой
        hit(RANDOM.nextBoolean(), RANDOM.nextBoolean(), RANDOM.nextBoolean(), selectOrc(), selectHuman());

        for (int i = 0; i < 2; i++) {
            System.out.println(HUMANS[i].getHealth() + " " + ORCS[i].getHealth());
        }
    }

    //выбор бойца из альянса
    private static Human selectHuman() {
        while (true) {
            Human human = HUMANS[RANDOM.nextInt(HUMANS.length)];
            if (human.getHealth() > 0) {
                return human;
            }
        }
    }

    //выбор бойца из орды
    private static Orc selectOrc() {
        while (true) {
            Orc orc = ORCS[RANDOM.nextInt(ORCS.length)];
            if (orc.getHealth() > 0) {
                return orc;
            }
        }
    }

    public static void hit(boolean whoHit, boolean isAttack, boolean isDef, Orc orc, Human human) {
        if (whoHit) {
            human.attack(human, orc, isAttack,isDef);
        } else {
            orc.attack(orc, human, isAttack, isDef);
        }
    }
}