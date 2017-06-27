package homework11;


public class Test {
    public static void main(String[] args) {
        Group s = new Group ("N103");

        s.addStudent(new Student("Petro","Ivanov",19,"man",1231));
        s.addStudent(new Student("Elena","Kust",20,"female",1232));
        s.addStudent(new Student("Ivan","Dorn",19,"man",1233));
        s.addStudent(new Student("Yulia","Kolobok",19,"female",1234));
//        s.addStudent(new Student("Natali","Kucher",20,"female",1235));
//        s.addStudent(new Student("Evheniy","Drozdov",19,"man",1236));
//        s.addStudent(new Student("Roman","Abramovich",21,"man",1237));
//        s.addStudent(new Student("Georg","Pic",19,"man",1238));
//        s.addStudent(new Student("Razina","Ilona",19,"female",1239));



        s.information();
        s.delStudent(1232);
//        s.sortSurname();
//        s.searchStudent();
//        s.findStudent("Kust");
        s.information();


//        s.information();

//        s.searchStudent ();

    }
}
