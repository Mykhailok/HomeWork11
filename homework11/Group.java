package homework11;

import java.util.Scanner;

public class Group implements StudyGroup {
    private String groupName;
    Student student;
    private Student[] students;
    int i;


    public Group(String groupName) {
        this.groupName = groupName;
        students = new Student[10];
        i = 0;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void addStudent(Student student) {
        if (this.i >= students.length) {
            System.out.println("ERROR: The Group is full");
            return;

        }
        students[this.i] = student;
        this.i++;
    }

    @Override
    public void delStudent(Integer id) {
        boolean isFound = false;
        for (int a = 0; a < this.i; a++) {

            if (students[a].getId().equals(id)) {
                for (int j = 0; j < a; j++) {
                    isFound = true;
                    students[j] = null;
                    System.out.println("\nStudent which id number: " + id + " is deleted from the " + getGroupName());
                    sortGroupAfterDelStudent();
                }
            } else {
                isFound = false;

                System.out.println("\nNo student with this number id: " + id);

            }
        }
    }


    public void sortGroupAfterDelStudent() {
        for (int a = 0; a < this.i - 1; a--) {
            if (students[a] == null && students[a + 1] != null) {
                students[a] = students[a + 1];
                students[a] = null;


            }
        }
    }


    public void information() {
        for (int a = 0; a < this.i; a++) {
            System.out.print("\nGroup name: " + getGroupName());
            students[a].printInformation();
        }
    }


    public void searchStudent() {
        System.out.println("Input surname: ");
        Scanner scan = new Scanner(System.in);
        String surname = scan.nextLine();
        boolean isFound = false;
        for (int a = 0; a < this.i; a++) {
            if (students[a].getSurname().equals((surname))) {
                isFound = true;
                System.out.println(students[a].toString());
            } else {
                students[a] = null;
                isFound = false;
                System.out.println("No such student was found");
            }
            break;
        }
    }

    public void findStudent(String lastName) {
        if (lastName == null || lastName.equalsIgnoreCase(""));
        for (int a = 0; a < this.i; a++) {
            try {
                if (students[a].getSurname().equalsIgnoreCase(lastName)) ;
            } catch (NullPointerException e) {
            }
            System.out.println();
        }
    }




    public void sortSurname(){
        for (int a = 0; a < this.i; a++) {
            if (students[i]!=null){

                System.out.println(students[i].toString());
            }
        }
    }
}

