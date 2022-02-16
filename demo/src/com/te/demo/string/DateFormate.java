package com.te.demo.string;

public class DateFormate {
	static int Minvalid_yr=2000;
	
	static int Maxvalid_yr=3000;
	public static String date(int d,int m, int y) {
		if(y<Minvalid_yr || y>Maxvalid_yr) {
			return "Invalid year";
		}
		if(m <1 || m >12) {
			return "Invalid month";
		}
		if(d <1 || m >31) {
			return "Invalid day";
		}
		return "valid";
	}

}
