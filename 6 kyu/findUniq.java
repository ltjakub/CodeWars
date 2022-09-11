public class findUniq {
    public static void main(String[] args) {
       double test = findUniq((new double[]{ 0, 0, 0, 0, 7 }));
        System.out.println(test);
    }
    public static double findUniq(double[] array) {
        double backgroundNumber = 0;
        if(array[0] == array[1])
            backgroundNumber = array[0];
        else if (array[0] == array[2])
            return array[1];
        else
            return array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] != backgroundNumber)
                return array[i];
        }

        return 0;
    }
}
