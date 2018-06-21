package p05_OnlineRadioDatabase.constants;

public final class ExeptionConstants {
    public static final String INVALID_SONG_LENGTH_EXEPTION_MESSAGE = "Invalid song length.";
    public static final String INVALID_SONG_LENGTH_MINUTES_EXEPTION_MESSAGE = "Song minutes should be between 0 and 14.";
    public static final String INVALID_SONG_LENGTH_SECONDS_EXEPTION_MESSAGE = "Song seconds should be between 0 and 59.";
    public static final String INVALID_ARTIST_NAME_EXEPTION_MESSAGE = "Artist name should be between 3 and 20 symbols.";
    public static final String INVALID_SONG_NAME_EXEPTION_MESSAGE = "Song name should be between 3 and 30 symbols.";

    private ExeptionConstants() {
    }
}
