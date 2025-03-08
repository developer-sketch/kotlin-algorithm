import kotlin.math.ceil
import kotlin.math.floor

class ExamSupervisor {
    fun solution(n:Int, ai:Array<Int>, b:Int, c:Int) : Int {
        var subSupervisors = 0
        for (i in ai) {
            val subSupervisor = ceil(((i - b).toDouble() / c)).toInt()
            subSupervisors += subSupervisor
        }
        return n + subSupervisors
    }
}