package OOP_4;

import java.util.ArrayList;
import java.util.List;

public class TeacherController implements UserConroller<Teacher> {

    private List<Teacher> teachers;

    public TeacherController() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public void create(String firstName, String lastName, String middleName) {
        Teacher teacher = new Teacher();
        teacher.setFirstName(firstName);
        teacher.setLastName(lastName);
        teacher.setMiddleName(middleName);
        teachers.add(teacher);
    }

    public void edit(Long teacherId, String firstName, String lastName, String middleName) {
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherid().equals(teacherId)) {
                teacher.setFirstName(firstName);
                teacher.setLastName(lastName);
                teacher.setMiddleName(middleName);
                break;
            }
        }
    }

    public void displayTeachers() {
        TeacherView teacherView = new TeacherView();
        teacherView.sendOnConsole(teachers);
    }
}