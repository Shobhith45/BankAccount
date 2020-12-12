
fun main() {

    var account: Account? = null
    var accountManager: Account?
    loop@ do {
        println("===CHOICE===\n1.Create Account\n2.Get Balance\n3.Deposite\n4.With Draw\n5.Get Account Details\n6.Account Statement\n7.Add Email To Your Account\n8.Add Phone Number to Account \n9.Intrest Update \n10.Change Intrest \n11.Exit")
        try {
            when (readLine()!!.toInt()) {
                1 -> {
                    println("Enter your name")
                    val name: String = readLine()!!
                    println("Enter initial amount")
                    var initialAmount: Double = 0.0

                    initialAmount = readLine()!!.toDouble()
                    if (initialAmount <= 0) {
                        throw Exception("Enter Valid Amount")
                    }
                    println("===ACCOUNT TYPE===\n1.Savings Account\n 2.Current Account\n3.Fixed Deposit Account \n4.Recurrent Deposit Account\n5.Home Loan Account\n6.Vehicle Loan Account\n7.Personal Loan Account")
                    when (readLine()!!.toInt()) {
                        1 -> account = SavingsAccount(name, initialAmount)
                        2 -> account = CurrentAccount(name, initialAmount)
                        3 -> {
                            println("enter Term of Deposit")
                            val depositTerm = readLine()!!.toInt()
                            if (depositTerm <= 0) {
                                throw Exception("Enter Valid Deposit Period")
                            }
                            account = Fixed(name, initialAmount, depositTerm)
                        }

                        4 -> {
                            println("enter Term of Deposit")
                            val depositTerm = readLine()!!.toInt()
                            if (depositTerm <= 0) {
                                throw Exception("Enter Valid Deposit Period")
                            }
                            account = RecurringAccount(name, initialAmount, depositTerm)
                        }
                        5 -> account = HomeLoanAccount(name, initialAmount)
                        6 -> account = VehicleLoanAccount(name, initialAmount)
                        7 -> account = PersonalLoanAccount(name, initialAmount)
                        else -> println("Incorrect option")
                    }



                    if (account != null) {
                        println("Account Created")
                        account.getAccountDetails()
                    } else {
                        println("Error creating Account")
                    }
                }


                2 -> {
                    println("Enter Account Number")
                    val accNumber = readLine()!!.toLong()
                    accountManager = AccountManager.getAccount(accNumber)
                    if (accountManager == null) {
                        throw Exception("Account Doesn't Exist")
                    }
                    println(accountManager.getBalance())
                }
                3 -> {

                    println("Enter Amount to Deposit")

                    val depositAmount = readLine()!!.toDouble()
                    if (depositAmount <= 0) {
                        throw Exception("Amount is not valid")
                    }
                    println("Enter Account Number")
                    val accNumber = readLine()!!.toLong()
                    accountManager = AccountManager.getAccount(accNumber)
                    if (accountManager == null) {
                        throw Exception("Account Doesn't Exist")
                    }
                    accountManager.Deposite(depositAmount)
                    //account?.Deposite(depositAmount)
                    println("Deposited $depositAmount")

                }
                4 -> {
                    println("Enter Amount to With Draw")

                    val withdrawAmount = readLine()!!.toDouble()
                    if (withdrawAmount <= 0) {
                        throw Exception("Amount is Not Valid")
                    }
                    println("Enter Account Number")
                    val accNumber = readLine()!!.toLong()
                    accountManager = AccountManager.getAccount(accNumber)
                    if (accountManager == null) {
                        throw Exception("Account Doesn't Exist")
                    }
                    accountManager.WithDraw(withdrawAmount)
                    //account?.WithDraw(withdrawAmount)
                    println("With Drawn $withdrawAmount")

                }
                5 -> {
                    println("Enter Account Number")
                    val accNumber = readLine()!!.toLong()
                    accountManager = AccountManager.getAccount(accNumber)
                    if (accountManager == null) {
                        throw Exception("Account Doesn't Exist")
                    }
                    accountManager.getAccountDetails()
                }
                6 -> {
                    println("Enter Account Number")
                    val accNumber = readLine()!!.toLong()
                    accountManager = AccountManager.getAccount(accNumber)
                    if (accountManager == null) {
                        throw Exception("Account Doesn't Exist")
                    }
                    accountManager.getStatement()
                }
                7 -> {

                    println("Enter Account Number")
                    val accNumber = readLine()!!.toLong()
                    accountManager = AccountManager.getAccount(accNumber)
                    if (accountManager == null) {
                        throw Exception("Account Doesn't Exist")
                    }
                    println("Enter Email")
                    accountManager.setEmail(readLine())
                    //account?.setEmail(readLine())

                }
                8 -> {

                    println("Enter Account Number")
                    val accNumber = readLine()!!.toLong()
                    accountManager = AccountManager.getAccount(accNumber)
                    if (accountManager == null) {
                        throw Exception("Account Doesn't Exist")
                    }
                    println("Enter Phone Number")
                    accountManager.setPhoneNumber(readLine()?.toLong())
                    println("Phone Number Added")

                }
                9 -> {
                    try {
                        AccountManager.IntrestUpdate()
                        println("Intrest Updated for All Accounts")
                    } catch (e: Exception) {
                        println("Account number is not Valid")
                    }

                }

                10 -> {
                    println("Enter New Intrest Rate")
                    val newIntrestRate = readLine()!!.toFloat()
                    if (newIntrestRate < 0) {
                        throw Exception("Invalid Intrest Rate")
                    }
                    println("===ACCOUNT TYPE===\n1.Savings Account\n 2.Current Account\n3.Fixed Deposit Account \n4.Recurrent Deposit Account\n5.Home Loan Account\n6.Vehicle Loan Account\n7.Personal Loan Account")
                    when (readLine()!!.toInt()) {
                        1 -> SavingsAccount.intrestRate = newIntrestRate
                        2 -> CurrentAccount.intrestRate = newIntrestRate
                        3 -> Fixed.intrestRate = newIntrestRate
                        4 -> RecurringAccount.intrestRate = newIntrestRate
                        5 -> HomeLoanAccount.intrestRate = newIntrestRate
                        6 -> VehicleLoanAccount.intrestRate = newIntrestRate
                        7 -> PersonalLoanAccount.intrestRate = newIntrestRate
                        else -> println("Incorrect option")
                    }
                }
                11 -> break@loop
                else -> println("Invalid Option")


            }
        } catch (e: Exception) {
            println(e.message)
        }

    } while (true)
    return


}






