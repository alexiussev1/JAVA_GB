package Lection_6;

public class Lesson_6_2_1_Worker {
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {
       return String.format("id:%d fn:%s ln:%s s:%d", id, firstName, lastName, salary);
    }

    @Override
    public boolean equals(Object o) {
        Lesson_6_2_1_Worker t = (Lesson_6_2_1_Worker) o;
        return id == t.id && firstName == t.firstName;
    }

    @Override
    public int hashCode() {
        return id;
    }
}



