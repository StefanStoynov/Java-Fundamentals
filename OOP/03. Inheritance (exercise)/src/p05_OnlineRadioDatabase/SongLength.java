package p05_OnlineRadioDatabase;

import p05_OnlineRadioDatabase.constants.ExeptionConstants;
import p05_OnlineRadioDatabase.exeptions.InvalidSongLengthException;
import p05_OnlineRadioDatabase.exeptions.InvalidSongMinutesException;
import p05_OnlineRadioDatabase.exeptions.InvalidSongSecondsException;

public class SongLength {
    private int seconds;
    private int minutes;

    public SongLength(String length) {
        this.parceSonLength(length);
    }

    private int getTotalSongLength(int minutes, int seconds) {
        return minutes * 60 + seconds;
    }

    private void parceSonLength(String length) {
        String[] lengthTokens = length.split(":");
        String minutes = lengthTokens[0];
        String seconds = lengthTokens[1];
        if (lengthTokens.length != 2 || !minutes.matches("\\d+") || !seconds.matches("\\d+")) {
            throw new InvalidSongLengthException(ExeptionConstants.INVALID_SONG_LENGTH_EXEPTION_MESSAGE);
        }
        int totalLength = this.getTotalSongLength(Integer.parseInt(minutes), Integer.parseInt(seconds));
        int lengthMax = (14 * 60) + 59;
        if (totalLength < 0 || totalLength > lengthMax) {
            throw new InvalidSongLengthException(ExeptionConstants.INVALID_SONG_LENGTH_SECONDS_EXEPTION_MESSAGE);
        }
        this.setMinutes(Integer.parseInt(minutes));
        this.setSeconds(Integer.parseInt(seconds));
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes > 14) {
            throw new InvalidSongMinutesException(ExeptionConstants.INVALID_SONG_LENGTH_MINUTES_EXEPTION_MESSAGE);
        }
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 59) {
            throw new InvalidSongSecondsException(ExeptionConstants.INVALID_SONG_LENGTH_SECONDS_EXEPTION_MESSAGE);
        }
        this.seconds = seconds;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public int getMinutes() {
        return this.minutes;
    }
}
