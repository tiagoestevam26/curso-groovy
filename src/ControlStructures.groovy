
class Account2{
    BigDecimal balance = 0.0

    void deposit(BigDecimal value) {
        if(value >= 0){
            balance = balance + value;
        }else{
        throw new Exception("Number lower than zero")
        }
    }

    void deposit(List<BigDecimal> values){
        for (i in values){
            balance = balance + i; //pode usar o outro deposit() ne, inteligente
        }
    }
}

Account2 acc = new Account2();
acc.deposit(20);
acc.deposit(40);
println(acc.getBalance());
try{
    acc.deposit(-10)
}catch(Exception e){
    println("ERROOOOOOOOOOOO")
}
def list = [10,20,30];
acc.deposit(list)
println(acc.getBalance());
