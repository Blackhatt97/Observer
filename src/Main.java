/**
 * Created by blackhatt on 09/03/2017.
 */
public class Main {

    public static void main(String[] args) {

        Person rasmus = new Person("Rasmuselinios dios");
        Person minhel = new Person("Mihnel");

        NewYorkTimes nyt = new NewYorkTimes();

	//this is the second's branch awesomeness
        nyt.subcribe(rasmus);

        NewYorkTime nytu = new NewYorkTimes();
        nyt.subcribe(minh);

        Article a1 = new Article("Donald trumped the trumpet","blah blah bleu blah", "Authorincus");

        nyt.postNewArticle(a1);


    }
}
