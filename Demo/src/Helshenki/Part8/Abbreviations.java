package Helshenki.Part8;

import java.util.HashMap;

public class Abbreviations {

    private String abbreviation;

    private String explanation;

    private HashMap<String, String> manage;

    public Abbreviations(String abbreviation, String explanation){
        this.abbreviation = abbreviation;
        this.explanation = explanation;
    }

    public Abbreviations(){
        manage = new HashMap<>();
    }

    public String getAbbreviation(){
        return this.abbreviation;
    }

    public String getExplanation(){
        return this.explanation;
    }

    public void setAbbreviation(String abbreviation){
        this.abbreviation = abbreviation;
    }

    public void setExplanation(String explanation){
        this.explanation = explanation;
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        manage.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String part){

        if(manage.containsKey(part)){
            return true;
        }

        return false;
    }

    public String findExplanationFor(String part){
        return this.manage.get(part);
    }

    public static void printKeys(HashMap<String, String> hashmap){
        for (String keys: hashmap.keySet()){
            System.out.println(keys);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text){
        for (String keys: hashmap.keySet()){
            if(keys.contains(text)){
                System.out.println(text);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String values : hashmap.keySet()) {
            if (values.contains(text)) {
                System.out.println(hashmap.get(values));
            }
        }
    }

    public static void printValues(HashMap<String, Book> hashMap){
        for(Book books: hashMap.values()){
            System.out.println(books.getContent());
        }
    }

    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text){
        for(Book books: hashmap.values()){
            if(books.getName().contains(text)){
                System.out.println(books.getContent());
            }
        }
    }

    public static void main(String [] args){
        Abbreviations abbreviations = new Abbreviations();

        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String partsOfText: text.split(" ")){

            if(abbreviations.hasAbbreviation(partsOfText)){
                partsOfText = abbreviations.findExplanationFor(partsOfText);
            }
            System.out.print(partsOfText);
            System.out.print(" ");
        }


        //Print me my hashmap
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");

        //Print me another hashmap
    }
}


