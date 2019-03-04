package pl.lodz.uni.math.java.name;

public class TXT extends DAO {
    private String server;
    private Integer id;

    public TXT(Integer id) {
        this.id = id;
    }

    @Override
    public String setServer(String server) {
        return "Finding txt file";
    }

    @Override
    public String getPersonById(Integer id) {
        return "Getting person with id number "+ id;
    }
}
