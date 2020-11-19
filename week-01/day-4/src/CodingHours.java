public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        long hour = 6;
        long day = 5;
        long week = 17;

        long weekdays = week * day;
        long hoursspend = weekdays * hour;
        System.out.println(hoursspend);

        long avworkh = 52;
        double pec = (double) 100 * (hour * day) / avworkh;
        long pecint = (int) pec;
        System.out.println(pecint + "%");

    }
}
