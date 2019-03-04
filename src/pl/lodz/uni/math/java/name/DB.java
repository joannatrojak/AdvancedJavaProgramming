package pl.lodz.uni.math.java.name;

public class DB extends DAO {
    private String server;
    private Integer id;
    public DB(Integer id) {
        this.id = id;
    }

    @Override
    public String setServer(String server) {
        return "Connecting to database";
    }

    @Override
    public String getPersonById(Integer id) {
        return "Getting person with id number "+ id;
    }
}
