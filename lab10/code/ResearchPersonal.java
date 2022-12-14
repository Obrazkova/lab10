public class ResearchPersonal extends Employee {

	private String researchArea;

	public void createProject(String name, String start, String end) {
		System.out.println("Проект создан с именем "+name+", который пройдет с "+start+" по "+end);
	}

	public void changeProject(String newName, String newStart, String newEnd) {
		System.out.println("Данные проета изменены");
	}

	public void deleteProject(String projectName) {
		System.out.println("Проект "+projectName+" удален");
	}

}