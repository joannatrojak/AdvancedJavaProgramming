package pl.lodz.uni.math.java.name;

public class DAOFactory {
    public static DB getDao(String server, Integer id){
        if ("DB".equalsIgnoreCase(server))
            return new DB(id);
        else if ("TXT".equalsIgnoreCase(server))
            return new TXT(id);
        return null;
    }
}
