package 자바함수공부.N3_날짜와시간다루기;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class N059_날짜와시간포매팅 {
    public static void main(String[] args) {
        //y 년도, M 월, W주, E요일, d일, H시, m분, s초, S나노초, z표준시간대명, Z시간대오프셋, V표준시간대id
        //JDK8 이전 버전이면 SimpleDateFormat을 사용하고, 이후는 DateTimeFormatter로 포맷 패턴을 적용한다

        //사용자정의 포매터 적용하는 법. 날짜 - yyyy년 MM월 dd일
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatterLocalDate = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String stringLD = formatterLocalDate.format(localDate);
        System.out.println(stringLD);

        //사용자정의 포매터 적용하는 법. 시간 (간단히) - HH시 mm분 ss초
        String stringLT = LocalTime.now().format(DateTimeFormatter.ofPattern("HH시 mm분 ss초"));
        System.out.println(stringLT);
    }
}
