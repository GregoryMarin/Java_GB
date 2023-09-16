package Sem5;

import java.util.*;

public class MethodsHW {
    private Map<String, List<String>> map = new HashMap<>();

    public void addContact(String name, String phoneNum){
        if (map.containsKey(name.toUpperCase())){
            List <String> lst = map.get(name.toUpperCase());
            lst.add(phoneNum);
        }
        else {
            List<String> list = new ArrayList<>();
            list.add(phoneNum);
            map.put(name.toUpperCase(), list);
        }
    }

    void findByName(String name){
        if (!map.containsKey(name.toUpperCase())){
            System.out.println("Search result: "+name+"  didn`t find in phonebook");
            return;
        }
        System.out.println("Search result: "+name+"\t"+map.get(name.toUpperCase()).toString());
    }
}
