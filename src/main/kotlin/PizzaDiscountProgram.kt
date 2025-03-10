class PizzaDiscountProgram() {
    private val priceMap = HashMap<String, Int>()

    class Pizza (
        var name: String,
        var priceS: Int,
        var priceM: Int,
        var priceL: Int
    )

    class OrderItem (
        var name: String,
        var size: String,
        var quantity: Int
    )

    fun solution(menus :Array<Pizza>, orderItems :Array<OrderItem>) :Int {
        for (menu in menus) {
            priceMap["${menu.name}Small"] = menu.priceS
            priceMap["${menu.name}Medium"] = menu.priceM
            priceMap["${menu.name}Large"] = menu.priceL
        }

        val everyDiscountResult = IntArray(4)
        everyDiscountResult[0] = buy1LargeGet1Small(orderItems)
        val priceList = priceList(orderItems)
        everyDiscountResult[1] = buy3Get1Free(priceList)
        everyDiscountResult[2] = buy5Get100Dollars(priceList)
        everyDiscountResult[3] = buyLarge3Get3Medium(orderItems)

        return everyDiscountResult.filter { it != 0 }.minOrNull() ?: getTotal(priceMap, orderItems)
    }

    private fun buy1LargeGet1Small (orderItems :Array<OrderItem>) :Int {
        var sum = 0
        val largePizzasQuantity = HashMap<String, Int>()

        for (orderItem in orderItems) {
            if (orderItem.size == "Large") {
                largePizzasQuantity[orderItem.name] = orderItem.quantity
            } else if (orderItem.size == "Small" && largePizzasQuantity[orderItem.name] != null) {
                if (orderItem.quantity > largePizzasQuantity[orderItem.name]!!) {
                    sum += (orderItem.quantity - largePizzasQuantity[orderItem.name]!!) * getPrice(orderItem.name, orderItem.size)
                }
                continue
            }
            sum += getPrice(orderItem.name, orderItem.size) * orderItem.quantity
        }

        return sum
    }

    private fun buy3Get1Free(priceList: List<Int>) :Int {
        val freeCount :Int = priceList.size / 3
        return priceList.subList(freeCount, priceList.size).sum()
    }

    private fun buy5Get100Dollars(priceList: List<Int>) :Int {
        var total = 0
        val freeCount :Int = priceList.size / 5
        for (i in priceList.indices) {
            if ((i+1) > freeCount * 5) total += priceList[i]
            else if ((i+1) % 5 == 0) total += 100
        }
        return total
    }

    private fun buyLarge3Get3Medium(orderItems :Array<OrderItem>) :Int {
        var total = 0
        var largeQuantity = 0
        val mediumPriceList = ArrayList<Int>()
        for (orderItem in orderItems) {
            if (orderItem.size == "Large") {
                largeQuantity += orderItem.quantity
            } else if (orderItem.size == "Medium") {
                mediumPriceList.addAll(priceList(arrayOf(orderItem)))
                continue
            }
            total += getPrice(orderItem.name, orderItem.size) * orderItem.quantity
        }

        val freeMediumCount = (largeQuantity / 3) * 3
        return if (freeMediumCount < mediumPriceList.size) {
                    total + mediumPriceList.subList(freeMediumCount, mediumPriceList.size).sum()
                }
                else total
    }

    private fun priceList(orderItems :Array<OrderItem>) :List<Int> {
        val priceList = ArrayList<Int>()

        for (orderItem in orderItems) {
            for (quantity in 1 .. orderItem.quantity) priceList.add(getPrice(orderItem.name, orderItem.size))
        }

        return priceList.sortedDescending()
    }

    private fun getPrice(name :String, size :String) :Int {
        return priceMap["${name}${size}"]!!
    }

    private fun getTotal (priceMap :HashMap<String, Int>, orderItems: Array<OrderItem>) :Int {
        var sum = 0
        for (orderItem in orderItems) {
            sum += priceMap["${orderItem.name}${orderItem.size}"]!!
        }
        return sum
    }
}