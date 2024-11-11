//Пузырьковая сортировк
Class Bubbles {
	public static void mai(String[] args) {
		int[] nums = {34, 353, 521, 24, -242, -12, 583, 32, 122, -44};
		int a, b, t, vnesh = 0, vnutr = 0;
		int size;

		size = 10;

		// Отображение исходного массива
		System.out.println("Исходный массив: ");
		for(int i = 0; i < size; i++)
			System.out.println(" " + nums [i]);
		System.out.println();
		//Сортировка
		for(a = 1; a < size; a++)
