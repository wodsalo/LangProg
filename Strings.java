class Strings {
	public static void main(String[] args) {
		String str = new String("Строка номер один");
		String str2 = new String(str);
		String str3 = "Строка номер три";
		
		System.out.println(str + " " + str2 + " " + str3);

		//Методы, работающие со строками
		//1. Проверка на эквивалентность boolean equals(str)
		boolean eq;
		eq = str.equals(str2);
		System.out.println("Строки str и str2 эквивалентны: " + eq);
		eq = str.equals(str3);
		System.out.println("Строки str и str3 эквивалентны: " + eq);
		//2. Метод  определения длины строки int length()
		int length = str.length();
		System.out.println("Длина строки str: " + length);

		//3. Извлечение символа по индексу char charAt(index)
		char ch;
		ch = str.charAt(3);
		System.out.println("В строке str символ под индексом 3: " + ch);
		for(int i=0; i < str.length(); i++)
			System.out.print(str.charAt(i));
		System.out.println();

		System.out.println();
		//4. Сравнение строк
		int result;
		result = str.compareTo(str2);
		System.out.println("Результат сравнения строк str и str2: " + result);
		result = str.compareTo(str3);
                System.out.println("Результат сравнения строк str и str3: " + result);


		System.out.println();
		//5. Поиск подстроки и вывод индекса по первому вхождению подстроки
		str3 = "од";
		result = str.indexOf(str3);
		System.out.println("Первое вхождение подстроки \"од\" в str: " + result);

		System.out.println();
		//6. Поиск подстроки и вывод индекса по первому вхождению подстроки
		str3 = "н";
		result = str.lastIndexOf(str3);
                System.out.println("Последнее вхождение подстроки \"н\" в str: " + result);
		str3 = "три";
                result = str.lastIndexOf(str3);
                System.out.println("Первое вхождение подстроки \"три\" в str: " + result);

		//Массивы строк
		System.out.println();
		String[] strs = {"Разные", "элементы", "массива", "строк", str};
		System.out.println("Исходный массив: ");
		for(String s : strs)
			System.out.print(s + " ");
		System.out.println("\n");
		strs[1] = "изменённые элементы";
		strs[4] = "Новая строка один";
		System.out.println("Изменённый массив: ");
                for(String s : strs)
                        System.out.print(s + " ");
                System.out.println("\n");

		//Создание подстроки
		String substr;
		System.out.println("Выделяем подстроку из строки str: ");
		substr = str.substring(13, 17); 
		System.out.println("Оригинальная строка: " + str);
		System.out.println("Подстрока: " + substr);

		//Управление оператором switch при помощи строк
		String command = "can";
		switch(command) {
			case "connect":
				System.out.println("Подключение");
				break;
			case "cancel":
				System.out.println("Отмена");
				break;
			case "disconnect":
				System.out.println("Отключение");
				break;
			default:
			System.out.println("Неизвестная команда");
			break;


		}

		System.out.println();

		//Текстовые блоки
		String strblk = """
			Пример блока с нестандартным форматированием строк.Можно пользоваться переносом строки, табуляцией и прочим управляющим символами.
			""";
		System.out.println(strblk);
		
		//Аргументы командной строки
		System.out.println("Количество параметров, переданных программе: " + args.length);
		System.out.println("Список параметров: ");
		for (int i=0; i<args.length; i++)
			System.out.println("Аргумент[" + i + "]: " + args[i]);
		System.out.println();

		String[][] phoneNumbers = {
			{"Авторемонт", "383-262-25-01"},
			{"Деканат", "244-85-10"},
			{"Поликлиника", "353-01-02"},
			{"Сантехник", "206-08-11"}
		};
		int i2;
		if(args.length != 1)
			System.out.println("Usage: java Strings <наименование>");
		else {
			for(i2=0; i2<phoneNumbers.length; i2++) {
				if(phoneNumbers[i2][0].equals(args[0])) {
					System.out.println(phoneNumbers[i2][0] + ": " + phoneNumbers[i2][1]);
					break;
				}
			}
			if(i2==phoneNumbers.length)
				System.out.println("Ничего не найдено");

		}
	}
}

