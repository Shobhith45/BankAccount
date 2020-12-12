 open class AccountManager {

     companion object {
        private val accountList = mutableMapOf<Long,Account?>()
        fun getAccount(accNum: Long): Account? {

            return accountList[accNum]
        }
        fun addAccountList(accNum: Long, account: Account?) {
            accountList[accNum] = account

        }
        fun IntrestUpdate(){
            for(i in accountList.values)
                i?.Intrest()
        }
    }
}
