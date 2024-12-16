//пример обобщенного класса
class Gen <T> {
    T ob; //обьявление ссылки на обьект обобщенного типа
    
    //конструктор
    Gen(T o) {
        ob = o;
    }
    //методы для проверки информации об обьектеах
    T getOb(){
        return ob;
    }
    void showType(){
        System.out.println("Тип Т: " + ob.getClass().getName());
    }
}

class  GenDemo {
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
    }
}
