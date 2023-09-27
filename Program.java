package Observer;

public class Program {

    public static void main(String[] args) {
        
        Publisher jobAgency = new JobAgency();

        Vacancy vacancy1 = new Vacancy("Разработчик",90000);
        Vacancy vacancy2 = new Vacancy("Тестировщик",70000);
        Vacancy vacancy3 = new Vacancy("Стажер",30000);

        Company google = new Company("Google",  jobAgency, vacancy1);
        Company yandex = new Company("Yandex",  jobAgency, vacancy2);
        Company geekBrains = new Company("GeekBrains",  jobAgency, vacancy3);

        Student student1 = new Student("Student1","Стажер");
        Worker worker1 = new Worker("Worker1","Разработчик");
        Worker worker2 = new Worker("Worker2","Тестировщик");

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(worker1);
        jobAgency.registerObserver(worker2);

        for (int i = 0; i < 5; i++) {
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
        }
    }
    
}
