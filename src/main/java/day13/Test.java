package day13;

public class Test {
    public static void main(String[] args) {
        User firstUser = new User("Первый");
        User secondUser = new User("Второй");
        User thirdUser = new User("Третий");

        firstUser.sendMessage(secondUser, "Первое сообщение Второму.");
        firstUser.sendMessage(secondUser, "Второе сообщение Второму.");

        secondUser.sendMessage(firstUser, "Первое сообщение Первому.");
        secondUser.sendMessage(firstUser, "Второе сообщение Первому.");
        secondUser.sendMessage(firstUser, "Третье сообщение Первому.");

        thirdUser.sendMessage(firstUser, "Первое сообщение Первому.");
        thirdUser.sendMessage(firstUser, "Второе сообщение Первому.");
        thirdUser.sendMessage(firstUser, "Третье сообщение Первому.");

        firstUser.sendMessage(thirdUser, "Первое сообщение Третьему.");
        firstUser.sendMessage(thirdUser, "Второе сообщение Третьему.");
        firstUser.sendMessage(thirdUser, "Третье сообщение Третьему.");

        thirdUser.sendMessage(firstUser, "Четвёртое сообщение Первому.");

        MessageDatabase.showDialog(firstUser, thirdUser);
    }
}