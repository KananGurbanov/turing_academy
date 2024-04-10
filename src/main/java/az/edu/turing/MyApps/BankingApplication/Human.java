package az.edu.turing.MyApps.BankingApplication;

public class Human {

    public boolean haveDebitCard;

    private DebitCard card;

    private String nickName;

    private int age;

    private int deposit;

    public DebitCard getCard() {
        return card;
    }

    public void setCard(DebitCard card) {
        this.card = card;
    }

    public Human(String nickName, int age, int deposit) {
        this.nickName = nickName;
        this.age = age;
        this.deposit = deposit;
        this.haveDebitCard = false;
        this.card = null;

    }

    public Human(int cardAmount, String nickName, int age, int deposit) {
        this.setCard(new DebitCard());
        this.card.setAmount(cardAmount);
        this.nickName = nickName;
        this.age = age;
        this.deposit = deposit;
        this.haveDebitCard = true;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }



    @Override
    public String toString() {
        return "Human{" +
                "nickName='" + nickName + '\'' +
                ", age=" + age +
                '}';
    }


}
