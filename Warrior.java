class Warrior extends Character {
    private int strength;
    private int armor;

    public Warrior(String name, int health, int mana, int level, int strength, int armor) {
        super(name, health, mana, level);
        this.strength = strength;
        this.armor = armor;
    }

    public void swingAttack(Character a) {
        System.out.println(name + " swung his sword at " + a.name + "!");
        this.mana -= 10;
        a.health -= 9;
    }

    public void shieldDefence() {
        System.out.println(name + " used a shield defence!");
        this.mana -= 5;
        this.health += 5;
    }

    public void statsDisp() {
        super.statsDisp();
        System.out.println("Strength: " + strength);
        System.out.println("Armor: " + armor);
    }
}
