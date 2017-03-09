/**
 * Created by blackhatt on 09/03/2017.
 */
public class NewYorkTimes extends Observable{

    public void postNewArticle(Article a){

        System.out.println("Action occured");
        notifySubscribers(a);
    }
}
