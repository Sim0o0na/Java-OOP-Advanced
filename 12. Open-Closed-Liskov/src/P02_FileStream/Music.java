package P02_FileStream;

public class Music extends BaseStream{

    private String artist;
    private String album;


    public Music(int length, int bytesSent, String artist, String album) {
        super(length, bytesSent);
        this.album = album;
        this.artist = artist;
    }
}
