package test2;

public class TemperatureTest {
    Api api;
    int endDay = -1;
    int startDay = -1;
    int minTemp = -1000;
    int maxTemp = -1000;

    public TemperatureTest(Api api) {
        this.api = api;
    }

    public void findStartAndEndDay()throws Exception{
        int amountOfDays = api.getAmountOfDays();

        int currMinTemp =api.getTemperatureOnDay(0);
        int currMaxTemp = api.getTemperatureOnDay(0);

        //maxTemp and minTemp are used for testing
        maxTemp = currMaxTemp;
        minTemp = currMinTemp;

        int end = 0;
        int currStart = 0;
        int start = 0;
        int count = 1;
        int maxCount = 1;


        for(int i = 1; i< amountOfDays;i++){
            int temp = api.getTemperatureOnDay(i);
            currMinTemp = Math.min(currMinTemp, temp);
            currMaxTemp = Math.max(currMaxTemp,temp);
            if(currMaxTemp-currMinTemp>5){
                if(count>maxCount){
                    start = currStart;
                    maxCount = count;
                    end = i-1;
                }
                currStart = i;
                count = 1;
                currMaxTemp = temp;
                currMinTemp = temp;
            }else {
                count++;
                maxTemp = currMaxTemp;
                minTemp = currMinTemp;
            }
        }
        if(count>maxCount){
            start =currStart;
            end = amountOfDays-1;
            maxTemp = currMaxTemp;
            minTemp = currMinTemp;
        }
        endDay = end;
        startDay = start;
    }

    public int GetEndDay()throws Exception {
        if(endDay == -1){
            findStartAndEndDay();
        }
        return endDay;
    }
    public int GetStartDay()throws Exception{
        if(startDay == -1){
            findStartAndEndDay();
        }
        return  startDay;
    }

    public int getMinTemp()throws Exception {
        if(minTemp == -1000){
            findStartAndEndDay();
        }
        return minTemp;
    }

    public int getMaxTemp()throws Exception {
        if(maxTemp == -1000){
            findStartAndEndDay();
        }
        return maxTemp;
    }
}
