package org.example;

public class DecoratorTest {

    public static void main(String[] args) {

        Notifier notifier = new EmailNotifier();
        notifier.send();

        System.out.println();

        Notifier smsNotifier = new SMSNotifierDecorator(new EmailNotifier());
        smsNotifier.send();

        System.out.println();

        Notifier slackNotifier = new SlackNotifierDecorator(
                new SMSNotifierDecorator(new EmailNotifier())
        );
        slackNotifier.send();
    }
}