package test1;

import java.util.HashMap;
import java.util.Map;

public class ShoeTest {
    Api api;
    public ShoeTest(){
        api = new Api();
    }
    public void run(){
        System.out.println(popShoeSize());
        System.out.println(popName());
    }
    public String popName(){
        HashMap<String,Integer> map = new HashMap<>();
        int listSize = api.listSize();
        int shoeSize = popShoeSize();
        for (int i = 0; i<listSize;i++){
            if(api.getShoe(i)==shoeSize){
                String name = api.getName(i);
                if(!map.containsKey(name)){
                    map.put(name,1);
                }else {
                    int temp = map.get(name);
                    temp++;
                    map.put(name,temp);
                }
            }
        }
        String popName = "";
        int numb = 0;
        boolean distinct = true;
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue()>numb){
                distinct = true;
                popName = entry.getKey();
                numb = entry.getValue();
            }else if(entry.getValue()==numb){
                distinct = false;
            }
        }//numb == 1 && map.size()>1
        if(!distinct){
            return "";
        } return popName;
    }

    public int popShoeSize(){
        HashMap<Integer,Integer> map = new HashMap<>();
        int listSize = api.listSize();

        for (int i = 0; i<listSize;i++){
            int shoeSize = api.getShoe(i);
            if(!map.containsKey(shoeSize)){
                map.put(shoeSize,1);
            }else {
                int temp = map.get(shoeSize);
                temp++;
                map.put(shoeSize,temp);
            }
        }

        int popSize = -1;
        int numb = 0;
        boolean distinct = true;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>numb){
                distinct = true;
                popSize = entry.getKey();
                numb = entry.getValue();
            }else if(entry.getValue()==numb){
                distinct = false;
            }
        }//numb == 1 && map.size()>1
        if(!distinct){
            return -1;
        } return popSize;
    }
}
