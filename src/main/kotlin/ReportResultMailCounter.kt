class ReportResultMailCounter {
    fun solution(id_list : Array<String>, report : Array<String>, k : Int) : IntArray {
        var reportSet = report.toSet()
        val reportMap = id_list.associateWith { mutableSetOf<String>() }.toMutableMap()
        val reportedCount = mutableMapOf<String, Int>()
        for (r in reportSet) {
            val arr = r.split(" ")
            val reporter = arr[0]
            val reported: String = arr[1]
            reportMap[reporter]?.add(reported)
            reportedCount[reported] = reportedCount.getOrDefault(reported, 0) + 1
        }

        val bannedUsers = reportedCount.filter { it.value >= k }.keys.toSet()
        var mailCount = id_list.map { id ->
            reportMap[id]?.count { it in bannedUsers } ?: 0
        }
        return mailCount.toIntArray()
    }
}