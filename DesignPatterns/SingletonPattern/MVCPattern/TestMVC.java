public class TestMVC {

    public static void main(
            String[] args) {

        Student student =
                new Student(
                        "Cheril",
                        101,
                        "A");

        StudentView view =
                new StudentView();

        StudentController controller =
                new StudentController(
                        student,
                        view);

        controller.updateView();

        System.out.println();

        controller.setStudentName(
                "Grace");

        controller.setStudentGrade(
                "A+");

        controller.updateView();
    }
}