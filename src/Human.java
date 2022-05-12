public class Human extends Player {

    public Human(String name, int health, int hitPoints) {
        super(name, health, hitPoints);
    }

    public void attack(Human defender, Orc attacker, int isAttack, int isDef, double kof) {
        System.out.println(attacker.getName() + " атакует " + defender.getName());
        if (isAttack != isDef) {
            this.health -= attacker.getHitPoints() * (1 - kof / 10);
            this.hitPoints *= 0.9;
            if (this.hitPoints==0) {
                this.hitPoints += 1;
            }
        } else {
            System.out.println("Удар заблокирован");
        }
    }
}