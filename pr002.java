class pr002 {
	public static void main(String args[])
       			throws java.io.IOException {
		int intg = 10, intgr = 20;
		char ch, answer = 'R';
		System.out.println("Попробуйте угадать символ");
		ch = (char) System.in.read();
		if (ch == answer)
			System.out.println("Угадали букву");
		else {
			System.out.print("Нужная буква по алфавиту ");
			if (ch > answer)
				System.out.println("ниже, чем указанная");
			else
				System.out.println("выше, чем указанная");
		}
		boolean bool = true;
	
		//int i;
		for(int i=0; i<10; i++)
		       switch(i) {
		       		case 0:
			 		System.out.println("i = 0");	
					break;
				case 1:
					System.out.println("i = 1");
					break;	
				case 2:
				  	System.out.println("i = 2");
					break;
				case 3:
					System.out.println("i = 3");
					break;
				case 4:
					System.out.println("i = 4");	
					break;

				default:
					System.out.println("i = 5 или больше 5");

		       }
		if (bool)
			System.out.println("bool равен true");
		else
			System.out.println("bool равен false");
	}
}