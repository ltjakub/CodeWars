import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class DirReduction {
    public static void main(String[] args) {
        String[] strings = {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH"};
        String[] resultArray = dirReduc(strings);
        System.out.println(Arrays.toString(resultArray));

    }

    public static String[] dirReduc(String[] arr) {
        ArrayList<String> arrayList = Arrays.stream(arr).collect(Collectors.toCollection(ArrayList::new));
        String previousDirection = "";
        String presentDirection = "";

        for (int i = 0; i < arrayList.size(); i++) {

            previousDirection = presentDirection;
            presentDirection = arrayList.get(i);

            if (previousDirection.equals("NORTH") && presentDirection.equals("SOUTH") ||
                    previousDirection.equals("SOUTH") && presentDirection.equals("NORTH") ||
                    previousDirection.equals("EAST") && presentDirection.equals("WEST") ||
                    previousDirection.equals("WEST") && presentDirection.equals("EAST")) {
                if (arrayList.size() <= 2) {
                    return new String[0];
                }
                arrayList.remove(i);
                arrayList.remove(i - 1);
                i = 0;
                presentDirection = arrayList.get(0);
            }
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }
}
