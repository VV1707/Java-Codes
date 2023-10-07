//Program to print the largest integer X obtained from a given integer N by removing exactly one digit at a time N.

import java.util.*;
public class Sample1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        String N_str=Integer.toString(N); 
        int largest=0;
        for(int i=1;i<N_str.length();i++){ 
            String subStr=N_str.substring(0,1)+N_str.substring(1, i)+N_str.substring(i + 1);
            int newVal=Integer.parseInt(subStr);
            if(newVal>largest){
                largest=newVal;
            }
        }
        System.out.println(largest);
        sc.close();
    }
}

// Explanation:

// N=15742 
// length=5 index --> 0 to 4
// first digit shouldn't be removed, so consider index --> 1 to 4 only
// for loop iterations:
// 	first iteration i=1 subStr=1++742
//         second iteration i=2 subStr=1+5+42
//         third iteration i=3 subStr=1+57+2
//         forth iteration i=4 subStr=1+574+
