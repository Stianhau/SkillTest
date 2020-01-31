package test1;

import java.util.ArrayList;

public class Api {

    private ArrayList<Person> list;

    public Api(){
        list = new ArrayList<>();
        list.add(new Person("Stian",45));
        list.add(new Person("Stian",46));
        list.add(new Person("Stian",45));
        list.add(new Person("Stian",45));
        list.add(new Person("Stian",45));
        list.add(new Person("Stian",45));
        list.add(new Person("Stian",45));
        list.add(new Person("Per",45));
        list.add(new Person("Ludvig",42));
        list.add(new Person("Ludvig",42));
        list.add(new Person("Ludvig",42));
        list.add(new Person("Ludvig",42));
        list.add(new Person("Lisa",42));
        list.add(new Person("Stian",42));
    }

    public int listSize(){
        return list.size();
    }
    public int getShoe(int i){
        return list.get(i).size;
    }
    public String getName(int i){
        return list.get(i).name;
    }

    public class Person{
        private final String name;
        private final int size;

        public Person(String name, int size){
            this.name = name;
            this.size = size;
        }
    }
}
