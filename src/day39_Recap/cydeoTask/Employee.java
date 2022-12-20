package day39_Recap.cydeoTask;

public class Employee extends Person {// if the Employee clas IS Relation to Person class it must call the Parent class Constructor;

    private int employeeID;
    private  String jobTitle;
    private  double salary;
    //new Employee("Mete Yavsak",-100000);prevent this assigning we should use private variables;

    public Employee(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        if (employeeID <= 0 ){
            System.err.println("Invalid employee ID number");
            System.exit(1);
        }
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle.isEmpty() || jobTitle.isBlank()){
            System.err.println("Invalid Job Title");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<=0){
            System.err.println("Invalid salary input");
            System.exit(1);
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName()+" is working");
    }

    public String toString() {// you have to override to String method from Person class adding the other three private variables;
        return "Employee{" +
                "name='" + getName() + '\'' +  // koz the variables are private use getter and setter;
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }


}

/*
2. Create a sub class of Person named Employee:
            Extra variables:
                employeeId, jobTitle, salary

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                work()
                toString()
 */