public class Warrior extends Character implements Weapon {
    private int stamina;
    private String weapon;

    public Warrior(int health, int damage, String name, int stamina, String weapon) {
        super(health, damage, name, "Warrior");
        this.stamina = stamina;
        this.weapon = weapon;
    }

    @Override
    public void attack() {

        System.out.println(getName() +" " + getType() + " attacks with " + weapon + " for " + getDamage() + " damage.");
    }

    @Override
    public void move() {
        System.out.println(getName() + " "+ getType() + " moves forward.");
    }

    @Override
    public void useWeapon() {
        System.out.println(getName() + " " + getType() + " uses " + weapon + ".");
    }
}
