package d5_duration;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Test {
    public static void main(String[] args) {
        //定义高考时间
        String CollegeEntranceExaminationTime = "2025:11:08 09:30:00";
        //格式化时间
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy:MM:dd HH:mm:ss");
        LocalDateTime endTime = LocalDateTime.parse(CollegeEntranceExaminationTime, dtf);
        //获取当前时间
        LocalDateTime nowTime = LocalDateTime.now();
        //计算间隔时间
        Duration duration = Duration.between(endTime, nowTime);
        long j = ChronoUnit.YEARS.between(endTime, nowTime);
        int i = endTime.compareTo(nowTime);
        if( i <= 0 ){
            System.out.println("已经过去"+j+"年"+duration.toDays()+"天"+duration.toHoursPart()+"小时"+duration.toMinutesPart()+"分钟"+duration.toSecondsPart()+"秒");
        }else {
            System.out.println("还剩下"+duration.toDays()+"天"+duration.toHoursPart()+"小时"+duration.toMinutesPart()+"分钟"+duration.toSecondsPart()+"秒");
        }
    }
}
