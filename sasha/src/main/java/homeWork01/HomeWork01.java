package homeWork01;

/*
    1. Создать классы с полями:

	Category
	- name

	Product
	- name
	- price
	- category

	Order
	- name
	- number
	- products
	- date

	User
	- firstname
	- lastname
	- age
	- salary
	- orders
	- friends

    2. Написать методы:

    - для нахождения пользователя с самой большой зарплатой
    - для нахождения пользователей в заданном интервале лет(от и до)
    - для нахождения суммарной цены по всем заказам пользователя
    - для нахождения суммарной цены по заказам пользователя в заданном интервале времени(от и до по date)
    - для нахождения купленных товаров пользователя по заданной категории
    - для нахождения заданного количества самых дорогих заказов пользователя
 */


public class HomeWork01 {
    public static void main(String[] args) {
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();
        Order order5 = new Order();
        Order[] ordersOfUser1 = {order1,order3,order4};
        Order[] ordersOfUser2 = {order2,order3,order5};
        Order[] ordersOfUser3 = {order1,order2,order4,order5};

        User user1 = new User("Ivan","Petrov",23,15000,ordersOfUser1);
        User user2 = new User("Tom","Marlov",19,7000,ordersOfUser2);
        User user3 = new User("Anna","Lubimova",45,50000,ordersOfUser3);
        User[] allUsers = {user1,user2,user3};

        userWithBiggerSalary(allUsers);
        userFromManageAgeInterval(allUsers,20,30);
    }

    public static void userWithBiggerSalary(User[] users) {
        User maxSalaryUser = users[0];
        for (int i = 0; i < users.length; i++) {
            if (maxSalaryUser.salary < users[i].salary) {
                maxSalaryUser = users[i];
            }
        }
        System.out.println("User with bigger salary is:");
        System.out.println(maxSalaryUser.firstname + " "  + maxSalaryUser.lastname + " age: " + maxSalaryUser.age);
    }

    public static void userFromManageAgeInterval(User[] users, int beginInterval, int endInterval) {
        System.out.println("User in age interval from " + beginInterval + " to " + endInterval);
        for (int i = 0; i < users.length; i++) {
            if ((users[i].age > beginInterval) && (users[i].age < endInterval)) {
                System.out.println(users[i].firstname + " " + users[i].lastname + " age " + users[i].age);
            }
        }
    }

}
