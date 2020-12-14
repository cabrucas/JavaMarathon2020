package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        boolean isSubscribed = false;
        if (subscriptions.contains(user)) isSubscribed = true;
        return isSubscribed;
    }

    public boolean isFriend(User user) {
        boolean isFriend = false;
        if (subscriptions.contains(user) && user.subscriptions.contains(this)) isFriend = true;
        return isFriend;
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return String.format("%s", username);
    }
}
