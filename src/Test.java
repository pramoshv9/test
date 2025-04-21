import java.util.Objects;

public class Test {
 /*   String[] input = {
 /*           "Alice:Math=80,Science=90,English=70",
 /*          "Bob:Math=85,Science=80,English=88",
 /*          "Charlie:Math=78,Science=82,English=79"
 /*   };*/


       // Strudent s1

}


class Strudent {
    private String studentName;
    int math;
    int Science;
    int english;

    public Strudent() {
    }

    public Strudent(String studentName, int math, int science, int english) {
        this.studentName = studentName;
        this.math = math;
        Science = science;
        this.english = english;
    }

    public String getStudentName() {
        return studentName;
    }


    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getScience() {
        return Science;
    }

    public void setScience(int science) {
        Science = science;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Strudent strudent = (Strudent) o;
        return math == strudent.math && Science == strudent.Science && english == strudent.english && Objects.equals(studentName, strudent.studentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentName, math, Science, english);
    }
}