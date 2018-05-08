package OOPHomeWork1;

import java.util.Date;

public class User {
    String firstname;
    String lastname;
    int age;
    int salary;
    Order[] orders;
    User[] friends;

    User(String firstname, String lastname, int age, int salary, Order[] order, User[] friends) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
        this.orders = orders;
        this.friends = friends;
    }

    static User maxSallary(User[] users) {
        /* для нахождения пользователя с самой большой зарплатой*/
        User userMaxSallary = users[0];
        for (int i = 0; i < users.length; i++) {
            if (users[i].salary > userMaxSallary.salary) {
                userMaxSallary = users[i];
            }
        }
        return userMaxSallary;
    }

    static void userAgeInterval(User[] users, int agemin, int agemax) {
        /*для нахождения пользователей в заданном интервале лет(от и до)*/

        for (int i = 0; i < users.length; i++) {
            if (users[i].age >= agemin && users[i].age <= agemax) {
                System.out.println(users[i].firstname + " " + users[i].lastname + "is in age interval from " + agemin + " to " + agemax);
            }
        }
    }

    static int userOrderSumPrice(User user, Date dateFrom, Date dateTo) {
        /* для нахождения суммарной цены по заказам пользователя в заданном интервале времени(от и до по date)*/
        int sum = 0;
        for (int i = 0; i < user.orders.length; i++) {
            if (user.orders[i].date.after(dateFrom) && user.orders[i].date.before(dateTo)) {
                for (int j = 0; j < user.orders[i].products.length; j++) {
                    sum = sum + user.orders[i].products[i].price;
                }
            }
        }
        return sum;
    }

    static void purchaceGoods(User user, Category category) {
        /*- для нахождения купленных товаров пользователя по заданной категории*/
        for (int i = 0; i < user.orders.length; i++) {
            for (int j = 0; j < user.orders[i].products.length; j++) {
                if (user.orders[i].products[j].category == category) {
                    System.out.println(user.orders[i].products);
                }
            }
        }
    }

    int userOrderSumPrice() {
        /* для нахождения суммарной цены по всем заказам пользователя*/
        int sum = 0;
        for (int i = 0; i < this.orders.length; i++) {
            for (int j = 0; j < this.orders[i].products.length; j++) {
                sum = sum + this.orders[i].products[j].price;
            }
        }
        return sum;
    }
}