package models;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // moje metody
    // 2 etatpy:
    // co robi - np wylicza wynagrodzenie aktora - stawka * iloscFilmowWRoku
    // jak to robi
    // w javie:
    // deklaracje metody
    // używanie

    public int caltulateSalary(int stawka, int iloscFilmow) {
        int rezultat = stawka * iloscFilmow;
        return rezultat;
    }

    public int giveBonus(int rating, int salary) {
        int rezultat;
        if (rating < 11) {
            rezultat = salary * 2;
        } else {
            rezultat = salary;
        }
        return rezultat;
    }


}
