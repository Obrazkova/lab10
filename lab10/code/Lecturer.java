public class Lecturer extends ResearchPersonal {

	public void createCourse(String name, int weeklyDuration) {
		System.out.println("Курс создан с именем "+name+"; его количество часов в неделю: "+weeklyDuration);
	}

	public void changeCourse(String newName, int newWeeklyDuration) {
		System.out.println("Данные курса изменены");
	}

	public void deleteCourse(int id) {
		System.out.println("Курс удален");
	}

}