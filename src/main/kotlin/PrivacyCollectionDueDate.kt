const val DAYS_OF_MONTH = 28

class PrivacyCollectionDueDate {
    private fun daysFromDate(dateStr : String) : Int {
        val (year, month, date) = dateStr.split(".")
        return year.toInt() * DAYS_OF_MONTH * 12 + month.toInt() * DAYS_OF_MONTH + date.toInt()
    }

    fun solution(today : String, terms : Array<String>, privacies : Array<String>) : IntArray {
        val termsMap = terms.associate {
            val (type, month) = it.split(" ")
            type to month.toInt()
        }

        val todayDays = daysFromDate(today)

        val resultList = mutableListOf<Int>()
        for ((idx, privacy) in privacies.withIndex()) {
            val (date, type) = privacy.split(" ")
            val dueDateDays = daysFromDate(date) + termsMap[type]!!.toInt() * DAYS_OF_MONTH - 1
            if (todayDays > dueDateDays) resultList.add(idx + 1)
        }
        return resultList.toIntArray()
    }
}