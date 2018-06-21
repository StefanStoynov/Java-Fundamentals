package p05_OnlineRadioDatabase.exeptions;

public class InvalidArtistNameException extends InvalidSongException {
    public InvalidArtistNameException(String message) {
        super(message);
    }
}
