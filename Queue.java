class Queue {
	char[] q;
	int putloc, getloc;
	Queue(int size) {
		q = new char[size];
		putloc = getloc = 0;
	}

	void put(char, ch) {
		if(putloc == q.length) {
			System.out.println(" - очередь переполнена");
			return;
		}
		q[putloc++] = ch;
	}

	char get() {
		if(getloc == putloc) {
			System.out.println(" - очередь пуста");
			return (char) 0;
		}
		return q[getloc++];
	}

}
class QDemo {
	public static void main(String[] args) {
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		char ch;
		int i;

		System.out.println("Сохраняем алфавит в очередь big Q");
		for(i = 0; i < 26; i++)
			bigQ.put((char) ('A' + i));

		System.out.print("Содержимое очереди bigQ: ");
		for(i = 0; i < 26; i++) {
			ch = bigQ.get();
			if(ch != (char) 0)
				System.out.print(ch);
		}

		System.out.println("\n");
		System.out.println("Сохраняем символы в очередь smallQ");
		for(i = 0; i < 5; i++)
			System.out.print("Попытка сохранения " + (char) ('Z' - i));
			smallQ.put((char) ('Z' - i));
			System.out.println();
		}
		System.out.println();

		System.out.println("Извлекаем символы из очереди smallQ");
		for(i = 0; i < 5; i++) {
                        ch = smallQ.get();
                        if(ch != (char) 0)
                                System.out.print(ch);
                }


	}
}
