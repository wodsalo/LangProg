//пример обобщенного класса c двумя обобщенными типами
class TwoGen <T, V> {
    T ob1; //обьявление ссылки на обьект обобщенного типа
    V ob2;
    //конструктор
    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }
    //методы для проверки информации об обьектеах
    T getOb1(){
        return ob1;
    }
    V getOb2(){
        return ob2;
    }
    void showType(){
        System.out.println("Тип Т: " + ob1.getClass().getName());
        System.out.println("Тип V: " + ob2.getClass().getName());
    }
}

class  TwoGenDemo {
    public static void main(String[] args) {
        //обьявили переменную класса Gen
        Gen <Integer> iOb;
        //создаем обьект
        iOb = new Gen <Integer> (100);
        //ошибочное использование
        //iOb = new Gen <Integer> (10.0);

        iOb.showType();
        int v = iOb.getOb();
        System.out.println("Значение v: " + v);
        System.out.println();

        //обьявили переменную класса Gen
        Gen <Double> dOb;
        //создаем обьект
        dOb = new Gen <Double> (10.0);
        //ошибочное использование
        //iOb = new Gen <Integer> (10.0);

        dOb.showType();
        double x = dOb.getOb();
        System.out.println("Значение x: " + x);
        System.out.println();



        Gen <String> sOb;
        sOb = new Gen <> ("Hello world!");
        sOb.showType();
        String s = sOb.getOb();
        System.out.println("Значение s: " + s);
        System.out.println();

        //неверное присваивание несовместимых обьектов
        //dOb = iOb;
        TwoGen <Integer, Integer> tgOb;
        tgOb = new TwoGen<>(8,16);
        tgOb.showType();
        int v1 = tgOb.getOb1();
        int v2 = tgOb.getOb2();
        System.out.println("Переменные v1 и v2: " + v1 + " " + v2);
        System.out.println();

        TwoGen <Double, String> tg2Ob;
        tg2Ob = new TwoGen<>(1.8,"Строка");
        tgOb.showType();
        double vd1 = tg2Ob.getOb1();
        String vs2 = tg2Ob.getOb2();
        System.out.println("Переменные vd1 и vs1: " + vd1 + " " + vs2);
        System.out.println();
    }
}
