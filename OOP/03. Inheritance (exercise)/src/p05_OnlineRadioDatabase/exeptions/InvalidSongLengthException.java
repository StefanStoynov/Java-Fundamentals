package p05_OnlineRadioDatabase.exeptions;

public class InvalidSongLengthException extends InvalidSongException {
    public InvalidSongLengthException(String message) {
        super(message);
    }
}
