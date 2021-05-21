package Demo05;

/**
 *
 *
 * Collection 接口  单列接口，用来存储一个一个的对象
 *               List接口：存储有序、可重复的数据   --->“动态”数组 ,替换原有的数组
 *  ArrayList    作为List接口的主要实现类    线程不安全的   效率高 ；  底层使用Object[]存储  elementDate存储
 *  LinkedList     对于频繁的插入、删除操作，使用此类效率比ArrayList 高 底层使用双向链表存储
 *  Vector    作为List的古老实现类   线程安全的    效率低   ；  底层使用Object[]存储     elementDate存储
 *
 *  面试题：ArrayList    LinkedList   Vector
 *   三者的异同：
 * 同：三个类都实现了List接口 存储数据的特点相同  ，存储有序的 可重复的数据
 *不同：见上
 *
 * ArrayList的源码分析： jdk7 的情况下：
 * ArrayList  list =new ArrayList(); //    底层创建了长度为10的Object[]数组  elementDate
 *list.add(123); //elementDate[0] = new Integer(123);
 * ...
 * list.add(11); // 如果此次的添加导致底层elementDate数组容量不够，则扩容
 * 默认情况下，扩容为原来的容量的1.5倍，同时需要将原有数组中的数据赋值到新的数组中。
 *
 * 结论：建议开发中使用带参的构造器；ArrayList list = new ArrayList(int capacity)
 *
 *  jdk8 的情况下：
 *ArrayList  list =new ArrayList();  // 底层 Object[] elementDate 初始化为{}，并没有创建长度
 *list.add(123);  // 第一次调用add()时，底层才创建了场地10的数组，并将数据123 添加到elementDate
 *后续的添加和扩容操作和jdk7 无异
 *
 * 小结
 * jdk7中的 ArrayList 的创建类似与 单例的饿汉式，而jdk8中的A rrayList的对象的创建类似于单例中的懒汉式 延迟了数组的创建，节省内存
 *
 *
 *LinkedList 的源码分析：
 *LinkedList  list = new  LinkedList() ;内部声明了node类型的first和last属性，默认值为null
 * list.add(123);将123 封装到node中，创建了node对象
 *
 * 其中 Node定义为：  体现了 Linkedlist的双向链表的说法
 * private static class Node<E>{
 *     E item;
 *     Node<E> next;
 *     Node<E> prev;
 *
 *     Node(Node<E> prev,E element,  Node<E> nexst){
 *     this.item = element;
 *     this.next = next;
 *     this.prev = prev;
 *         * }
 *
 *
 *
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-21 09:47
 */
public class Listtest {

}
