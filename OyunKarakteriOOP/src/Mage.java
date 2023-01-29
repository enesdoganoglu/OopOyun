public class Mage extends Character {
    private int mana;
    private String spell;

    public Mage(int health, int damage, String name, int mana, String spell) {
        super(health, damage, name, "Mage");
        this.mana = mana;
        this.spell = spell;
    }

    @Override
    public void attack() {
        System.out.println(getName() + " "  + getType() + " casts " + spell + " for " + getDamage() + " damage.");
    }

    @Override
    public void move() {
        System.out.println(getName() + " " + getType() + " teleports.");
    }
}
