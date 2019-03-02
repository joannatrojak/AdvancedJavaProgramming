package pl.lodz.uni.math.java.name;
public class Name {
    public int passanger;
    static Name name1 = new Name();
    private Name(){

    }
    public int getPassanger() {
        return passanger;
    }
    public static Name getInstance(){
        if (name1 == null){
            name1 = new Name();
        }
        return name1;
    }
    public void setPassanger(int passanger) {
        this.passanger = passanger;
    }
}

