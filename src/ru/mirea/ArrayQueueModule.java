package ru.mirea;

import java.util.Arrays;
import java.util.Random;

public abstract class ArrayQueueModule {
    private static int [] queue_mass;
    private static  int elements=0;
    private static  int begin;
    private static int end;


    static void ArrayQueueModuleConstructor(int quantity){
        queue_mass=new int[quantity];
        begin=-1;//начало очереди. Обновляется при извлечении poll
        end=-1; //конец очереди. Обновляется при добавление add
    }



    public  static  void generate(){
        Random rand= new Random();
        while(!isFull()){
            add(Math.abs(rand.nextInt())%1000);
        }
    }

    public static  void add(int element){
        //переполнение
        if(!isFull()) {

            end = (end + 1) % queue_mass.length;
            queue_mass[end % queue_mass.length] = element;
        }
        else{
            System.out.println("Чёт вроде места нет");
        }
    }
    public static  int poll(){
        elements--;
        begin=(begin+1)%queue_mass.length;
        return queue_mass[begin];
    }

    public static  void del(){
        elements--;
        begin=(begin+1)%queue_mass.length;
    }

    public static  boolean isFull(){
        if(elements!=queue_mass.length) return false;
        else return true;
    }
    public static  boolean isEmpty(){
        if(elements==0) return true;
        else return false;
    }
    public  static boolean deleteQueue(){
        queue_mass=new int[queue_mass.length];
        begin=-1;//начало очереди. Обновляется при извлечении poll
        end=-1; //конец очереди. Обновляется при добавление add
        return true;

    }
    //    public int peek(){
//        return queue_mass[pointer--];
//    }
    public static  int quantityElements(){
        return elements;
    }



    // peek //просто элемент посмотреть
    // poll извлекаем


}
