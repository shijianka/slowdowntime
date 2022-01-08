package homework.双色球;

public class Personnel {
    private String id;

    @Override
    public String toString() {
        return id;
    }

    public Personnel(String id) {
        this.id = id;
    }

    public Personnel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
