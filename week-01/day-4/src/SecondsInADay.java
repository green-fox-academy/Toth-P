public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

       /* int remainingHour = 24 - currentHours;
        int remainingMinutes = 60 - currentMinutes;
        int remainingSeconds = 60 - currentSeconds;

        int remSecOfTheDay = ((remainingHour * 60 * 60) + (remainingMinutes * 60) + (remainingSeconds));
        System.out.println(remSecOfTheDay);
                */
        int remainingSeconds = (24 * 60 * 60) - ((currentHours * 60 * 60) + (currentMinutes * 60) + currentSeconds);
        System.out.println("remaining seconds from a day: " + remainingSeconds);
    }
}
