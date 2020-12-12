abstract class Account {

    companion object {
        var nextAccNum = 1111111111111L
    }

    protected var account_Holder_Name: String? = null
    protected var account_Number: Long = 0
    protected var account_Balance = 0.0
    protected var email_Address: String? = null
    protected var phone_Number: Long? = 0
    protected var account_Statement = mutableListOf<String?>()

    constructor(account_Holder_Name: String, account_Balance: Double) {
        this.account_Holder_Name = account_Holder_Name
        this.account_Balance = account_Balance
        this.account_Number = getNextAccountNumber()
        AccountManager.addAccountList(account_Number, this)

    }

    open fun getEmail(): String? {
        return this.email_Address
    }

    open fun setEmail(email: String?) {
        this.email_Address = email
    }

    open fun getPhoneNumber(): Long? {
        return this.phone_Number
    }

    open fun setPhoneNumber(phone_Number: Long?) {
        this.phone_Number = phone_Number
    }

    fun getBalance(): Double {
        return this.account_Balance;
    }

    private fun getNextAccountNumber(): Long {
        return Account.nextAccNum++
    }

    open fun getAccountDetails() {
        println(
                """
                Account Name:${this.account_Holder_Name}
                Account Number:${this.account_Number}
                Balance:${this.account_Balance}
                Email Address:${this.email_Address}
                Phone Number:${this.phone_Number}
                """.trimIndent()
        )
    }

    protected open fun addToStatement(transaction: String?) {
        account_Statement.add(0, transaction)
    }

    open fun getStatement() {
        var list: MutableList<String?> = if (account_Statement.size >= 10) {
            account_Statement.subList(0, 11)
        } else {
            account_Statement
        }
        for (transaction in list) {
            println(transaction)
        }
    }

    open fun Deposite(amount: Double) {
        println("Deposit operation not possible")
    }

    open fun WithDraw(amount: Double) {
        println("With Draw Not Possible")

    }

    open abstract fun Intrest()

}