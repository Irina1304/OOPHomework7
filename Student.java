package Observer;

public class Student implements Observer {

    private final String name;

    private final String jobTitle;

    private int salary = 2000;

    public Student(String name,String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    @Override
    public boolean receiveOffer(String companyName, String jobTitle, int salary) {
        if (this.salary <= salary && this.jobTitle.equals(jobTitle)){
            System.out.printf("Студент %s принимает предложение о работе в компании %s на вакансию %s с заработной платой: %d)\n",
                    name, companyName, jobTitle, salary);
            return true;

        }
        else{
            System.out.printf("Студент %s не принимает предложение о работе в компании %s на вакансию %s с заработной платой: %d)\n",
                    name, companyName, jobTitle, salary);
            return false;
        }
    }
}
    

