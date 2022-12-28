import java.util.Objects;

//Напишите методы Equals and HashCode для класса Student,
// который состоит из полей String name и int age.

public class Student {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && name.equals(student.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


}
