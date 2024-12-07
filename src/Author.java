public class Author {
    String name;
    String surename;
    Integer quantity_music;

    public Author(String name, String surname){
        this.name = name;
        this.surename = surname;
        this.quantity_music = 0;
    }

    public String toString(){
        return this.name + " " + this.surename;
    }

    public String getInfo(){
        return this.name + " created " + this.quantity_music + " times";
    }
}