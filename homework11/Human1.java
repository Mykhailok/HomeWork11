package homework11;

public class Human1 implements Human {
    private Integer age;
    private String sex;

    public Human1(Integer age, String sex) {
        this.age = age;
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void printInformation() {
        System.out.println("\nAge " + getAge() + "\nSex: " + getSex());
    }
}

