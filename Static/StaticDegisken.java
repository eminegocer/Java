package Static;

public class StaticDegisken {
    public static void main(String args[]) {
        T t1 = new T();
        System.out.println("t1's i= " + t1.i + " and j = " + t1.j);
        T t2 = new T();
        System.out.println("t2's i= " + t2.i + " and j = " + t2.j);
    }
}

class T {
    static int i = 7;
    int j = 0;

    T() {
        i++;
        j = 1;
    }
}
