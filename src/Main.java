public class Main {

    public static void main(String[] args) {
        Genre pop = new Genre("Pop");

        Author clean_bandit = new Author("Clean", "Bandit");
        Author enrique = new Author("Enrique", "Iglesias");
        Author bts = new Author("BTS", "");
        Author the_weeknd = new Author("The", "Weeknd");
        Author justin_bieber = new Author("Justin", "Bieber");
        Author the_kid_laroi = new Author("The Kid", "LAROI");
        Author jason_derulo = new Author("Jason", "Derulo");
        Author harry_styles = new Author("Harry", "Styles");

        Music dynamite = new Music("Dynamite", bts, pop,
                "https://www.youtube.com/watch?v=gdZLi9oWNZg", 233, 100);
        Music blinding_lights = new Music("Blinding Lights", the_weeknd, pop,
                "https://www.youtube.com/watch?v=fHI8X4OXluQ", 200, 80);
        Music peaches = new Music("Peaches", justin_bieber, pop,
                "https://www.youtube.com/watch?v=tQ0yjYUFKAE", 198, 70);
        Music stay = new Music("Stay", the_kid_laroi, pop,
                "https://www.youtube.com/watch?v=kTJczUoc26U", 141, 90);
        Music savage_love = new Music("Savage Love", jason_derulo, pop,
                "https://www.youtube.com/watch?v=j5q2KRq6e-g", 177, 60);
        Music as_it_was = new Music("As It Was", harry_styles, pop,
                "https://www.youtube.com/watch?v=H5v3kku4y6Q", 165, 50);

        User Aruuke = new User("Aruuke", "K-POP", 500);
        User Saku = new User("Saku", "R&B", 120);

        Aruuke.buyMusic(dynamite, 5);
        Aruuke.getPlaylist();

        Saku.cashIn(700);
        Saku.buyMusic(as_it_was, 3);
        Saku.getPlaylist();

        Aruuke.listenMusic(dynamite);
        Aruuke.listenMusic(as_it_was);
        Aruuke.listenMusic(as_it_was);

        Saku.listenMusic(as_it_was);
        Saku.listenMusic(as_it_was);

        as_it_was.getDownloads();
        as_it_was.getViews();
        as_it_was.getRate();
        as_it_was.openVideo();
    }
}
