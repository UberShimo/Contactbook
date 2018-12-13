package kontaktbok.klasser;

import java.util.ArrayList;

public class Remove{
    public static void remove(ArrayList<Person> list, Person p){
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(p)) {
                list.remove(i);
                break;
            }
        }
    }

    public static void remove(ArrayList<Person> list, int i){
        list.remove(i);
    }
}