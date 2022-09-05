public class SquareDigit {
    public static void main(String[] args) {
        squareDigits(9119);
    }
    public static int squareDigits(int n) {
        String stringedValue = String.valueOf(n);
        int length = stringedValue.length();
        int squaredValue;
        String result = "";
        for (int i = 0; i < length; i++) {
            int value = Integer.parseInt(String.valueOf(stringedValue.charAt(i)));
            squaredValue =  value * value;
            result = result + squaredValue;
        }
        System.out.println(Integer.parseInt(result));
        return Integer.parseInt(result);
    }
}
