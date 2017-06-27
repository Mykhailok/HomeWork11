package homework11;

public class Student extends Human1 {
    private String name;
    private String surname;
    private Integer id;

    public Student( String name, String surname, Integer age, String sex,Integer id) {
        super(age, sex);
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public void printInformation() {
        System.out.print("\nStudent name: " + getName() + "\nStudent surname: " + getSurname() +"\nId number: " + getId());
        super.printInformation();
    }
}

