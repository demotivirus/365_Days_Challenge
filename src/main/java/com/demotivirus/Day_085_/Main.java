package com.demotivirus.Day_085_;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer(5L, "Mahram Buji", "Java Developer");
        Manager manager = new Manager(111L, "Miriam Kays", "Super blond manager)))");
        CompanyDirector composite = new CompanyDirector();
        composite.add(developer);
        composite.add(manager);

        System.out.println(composite);
    }
}
