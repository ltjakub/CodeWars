public class HumanReadableTime {
    public static void main(String[] args) {
        String result = makeReadable(3598);
        System.out.println(result);
    }
    public static String makeReadable ( int seconds){
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int timeInSeconds = seconds - hours * 3600 - minutes * 60;


        return (hours < 10 ? "0" + hours : hours)
                + ":" +
                (minutes < 10 ? "0" + minutes : minutes)
                + ":" +
                (timeInSeconds < 10 ? "0" + timeInSeconds : timeInSeconds);
    }
}
