

package oopHomeWork1;

public class MainCategory {
    public static void main(String[] args) {

        User firstUser = new User("First", "name", 10, 18, 5000, 100);
        User secondUser = new User("Second", "name", 20, 25, 10000, 200);
        User thirdUser = new User("Third", "name", 40, 35, 100000, 300);
        User[] users = {firstUser, secondUser, thirdUser};

        Orders firstOrder = new Orders("vodka", "alcohol", 4, 15);
        Orders secondOrder = new Orders("chips", "fastfood", 34, 123);
        Orders thirdOrder = new Orders("bread", "essential", 6, 1);
        Orders[] order = {firstOrder, secondOrder, thirdOrder};

        Product firstProduct = new Product("Stolichna", 213, "drinks");
        Product secondProduct = new Product("lays", 100, "snack");
        Product thirdProduct = new Product("chornuy", 213, "food");
        Product[] products = {firstProduct, secondProduct, thirdProduct};


        System.out.println("User with biggest salary is  " + BiggestSalaryUser(users));
        System.out.println("His age is between " + Agebeetween(users));
        System.out.println("SUM " + totalSumOfOrders(order));


    }


    static User BiggestSalaryUser(User[] salary) {
        User maxSalary = salary[0];
        for (int i = 0; i < salary.length; i++) {
            if (maxSalary.salary < salary[i].salary) {
                maxSalary = salary[i];
            }
        }
        return maxSalary;
    }


    static User Agebeetween(User[] users) {
        User ageIs = users[0];
        for (int i = 0; i < users.length; i++) {
            if (ageIs.age > 0 && ageIs.age <= 23) {
                return ageIs;
            } else if (ageIs.age >= 18 && ageIs.age <= 25) {
                return ageIs;
            } else if (ageIs.age >= 26 && ageIs.age <= 50) {
                System.out.println("is  in 30's  ");
                return ageIs;
            } else {
                System.out.println("Very old");
            }
        }
        return ageIs;
    }

    static Orders totalSumOfOrders(Orders[] order) {
        Orders total = order[0];
        for (int i = 0; i < order.length; i++) {
            total = order[i];
        }
        return total;
    }

}

