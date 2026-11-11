package decorator;

public class Main {
    public static void main(String[] args) {
        decorator.Notifier n1 = new EmailNotifier();
        n1.send("Olá");

        System.out.println();

        decorator.Notifier n2 = new SlackDecorator(new EmailNotifier());
        n2.send("Promoção");

        System.out.println();

        decorator.Notifier n3 = new SlackDecorator(new SmsDecorator(new EmailNotifier()));
        n3.send("Sistema fora");
    }
}
