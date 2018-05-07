package oop_intro;

public class HW2 {
    public static void main(String[] args) {
        User firstUser = new User("Joe", "Cockroach", 20, 500, 5, 10);
        User secondUser = new User("Markey", "Cockroach", 24, 700, 4, 8);
        User thirdUser = new User("DeeDee", "Cockroach", 31, 900, 3, 11);


        User[] allUsers = new User[]{firstUser, secondUser, thirdUser};
        User interval = ageInterval(allUsers);
        System.out.println("users in age interval");
        System.out.println(interval.firstname);
    }

    static User ageInterval(User[] nums) {
        User inter = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i].age <= 30 && nums[i].age >= 20) {
                inter = nums[i];
            }
        }
        return inter;
    }
}
//- для нахождения пользователей в заданном интервале лет(от и до)