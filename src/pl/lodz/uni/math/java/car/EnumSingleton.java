package pl.lodz.uni.math.java.car;

public enum EnumSingleton {
    numberOfPassangers(3);
    private final int value;

    EnumSingleton(int value) {
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}


