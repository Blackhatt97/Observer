import java.util.ArrayList;

/**
 * Created by blackhatt on 09/03/2017.
 */
public class Observable {

    private ArrayList<Observer> subs = new ArrayList<Observer>();

    Observable(){


    }
    public void subcribe(Observer o){
        subs.add(o);


    }

    public void notifySubscribers(Article a){

        for(Observer o : subs){
            o.myNotify(a);


        }
    }


}
