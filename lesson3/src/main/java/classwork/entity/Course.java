package classwork.entity;

import java.util.Objects;

public class Course {

    private int id;
    private String title;
    private String firstName;
    private String lastName;
    private String patronymic;
    private int hours;

    public Course() {
    }

    public Course(int id, String title, String firstName, String lastName, String patronymic, int hours) {
        this.id = id;
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.hours = hours;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return getId() == course.getId() &&
                getHours() == course.getHours() &&
                Objects.equals(getFirstName(), course.getFirstName()) &&
                Objects.equals(getLastName(), course.getLastName()) &&
                Objects.equals(getPatronymic(), course.getPatronymic());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName(), getPatronymic(), getHours());
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", hours=" + hours +
                '}';
    }
}
