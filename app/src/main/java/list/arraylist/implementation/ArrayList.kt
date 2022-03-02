package list.arraylist.implementation


open class ArrayList {
    private var size:Int = 0
    private val elementData = arrayOfNulls<Int>(100)



    fun addLast(element: Int):Boolean {
        elementData[size] = element
        size++
        return true
    }

    fun add(index:Int, element:Int):Boolean {
        for (i in size-1..index) {
            elementData[i+1] = elementData[i]
            elementData[index] = element
        }
        size++
        return true
    }

    fun addFirst(element: Int):Boolean {
        return add(0, element)
    }

    fun remove(index:Int): Int? {
        var removed = elementData[index]
        for (i in index+1 until size) {
            elementData[i] = elementData[i+1]
        }
        size--
        elementData[size] = null
        return removed
    }

    fun get(index:Int): Int? {
        return elementData[index]
    }

    fun indexOf(element:Int): Int {
        for (i in 0 until size) {
            if (elementData[i] == element) {
                return i
            }
        }
        return -1
    }

}

