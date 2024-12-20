public class EBook  extends Book {
    private String downliadUrl;

    public EBook(String title, String author, String downliadUrl) {
        super(title, author);
        this.downliadUrl = downliadUrl;
    }

    public String getDownliadUrl() {
        return downliadUrl;
    }

    @Override
    public String toString() {
        return super.toString() + ", 下載連結: " + downliadUrl;
    }
}
