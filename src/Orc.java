public class Orc extends Player {
    public Orc(String name, int health, int hitPoints) {
        super(name, health, hitPoints);
    }

    public void attack (Orc defender, Human attacker, boolean isAttack, boolean isDef) {
        System.out.println(attacker.getName() + " атакует " + defender.getName());
        if (isAttack!=isDef) {
            this.health -= attacker.getHitPoints();
        } else {
            System.out.println("Удар заблокирован");
        }
    }
}
