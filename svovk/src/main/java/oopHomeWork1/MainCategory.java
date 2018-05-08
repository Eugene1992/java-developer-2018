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


    }

//    static Product SumOfOrders(Product[] products) {
//        int sum = 0;
//        for (int i = 0; i < products.length; i++) {
//            sum = sum + products[i].price;
//            System.out.println(sum);
//
//        } return ;


//    }

    //TO DO


    static User BiggestSalaryUser(User[] users) {
        User maxSalary = users[0];
        for (int i = 0; i < users.length; i++) {
            if (maxSalary.salary < users[i].salary) {
                maxSalary = users[i];
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

}    //TO DO

