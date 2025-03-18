//https://school.programmers.co.kr/learn/courses/30/lessons/150369

class MinDistanceForDelivery {
    fun solution(cap :Int, n:Int, deliveries:IntArray, pickups:IntArray):Int {
        var result = 0
        var remainDelivery = 0
        var remainPickup = 0

        for (i in n downTo 1) {
            remainDelivery += deliveries[i]
            remainPickup += pickups[i]

            // 같은 집에 몇번째 오는지 셈
            var trips = 0
            while (remainDelivery > 0 || remainPickup > 0) {
                remainDelivery -= cap
                remainPickup -= cap
                trips++
            }
            result += 2 * (i + 1) * trips
        }
        return result
    }
}