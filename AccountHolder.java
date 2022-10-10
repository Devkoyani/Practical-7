public class AccountHolder {
    private String name;
    private int age;
    private int monthlyIncome;
    private int experiance;
    private String citizenship;

    public AccountHolder() {
    }

    public AccountHolder(String name, int age, int monthlyIncome, int experiance, String citizenship) {
        this.name = name;
        this.age = age;
        this.monthlyIncome = monthlyIncome;
        this.experiance = experiance;
        this.citizenship = citizenship;
    }

    public int getAge() {
        return age;
    }

    public int getMonthlyIncome() {
        return monthlyIncome;
    }

    public String getName() {
        return name;
    }

    public int getExperiance() {
        return experiance;
    }

    public String getCitizenship() {
        return citizenship;
    }

}