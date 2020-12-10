import com.sun.source.tree.CaseTree

open class CaSaAccount:Account{
    constructor(account_Holder_Name:String,account_Balance:Double):super(account_Holder_Name,account_Balance)

    override fun Deposite(amount: Double) {
        this.account_Balance += amount
        addToStatement(" Deposited " + amount + " Balance:" + this.account_Balance)
    }

    override fun WithDraw(amount: Double) {
        if (this.account_Balance < amount) {
            println("The amount is more than the balance in the account")
        } else {

            this.account_Balance -= amount
            addToStatement( " Withdrawn " + amount + " Balance:" + this.account_Balance)
        }
    }
}
class SavingsAccount:CaSaAccount{
    constructor(account_Holder_Name:String,account_Balance:Double):super(account_Holder_Name,account_Balance)
}

class CurrentAccount:CaSaAccount{
    constructor(account_Holder_Name:String,account_Balance:Double):super(account_Holder_Name,account_Balance)
}
