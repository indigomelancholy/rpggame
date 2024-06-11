class Rogue extends Character {
    private int agility;
    private int dexterity;

    public Rogue(String name, int health, int mana, int level, int agility, int dexterity) {
        super(name, health, mana, level);
        this.agility = agility;
        this.dexterity = dexterity;
    }

    public void sneakAttack(Character a) {
        System.out.println(name + " performed a sneak attack on " + a.name + "!");
        this.mana -= 10;
        a.health -= 7;
    }

    public void deceptionDefence(Character a) {
        System.out.println(name + " defended using deception against " + a.name + "!");
        this.mana -= 5;
        this.health += 10;
        a.mana -= 7;
    }
    public void statsDisp() {
        super.statsDisp();
        System.out.println("Agility: " + agility);
        System.out.println("Dexterity: " + dexterity);
    }
}