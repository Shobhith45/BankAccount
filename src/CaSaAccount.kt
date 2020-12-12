
open class CaSaAccount : Account {
    constructor(account_Holder_Name: String, account_Balance: Double) : super(account_Holder_Name, account_Balance)

    override fun Deposite(amount: Double) {
        this.account_Balance += amount
        addToStatement(" Deposited " + amount + " Balance:" + this.account_Balance)
    }

    override fun WithDraw(amount: Double) {
        if (this.account_Balance < amount) {
            println("The amount is more than the balance in the account")
        } else {

            this.account_Balance -= amount
            addToStatement(" Withdrawn " + amount + " Balance:" + this.account_Balance)
        }
    }

    override fun Intrest() {}


}

class SavingsAccount : CaSaAccount {
    companion object {
        var intrestRate: Float = 3.0f
    }

    override fun Intrest() {
        this.account_Balance += this.account_Balance * intrestRate / 36500
    }

    constructor(account_Holder_Name: String, account_Balance: Double) : super(account_Holder_Name, account_Balance)

}

class CurrentAccount : CaSaAccount {
    companion object {
        var intrestRate: Float = 4.0f
    }

    constructor(account_Holder_Name: String, account_Balance: Double) : super(account_Holder_Name, account_Balance)

    override fun Intrest() {
        this.account_Balance += this.account_Balance * intrestRate / 36500
    }
}
