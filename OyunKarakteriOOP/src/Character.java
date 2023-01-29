abstract class Character {
    private int health;
    private int damage;
    private String name;
    private String type;

    public Character(int health, int damage, String name, String type) {
        this.health = health;
        this.damage = damage;
        this.name = name;
        this.type = type;
    }

    public abstract void attack();

    public abstract void move();

    public void takeDamage(int damage) {
        health -= damage;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

