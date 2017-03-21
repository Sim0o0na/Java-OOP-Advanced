package mood;

public interface Character<T> {
    String getUserName();
    String getHashedPassword();
    int getLevel();
    T getSpecialPoints();
    String hashPass();
}
