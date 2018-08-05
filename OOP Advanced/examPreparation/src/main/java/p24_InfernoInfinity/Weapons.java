package p24_InfernoInfinity;

public enum Weapons {
    AXE(5,10,4), SWORD(4,6,3), KNIFE(2,8,4);

    private int minDamage;
    private int maxDamage;
    private int sockets;

    Weapons(int minDamage, int maxDamage, int sockets) {
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.sockets = sockets;
    }

    public int getMinDamage() {
        return this.minDamage;
    }

    public int getMaxDamage() {
        return this.maxDamage;
    }

    public int getSockets() {
        return this.sockets;
    }
}
