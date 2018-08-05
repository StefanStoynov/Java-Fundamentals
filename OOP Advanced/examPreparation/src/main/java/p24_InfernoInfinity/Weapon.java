package p24_InfernoInfinity;


public class Weapon {
    private String name;
    private Weapons weapons;
    private Gems[] gems;


    public Weapon(String name, String weapons) {
        this.name = name;
        this.weapons = Weapons.valueOf(weapons);
        this.gems = new Gems[Weapons.valueOf(weapons.toUpperCase()).getSockets()];
    }

    private int getStrenght() {
        int strenght = 0;
        for (Gems gem : gems) {
            if (gem != null) {
                strenght += gem.getStrength();
            }
        }
        return strenght;
    }

    private int getAgility() {
        int agility = 0;
        for (Gems gem : gems) {
            if (gem != null) {
                agility += gem.getAgility();
            }
        }
        return agility;
    }

    private int getVitality() {
        int vitality = 0;
        for (Gems gem : gems) {
            if (gem != null) {
                vitality += gem.getVitality();
            }
        }
        return vitality;
    }

    public int getMinDamage() {
        int minDamage = this.weapons.getMinDamage();
        minDamage += this.getAgility();
        minDamage += this.getStrenght() * 2;
        return minDamage;
    }

    public int getMaxDamage() {
        int maxDamage = this.weapons.getMaxDamage();
        maxDamage += this.getAgility() * 4;
        maxDamage += this.getStrenght() * 3;
        return maxDamage;
    }

    public void addGem(String gem, int socketIndex) {
        if (socketIndex >= 0 && socketIndex < this.gems.length) {
            this.gems[socketIndex] = Gems.valueOf(gem.toUpperCase());
        }
    }

    public void removeGem(int socketIndex) {
        if (socketIndex >= 0 && socketIndex < this.gems.length) {
            this.gems[socketIndex] = null;
        }
    }

    @Override
    public String toString() {
        return String.format("%s: %s-%s Damage, +%s Strength, +%s Agility, +%s Vitality"
                , this.name
                , this.getMinDamage()
                , this.getMaxDamage()
                , this.getStrenght()
                , this.getAgility()
                , this.getVitality());
    }
}
