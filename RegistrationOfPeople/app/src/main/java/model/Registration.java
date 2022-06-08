package model;

public class Registration {
    private int id;
    private String name;
    private String socialName;
    private String genre;
    private String fatherName;
    private String motherName;
    private String income;

    public Registration(String toString, String name, String socialName, String genre, String fatherName, String motherName) {
        this.name = name;
        this.socialName = socialName;
        this.genre = genre;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.income = income;
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

    public String getSocialName() {
        return socialName;
    }

    public void setSocialName(String socialName) {
        this.socialName = socialName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }
}
