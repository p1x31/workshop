import java.util.ArrayList;

/**
 * Created by Vadim on 18/10/2015.
 */
public class TutorGroup {
    private String tutor;

    private ArrayList<Student> students;

// constructor

    public TutorGroup(String name)
    {
        this.tutor = name;

        this.students = new ArrayList<Student>();
    }
    // toString method

    public String toString()
    {
        return this.tutor + " has those students: " + this.students;
    }

    public String getName()
    {
        return this.tutor;
    }
    public void setName(String name)
    {
        this.tutor = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
  /*  public void addStudents(Student element)
    {
        this.students.add(element);

    }*/
    public void addStudents(int index, Student element)
    {
        this.students.add(index, element);

    }
    public void SetStudents(ArrayList<Student> students){
        this.students = students;
    }

}
