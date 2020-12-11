open class DepositAccount:Account {
    var depositTerm:Int=0
    constructor(account_Holder_Name:String,account_Balance:Double,intrestRate:Float,depositTerm:Int):super(account_Holder_Name,account_Balance,intrestRate){
        this.depositTerm=depositTerm
    }

    override fun Intrest() {
            this.account_Balance+=this.account_Balance*this.intrestRate*depositTerm
    }

}
class Fixed:DepositAccount{
    constructor(account_Holder_Name:String,account_Balance:Double,intrestRate:Float,depositTerm:Int):super(account_Holder_Name,account_Balance,intrestRate,depositTerm)

}
class RecurringAccount:DepositAccount{
    constructor(account_Holder_Name:String,account_Balance:Double,intrestRate:Float,depositTerm:Int):super(account_Holder_Name,account_Balance,intrestRate,depositTerm)

    override fun Deposite(amount: Double) {
        this.account_Balance += amount
        addToStatement(" Deposited " + amount + " Balance:" + this.account_Balance)
    }
}