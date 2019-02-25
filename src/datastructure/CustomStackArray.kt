package datastructure

class CustomStackArray<T>(var size : Int) {

    var arrayStack : Array<Any> = Array(size) { Any() }

    var top = -1

    fun push (newItem : Any){
        if (!isFull()){
         top += 1
            arrayStack[top] = newItem
        }
            else{
            throw Throwable("Is full dude 😢")
        }
    }
        //stack peck
    fun isFull() : Boolean{
        return (top==(size-1))
    }

    fun pop() : T{
        if(!isEmpty()){
            val item = arrayStack[top] as T
            top -= 1
            return item
        }else{
            throw Throwable("Is empty dude ")
        }
    }

    fun isEmpty() : Boolean{
        return top==-1
    }

}