package P01_Logger.models.files;

import P01_Logger.interfaces.File;

public class LogFile implements File {

    private StringBuilder data;
    private int size;

    public LogFile() {
        this.data = new StringBuilder();
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public void write(String message) {
        this.data.append(message);
        this.increaseFileSize(message);
    }

    private void increaseFileSize(String message) {
        int messageSize = 0;
        for (int i = 0; i < message.length(); i++) {
            if ((message.charAt(i) >= 65 && message.charAt(i) <= 90)
                    || (message.charAt(i) >= 97 && message.charAt(i) <= 122)) {
                messageSize += message.charAt(i);
            }
        }

        this.size += messageSize;
    }
}
