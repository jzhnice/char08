package Demo03;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Test;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-18 10:03
 */

/**
 * Collection 接口中声明的方法的测试
 * 结论：
 *
 * 向 Collection接口的实现类的对象中添加数据obj时，要求obj所在类要重写equals（）
 */

public class CollectionTest {


    public void test01() {

        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(false);
        Person p = new Person("jerry", 20);
        coll.add(p);
        coll.add(new String("tom"));

//       1.Contains(Object obj)  :判断当前集合中是否包含obj
        //我们在判断是时会调用obj对象所在类的equals（）
        boolean condtains = coll.contains(123);
        System.out.println(condtains);
        System.out.println(coll.contains(new String("tom"))); // true
        System.out.println(coll.contains(new Person("jerry", 20)));  // false;
        System.out.println(coll.contains(p));  // true


        // 2.containsAll(Collection coll1); 判断 从coll1中的所有元素是否都存在与当前集合中
        Collection coll1 = Arrays.asList(123, 456);
        coll.containsAll(coll1);


    }

@Test
    public void test2() {
        // 3.remove(Object obj)  从当前集合中移除obj元素
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("jerry", 20));
        coll.add(new String("tom"));
        coll.add(false);


        coll.remove(123);
        System.out.println(coll);

        coll.remove(new Person("jerry", 20));
        System.out.println(coll);


        //4.removeAll(Collection coll1)   从当前集合中移除从coll1中所有的元素  相同的元素
        Collection coll1 = Arrays.asList(123, 4567);
        coll.removeAll(coll1);
        System.out.println(coll);

    }

    public void test3() {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("jerry", 20));
        coll.add(new String("tom"));
        coll.add(false);

        // 5. retainAll  (Collection coll1)获取当前集合和coll1集合的交际，并返回给当前集合
       // Collection coll1 = Arrays.asList(123, 456,789);
       // coll.retainAll(coll1);


        //6.equals(Object obj):  要想返回true 需要当前集合和形参集合的元素都相同
        Collection coll1 = new ArrayList();
        coll1.add(123);
        coll1.add(456);
        coll1.add(new Person("jerry", 20));
        coll1.add(new String("tom"));
        coll1.add(false);
        System.out.println(coll.equals(coll1));
    }

    public void test4(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("jerry", 20));
        coll.add(new String("tom"));
        coll.add(false);

        //7，hashCode() ：返回当前对象的哈希值
        System.out.println(coll.hashCode());


        // 8.集合---》数组：toArray()

       Object [] arr= coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

       //拓展： 数组---》集合：调用Arrays类的静态方法aslist()
        List<String>list =   Arrays.asList(new String[] {"AA","BB","CC"});
        System.out.println(list);

        List<int[]> arr1 = Arrays.asList(new int[]{123, 456});
        System.out.println(arr1);

        List arr2 = Arrays.asList(new int[]{123, 456});
        System.out.println(arr2);  //1  识别为一个元素


        List arr3 = Arrays.asList(new Integer[]{123, 456});
        System.out.println(arr3);




        // 9：iterator（）；返回iterator接口的实例，用于遍历集合元素，放在iteratorTest.java中测试
    }

}