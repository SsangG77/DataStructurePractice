package list.arraylist.implementation


class Main {

    fun main(args:Array<String>) {
        val Arraynumbers = ArrayList()
        Arraynumbers.addLast(10)
        Arraynumbers.addLast(20)
        Arraynumbers.addLast(30)
        Arraynumbers.add(1, 15)
        Arraynumbers.addFirst(5)

        val Linkednumbers = LinkedList()
        Linkednumbers.addFirst(30)
        Linkednumbers.addFirst(20)
        Linkednumbers.addFirst(10)
        Linkednumbers.node(2)
        Linkednumbers.add(2, 25)
        Linkednumbers.remove(2)
        Linkednumbers.removeLast()
        Linkednumbers.size()
        Linkednumbers.get(1)
        Linkednumbers.addLast(4)
        println(Linkednumbers.indexOf(2))
    }
}