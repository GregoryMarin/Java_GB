package Sem5;

import java.util.HashMap;
import java.util.Map;

public class Passports {
    private Map<String, String> map = new HashMap<>();
    void add(String pasNum, String lastName){
        map.put(pasNum, lastName);
    }

    String get(String passNum){
        return passNum + " " + map.get(passNum);
    }

    String getByLastName(String lastName){
        StringBuilder stringBuilder = new StringBuilder();
        for(Map.Entry<String, String> entry: map.entrySet()){
            if (entry.getValue().equalsIgnoreCase(lastName)){
                stringBuilder.append(entry.getKey());
                stringBuilder.append(": ");
                stringBuilder.append(entry.getValue());
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    String getAll(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry: map.entrySet()){
            stringBuilder.append(entry.getKey());
            stringBuilder.append(": ");
            stringBuilder.append(entry.getValue());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    String print(){
        return map.toString();
    }
}
