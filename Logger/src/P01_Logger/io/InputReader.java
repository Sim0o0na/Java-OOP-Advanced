package P01_Logger.io;

import P01_Logger.interfaces.io.Reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReader implements Reader {

    private BufferedReader reader;

    public InputReader() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String read() throws IOException {
        return reader.readLine();
    }
}
