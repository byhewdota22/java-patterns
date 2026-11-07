package adapter;

public class AudioPlayerAdapter implements MediaPlayer {

    private final OldAudioPlayer oldPlayer;

    public AudioPlayerAdapter(OldAudioPlayer oldPlayer) {
        this.oldPlayer = oldPlayer;
    }

    @Override
    public void play(String filename) {
        oldPlayer.playMp3(filename);
    }
}
