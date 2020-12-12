open class DepositAccount : Account {
    var depositTerm: Int = 0

    constructor(account_Holder_Name: String, account_Balance: Double, depositTerm: Int) : super(account_Holder_Name, account_Balance) {
        this.depositTerm = depositTerm
    }

    override fun Intrest() {

    }

}

class Fixed : DepositAccount {
    companion object {
        var intrestRate = 5.0f
    }

    constructor(account_Holder_Name: String, account_Balance: Double, depositTerm: Int) : super(account_Holder_Name, account_Balance, depositTerm)

    override fun Intrest() {
        this.account_Balance += this.account_Balance * (intrestRate / 100) * depositTerm
    }

}

class RecurringAccount : DepositAccount {
    companion object {
        var intrestRate: Float = 4.5f
    }

    constructor(account_Holder_Name: String, account_Balance: Double, depositTerm: Int) : super(account_Holder_Name, account_Balance, depositTerm)

    override fun Deposite(amount: Double) {
        this.account_Balance += amount
        addToStatement(" Deposited " + amount + " Balance:" + this.account_Balance)
    }

    override fun Intrest() {
        this.account_Balance += this.account_Balance * (intrestRate / 100) * depositTerm
    }
}