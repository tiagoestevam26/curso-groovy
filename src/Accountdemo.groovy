
class Account {
    BigDecimal balance = 0
    String type

    void deposit(BigDecimal value) {
        balance = balance + value
    }

    void withdraw(BigDecimal value) {
        balance = balance - value
    }

    BigDecimal plus(Account other){
        return this.balance + other.getBalance()
    }

}

Account checking = new Account(type:"Checking")
checking.deposit(100.00)
Account savings = new Account(type:"Savings")
savings.deposit(50.00)
println(savings.getBalance());
BigDecimal total = checking + savings
println(total)