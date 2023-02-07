package nivi.org.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
	
		public static void main(String[] args) {
//			int[] x = {2,6,8,5};
//			int[] x ={1,5,5,2,6};
//			int[] x ={1,1};
//			int x[] = {1,3,6,4,1,2};
//			int x[] = {1,2,3,4,5,6}; //last
//			int x[] = {-1,-2,-5};
//			int x[] = {13,13,1,6};
			int x[] = {100,63,1,6,2,13,10};
//			System.out.println(App.small(x));
			System.out.println(App.solution(6, 13, x));
    
  }
		
		
		public static int soliution(int[] blocks) {
			int count = 1;
			int start = 0;
			for (int i = 1; i < blocks.length-1; i++) {
				if(blocks[i-1]> blocks[i] && blocks[i] < blocks[i+1] ) {
					start = i;
				}
			}
			for (int i = start; i < blocks.length-1; i++) {
				if(blocks[i] <= blocks[i+1]) {
					count++;
				}
			}
			for (int i = start; i > 0; i--) {
				if(blocks[i] <= blocks[i-1]) {
					count++;
				}
			}
			return count;
		}
		
		
	
		
		public static int small(int[] A) {
			Arrays.sort(A);
			int[] array = Arrays.stream(A).filter(x -> x > 0).map(n -> Integer.valueOf(n)).toArray();
			if(array.length == 0) {
				return 1;
			}
			for (int i = 0; i < array.length-1; i++) {
				if(!(array[i+1]-array[i] < 2)) {
					return array[i]+1;
				}
			}
			return array[array.length-1]+1;
			}
		
		static int solution(int X, int Y, int[] A) {
		        int N = A.length;
		        int result = -1;
		        int nX = 0;
		        int nY = 0;
		        for (int i = 0; i < N; i++) {
		            if (A[i] == X)
		                nX += 1;
		            else if (A[i] == Y)
		                nY += 1;
		            if (nX == nY && (A[i] > Math.min(X,Y) && A[i] < Math.max(X,Y)))
		                result = i;
		        }
		        
		        return result;
		    }
		}

