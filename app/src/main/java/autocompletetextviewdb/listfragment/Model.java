package autocompletetextviewdb.listfragment;

/**
 * Created by Dell on 14-10-2016.
 */
public class Model {
    private final String name;
    private String id;

    public Model(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }




}
