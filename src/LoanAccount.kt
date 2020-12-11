open class LoanAccount:Account {
    constructor(account_Holder_Name:String,account_Balance:Double,intrestRate:Float):super(account_Holder_Name,account_Balance,intrestRate)

    override fun Deposite(amount: Double) {
        if (this.account_Balance < amount) {
            println("The amount is more than the balance in loan account")
        }
        else {
            this.account_Balance -= amount
            addToStatement(" Deposited " + amount + " Balance:" + this.account_Balance)
        }
    }

    override fun Intrest() {
        this.account_Balance+=this.account_Balance*this.intrestRate/36500
    }
}
class HomeLoanAccount:LoanAccount{

    constructor(account_Holder_Name:String,account_Balance:Double,intrestRate:Float):super(account_Holder_Name,account_Balance,intrestRate)
}
class VehicleLoanAccount:LoanAccount{
    constructor(account_Holder_Name:String,account_Balance:Double,intrestRate:Float):super(account_Holder_Name,account_Balance,intrestRate)

}
class PersonalLoanAccount:LoanAccount{
    constructor(account_Holder_Name:String,account_Balance:Double,intrestRate:Float):super(account_Holder_Name,account_Balance,intrestRate)
}