package test2;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class UnitTest {

    @Test
    public void correctMinTemp()throws  Exception{
        TemperatureTest temperatureTest = new TemperatureTest(setData(1));
        minTemp(temperatureTest,0);

        temperatureTest = new TemperatureTest(setData(2));
        minTemp(temperatureTest,10);

        temperatureTest = new TemperatureTest(setData(3));
        minTemp(temperatureTest,-2);

        temperatureTest = new TemperatureTest(setData(4));
        minTemp(temperatureTest,0);

        temperatureTest = new TemperatureTest(setData(5));
        minTemp(temperatureTest,28);
    }
    public void minTemp(TemperatureTest temperatureTest, int expected)throws  Exception{
        assertEquals(expected,temperatureTest.getMinTemp());
    }

    @Test
    public void correctMaxTemp()throws  Exception{
        TemperatureTest temperatureTest = new TemperatureTest(setData(1));
        maxTemp(temperatureTest,4);

        temperatureTest = new TemperatureTest(setData(2));
        maxTemp(temperatureTest,10);

        temperatureTest = new TemperatureTest(setData(3));
        maxTemp(temperatureTest,3);

        temperatureTest = new TemperatureTest(setData(4));
        maxTemp(temperatureTest,5);

        temperatureTest = new TemperatureTest(setData(5));
        maxTemp(temperatureTest,31);
    }

    public void maxTemp(TemperatureTest temperatureTest,int expected)throws  Exception{
        assertEquals(expected,temperatureTest.getMaxTemp());
    }

    @Test
    public void maxTemp_Minus_MinTemp_NotMoreThan5()throws  Exception{
        TemperatureTest temperatureTest = new TemperatureTest(setData(1));
        int max = temperatureTest.getMaxTemp();
        int min = temperatureTest.getMinTemp();
        max_minus_min(max,min);

        temperatureTest = new TemperatureTest(setData(2));
        max = temperatureTest.getMaxTemp();
        min = temperatureTest.getMinTemp();
        max_minus_min(max,min);

        temperatureTest = new TemperatureTest(setData(3));
        max = temperatureTest.getMaxTemp();
        min = temperatureTest.getMinTemp();
        max_minus_min(max,min);

        temperatureTest = new TemperatureTest(setData(4));
        max = temperatureTest.getMaxTemp();
        min = temperatureTest.getMinTemp();
        max_minus_min(max,min);

        temperatureTest = new TemperatureTest(setData(5));
        max = temperatureTest.getMaxTemp();
        min = temperatureTest.getMinTemp();
        max_minus_min(max,min);
    }

    public void max_minus_min(int max, int min){
        assertTrue(max-min<=5);
    }


    @Test
    public void returnsCorrectEnd()throws Exception{
        //longest seq at end
        TemperatureTest temperatureTest = new TemperatureTest(setData(1));
        correctEnd(temperatureTest,9);

        //longest longest seq = 1
        temperatureTest = new TemperatureTest(setData(2));
        correctEnd(temperatureTest,0);

        //longest seq middle
        temperatureTest = new TemperatureTest(setData(3));
        correctEnd(temperatureTest,7);

        //entire list
        temperatureTest = new TemperatureTest(setData(4));
        correctEnd(temperatureTest,22);

        //longest seq start
        temperatureTest = new TemperatureTest(setData(5));
        correctEnd(temperatureTest,6);
    }

    public void correctEnd(TemperatureTest temperatureTest, int expected)throws Exception{
        int start = temperatureTest.GetEndDay();
        assertEquals(expected,start);
    }

    @Test
    public void ReturnsCorrectStart() throws Exception {
        //longest seq at end
        TemperatureTest temperatureTest = new TemperatureTest(setData(1));
        correctStart(temperatureTest,6);

        //longest longest seq = 1
        temperatureTest = new TemperatureTest(setData(2));
        correctStart(temperatureTest,0);

        //longest seq middle
        temperatureTest = new TemperatureTest(setData(3));
        correctStart(temperatureTest,3);

        //entire list
        temperatureTest = new TemperatureTest(setData(4));
        correctStart(temperatureTest,0);

        //longest seq start
        temperatureTest = new TemperatureTest(setData(5));
        correctStart(temperatureTest,0);
    }

    public void correctStart(TemperatureTest temperatureTest, int expected)throws Exception{
        int start = temperatureTest.GetStartDay();
        assertEquals(expected,start);
    }

    public Api setData(int i){
        int[] temperature;
        switch (i){
            //start = 6, end = 9;
            case 1:{
                temperature = new int[10];
                temperature[0] = 20;
                temperature[1] = 30;
                temperature[2] = 40;
                temperature[3] = 41;
                temperature[4] = 42;
                temperature[5] = 49;
                temperature[6] = 2;
                temperature[7] = 4;
                temperature[8] = 0;
                temperature[9] = 3;
                break;
            }
            // start = 0, end = 0;
            case 2:{
                temperature = new int[10];
                temperature[0] = 10;
                temperature[1] = 20;
                temperature[2] = 30;
                temperature[3] = 40;
                temperature[4] = 50;
                temperature[5] = 60;
                temperature[6] = 70;
                temperature[7] = 10;
                temperature[8] = 20;
                temperature[9] = 30;
                break;
            }
            //start = 3, end = 7
            case 3:{
                temperature = new int[10];
                temperature[0] = -1;
                temperature[1] = -3;
                temperature[2] = -9;
                temperature[3] = -1;
                temperature[4] = -2;
                temperature[5] = 0;
                temperature[6] = 3;
                temperature[7] = -1;
                temperature[8] = 20;
                temperature[9] = 30;
                break;
            }

            //start = 0, end = 22
            case 4:{
                temperature = new int[23];
                temperature[0] = 1;
                temperature[1] = 2;
                temperature[2] = 3;
                temperature[3] = 2;
                temperature[4] = 1;
                temperature[5] = 4;
                temperature[6] = 0;
                temperature[7] = 0;
                temperature[8] = 2;
                temperature[9] = 5;
                temperature[10] = 2;
                temperature[11] = 1;
                temperature[12] = 3;
                temperature[13] = 1;
                temperature[14] = 1;
                temperature[15] = 1;
                temperature[16] = 1;
                temperature[17] = 2;
                temperature[18] = 3;
                temperature[19] = 4;
                temperature[20] = 0;
                temperature[21] = 1;
                temperature[22] = 2;
                break;
            }

            //UnitTest 10 Start = 0, end = 6
            default:{
                temperature = new int[10];
                temperature[0] = 31;
                temperature[1] = 30;
                temperature[2] = 30;
                temperature[3] = 31;
                temperature[4] = 29;
                temperature[5] = 28;
                temperature[6] = 28;
                temperature[7] = 40;
                temperature[8] = 20;
                temperature[9] = 30;
            }

        }
        return new Api(temperature);
    }
}

