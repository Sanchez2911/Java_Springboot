package SuperGiros.domain;

public class Category {
    private int catogoryId;
    private String category;
    private boolean active;

    public int getCatogoryId() {
        return catogoryId;
    }

    public void setCatogoryId(int catogoryId) {
        this.catogoryId = catogoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
