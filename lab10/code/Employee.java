public class Employee {

    private int socialSecurityNumber;
    private String name;
    private String eMail;

    public void changeName(String newName) {
        this.name = newName;
        System.out.println("Имя изменено на "+newName);
    }

    public void changeEMail(String newEMail) {
        this.eMail = newEMail;
        System.out.println("E-mail изменен на "+newEMail);
    }

}