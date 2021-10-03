package geeko;

import java.util.ArrayList;

public class Non_repeating_element {
	
private static String end;
//	// Find 2 non repeating element in an array using bitwise operator
//	I/p- [1,5,8,6,5,1,6,2]
//	O/p- 8,2
	
	public static void main(String args[]) {
		
		int[] arr= {1,5,8,6,5,1,6,2};
		int n=arr.length;
		System.out.println("Method-1");
		method1(arr);
		System.out.println("Method-2 ");
		
		UniqueNumbers2(arr,n);
		
	}
	public static void method1(int[] arr) {
		int flag=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i!=j) {
					if((arr[i]^arr[j])==0) {          // using XOR operator
						flag=1;
						break;
					}
					else {
						flag=0;
					}
				}
			}
			if(flag==0) {
				System.out.print(arr[i]+" ");
			}
			
			
		}
	}
	
	public static void UniqueNumbers2(int[] arr, int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++) {
 
            // Xor  all the elements of the array
            // all the elements occurring twice will
            // cancel out each other remaining
            // two unique numbers will be xored
            sum = (sum ^ arr[i]);
        }
 
        // Bitwise & the sum with it's 2's Complement
        // Bitwise & will give us the sum containing
        // only the rightmost set bit
        sum = (sum & -sum);
 
        int sum1 = 0;
        int sum2 = 0;
 
        for (int i = 0; i < arr.length; i++) {
 
            // Bitwise & the arr[i] with the sum
            // Two possibilities either result == 0
            // or result > 0
            if ((arr[i] & sum) > 0) {
 
                // if result > 0 then arr[i] xored
                // with the sum1
                sum1 = (sum1 ^ arr[i]);
            }
            else {
                // if result == 0 then arr[i]
                // xored with sum2
                sum2 = (sum2 ^ arr[i]);
            }
        }
 
        // print the the two unique numbers
        System.out.println("The non-repeating elements are "
                           + sum1 + " and " + sum2);
    }

}
