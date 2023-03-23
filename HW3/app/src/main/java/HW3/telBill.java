package HW3;

public class telBill {
    public String classify(int day, int hour1, int min1, int hour2, int min2) {
        double allMin = (double)(hour2-hour1) * 60 + min2 - min1;
        if (day == 1 &&hour1 == 1 && hour2 == 3) {
            allMin -= 60;
        } else if(day == 2 && hour1 == 2 && hour2 == 2 && min2<min1){
            allMin += 60;
        }
        if(allMin<0 || allMin>30) {
            return "输入时间错误";
        } else if(allMin < 20){
            return Double.toString(allMin * 0.05);
        } else if(allMin >= 20){
            return Double.toString(1.0 + (allMin - 20) * 0.1);
        }
        return "程序运行错误";
    }
}
