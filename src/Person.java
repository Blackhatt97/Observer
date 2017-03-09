/**
 * Created by blackhatt on 09/03/2017.
 */
public class Person implements Observer{


    private String name;
    Person(String name){

        this.name = name;
    }
    public void myNotify(Article a){

        System.out.println(this.name + ": was notified that NYT crated a new article :" + a.getTitle() + " written by "
        + a.getAuthor());
    }


}
