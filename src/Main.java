public class Main {

    public static void main(String[] args) {
//
        Music symphony = new Music("symphony", "Clean Bandit", "POP",
                "https://www.youtube.com/watch?v=aatr_2MstrI", 246, 40);
        Music subeme = new Music("subele a la radio", "Enrique", "POP",
                "https://www.youtube.com/watch?v=dczdR4laGwc", 208, 20);
        Music night_call = new Music("Night call","Kavinsky", "POP",
                "https://www.youtube.com/watch?v=MV_3Dpw-BRY", 256, 55);
        Music real_hero = new Music("Real Hero", "College & Electric Youth","POP",
                "https://www.youtube.com/watch?v=BHgYtKkSEDA",267, 60);
        Music let_it_happen = new Music("Let it happen", "Tame Impala", "POP",
                "https://www.youtube.com/watch?v=pFptt7Cargc", 256, 40);
        Music my_love = new Music("My Love Mine All Mine ", "Mitski", "POP",
                "https://www.youtube.com/watch?v=CwGbMYLjIpQ", 138, 50);

        User Ryan = new User("Ryan Gosling", "POP", 500);
        User Temi = new User("Temirlan Emilbekov", "Metal", 120);


//        Ryan.getBalance();
//        Ryan.buyMusic(night_call);
//        Ryan.buyMusic(real_hero);
//        Ryan.buyMusic(night_call);
//        Ryan.buyMusic(real_hero);
//        Ryan.buyMusic(let_it_happen);
        Ryan.buyMusic(my_love, 5);
//        Ryan.getBalance();
        Ryan.getPlaylist();

//        Temi.getBalance();
//        Temi.buyMusic(symphony);
//        Temi.buyMusic(night_call);
//        Temi.buyMusic(my_love);
//        Temi.buyMusic(my_love);
//        Temi.buyMusic(my_love);
        Temi.cashIn(700);
        Temi.buyMusic(my_love, 0);
        Temi.buyMusic(my_love, -1);
        Temi.buyMusic(my_love, 3);
//        Temi.buyMusic(subeme);
//        Temi.buyMusic(real_hero);
//        Temi.getBalance();
        Temi.getPlaylist();

        Ryan.listenMusic(real_hero);
        Ryan.listenMusic(night_call);
        Ryan.listenMusic(my_love);
        Ryan.listenMusic(my_love);
        Ryan.listenMusic(my_love);
        Ryan.listenMusic(my_love);

        Temi.listenMusic(my_love);
        Temi.listenMusic(my_love);
        Temi.listenMusic(my_love);

        my_love.getDownloads();
        my_love.getViews();
        my_love.getRate();

        my_love.openVideo();

    }

}