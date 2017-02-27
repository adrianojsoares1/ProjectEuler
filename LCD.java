import java.util.ArrayList;

/**
 * Created by Adriano on 11/29/2016.
 */
public class LCD {

    public static void main(String[] ags) {
        final long startTime = System.nanoTime();
            System.out.println(lcdFinder());
        final long endTime = System.nanoTime();

        System.out.println("Total execution time: " + (endTime - startTime) );
    }
    public static int lcdFinder() {
        ArrayList<Integer> temp = new ArrayList<>();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] primes = {2,3,5,7};

        int div = 0;
        boolean whileMod = true;
        boolean tripper = false;
        while(whileMod)
        {
            for(int i = 0;i<20;i++)
            {
                if(nums[i]%primes[div] == 0){
                    tripper = true;
                    nums[i] = nums[i]/primes[div];}
            }
            if(tripper)
            {
                tripper = false;
                temp.add(primes[div]);
                System.out.println(div + " has been added to the array which now contains " + temp);
            }
            else
            {
                if(div == 3)
                whileMod = false;
                else
                    div++;
            }
        }
        div = 1;
        for(Integer c : temp){div = c*div;}
        for(int c : nums) {
            if (c != 1)
                div *= c;
        }
                return div;
        }
    }
