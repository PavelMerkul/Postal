public class Main {
    public static void main(String[] args) {
        // Создаем объект Post
        Post post = new Post();

        // Заполняем поля объекта Post
        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.passport = "4444 № 44444444";
        post.phone = "+7 (999)-999-99-99";
        post.subscription = true;

        // Создаем и заполняем объект FormDate для поля birthday
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;

        // Выводим информацию на экран
        System.out.println("Name: " + post.name);
        System.out.println("Surname: " + post.surname);
        System.out.println("Patronymic: " + post.patronymic);
        System.out.println("Passport: " + post.passport);
        System.out.println("Phone: " + post.phone);
        System.out.println("Subscription: " + (post.subscription ? "Yes" : "No"));
        System.out.println("Birthday: " + post.birthday.day + "." + post.birthday.month + "." + post.birthday.year);
    }
}
