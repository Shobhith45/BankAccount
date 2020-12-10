import java.util.function.DoubleUnaryOperator

fun main() {

    var account: Account? = null
    loop@ do {
        println("===CHOICE===\n1.Create Account\n2.Get Balance\n3.Deposite\n4.With Draw\n5.Get Account Details\n6.Account Statement\n7.Add Email To Your Account\n8.Add Phone Number to Account \n9.Exit")
        when (readLine()!!.toInt()) {
            1 -> {
                println("Enter your name")
                val name: String = readLine()!!
                println("Enter initial amount")
                var initialAmount: Double = 0.0
                try {
                    initialAmount = readLine()!!.toDouble()
                    println("===ACCOUNT TYPE===\n1.Savings Account\n 2.Current Account\n3.Fixed Deposit Account \n4.Recurrent Deposit Account\n5.Home Loan Account\n6.Vehicle Loan Account\n7.Personal Loan Account")
                    when (readLine()!!.toInt()) {
                        1 -> account = SavingsAccount(name, initialAmount)
                        2 -> account = CurrentAccount(name, initialAmount)
                        3 -> account = Fixed(name, initialAmount)
                        4 -> account = RecurringAccount(name, initialAmount)
                        5 -> account = HomeLoanAccount(name, initialAmount)
                        6 -> account = VehicleLoanAccount(name, initialAmount)
                        7 -> account = PersonalLoanAccount(name, initialAmount)
                        else -> println("Incorrect option")
                    }

                } catch (e: Exception) {
                    println("Enter valid amount")
                }
            }
            2 -> println(account?.getBalance())
            3 -> {
                println("Enter Amount to Deposit")
                try {
                    account?.Deposite(readLine()!!.toDouble())
                } catch (e: Exception) {
                    println("Amount is not valid")
                }
            }
            4 -> {
                println("Enter Amount to With Draw")
                try {
                    account?.WithDraw(readLine()!!.toDouble())
                } catch (e: Exception) {
                    println("Amount is not valid")
                }
            }
            5 -> account?.getAccountDetails()
            6 -> account?.getStatement()
            7 -> {
                println("Enter Email")
                account?.setEmail(readLine())
            }
            8 -> {
                try {
                        println("Enter Phone Number")
                        account?.setPhoneNumber(readLine()?.toLong())
                } catch (e: Exception) {
                    println("Phone Number is not Valid")
                }
            }
            9 -> break@loop
            else -> println("Invalid Option")


        }

    } while (true)
    return


}






