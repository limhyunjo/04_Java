package test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {

 

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
   
	List<IPInfo> ipInfoList=  new ArrayList();;
	ipInfoList.add(new IPInfo("123.123.123.123", "홍길동"));
	ipInfoList.add(new IPInfo("177.233.111.222", "고등어"));
	ipInfoList.add(new IPInfo("177.233.111.222", "고길순"));
	
	System.out.print("ip 입력 :");
	
	String ip = sc.next();
	
	for(int i=0; i < ipInfoList.size(); i++) {
		
		
		
		if(ipInfoList.get(i).getIp().equals(ip)) {
			System.out.println(ipInfoList.get(i));
			
			return;
		}
		
	 }
	System.out.println("일치하는 ip 사용자가 없습니다.");
	}
}

