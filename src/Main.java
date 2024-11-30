public class Main {

    public static void main(String[] args) {
//
        Music symphony = new Music("symphony", "Clean Bandit", "POP", 246, 40);
        Music subeme = new Music("subele a la radio", "Enrique", "POP", 208, 20);
        Music night_call = new Music("Night call","Kavinsky", "POP", 256, 55);
        Music real_hero = new Music("Real Hero", "College & Electric Youth","POP", 267, 60);
        Music let_it_happen = new Music("Let it happen", "Tame Impala", "POP", 256, 40);
        Music my_love = new Music("My Love Mine All Mine ", "Mitski", "POP", 138, 50);

        User Aruu = new User("Aruusha moonlight", "POP", 100);
        User Saku = new User("Sogdiana", "K-POP", 50);


//        Ryan.getBalance();
//        Ryan.buyMusic(night_call);
//        Ryan.buyMusic(real_hero);
//        Ryan.buyMusic(night_call);
//        Ryan.buyMusic(real_hero);
//        Ryan.buyMusic(let_it_happen);
        Aruu.buyMusic(my_love);
//        Ryan.getBalance();
        Aruu.getPlaylist();

//        Temi.getBalance();
//        Temi.buyMusic(symphony);
//        Temi.buyMusic(night_call);
//        Temi.buyMusic(my_love);
//        Temi.buyMusic(my_love);
//        Temi.buyMusic(my_love);
        Saku.cashIn(700);
        Saku.buyMusic(my_love);
//        Temi.buyMusic(subeme);
//        Temi.buyMusic(real_hero);
//        Temi.getBalance();
        Saku.getPlaylist();


        Aruu.listenMusic(real_hero);
        Aruu.listenMusic(night_call);
        Aruu.listenMusic(my_love);
        Aruu.listenMusic(my_love);
        Aruu.listenMusic(my_love);
        Aruu.listenMusic(my_love);

        Saku.listenMusic(my_love);
        Saku.listenMusic(my_love);
        Saku.listenMusic(my_love);

        my_love.getDownloads();
        my_love.getViews();

    }

}