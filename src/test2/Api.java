package test2;


public class Api {
    private int[] temperature;

    public Api(int[] array){
        temperature = array;
    }

    public int getAmountOfDays(){
        return temperature.length;
    }
    public int getTemperatureOnDay(int i) throws Exception {
        if(i>=0 && i<getAmountOfDays()){
            return temperature[i];
        }else {
            throw new Exception();
        }
    }
}
