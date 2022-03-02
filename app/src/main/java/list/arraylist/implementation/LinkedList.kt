package list.arraylist.implementation

class LinkedList {

    // 첫번째 노드를 가리키는 필드
    private var head: Node? = null
    private var tail: Node? = null
    private var size = 0

    inner class Node(
        // 데이터가 저장될 필드
        private var data: Any,
    )  {
        // 다음 노드를 가리키는 필드
        var next: Node? = null

        fun Node(input: Any?) {
            this.data = input!!
            this.next = null
        }
    }

    fun addFirst(input: Any) {
        var newNode = Node(input)
        newNode.next = head
        head = newNode
        size++
        if(newNode.next == null) {
            tail = head
        }
    }

    fun addLast(input:Int) {
        var newNode = Node(input)
        if(size == 0 ) {
            addFirst(input)
        }
        else {
            tail!!.next = newNode
            newNode = tail!!
            size++
        }
    }

    fun node(index: Int): Node {
        var x: Node = head!!
        for (i in 0 until index) {
            x = x.next!!
        }
        return x
    }

    fun add(k:Int, input:Int) {
        if(k == 0 ) {
            addFirst(input)
        }
        else {
            val newNode = Node(input)
            val temp1 = node(k-1)
            val temp2 = temp1.next
            temp1.next = newNode
            newNode.next = temp2
            size++
            if(newNode.next == null) {
                tail = newNode
            }
        }
    }
}