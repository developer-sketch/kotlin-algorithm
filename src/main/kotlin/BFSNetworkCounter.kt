import java.util.LinkedList
import java.util.Queue

class BFSNetworkCounter {
    fun count(n: Int, computers: Array<IntArray>): Int {
        val visited = BooleanArray(n)
        var networkCount = 0

        val queue : Queue<Int> = LinkedList()
        for (i in 0..< n) {
            if (!visited[i]) { // 방문했던 곳이면 건너 뛰기
                queue.add(i)
                print(queue)
                visited[i] = true

                while (!queue.isEmpty()) {
                    val current :Int = queue.poll()
                    for (j in 0..<n) {
                        if (computers[current][j] == 1 && !visited[j]) { //연결되어 있고 방문했던 곳이 아니면
                            visited[j] = true
                            queue.add(j)
                            print(queue)
                        }
                    }
                }
                networkCount++ //네트워크의 개수 추가. queue에 1개만 있어도 하나의 네트워크로 봄
            }
        }
        return networkCount
    }
}