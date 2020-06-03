public class PhraseOMatic {
	public static void main (String[] args) {

	//Создайте три набора слов для выбора. Добавляйте собственные слова!

	String[] wordListOne = {"круглогодичный", "лольный", "чумачечий", "сто-пудовый", "трансцендентный",
	 "на основе квантовых технологий", "гиперковенгентный", "Обоюдный профит", "метод успешного пути", "няшный"};

	String[] wordListTwo = {"замороченный", "организованный", "заюзанный с профитом", "общний", "сочни", "вкусный", "дельный", "финансовый","опупени", "нестандартный ом", "забимбомбный лом"};

	String[] wordListThree = {"процесс", "деплой", "тип структуры", "контейнер", "многопоточный", "обзор", "образец", "талант", "подход", "уровень завоеванного внимания"};
	
	//Вычисляем, сколько слов в каждом списке
	int oneLength = wordListOne.length;
	int twoLength = wordListTwo.length;
	int threeLength = wordListThree.length;
	
	//Генерируем три случайных числа
	int rand1 = (int) (Math.random() * oneLength);
	int rand2 = (int) (Math.random() * twoLength);
	int rand3 = (int) (Math.random() * threeLength);

	String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

	System.out.println("Все, что нам нужно, — это " + phrase);


} 
} 