package ru.mirea.task4.task4_1;
public class Main {
    public static void main(String[] args) {
        Seasons season1 = Seasons.SUMMER;
        ILoveSeason(season1);
        for (Seasons season: Seasons.values()) {
            System.out.println(season.toString() + " " + season.getAvgTemp() + " " + season.getDescription());
        }
    }

    public static void ILoveSeason(Seasons season) {
        System.out.print("I love ");
        switch (season) {
            case AUTUMN:
                System.out.println("autumn");
                break;
            case SPRING:
                System.out.println("spring");
                break;
            case SUMMER:
                System.out.println("summer");
                break;
            case WINTER:
                System.out.println("winter");
                break;
        }
    }
}
