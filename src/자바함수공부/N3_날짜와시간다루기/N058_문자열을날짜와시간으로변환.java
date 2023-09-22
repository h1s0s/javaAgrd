package 자바함수공부.N3_날짜와시간다루기;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class N058_문자열을날짜와시간으로변환 {

    public static void main(String[] args) {
        //parse()메서드 집합을 사용해 String을 날짜와 시간으로 변환 또는 파싱할 수 있다.
        //날짜와 시간을 String으로 변환할 때는 toString()이나 format()메서드 사용

        //DateTimeFormatter는 날짜-시간을 표현하는 불변 클래스

        //JDK8에 추가된 새 클래스,
        System.out.println(LocalDate.now()); //현재 년월일
        System.out.println(LocalTime.now()); //현재 시간, 초 소숫점 3번째 까지
        System.out.println(LocalDateTime.now()); //현재 달력시스템 표준이 아닌 일시, 초 소숫점 3번째 까지
        System.out.println(ZonedDateTime.now()); //현재 달력시스템 표준인 일시, 초 소숫점 3번째 까지

        LocalDate localDate = LocalDate.parse("2020-06-01"); //문자열을 날짜로 파싱, 시간은 LocalTime을 사용
        System.out.println(localDate);
        //LocalDate, LocalTime 객체는 고정된 포매터를 따라야 함.

        //사용자가 지정한 포매터로 날짜를 파싱하고 싶다면 아래처럼
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        System.out.println(LocalDate.parse("1994.12.02", dateFormatter));
    }
}
