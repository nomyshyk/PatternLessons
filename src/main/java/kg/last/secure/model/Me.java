package kg.last.secure.model;

public class Me {
    private int id;
    private String text;

    public Me(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public Me() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
