open class LoanAccount:Account {
    constructor(account_Holder_Name:String,account_Balance:Double):super(account_Holder_Name,account_Balance)

    override fun Deposite(amount: Double) {
        if (this.account_Balance < amount) {
            println("The amount is more than the balance in loan account")
        }
        else {
            this.account_Balance -= amount
            addToStatement(" Deposited " + amount + " Balance:" + this.account_Balance)
        }
    }
}
class HomeLoanAccount:LoanAccount{

    constructor(account_Holder_Name:String,account_Balance:Double):super(account_Holder_Name,account_Balance)
}
class VehicleLoanAccount:LoanAccount{
    constructor(account_Holder_Name:String,account_Balance:Double):super(account_Holder_Name,account_Balance)

}
class PersonalLoanAccount:LoanAccount{
    constructor(account_Holder_Name:String,account_Balance:Double):super(account_Holder_Name,account_Balance)
}