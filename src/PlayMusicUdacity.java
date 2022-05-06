package practice;

public class PlayMusicUdacity {
    boolean playButton=true;
    public void playMusic() {
        if (playButton) {
            System.out.println("Music is playing");
        } else {
            System.out.println("Music is paused");
        }
    }

    public static void main(String[] args) {
        String a ="1";
        int i =0;
        while( i<101){
            a=a+"0";

            i++;

        }
        System.out.println(a);


    }
}
