package list.arraylist.implementation


class Main {

    fun main(args:Array<String>) {
        val Arraynumbers = ArrayList()
        Arraynumbers.addLast(10)
        Arraynumbers.addLast(20)
        Arraynumbers.addLast(30)
        Arraynumbers.add(1, 15)
        Arraynumbers.addFirst(5)
        println(Arraynumbers.indexOf(10))

    }
}