package algorithim;

import java.io.File;
import java.util.Scanner;

public class roadsandlibraries {

	static int roadsAndLibraries(int noOfCities, int c_lib, int c_road,
			int[][] cities) {
		int totalCost = 0;
		if (c_lib > c_road) {

		}

		totalCost = noOfCities * c_lib;
		return totalCost;
		
	}

	public static void main(String[] args) {
		String filename = "/Users/saravananrajan/git/hackerrank/sar/testdata/algorithim/roadsandlibs";
		File inpfile = new File(filename);

		Scanner in;
		try {
			in = new Scanner(inpfile);
			int q = in.nextInt();
			for (int a0 = 0; a0 < q; a0++) {
				int noOfCities = in.nextInt();
				int noOfRoads = in.nextInt();
				int c_lib = in.nextInt();
				int c_road = in.nextInt();
				int[][] cities = new int[noOfRoads][2];
				for (int cities_i = 0; cities_i < noOfRoads; cities_i++) {
					for (int cities_j = 0; cities_j < 2; cities_j++) {
						cities[cities_i][cities_j] = in.nextInt();
					}
				}
				int result = roadsAndLibraries(noOfCities, c_lib, c_road,
						cities);
				System.out.println(result);
			}

			in.close();
		} catch (Exception e) {
		}

	}

}

//	1	2	
//1	1	2	
//2	3	1	
//3	2	1	