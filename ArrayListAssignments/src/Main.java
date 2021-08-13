import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] favSongs=
                //<editor-fold desc="raw names data">
                {
                        "AfricanJazz", "Salif Keita",
                        "Afro-Cuban", "Evora Cesaria",
                        "Afro-pop", "Sauti Sol",
                        "Afro-HipHop", "Nyashinski",
                        "RnB", "Beyonce",
                        "AfroRnB", "Tshala Muana",
                        "Lingala", "Fally Ipupa",
                        "Rock", "Evanescence"
                };
        //</editor-fold>

        String[] Genre= new String[favSongs.length/2];
        String[] Artist= new String[favSongs.length/2];

        for(int i= 0; i<favSongs.length; i++){
            if(i%2==0){
                Genre[i/2] = favSongs[i];
            }else{
                Artist[i/2] = favSongs[i];
            }
        }
        Map<String,String> music = new HashMap<String, String>();

        //x<Genre.length= true
        for(int i = 0; i<Genre.length; i++){
            music.put(Genre[i],Artist[i]);
        }

        //checking if map created is accesible
        //System.out.println(music.get("Lingala"));

        //making reference to created map interface
        for(String i: music.keySet()){

            System.out.println("Genre is : " + i + " and Artist is : " +music.get(i));

        }
    }
}
