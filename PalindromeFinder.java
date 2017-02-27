import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by soaresad on 12/24/2016.
 */
public class PalindromeFinder {
    public static ArrayList<Integer> palins(int lbound,int ubound)
    {
        String result = "";
        int endAt = 900;
        ArrayList<Integer> x = new ArrayList<>();
        for(int i = 900;i<=999;i++) {
            for(int j = endAt;j<999;j++) {
                result = "" + (i*j);
                if (reverse(result).equals(result)){
                    x.add(Integer.parseInt(result));
                    ;System.out.println("L: " + i + " H: " + i + " = " + result);}
            }
            endAt++;
        }
        return x;
    }
    public static String reverse(String s)
    {
        String temp =  "";
        for(int i = s.length()-1;i>=0;i--)
        {
            temp += s.charAt(i);
        }
        return temp;
    }
    public static void main(String[] ags) {
        ArrayList<Integer> palindrones;
        palindrones = palins(100,1000);
        int max = 0;
        for(Integer c : palindrones)
        {
            if(c > max)
                max = c;
        }
        System.out.println(max);
    }
}
