package day39_Recap.cydeoTask;

public class Student extends Person  {// Student class does not need some variables form Employee class but can be inherited to Person class;
    //before you extend it to a parent class you had better to set the instance variables and fields of the class;

    private int studentId;
    private String fieldOfStudy;

    public Student(String name, int age, char gender, int studentId, String fieldOfStudy) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);// what if we have conditions ? so it is better to use setter method instead of this key word;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public void study(){
        System.out.println(getName()+" is studying");// the name is privet that's why we should call it by getter;
    }

    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", studentId=" + studentId +// we should override toString method from Person class and add the fields;
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }


}

/*
6. Create a sub class of Person named Student

            Extra variables:
                studentId, fieldOfStudy

            Encapsulate all the fields

            Add a constructor to set all the fields

            Encapsulate all the fields

            Methods:
                study()
 */