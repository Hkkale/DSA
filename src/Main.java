import java.lang.reflect.Constructor;
import java.util.*;


public class Main {
    int x;

    int y;

    String name;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Main main = (Main) o;
        return x == main.x && y == main.y && name.equals(main.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, name);
    }




    public static void main(String[] args) throws Throwable {
        Main m1=new Main();
        m1.x=10;
        m1.name="bala";
        Main m2=new Main();



        System.out.println(m2.hashCode()==m1.hashCode());

        Class<?> clazz= m2.getClass();
       Constructor<?>[] cons= clazz.getConstructors();

        System.out.println(Arrays.toString(cons));





    }






}






















