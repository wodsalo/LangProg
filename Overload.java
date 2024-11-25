// Демонстрация перегрузки методов
class Overl {
    int s;
    Overl() {
        System.out.println("Внутри конструктора без параметров");
        s = 0;
    }
    Overl(int i) {
        System.out.println("Внутри конструктора с одним целым параметром");
        s = i;
    }
    Overl(double i) {
        System.out.println("Внутри конструктора с одним вещественным параметром");
        s = (int) i;
    }
    Overl(int i, int j) {
        System.out.println("Внутри конструктора с двумя целыми параметрами");
        s = i + j;
    }

    void ovlDemo() {
        System.out.println("Выполнение метода без параметров");
    }

    void ovlDemo(int a) {
        System.out.println("Один параметр типа int: " + a);
    }

    int ovlDemo(int a, int b) {
        System.out.println("Два параметра типа int: " + a + " " + b);
        return a + b;
    }

    double ovlDemo(double a, double b) {
        System.out.println("Два параметра типа double: " + a + " " + b);
        return a + b;
    }

    void f(int x) {
        System.out.println("Внутри f(int): " + x);
    }

    void f(double x) {
        System.out.println("Внутри f(double): " + x);
    }

    void f(byte x) {
        System.out.println("Внутри f(byte): " + x);
    }
}

class Summation {
    int sum;

    Summation(int num) {
        sum = 0;
        for(int i=1; i <= num; i++) {
            sum += i;
            System.out.println(i);
        }
    }

    Summation(Summation ob) {
        sum = ob.sum;
    }
}

class Overload {
    public static void main(String[] args) {
        Overl ob = new Overl();
        int resI;
        double resD;

        System.out.println();

        ob.ovlDemo();
        System.out.println();

        resI = ob.ovlDemo(3, 7);
        System.out.println("Результат выполнения ob.ovlDemo(3, 7): " + resI);
        System.out.println();

        ob.ovlDemo(6);
        System.out.println();

        resD = ob.ovlDemo(3.5, 8.5);
        System.out.println("Результат выполнения resD = ob.ovlDemo(3.5, 8.5): " + resD);

        // Автоматическое преобразование типов при перегрузке
        System.out.println();
        int i = 10;
        double d = 99.9;
        byte b = 30;
        short s = 23;
        float f = 11.2F;
        System.out.println(f);
        System.out.println((double)f);
        ob.f(i);
        ob.f(d);
        ob.f(b);
        ob.f(s);
        ob.f(f);

        System.out.println();
        //Демонстрация перегрузки конструкторов
        //
        Overl t1 = new Overl();
        Overl t2 = new Overl(3);
        Overl t3 = new Overl(25.5);
        Overl t4 = new Overl(5, 7);
        System.out.println("t1.s: " + t1.s);
        System.out.println("t2.s: " + t2.s);
        System.out.println("t3.s: " + t3.s);
        System.out.println("t4.s: " + t4.s);

        System.out.println();

        Summation s1 = new Summation(5);
        Summation s2 = new Summation(s1);

        System.out.println("s1.sum: " + s1.sum);
        System.out.println("s2.sum: " + s2.sum);
        
    }
}
