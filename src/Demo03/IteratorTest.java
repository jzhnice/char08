package Demo03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * 集合元素的遍历操作   使用迭代器Iteratir接口
 *1.集合对象每次调用iterator()方法都得到一个全新的迭代器对象，默认游标都在集合的第一个元素之前
 *2、内部的方法：hasNext()和next()
 *3.内部定义了remove（），可以在遍历的时候，删除集合中的元素。此方法不同于集合直接调用remove（）调用的是迭代器里面的
 *  如果还未调用next（）或在上一次调用next方法之后已经调用了remove方法，在调用remove都会报错（IllegalstateException)
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-18 11:19
 */
public class IteratorTest {

    public void test01() {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("jerry", 20));
        coll.add(new String("tom"));
        coll.add(false);


        Iterator iterator = coll.iterator();
        // 方式1：
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        //方式二   不推荐
        for (int i = 0; i < coll.size(); i++) {
            System.out.println(iterator.next());

        }



        //方式三
        //hasNext();判断是否还有下一个元素
        while(iterator.hasNext()){
            //next（）：1指针下移，2将下移以后集合位置上的元素返回
            System.out.println(iterator.next());
        }
    }


    public  void test02(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("jerry", 20));
        coll.add(new String("tom"));
        coll.add(false);


        // 错误方式一：
        Iterator itertor = coll.iterator();
        while ((itertor.next()!=null)) {
            System.out.println(itertor.next());
        }


        // 错误方式二：
        while(coll.iterator().hasNext()){
            System.out.println(coll.iterator().next());
        }  //  死循环
    }
     //测试Iterator中的remove（）

        public void test3(){
            Collection coll = new ArrayList();
            coll.add(123);
            coll.add(456);
            coll.add(new Person("jerry", 20));
            coll.add(new String("tom"));
            coll.add(false);
            Iterator itertor = coll.iterator();
//            移除了tom
            while (itertor.hasNext()){
                Object obj = itertor.next();
                if("tom".equals(obj)){
                    itertor.remove();
                }
            }
//            从头遍历
            itertor = coll.iterator();
            while (itertor.hasNext()){
                System.out.println(itertor.next());
            }
        }


}
