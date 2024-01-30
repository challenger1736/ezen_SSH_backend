package day21;

public class Account {
    private long balance;

    public Account(){};

    public long getBalance(){
        return balance;
    }

    public void deposit(int money){
        balance += money;
    }

    public void withdraw(int money) throws InsufficientException{
        if(balance<money){ // 만약에 예금액 보다 출금액이 더크면

            throw new InsufficientException("잔고부족: "+ (money-balance)+" 모자람");
        }
        balance -= money;
    }
}
