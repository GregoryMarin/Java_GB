package Sem5;

import java.util.*;

public class Tasks_5sem {
    public static void main(String[] args) {
        ex4("Мороз и солнце день чудесный\n" +
                "        Еще ты дремлешь друг прелестный\n" +
                "        Пора красавица проснись.");
    }

    static void passports(){
         /*
        Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
        123456 Иванов
        321456 Васильев
        234561 Петрова
        234432 Иванов
        654321 Петрова
        345678 Иванов
        Вывести данные по сотрудникам с фамилией Иванов.
         */
        Passports passports = new Passports();
        passports.add("123456", "Ivanov");
        passports.add("321456","Vasiliev");
        passports.add("234561", "Petrova");
        passports.add("234432", "Ivanov");
        passports.add("654321", "Petrova");
        passports.add("345678", "Ivanov");

        System.out.println(passports.get("234561"));
        System.out.println();
        System.out.println(passports.getByLastName("Ivanov"));
        System.out.println();
        System.out.println(passports.getAll());
        System.out.println(passports.print());

    }

    static boolean ex2(String s1, String s2){
        /*
        Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
        Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
        повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
        буква может не меняться, а остаться такой же. (Например, note - code)

        Пример 1:
        Input: s = "foo", t = "bar"
        Output: false
        Пример 2:
        Input: s = "paper", t = "title"
        Output: true
         */
        
        if (s1.length() != s2.length()){
            return false;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < c1.length; i++) {
            if (map.containsKey(c1[i])){
                if (c2[i] != map.get(c1[i])){
                    return false;
                }
            }else {
                map.put(c1[i], c2[i]);
            }
        }
        return true;
    }

    static boolean ex3(String line){
        /*
        Написать программу, определяющую правильность расстановки скобок в выражении.
        Пример 1: a+(d*3) - истина
        Пример 2: [a+(1*3) - ложь
        Пример 3: [6+(3*3)] - истина
        Пример 4: {a}[+]{(d*3)} - истина
        Пример 5: <{a}+{(d*3)}> - истина
        Пример 6: {a+]}{(d*3)} - ложь
         */

        Stack<Character> stack = new Stack<>();
        char[] c1 = line.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('<', '>');
        map.put('{', '}');
        for (int i = 0; i < c1.length; i++) {
            if (map.containsKey(c1[i])){
                stack.push(c1[i]);
            }
            if (map.containsValue(c1[i])){
                if (stack.isEmpty() || map.get(stack.pop()) != c1[i]){
                    return false;
                }
            }
            if (c1[i] == ']'){
                if (stack.isEmpty() || stack.pop() != '['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    static void ex4(String line){
        /*
        Взять набор строк, например,

        Мороз и солнце день чудесный
        Еще ты дремлешь друг прелестный
        Пора красавица проснись.

        Написать метод, который отсортирует эти слова по длине с помощью TreeMap.
        Строки с одинаковой длиной не должны “потеряться”.
        */
        line = line.replace(".", "");
        line = line.replace("\n", " ");
        String[] words = line.split(" ");
        Map<Integer, List<String>> map = new TreeMap<>(Comparator.reverseOrder());
        for (String word: words){
            int len = word.length();
            if (map.containsKey(len)){
                List<String> list = map.get(len);
                list.add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(len, list);
            }
        }
        System.out.println(map);
    }
}
