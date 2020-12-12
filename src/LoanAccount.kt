open class LoanAccount : Account {
    constructor(account_Holder_Name: String, account_Balance: Double) : super(account_Holder_Name, account_Balance)

    override fun Deposite(amount: Double) {
        if (this.account_Balance < amount) {
            println("The amount is more than the balance in loan account")
        } else {
            this.account_Balance -= amount
            addToStatement(" Deposited " + amount + " Balance:" + this.account_Balance)
        }
    }

    override fun Intrest() {

    }
}

class HomeLoanAccount : LoanAccount {
    companion object {
        var intrestRate: Float = 7.0f
    }

    constructor(account_Holder_Name: String, account_Balance: Double) : super(account_Holder_Name, account_Balance)

    override fun Intrest() {
        this.account_Balance += this.account_Balance * intrestRate / 36500
    }
}

class VehicleLoanAccount : LoanAccount {
    companion object {
        var intrestRate: Float = 9.0f
    }

    constructor(account_Holder_Name: String, account_Balance: Double) : super(account_Holder_Name, account_Balance)

    override fun Intrest() {
        this.account_Balance += this.account_Balance * intrestRate / 36500
    }

}

class PersonalLoanAccount : LoanAccount {
    companion object {
        var intrestRate: Float = 8.0f
    }

    constructor(account_Holder_Name: String, account_Balance: Double) : super(account_Holder_Name, account_Balance)

    override fun Intrest() {
        this.account_Balance += this.account_Balance * intrestRate / 36500
    }
}