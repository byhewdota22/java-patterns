package adapter;

public class Main {
    public static void main(String[] args) {
    	
        OldAudioPlayer oldPlayer = new OldAudioPlayer();
        MediaPlayer player = new AudioPlayerAdapter(oldPlayer);
        player.play("song.mp3");
        player.play("another-track.mp3");
        
    }
}