package p05_OnlineRadioDatabase.exeptions;

public class InvalidSongException extends IllegalArgumentException {
    public InvalidSongException (String message){
        super(message);
    }
}
