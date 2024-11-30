public class Music {
    String name;
    String author;
    String genre;
    Integer duration_sec;
    double price;
    Integer downloads;
    Integer views;

    public Music(String name, String author, String genre, Integer duration_sec, double price){
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.duration_sec = duration_sec;
        this.price = price;
        this.downloads = 0;
        this.views = 0;
    }

    public void get_info(){
        System.out.println(this.name + " by " + this.author + ". genre: " + this.genre + ". Costs " +this.price);
    }

    public String toString(){
        return this.name + " by " + this.author ;
    }

    public void getDownloads(){
        System.out.println(this.name + " was downloaded " + this.downloads + " times");
    }

    public void getViews(){
        System.out.println(this.name + " was listened " + this.views + " times");
    }


}