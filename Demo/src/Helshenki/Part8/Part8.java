package Helshenki.Part8;

import java.util.HashMap;

public class Part8 {

    public static void main(String[] args) {

        //NickNames

        HashMap<String, String> names = new HashMap<>();

        names.put("matthew", "matt");
        names.put("micheal", "mike");
        names.put("arthuer", "artie");
        names.put("matthew", "hey");

        System.out.println(names.get("matthew"));

    }
}
