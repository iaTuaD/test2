package Hoa;

public class Hoa {
    private int resoucedId;
    private String title;

    public Hoa(int resoucedId, String title) {
        this.resoucedId = resoucedId;
        this.title = title;
    }

    public int getResoucedId() {
        return resoucedId;
    }

    public void setResoucedId(int resoucedId) {
        this.resoucedId = resoucedId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
