package subject;

import observer.ObserverInterface;

public interface SubjectInterface {
	
	void attachObserver(ObserverInterface observer);
	void detachObserver(ObserverInterface observer);
	void notifyObserver();

}
