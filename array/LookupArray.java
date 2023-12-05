import java.util.Random;

public class LookupArray {
    public static void main(String[] args) {
        for (int i=0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        String[] dayNames = { "Mon", "Tue", "Wed", "Thu", 
                                "Fri", "Sat", "Sun" };

        System.out.println(dayNames[0]);

        System.out.println(dayNames[0].charAt(0));

        Random rng = new Random();
        System.out.println(dayNames[ rng.nextInt( dayNames.length ) ]);

        for (int i=0; i < dayNames.length; i++) {
            dayNames[i] = dayNames[i].toUpperCase();
        }

        for (int i=0; i < dayNames.length; i++) {
            System.out.println(dayNames[i]);
        }

        int todayNum = 6;

        String tomorrowString = dayNames[(todayNum+14) % 7];

        System.out.println("Today is " + dayNames[todayNum % 7] + 
                            ", tomorrow is " + tomorrowString);
    }
}