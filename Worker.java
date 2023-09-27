package Observer;

public class Worker implements Observer {
    
    private String name;

    private String jobTitle;
    private int salary = 70000;

    public Worker(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    @Override
    public boolean receiveOffer(String companyName, String jobTitle, int salary) {
        if (this.salary <= salary && this.jobTitle.equals(jobTitle)){
            System.out.printf("Работник %s принимает предложение о работе в компании %s на вакансию %s с заработной платой: %d)\n",
                    name, companyName, jobTitle, salary);
            return true;
        }
        else{
            System.out.printf("Работник %s не принимает предложение о работе в компании %s на вакансию %s с заработной платой: %d)\n",
                    name, companyName, jobTitle, salary);
            return false;
        }
    }
}   
