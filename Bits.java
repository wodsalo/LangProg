import java.util.Random; 
class Bits { 
    public static void main(String[] args) { 
        class ShowBits{ 
            int numbits; 
            ShowBits(int n){ 
            numbits = n; 
        } 
            void show(long val){ 
                long mask = 1; 
                //сдвиг влево значения 1 
                mask <<= numbits-1; 
                int spacer = 0; 
                for(;mask!=0;mask >>>=1){ 
                    if((val&mask)!=0) System.out.print("1"); 
                    else System.out.print("0"); 
                    spacer++; 
                    if((spacer % 8) == 0){ 
                        System.out.print(" "); 
                        spacer = 0; 
                    } 
                } 
                System.out.println(); 
            } 
        } 
            for(byte b = -128;b<127;b++){ 
                ShowBits byteval = new ShowBits(8); 
                System.out.println(b + " в двоичном виде: "); 
                byteval.show(b);    
        } 
    } 
} 
/*class bits2 { 
    public static void main(String[] args) { 
        Random rand = new Random(); 
        //сброс 6-го бита, изменение регистра латиницы 
        char ch; 
        System.out.println("Преоброзование букв из нижнего в верхний"); 
        for(int i = 0;i<26;i++){ 
            ch = (char)('a' + i); 
            System.out.print(ch + " "); 
            ch = (char)((int) ch & 65503); 
            System.out.println(ch); 
        } 
        System.out.println(); 
 
 
        //отображение числа в двоичной форме 
        int t; 
        byte val; 
        val = 32; 
        for(t=val;t>0;t=t/2){ 
            if((val&t)!=0)  
                System.out.print("1 "); 
            else System.out.print("0 "); 
        } 
        System.out.println("\n"); 
 
        //Преобразование букв из верхнего регистра в нижний 
        System.out.println("Преоброзование букв из верхнего регистра в нижний"); 
        for(int i = 0;i<26;i++){ 
            ch = (char)('A' + i); 
            System.out.print(ch + " "); 
            ch = (char)((int) ch | 32); 
            System.out.println(ch); 
        } 
 
        System.out.println(); 
        //Шифрование сообщения при помощи операции "Исключаизее ИЛИ" 
        String msg = "Незашифрованная строка"; 
        String encmsg = ""; 
        String decmsg = ""; 
        int key = rand.nextInt(127); 
        System.out.println("Ключ: " + key); 
        System.out.println("Исодное сообщение: " + msg); 
 
        //шифрование 
        for(int i = 0; i<msg.length();i++) 
            encmsg = encmsg + (char)(msg.charAt(i)^key); 
        System.out.println("Закодированное сообщение: " + encmsg); 
 
        //расшифрование 
        for(int i = 0; i<msg.length();i++) 
            decmsg = decmsg + (char)(encmsg.charAt(i)^key); 
        System.out.println("Декоддированое сообщение: " + decmsg); 
 
        System.out.println(); 
 
        //операция "побитовое НЕ" 
        byte b = -34; 
        for(int t2=128;t2>0;t2=t2/2){ 
            if((b&t2)!=0)  
                System.out.print("1 "); 
            else System.out.print("0 "); 
        } 
        System.out.println(); 
        b = (byte) ~b; 
        for(int t2=128;t2>0;t2=t2/2){ 
            if((b&t2)!=0)  
                System.out.print("1 "); 
            else System.out.print("0 "); 
        } 
        System.out.println(); 
 
        //побитовый сдвиг 
        int val2 = 1; 
        for(int i=0;i<8;i++){ 
            for(int t2=128;t2>0;t2=t2/2){ 
                if((val2&t2)!=0)  
                    System.out.print("1 "); 
                else System.out.print("0 "); 
            } 
            System.out.println(); 
            val2 = val2 << 1;//сдвиг влево 
        } 
        System.out.println(); 
        for(int i=0;i<8;i++){ 
            for(int t2=128;t2>0;t2=t2/2){ 
                if((val2&t2)!=0)  
                    System.out.print("1 "); 
                else System.out.print("0 "); 
            } 
            System.out.println(); 
            val2 = val2 >> 1;//сдвиг влево 
        }
System.out.println(); 
 
 
        //использование showbits 
        ShowBits b3 = new ShowBits(8); 
        ShowBits i3 = new ShowBits(32); 
        ShowBits li3 = new ShowBits(64); 
 
        System.out.println("Двоичное представление значения 123:"); 
        b3.show(123); 
        System.out.println("Двоичное представление значения 12323:"); 
        i3.show(12323); 
        System.out.println("Двоичное представление значения 123111111111:"); 
        li3.show(123111111111L); 
 
        //операция & 
        //получение модуля числа 
        System.out.println(); 
        int absval; 
        val = -32; 
        absval = val < 0 ? - val : val; 
        System.out.println("val и absval: "+ val+" "+absval); 
 
        //предотвращение деления на 0: 
        System.out.println(); 
         
        int res; 
        for(int i = -5; i < 6; i++){ 
            res = i != 0 ? 100 / i : 0; 
            if(i != 0) 
                System.out.println("100 / " + i + " равно " + res); 
        } 
    } 
} 
*/
