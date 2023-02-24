package tipos;

import java.util.Arrays;
import java.util.Collections;

public class Vetor {

	public static void main(String[] args) {
		
		Integer[] arr = {0,8,2,3,1,5,6,7,4,9};
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		//System.out.println(arr); dessa forma só imprime o hash, pois busca o toString
		
		for(int n:arr) {
			System.out.println(n);
		}
		
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Elemento do indíce " + i + ": " + arr[i]);
		}

	}

}
