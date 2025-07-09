package delegationinclasseskeywordby

class CountingSet<T>(
    val innerSet: MutableCollection<T> = HashSet<T>()
) : MutableCollection<T> by innerSet {                 // Делегирование реализации MutableCollection объекту в поле innerSet
    var objectsAdded = 0


    // Собственная реализация вместо делегирования ---->
    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(c: Collection<T>): Boolean {
        objectsAdded += c.size
        return innerSet.addAll(c)
    }
}