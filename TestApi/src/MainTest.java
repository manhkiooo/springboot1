import java.util.Scanner;

import unitech.esb.dng.api.DNGApiUtil;
import unitech.esb.dng.common.UniConstant;

public class MainTest {

	public static void main(String[] args) {
		int [] arr = {5,9,2,7,3,1,5,4};
		int s = 8;
		int total = 0;
		for(int i = 2; i <= arr.length; i++) {
			for (int ii = 0; ii < arr.length; ii++) {
				if((ii + i) >= arr.length ) {
					break;
				}
				total = 0;
				for(int iii = 1; iii <= i; iii++ ) {
					total += arr[iii+ ii];
				}
				if(total == s) {
					System.out.print("Mang con co tong  = "+ s+ " la mang: ");
					String ds = "";
					for(int iii = 1; iii <= i; iii++ ) {
						ds +=  ds.equals("")? + arr[iii+ ii] : "," + arr[iii+ ii];
					}
					System.out.print("[" +ds+"]");
					break;
					
				}
				if(total == s) break;
			}
			if(total == s) break;
		}
		if(total != s) System.out.println("Ko co mang nao ca");
	}
}
