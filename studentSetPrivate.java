public class studentSetPrivate {
    private String id;
    private String name;
    private Double score;

    public void setID(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public void disPlayEmployee() {
        System.out.println("ID = " + this.id);
        System.out.println("Name = " + this.name);
        System.out.println("Score = " + this.score);
    }

    public String getName() {
        return this.name;
    }
}
