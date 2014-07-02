package com.rbf.ipsort;

public class ipsort {
	private static void ipsort_demo() {
		String ip1 = "10.108.203.50";
		String ip2 = "1.10.3.250";
		String ip3 = "101.18.203.50";
		String ip4 = "193.108.3.50";
		String[] str_ip = new String[4];
		str_ip[0] = ip1;
		str_ip[1] = ip2;
		str_ip[2] = ip3;
		str_ip[3] = ip4;
		int i=0;
		for (String ip : str_ip) {
			ip = ip.replaceAll("(\\d+)", "00$1");
			System.out.println(ip);
			str_ip[i]=ip;
			i++;
		}
		for (String ip : str_ip) { //
			ip = ip.replaceAll("0*(\\d{3})", "$1");
			ip = ip.replaceAll("0*(\\d{3})", "$1");
			System.out.println(ip);
		}
}
	
	public static void main(String[] args){
		ipsort_demo();
	}
}
