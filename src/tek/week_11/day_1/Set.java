package tek.week_11.day_1;

public class Set {

/*    In Java, Set is an interface that is part of the Java Collections Framework. It represents a collection that cannot contain
duplicate elements. It models the mathematical set abstraction and is used to create collections that should be unique by definition.

    Here are some key points about the Set interface:

    Uniqueness: The Set ensures that only unique elements are stored. No two objects are considered equal as per the equals() method.

    Ordering: The Set interface does not guarantee any specific order of its elements. However, some implementations like LinkedHashSet
    maintain the order of insertion, and TreeSet maintains a sorted order.

    Null Elements: While Set allows null elements, the number is limited to one, given that no two nulls can be equal to each other.

    Performance: Different implementations of the Set interface have different performance characteristics. For instance, HashSet
    offers constant time performance for basic operations like add, remove, and contains (assuming the hash function disperses the
    elements properly among the buckets).

    No Index-Based Methods: Set does not have methods for getting or setting elements by index position.

    Common Implementations:

    HashSet: The most commonly used implementation, which stores its elements in a hash table, is the best-performing implementation;
    however, it makes no guarantees concerning the order of iteration.

    LinkedHashSet: An ordered version of HashSet that maintains a doubly-linked list across all elements. It orders its elements
    based on the order in which they were inserted into the set (insertion-order).

    TreeSet: Implements the SortedSet interface and uses a Red-Black tree structure. It stores elements in a sorted (ascending) order,
    and allows for retrieval of elements in that sorted order.

    Use Cases:

    To remove duplicates from a collection.
    When the order is not a concern (for HashSet) or when you need a collection sorted by natural order or by a comparator (for TreeSet).
    When you want to maintain insertion order (for LinkedHashSet).
    */
}
