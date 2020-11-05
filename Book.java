public class Book {

    private int slno;
    private String nameofbook ;
    private String nameofauthor;
    private int cost;

    public Book(int slno, String nameofbook, String nameofauthor, int cost) {
        this.slno = slno;
        this.nameofbook = nameofbook;
        this.nameofauthor = nameofauthor;
        this.cost = cost;
    }

    public int getSlno() {
        return slno;
    }

    public String getNameofbook() {
        return nameofbook;
    }

    public String getNameofauthor() {
        return nameofauthor;
    }

    public int getCost() {
        return cost;
    }
}
