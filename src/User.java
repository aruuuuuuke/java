import java.util.Vector;

public class User {
    String name;
    String favorite_genre;
    double money;

    Vector<Music> playList;
    public User(String name, String favorite_genre, double money){
        this.name = name;
        this.favorite_genre = favorite_genre;
        this.money = money;
        this.playList = new Vector<Music>();;
    }

    public void getInfo(){
        System.out.println(this.name + " likes " + this.favorite_genre); ;
    }

    public void getBalance(){
        System.out.println(this.name + " has " + this.money) ;
    }

    public void buyMusic(Music music){
        if (this.musicExists(music)){
            System.out.println(this.name + " already has bought " + music);
        }else if(this.money < music.price){
            System.out.println(this.name + " cab't buy " + music + " due to the financial issues ");
        }
        else{
            this.playList.add(music);
            this.money -= music.price;
            System.out.println(this.name + " bought " + music + " for " + music.price);
        }

    }

    public boolean musicExists(Music music){
        for(int i=0; i<this.playList.size(); i++){
            if(this.playList.get(i).equals(music)){
                return true;
            }
        }
        return false;
    }

    public void getPlaylist(){
        System.out.println(this.name + " has these songs: \n");
        for(int i=0; i<this.playList.size(); i++){
            System.out.println(this.playList.get(i));
        }
    }

}