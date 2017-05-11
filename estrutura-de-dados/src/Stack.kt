/**
 * Created by thiago on 11/05/17.
 */


import java.util.ArrayList

fun  main (args: Array<String>){
    val stack = Stack<Int>()
    for (i in 0..9){
        stack.push(i)
    }
    for(i in 0..9){
        println(stack.pop())
    }

}


class Stack<E>{
    internal val myStack: ArrayList<E> = ArrayList()

    fun pop(): E {
        var value = myStack.get(myStack.lastIndex)
        myStack.removeAt(myStack.lastIndex)
        return value
    }

    fun push(k:E){
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

