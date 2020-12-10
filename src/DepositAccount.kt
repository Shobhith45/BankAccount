open class DepositAccount:Account {
    constructor(account_Holder_Name:String,account_Balance:Double):super(account_Holder_Name,account_Balance)

}
class Fixed:DepositAccount{
    constructor(account_Holder_Name:String,account_Balance:Double):super(account_Holder_Name,account_Balance)

}
class RecurringAccount:DepositAccount{
    constructor(account_Holder_Name:String,account_Balance:Double):super(account_Holder_Name,account_Balance)

    override fun Deposite(amount: Double) {
        this.account_Balance += amount
        addToStatement(" Deposited " + amount + " Balance:" + this.account_Balance)
    }
}