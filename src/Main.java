/**
 * Created by blackhatt on 09/03/2017.
 */
public class Main {

    public static void main(String[] args) {

        Person rasmus = new Person("Rasmus");
<<<<<<< HEAD
       
=======
        Person minhel = new Person("Mihnel");
>>>>>>> 85f90be73a5a1e5b4bcc8171911c2c2e2c049414

        NewYorkTimes nyt = new NewYorkTimes();

        nyt.subcribe(rasmus);
        nyt.subcribe(minh);

        Article a1 = new Article("Donald trumped the trumpet","blah blah bleu blah", "Authorincus");

        nyt.postNewArticle(a1);


    }
}
