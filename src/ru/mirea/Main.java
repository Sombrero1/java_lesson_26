package ru.mirea;



public class Main {

    public static void main(String[] args) {
	// write your code here
        Queue first=new Queue(10);
        first.add(3);
        first.add(5);
        first.add(6);

        System.out.println(first);
        System.out.println(first.poll());
        System.out.println(first.poll());
        System.out.println("--------------------");

        ArrayQueueModule.ArrayQueueModuleConstructor(10);
        System.out.println(ArrayQueueModule.class);
        ArrayQueueModule.add(3);
        ArrayQueueModule.add(5);
        ArrayQueueModule.add(6);
        System.out.println(ArrayQueueModule.poll());
        System.out.println(ArrayQueueModule.poll());
        System.out.println("--------------------");

        ArrayQueueADT b=new ArrayQueueADT();
        System.out.println(b.getClass());
        ArrayQueueADT.ArrayQueueADTConstructor(b,10);
        b.add(b,3);
        b.add(b,5);
        b.add(b,6);
        System.out.println(b.poll(b));
        System.out.println(b.poll(b));


        System.out.println("--------------------");

        Queue_list g=new Queue_list(5);
       g.add(3);
        System.out.println(g);
       g.add(5);
        System.out.println(g);
       g.add(6);
        System.out.println(g);
       System.out.println(g.poll());
       System.out.println(g.poll());
       System.out.println(g.poll());
       System.out.println(g);




    }
}
