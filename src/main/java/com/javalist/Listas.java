package com.javalist;

import java.util.ArrayList;

import java.util.List;

public class Listas {
    private String [] list = {"lunes","martes","miercoles","jueves","viernes","sabado,","domingo"};
    private List<String>days;


    public Listas(){
     setDays();
    }


    public String[] getList() {
        return list;
    }


    public void setList(String[] list) {
        this.list = list;
    }


    public List<String> getDays() {
        return days;
    }


    public void setDays() {
     days = new ArrayList<String>();


        for (int i = 0; i < list.length; i++){
            this.days.add(list[i]);
            

          
         

        }; 
/*         days = new ArrayList<String>();
        days = Arrays.asList(list); */

 
    }
    
    
}
