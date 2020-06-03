class Movie {
	String title;
	String genre;
	int rating;
	void playIt() {
	System.out.println("Проигрывание фильма");
}


}

public class MovieTestDrive {
	public static void main(String[] args) {

	Movie one = new Movie();
	one.title = "Как подняться на Акциях";
	one.genre = "Мелодрама";
	one.rating = 4;

	Movie two = new Movie();
	two.title = "Второй фильм";
	two.genre = "Героическое кино";
	two.rating = 5;
	two.playIt();

	Movie three = new Movie();
	three.title = "Бойцовский клаб";
	three.genre = "Хз что вообще";
	three.rating = 7;

}

}