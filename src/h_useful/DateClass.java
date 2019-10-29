package h_useful;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		
		
		Date today = new Date(); //현재 날짜
		System.out.println(today);
		
		
		//날짜 → 포멧 → 문자열
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");//소문자 m은 minute으로 사용.
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss.sss");
		//H: 24시간 / h: 12시간 기준 / sss: 밀리세컨드 단위
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yy-MM-dd hh:mm:ss a"); //a: 오전이냐 오후냐
		System.out.println("-----------------------");
		
/*		String format = sdf1.format(today); //포멧에 맞는 문자열을 반환해준다.
		System.out.println(format);*/
		
		
		String format = sdf1.format(today);
		//Assign statement to new locate variable = 지역변수로 만들어준다. 리턴타입이 있어서 사용 가능.
		System.out.println(format);
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		System.out.println("-----------------------");

		
		//문자열 → 포멧 → 날짜
		String str = "2019년 10월 16일";
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		try {
			Date dateStr = sdf5.parse(str); //문자열을 분석. 예외처리를 해주어야 함.
			System.out.println(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		System.out.println("-----------------------");
		
		Calendar cal = Calendar.getInstance(); //객체 반환 메소드. 싱클톤 패턴으로 만들어졌다.
		
		
		//날짜 세팅
		cal.setTime(new Date());
		cal.set(2019, 9, 16); //2019/10/16 (월은 0부터 시작)
		System.out.println(sdf3.format(cal.getTime()));
		
		
		//날짜 계산
		cal.add(Calendar.YEAR, 1); //연도를 1 증가시킨다.
		cal.add(Calendar.MONTH, 2); //월을 2 증가시킨다.
		cal.add(Calendar.DAY_OF_MONTH, -3); //일을 3 감소시킨다.
		cal.add(Calendar.HOUR, 2); //2시간을 증가시킨다.
		cal.add(Calendar.MINUTE, 5); //5분 증가시킨다.
		cal.add(Calendar.SECOND, -10); //10초 감소시킨다.
		
		System.out.println(sdf3.format(cal.getTime()));
		
	}

}










