package day13;

public class Task1 {
    public static void main(String[] args) {
        User one = new User("Jim");
        User two = new User("Jimmy");
        User three = new User("Jimmishe");

        one.sendMessage(two, "Хэллоу!");
        one.sendMessage(two, "Как дела?");
        two.sendMessage(one, "Ой");
        two.sendMessage(one, "Капец");
        two.sendMessage(one, "Задача жоская");
        three.sendMessage(one, "Помочь?");
        three.sendMessage(one, "Там, вроде, непросто...");
        three.sendMessage(one, "Чего молчишь?");
        one.sendMessage(three, "Не");
        one.sendMessage(three, "Сам попробую осилить.");
        one.sendMessage(three, "Без обид.");
        three.sendMessage(one, "Ок.");
        three.sendMessage(three, "Тестим отправку самому себе. Если видно, то фейл.");

        MessageDatabase.showDialog(one,three);

        for (Message message : MessageDatabase.messages) {
            System.out.println(message);
        }

        // Тестим друзей и подписку
        one.subscribe(two);
        System.out.println(one.isSubscribed(two));
        System.out.println(one.isFriend(two));
        two.subscribe(one);
        System.out.println(one.isFriend(two));
    }
}
