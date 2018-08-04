package p20_WarningLevels;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Logger implements Iterable<Message>{
    private List<Message>messages;

    public Logger() {
        this.messages = new ArrayList<>();
    }

    public void addMessage(Message message, String restriction){
        if (message.getImportance().compareTo(Importance.valueOf(restriction))>=0){
            messages.add(message);
        }
    }


    @Override
    public Iterator<Message> iterator() {
        return this.messages.iterator();
    }
}
