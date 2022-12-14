public class Main {
    public static void main(String[] args) {
        System.out.println("Работник изменяет свои данные:");
        Employee employee = new Employee();
        employee.changeName("Name");
        employee.changeEMail("email@mail.com");
        System.out.println("Научный сотрудник работает с проектом:");
        Lecturer lecturer = new Lecturer();
        lecturer.createProject("Проект", "01.01.2022", "31.12.2022");
        lecturer.changeProject("Проект","01.12.2022","31.12.2022");
        lecturer.deleteProject("Проект");
        System.out.println("Лектор работает с курсом:");
        lecturer.createCourse("Курс",2);
        lecturer.changeCourse("Курс", 3);
        lecturer.deleteCourse(0);
    }

}
