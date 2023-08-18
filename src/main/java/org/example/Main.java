package org.example;

public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Эльвира";
        post.passport = "4444 № 44444444";
        post.patronymic = "Игоревна";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Гордиенко";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 14;
        post.birthday.month = 4;
        post.birthday.year = 1997;

    }
}
