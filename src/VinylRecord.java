public class VinylRecord {
    private String name;
    private short year;
    private String author;
    private String songGenre;
    private String grading;
    private int size;
    private String countryWhereStamped;
    private String label;
    private int price;

    public VinylRecord(String name, short year, String author, int size) {
        this.name = name;
        this.year = year;
        this.author = author;
        this.size = size;
    }

    public void setGrading(String grading) {
        this.grading = grading;
    }

    // Getters and setters for other fields

    @Override
    public String toString() {
        return "VinylRecord{name='" + name + "', year=" + year + ", author='" + author + "', grading='" + grading + "'}";
    }
}