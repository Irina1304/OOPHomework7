package Observer;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        
    }

    @Override
    public Observer sendOffer(String companyName, String jobTitle, int salary) {
        for (Observer observer: observers) {
            if(observer.receiveOffer(companyName, jobTitle, salary)){
                System.out.println("Соискатель согласен на должность");
                return observer;
            }
        }
        return null;
    }
    
}
