import java.util.*;
import java.io.*;
import java.lang.Math;;

public class TempleVisit {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int tests = s.nextInt();
		while (tests > 0) {
			tests--;
			int num = s.nextInt();
			long[] st = new long[num];
 
			int x = 0;
			while (x < num) {
				st[x] = s.nextInt();
				x++;
			}
 
			Arrays.sort(st);
			long minValue = 0;
 
			if (num == 1) {
				System.out.println(st[0]);
				continue;
			}
			else if (num == 2) {
				minValue = st[1];
				System.out.println(minValue);
				continue;
			}
			else if (num == 3) {
				
				minValue += st[0] + st[1] + st[2];
				System.out.println(minValue);
				continue;
			}
		
			if (num % 2 == 0) {
				int endIdx = num - 1;	
				while (endIdx > 1) {
					long min1 = st[1] + st[0] + st[endIdx] + st[1];
					long min2 = st[endIdx] + st[0] + st[endIdx - 1] + st[0];
					minValue += Math.min(min1,min2);
					endIdx -= 2;
				}
				minValue += st[1];
			}
			else {
				int endIdx = num - 1;
				while (endIdx > 2) {
					long min1 = st[1] + st[0] + st[endIdx] + st[1];
					long min2 = st[endIdx] + st[0] + st[endIdx -1] + st[0];
					minValue += Math.min(min1,min2);
					endIdx -= 2;
				}
				minValue += st[0] + st[1] + st[2];
			}
			System.out.println(minValue);
		}
	}


	}


