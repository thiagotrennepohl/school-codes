import java.util.ArrayList

fun main (args: Array<String>){
    val stack: Stack = Stack()
    for (i in 0..9){
        stack.push(i)
    }
    for(i in 0..9){
        println(stack.pop())
    }

}


class Stack(){
    internal val myStack: ArrayList<Int> = ArrayList()

    fun pop(): Int{
        var value = myStack.get(myStack.lastIndex)
        myStack.removeAt(myStack.lastIndex)
        return value
    }

    fun push(k:Int){
        myStack.add(k)
    }

    fun isEmpty(): Boolean{
        if (myStack.isEmpty()) return  true
        return false
    }

    fun printStack(){
        println(myStack.toString())
    }

}
