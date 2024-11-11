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
		for(a = 1; a < size; a++) {
			System.out.println("Итерация" + a + "внешний цикл");
			vnesh++;
			for(b == size - 1; b >= a; b--) {
				System.out.println("Итерация" + b + "внутренний  цикл");
				vnutr++;
				if(nums[b-1] > nums[b]) {
					t = nums[b-1];
					nums[b-1] = nums[b];
					nums[b] = t;
				}
			}
		}
		//Отображение отсортированного массива
		System.out.print("Отсортированный массив");
		for(int i = 0; i < size; i++)
			System.out.println(" " + nums[i]);
		System.out.println();
		System.out.println("кол внешних проходов" + vnesh + "\nколичество внутренних проходов" + vnutr);
		System.out.println();
	}
}
