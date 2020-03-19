package project01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class workout {

	public static void main(String[] args) {
			
			//해당 루틴이 끝날때 무게 조회할때 사용
		
		
		
			//주당 운동 횟수
			int workday = 3;
			int workroutine[] = {1,2};
			String start = "2020-03-12";
			String end = "2020-07-12";
			String paramdate = "2020-05-07";
			int max = 0;
			double startWeight = 10;
			double plusWeight = 2.5;
			int failnum = 1;

			
				for(int i=0;i<workroutine.length;i++) {
				    if(max<workroutine[i]) {
					max = workroutine[i];
				    }
				}
				try {
					SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
					Date beginDate = formatter.parse(start);
					Date paramDate = formatter.parse(paramdate);
					
					// 시간차이를 시간,분,초를 곱한 값으로 나누면 하루 단위가 나옴
					long diff = paramDate.getTime() - beginDate.getTime();
					long diffDays = diff / (24 * 60 * 60 * 1000);
					double eeee= (double)workday/max;
					double week = diffDays / 7;
					System.out.println("eeee" + eeee);
					double workday1 =  week * eeee;
	
//					System.out.println((double)workday/max);
//					int maxday = (int) (diffDays / max)-failnum;
//					System.out.println(maxday);
					startWeight += workday1*plusWeight;
					
					System.out.println("날짜차이=" + diffDays);
					System.out.println("한 루틴을 몇번 실행할까요?" + workday1);
					System.out.println("루틴 끝나면 무게 : " + startWeight);
					
					
					
				} catch (ParseException e) {
					e.printStackTrace();
				}
			
//		System.out.println("무게 :" + startWeight);
	}

}
