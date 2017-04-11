package P02_FileStream;

public class StreamProgressInfo {
    private Streamable file;


    public StreamProgressInfo(Streamable file) {
        this.file = file;
    }

    public int calculateCurrentPercent() {
        return (this.file.getBytesSent() * 100) / this.file.getLength();
    }
}
