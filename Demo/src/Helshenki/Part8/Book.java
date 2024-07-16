package Helshenki.Part8;

import java.util.ArrayList;
import java.util.HashMap;

import static Helshenki.Part8.Abbreviations.printValueIfNameContains;
import static Helshenki.Part8.Abbreviations.printValues;

public class Book {

    private String name;
    private String content;
    private int published;

    public Book(String name, String content, int published){
        this.name = name;
        this.content = content;
        this.published = published;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getContent(){
        return this.content;
    }

    public void setContent(String content){
        this.content = content;
    }

    public void setPublished(int published){
        this.published = published;
    }

    public int getPublished(){
        return this.published;
    }

    public static void main(String[] args){
        HashMap<String, Book> directory= new HashMap<>();

        Book senseAndSensibility = new Book("Sense and Sensibility", "1811", 1231);
        Book prideAndPrejudice = new Book("Pride and Prejudice", "1813", 12345);

        directory.put(senseAndSensibility.getName(), senseAndSensibility);
        directory.put(prideAndPrejudice.getName(), prideAndPrejudice);

        Book book = directory.get("Pride and Prejudice");
//        System.out.println(book.getContent());

        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", senseAndSensibility);
        hashmap.put("prejudice", prideAndPrejudice);

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }


}
