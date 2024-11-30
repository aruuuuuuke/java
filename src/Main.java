public class Main {

    public static void main(String[] args) {
//
        Music symphony = new Music("symphony", "Clean Bandit", "POP", 246, 40);
        Music subeme = new Music("subele a la radio", "Enrique", "POP", 208, 20);
        Music night_call = new Music("Night call","Kavinsky", "POP", 256, 55);
        Music real_hero = new Music("Real Hero", "College & Electric Youth","POP", 267, 60);
        Music let_it_happen = new Music("Let it happen", "Tame Impala", "POP", 256, 40);
        Music my_love = new Music("My Love Mine All Mine ", "Mitski", "POP", 138, 50);

        User Ryan = new User("Ryan Gosling", "POP", 500);
        User Temi = new User("Temirlan Emilbekov", "Metal", 120);


        Ryan.getBalance();
        Ryan.buyMusic(night_call);
        Ryan.buyMusic(real_hero);
        Ryan.buyMusic(night_call);
        Ryan.buyMusic(real_hero);
        Ryan.buyMusic(let_it_happen);
        Ryan.buyMusic(my_love);
        Ryan.getBalance();

        Temi.getBalance();
        Temi.buyMusic(symphony);
        Temi.buyMusic(night_call);
        Temi.buyMusic(my_love);
        Temi.buyMusic(my_love);
        Temi.buyMusic(my_love);
        Temi.getBalance();

        Ryan.getPlaylist();
        Temi.getPlaylist();

    }

}