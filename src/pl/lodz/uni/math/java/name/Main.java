package pl.lodz.uni.math.java.name;


import pl.lodz.uni.math.java.car.EnumSingleton;

class Main{
    Name n1 = Name.getInstance();
    Name n2 = Name.getInstance();
    public static void main(String[] args){
        System.out.println(EnumSingleton.numberOfPassangers.getValue());
    }
}