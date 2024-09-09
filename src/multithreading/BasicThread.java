package multithreading;




//class A implements Runnable{
//    public void run(){
//        for (int i = 1; i <= 100; i++) {
//
//            System.out.println("kale");
//            try {
//                Thread.sleep(50);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//
//        }
//    }
//}

class B extends Thread{
    public void run(){
        for (int i = 100; i <= 200; i++) {

            System.out.println("Kale");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

public class BasicThread {

    public static void main(String[] args){
        Runnable obj1= () -> {

            {
                for (int i = 0; i <100 ; i++) {
                    System.out.println("Hitendra");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }


                }

            }
        };



        B obj2=new B();
//        System.out.println(obj1.getPriority());
////        obj2.setPriority(Thread.MAX_PRIORITY);
//
//        obj1.start();

        Thread t1=new Thread(obj1);
        t1.start();
        obj2.start();
    }
}
