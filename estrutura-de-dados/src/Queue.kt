fun main (args: Array<String>){
    val queue :Queue = Queue()
    for (i in 0..2){
        queue.offer(i)
    }
    var i: Int = 0
    while(i <= 2){
        println(queue.poll())
        i++
    }

}

class Queue (){
    var tail = -1
    var head = -1
    val myQueue = Array<Int?>(3){ i -> null }


    fun offer(k:Int) {
            if (isFull() && myQueue[myQueue.lastIndex] != null) {
                println(myQueue.lastIndex)
                tail = 0
                myQueue[tail] = k
            } else {
                tail++
                myQueue[tail] = k
                println("Index: $k")
            }
        }
    fun showArray(){
        for (i in myQueue.lastIndex downTo 0){
            println("* ${myQueue[i]}")
        }
    }

    fun poll(): Int?{
        if(head == myQueue.lastIndex){
            head = 0
        }
        var value: Int? = 0
        head++
        value = myQueue[head]
        myQueue[head] = null
        return value
    }

    fun isFull(): Boolean{
        if(tail == myQueue.lastIndex) return true
        return false
    }



}
