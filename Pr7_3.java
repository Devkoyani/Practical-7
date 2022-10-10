import java.util.ArrayList;

public class Pr7_3 {
    public static void main(String[] args) {
        ArrayList<AccountHolder> accounts = new ArrayList<AccountHolder>();

        // adding 5 accounts
        accounts.add(new AccountHolder("Dev",19, 25000, 10, "Indian"));
        accounts.add(new AccountHolder("Jenil",25, 40000, 30, "Indian"));
        accounts.add(new AccountHolder("Mohit",19, 10000, 3, "Indian"));
        accounts.add(new AccountHolder("Kush",66, 50000, 30, "Indian"));
        accounts.add(new AccountHolder("Krunal",35, 60000, 12, "Indian"));

        for (int i=0;i<accounts.size();i++) {
            AccountHolder accountHolder = accounts.get(i);
            if (accountHolder.getAge() >= 21 && accountHolder.getAge() <= 60
                    && accountHolder.getMonthlyIncome() >= 15000 && accountHolder.getExperiance() >= 1
                    && accountHolder.getCitizenship().equals("Indian")) {
                continue;
            } else {
                accounts.remove(accountHolder); // removing other accounts
            }
        }

        System.out.println("Eligible accounts holder's name:");
        for (AccountHolder accountHolder : accounts) {
            System.out.println(accountHolder.getName());
        }
    }

}
