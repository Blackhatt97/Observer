/**
 * Created by blackhatt on 09/03/2017.
 */
public class Main {

    public static void main(String[] args) {

        Person rasmus = new Person("Rasmus");
        Person minh = new Person("Minh");

        NewYorkTimes nyt = new NewYorkTimes();

        nyt.subcribe(rasmus);
        nyt.subcribe(minh);

        Article a1 = new Article("Donald trumped the trumpet","blah blah bleu blah", "Authorincus");

        nyt.postNewArticle(a1);


    }
}
