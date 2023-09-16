package Notebook;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();

        laptops.add(new Laptop("HP", 8, 1000, "Windows 10", "Green"));
        laptops.add(new Laptop("Apple", 8, 512, "MacOS", "Silver"));
        laptops.add(new Laptop("Lenovo", 8, 2000, "Windows 10", "Grey"));
        laptops.add(new Laptop("Dell", 8, 500, "Linux", "Black"));
        laptops.add(new Laptop("Asus", 16, 100, "Windows 10", "Red"));

        filterLaptops(laptops);
    }

    static void filterLaptops(Set<Laptop> laptops){
        Map<String, String> criteria = new HashMap<>();
        criteria.put("1", "ОЗУ");
        criteria.put("2", "Объем ЖД");
        criteria.put("3", "Операционная система");
        criteria.put("4", "Цвет");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру соответствующую необходимому критерию: ");
        System.out.println("1, ОЗУ");
        System.out.println("2, Объем ЖД");
        System.out.println("3, Операционная система");
        System.out.println("4, Цвет");

        String userInput = scanner.nextLine();

        if (criteria.containsKey(userInput)){
            String selectCriteria = criteria.get(userInput);
            System.out.println("Введите минимально значение для " + selectCriteria + ":");
            String minValue = scanner.nextLine();

            Set<Laptop> filteredLaptops = new HashSet<>();
            switch (selectCriteria) {
                case "ОЗУ":
                    int minRam = Integer.parseInt(minValue);
                    for (Laptop laptop : laptops) {
                        filteredLaptops.add(laptop);
                    }
                    break;
                case "Объем ЖД" :
                    int minHddSize = Integer.parseInt(minValue);
                    for (Laptop laptop: laptops){
                        if (laptop.getHddSize() >= minHddSize){
                            filteredLaptops.add(laptop);
                        }
                    }
                    break;
                case "Операционная сиистема" :
                    for (Laptop laptop: laptops){
                        if (laptop.getOs().equalsIgnoreCase(minValue)){
                            filteredLaptops.add(laptop);
                        }
                    }
                    break;
                case "Цвет" :
                    for (Laptop laptop: laptops){
                        if (laptop.getColor().equalsIgnoreCase(minValue)){
                            filteredLaptops.add(laptop);
                        }
                    }
                    break;
                default:
                    System.out.println("Некорректный ввод критерия!");
                    return;
            }
            if (filteredLaptops.isEmpty()){
                System.out.println("Ноутбуки, удовлетворяющие условиям фильтрации, не найдены.");
            }else {
                for (Laptop laptop: filteredLaptops){
                    System.out.println(laptop);
                }
            }
        }
        else {
            System.out.println("Некорректный ввод");
        }
    }
}
