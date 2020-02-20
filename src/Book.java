public class Book {
    public static int index=0;
    public int id;
    public int score;
    public Book(int score) {
        this.score=score;
        this.id=index++;
    }
}
