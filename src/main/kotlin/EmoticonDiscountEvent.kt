//https://school.programmers.co.kr/learn/courses/30/lessons/150368

class EmoticonDiscountEvent {
    private val discountList = intArrayOf(10, 20, 30, 40)
    private var result = longArrayOf(0, 0)


    fun solution (users:Array<IntArray>, emoticons:IntArray) : LongArray {
        decideDiscount(0, users, emoticons, IntArray(emoticons.size))

        return result
    }

    fun decideDiscount(emoticonIdx:Int, users:Array<IntArray>, emoticons:IntArray, emoticonDiscountRate:IntArray) {
        if (emoticonIdx == emoticons.size) {
            var totalPrice = 0L
            var membershipCount = 0L
            for (user in users) {
                var paid = 0
                for ((index, rate) in emoticonDiscountRate.withIndex()) {
                    if (user[0] <= rate) {
                        paid += (emoticons[index] * (100 - rate).toFloat() / 100).toInt()
                    }
                    //println ("user : ${user[0]} ${user[1]}, emo index : ${index}, rate : ${rate}, paid : $paid, memberShipCount : ${membershipCount}, totalPrice : ${totalPrice}, result.membershipCount : ${result[0]}, result.totalPrice : ${result[1]}")
                }
                if (paid >= user[1]) membershipCount++
                else totalPrice += paid
            }
            if (membershipCount > result[0]
                || membershipCount == result[0] && totalPrice > result[1]) {
                result[0] = membershipCount
                result[1] = totalPrice
            }
            emoticonDiscountRate[emoticonDiscountRate.size - 1] = 0
            return
        }

        for (rate in discountList) {
            emoticonDiscountRate[emoticonIdx] = rate
            decideDiscount(emoticonIdx + 1, users, emoticons, emoticonDiscountRate)
        }
    }
}