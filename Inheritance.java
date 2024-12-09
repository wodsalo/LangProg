abstract class TwoDShape {
    private double width;
    private double height;
    final int CONST1 = 1;
    final int CONST2 = 2;
    final int CONST3 = 3;
    String name;
    TwoDShape(double w, double h) {
        if(h>29.7)
            height = 29.7;
        else    
            height = h;
        if(w>21.0)
            width = 21.0;
        else
            width = w;
        name = "Двумерная фигура";
    }
    double getWidth(){
        return width;
    }
    double getHeight(){
        return height;
    }
    void setWidth(double w){
        if(w>21.0)
            width = 21.0;
        else
            width = w;
    }
    void setHeight(double h){
        if(h>29.7)
            height = 29.7;
        else    
            height = h;
    }
    void showDim() {
        System.out.println("Размер фигуры: " + width + " x " + height);
    }
    /*
    double area() {
        System.out.println("Метод должен быть переопределен!");
        return 0.0;
    }
         */
    //метод который должен обязательно переопределится внутри подклассов
    abstract double area();
    abstract void getMsg();
}

class Triangle extends TwoDShape {
    String style;
    Triangle(String s, double w, double h) {
        super(w, h);//вызов конструктора супер класса
        style = s;
        name = "Треугольник";
    }
    double area() {
        return getWidth() * getHeight() / 2;
    }
    void showStyle() {
        System.out.println("Стиль: " + style);
    }
    String showSuperName(){
        return super.name;
    }
    final void getMsg(){
        System.out.println("Сообщнеие от треугольника");
    }
}
class ColorTriangle extends Triangle {
    String color;
    ColorTriangle(String c, String s, double w, double h){
        super(s,w,h); //вызов конструктора Triangle();
        color = c;
        name = "Цветной треугольник";
    }
    void showColor(){
        System.out.println("Цвет " + color);
    }
/*     void getMsg(){
        System.out.println("Сообщение от цветного треугольника");
    }*/
    public String toString(){
        return "Цветной треугольник";
    }
}
class Rectangle extends TwoDShape {
    String outLine;
    Rectangle(String o, double w, double h) {
        super(w, h);//вызов конструктора супер класса
        outLine = o;
        name = "Прямоугольник";
    }
    double area() {
        return getWidth() * getHeight();
    }
    boolean isSquare() {
        return getWidth() == getHeight();
    }
    String showSuperName(){
        return super.name;
    }
    
}
//запрет наследования класса X
final class  X {
    int x = 10;
}
/* 
class Y extends X {
    int y = 20;
}*/

class Inheritance {
    public static void main(String[] args) { 
        TwoDShape fig1; // = new TwoDShape(20.0, 30.0); нельзя создать обьект обстрактного класса
        Triangle t1 = new Triangle("Закрашенный", 4.5, 7.0);
        ColorTriangle t2 = new ColorTriangle("Синий","Контурный", 3.5, 8.0);
        Rectangle r1 = new Rectangle("Сплошная линия", 5.0, 5.0); 
        Rectangle r2 = new Rectangle("Пунктирная линия", 5.0, 7.0);
        System.out.println("Информация об обьектах");
        //System.out.println("fig1: " + fig1.name);
        //fig1.showDim();
        System.out.println("t1: " + t1.name);
        t1.showStyle();
        System.out.println("Площадь: " + t1.area()); 
        System.out.println(t1.showSuperName());//вывод name из super
        System.out.println();
        System.out.println("r1: " + r1.name);
        System.out.println("Квадрат: " + r1.isSquare());
        System.out.println("Площадь: " + r1.area());

        //совместимость переменных родственных классов
        // переменная суперкласса может ссылатся на обьект любого подкласса
        System.out.println();
        //System.out.println("Ширина двумерной фигуры fig1: " + fig1.getWidth());
        //при указании на обьект суперкласса выполнятеся метод суперкласса
        //fig1.area();
        //System.out.println("Имя фигуры: " + fig1.name); System.out.println();

        fig1 = t1;
        System.out.println("Ширина треугольника на который ссылается fig1: " + fig1.getWidth());
        //при указани на обьект подкласа выполняется вычисление площади для него
        System.out.println("Площадь треугольника " + fig1.area());
        System.out.println("Имя фигуры: " + fig1.name); System.out.println();
        fig1.getMsg();

        fig1 = r1;
        System.out.println("Ширина прямоугольника на который ссылается fig1: " + fig1.getWidth());
        //при указани на обьект подкласа выполняется вычисление площади для него
        System.out.println("Площадь прямоугольника " + fig1.area());
        System.out.println("Имя фигуры: " + fig1.name); System.out.println();

        fig1 = t2;
        t2.showColor();
        System.out.println("Площадь цветного треугольника " + fig1.area());
        System.out.println("Имя фигуры: " + fig1.name);
        fig1.getMsg();

        System.out.println((fig1.CONST1 + fig1.CONST2 + fig1.CONST3));
        //изменить переменную final нельльзя
        //fig1.CONST1 = 333;
        //доступ к членам мподкласса для ссылочных переменных закрыт 
        //System.out.println(fig1.style);

        //проверка доступности переменных
        /* 
        System.out.println(fig1.width);
        System.out.println(t1.width); //подкласс имеет доступ к переменным и методам суперкласса
        System.out.println(fig1.style);//супер класс не имеет доступа к переменным описаных в подклассе
        */   
        //использлванеие класса Object
        Object obj1;
        System.out.println(t1.getClass());
        System.out.println(t2.getClass());
        System.out.println("Обьекты t1 и t2 эквивалентны: " + t1.equals(t2));
        System.out.println("Хэш-код для t1 и t2: " + t1.hashCode() + t2.hashCode());
        System.out.println("Описания для t1 и t2: " + t1.toString() + t2.toString());
        t1 = t2;
        System.out.println("Обьекты t1 и t2 эквивалентны: " + t1.equals(t2));


        /* 
        float n1 = 0x7F7FFFFF;
        int i1 = (int)n1;
        System.out.println(i1);
        System.out.println((int)n1);
        */

    }
}
