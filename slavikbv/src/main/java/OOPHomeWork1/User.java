package OOPHomeWork1;

import java.util.Date;

public class User {
    private String firstname;
    private String lastname;
    private int age;
    private int salary;
    private Order[] orders;
    private User[] friends;

    User() {
    }

    ;

    User(String firstname, String lastname, int age, int salary, Order[] orders, User[] friends) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
        this.orders = orders;
        this.friends = friends;
    }

    static void userAgeInterval(User[] users, int agemin, int agemax) {
        /*для нахождения пользователей в заданном интервале лет(от и до)*/

        for (int i = 0; i < users.length; i++) {
            if (users[i].age >= agemin && users[i].age <= agemax) {
                System.out.println(users[i].firstname + " " + users[i].lastname + " is in age interval from " + agemin + " to " + agemax);
            }
        }
    }

    static int userOrderSumPrice(User user, Date dateFrom, Date dateTo) {
        /* для нахождения суммарной цены по заказам пользователя в заданном интервале времени(от и до по date)*/
        int sum = 0;
        for (int i = 0; i < user.orders.length; i++) {
            if (user.orders[i].getOrderDate().after(dateFrom) && user.orders[i].getOrderDate().before(dateTo)) {
                for (int j = 0; j < user.orders[i].getProducts().length; j++) {
                    sum = sum + user.orders[i].getProducts()[i].getProductPrice();
                }
            }
        }
        return sum;
    }

    static int purchaceGoods(User user, Category category) {
        /*- для нахождения купленных товаров пользователя по заданной категории*/
        int numGoods = 0;
        for (int i = 0; i < user.orders.length; i++) {
            for (int j = 0; j < user.orders[i].getProducts().length; j++) {
                if (user.orders[i].getProducts()[j].getCategory() == category) {
                    numGoods++;
                }
            }
        }
        return numGoods;
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

    int userOrderSumPrice() {
        /* для нахождения суммарной цены по всем заказам пользователя*/
        int sum = 0;
        for (int i = 0; i < this.orders.length; i++) {
            for (int j = 0; j < this.orders[i].getProducts().length; j++) {
                sum = sum + this.orders[i].getProducts()[j].getProductPrice();
            }
        }
        return sum;
    }

    int userOrderSumPrice(Date fromDate, Date toDate) {
        /*- для нахождения суммарной цены по заказам пользователя в заданном интервале времени(от и до по date)*/
        int sum = 0;
        for (int i = 0; i < this.orders.length; i++) {
            for (int j = 0; j < this.orders[i].getProducts().length; j++) {
                if (this.orders[i].getOrderDate().after(fromDate) && this.orders[i].getOrderDate().before(toDate))
                    sum = sum + this.orders[i].getProducts()[j].getProductPrice();
            }
        }
        return sum;
    }
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    public User[] getFriends() {
        return friends;
    }

    public void setFriends(User[] friends) {
        this.friends = friends;
    }


}