package oop_intro;

public class HW {
    public static void main(String[] args) {
        User firstUser = new User("Joe", "Cockroach", 20, 500, 5, 10);
        User secondUser = new User("Markey", "Cockroach", 20, 700, 4, 8);
        User thirdUser = new User("DeeDee", "Cockroach", 20, 900, 3, 11);

//- для нахождения пользователя с самой большой зарплатой
        User [] salarys = {firstUser, secondUser, thirdUser};
        User sel = maxSalary(salarys);
        System.out.println(sel.salary);
    }
    static User maxSalary (User [] counts){
        User maxSal = counts[0];
        for(int i = 0; i < counts.length; i++) {
            if(maxSal.salary < counts[i].salary){
                maxSal = counts[i];
            }
        }
        return maxSal;
    }
}
