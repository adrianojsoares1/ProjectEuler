import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by soaresad on 12/13/2016.
 */
public class SieveOfEratosthenes {

    public static ArrayList<Integer> sift(int bound)
    {
        boolean[] sand = new boolean[bound];
        Arrays.fill(sand,true);
        int count;
        for(int i = 2;i<Math.sqrt((double)sand.length);i++)
        {
            count = 0;
            if(sand[i])
                for(int j=i*i;j<sand.length;j = (i*i) +  (i * count))
                {
                    sand[j] = false;
                    count++;
                }
        }
        ArrayList<Integer> primes = new ArrayList<>();
        for(int i = 2;i<sand.length;i++){
            if(sand[i])
                primes.add(i);
        }
        return primes;
    }
    public static long getSum(ArrayList<Integer> x)
    {
        long sum = 0;
        for(Integer c : x)
            sum += c;
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println(getSum(sift(2000000)));

    }

}
