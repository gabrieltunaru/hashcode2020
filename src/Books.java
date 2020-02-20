public class Books {
    public static int index=0;
    public int id;
    public int score;
    public Books(int score) {
        this.score=score;
        this.id=index++;
    }
}
