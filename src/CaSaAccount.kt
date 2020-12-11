import com.sun.source.tree.CaseTree

open class CaSaAccount:Account{
    constructor(account_Holder_Name:String,account_Balance:Double,intrestRate:Float):super(account_Holder_Name,account_Balance,intrestRate)

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

    override fun Intrest() {
        this.account_Balance+=this.account_Balance*this.intrestRate/36500
    }
}
class SavingsAccount:CaSaAccount{
    constructor(account_Holder_Name:String,account_Balance:Double,intrestRate:Float):super(account_Holder_Name,account_Balance,intrestRate)
}

class CurrentAccount:CaSaAccount{
    constructor(account_Holder_Name:String,account_Balance:Double,intrestRate:Float):super(account_Holder_Name,account_Balance,intrestRate)
}
