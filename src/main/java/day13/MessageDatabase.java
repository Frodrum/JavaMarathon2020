package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> listOfMessage = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {
        listOfMessage.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        return listOfMessage;
    }

    public static void showDialog(User u1, User u2) {
        for (int i = 0; i < listOfMessage.size(); i++) {
            Message tmp = listOfMessage.get(i);

            if ((tmp.getSender().equals(u1) && tmp.getReceiver().equals(u2))
                    || (tmp.getSender().equals(u2) && tmp.getReceiver().equals(u1))) {
                System.out.printf("%s: %s\n", tmp.getSender().getUsername(), tmp.getText());
            }
        }
    }
}