

public class Product {
    private int id;
    private String name;
    private String nationality;
    private int birth_date;
    private String titles;

    public Product(int id, String name, String nationality, int birth_date, String titles) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.birth_date = birth_date;
        this.titles = titles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(int birth_date) {
        this.birth_date = birth_date;
    }

    public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", birth_date=" + birth_date +
                ", titles='" + titles + '\'' +
                '}';
    }
}