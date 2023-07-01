package script

import groovy.transform.TypeChecked

/**
 * @Author: lly
 * @Date: 2023/5/28
 */
// 动态类型
//def v = 0;//定义了数值类型的变量v
//v = new Date();//然后又给它赋与Date类型的值.
//
//println(v);


//简单明了的list,map类型
//可以使用groovy简单明了的定义list和map数据
//
//使用"[]"定义list列表，并，对其直接操作
//使用":"分隔key和value来定义map数据，key不需要用引号引起来，并且能使用key对其直接对map进行读写操作

// list 可以看到的是编译器帮我们作何类型识别
//def list = [1, 2]
//// 这个是groovy的list的API从左边插入一个记录
//list.leftShift(3)
//// push是从插入到列表前面
//list.push(0)
//// add和我们java的List一样是追加到最后
//list.add("abc")
//// groovy中的<<可以对list数据类型的作用添加值，也是追加到最后面，需要注意的是在数字类型时是位运算操作
//list << "<<号";
//// "+"在groovy的语法中也是追加元素到集合中，并且是追加到最后
//list += "加上+="
//
//println(list)

//list.forEach({ println(it)})

////map
//def map = [a: 2, b: new Date()];
//
//// 写入 直接追加到map集合中
//map.put("aaaa","bbb")
//
//println(map)
//// 写入 直接采用Map的key进行操作
//map.a = "a value change"
//println(map)


//// 在groovy世界任何东西都是对象
//// 怎么理解上面的概念呢，对照着Java语言来说，我们都知道在Java语言中有是区分对待基本类型和引用类型的。基本类型是没有方法调用的因为基本类型是按值访问的，在这个方面Groovy比Java更像是一个面向对象语言。
//// 在java中，区分对待基本类型和引用类型的；
//// 在groovy中，一切都是对象。一切都可以当成对象来使用；
//100.times {println("hello world")}


//// 属性操作变得更容易
//// 不同意Java中要操作一个对象中的属性必须通过get,set方法，即使是将属性定义成private。在groovy中，定义一个javabean，不再需要写getter,setter方法。读写属性直接用"."号操作即可
//
//class JavaBeans {
//    String a
//    // 即使是定义成private 也可以直接访问
//    //    private String a
//}
//
//def beans = new JavaBeans();
//
//beans.a = "object set property value"
//
//println(beans.a)


//// GString
////GString是Groovy提供的快速处理字符串的工具。双引号""号的下字符串，可以直接通过 $var 或者 ${var}方式简单明了的嵌入变量。并且GStrng会调用包含的闭包 无参GString会调用闭包并打印我们期待的结果到Writer。
//
//// case1
//def a = "a"
//def b = "b"
//// a=a,b=b 快速替换字符串变量
//println("a=${a},b=$b")
//
//// case2
//def name = 'lly'
//def hello = "hello $name !"
//// 结果：hello lly ! 快速替换字符串变量
//println hello
//// 注意这一行
//name = '阳仔'
//// 结果：hello lly !
//println hello
//
//// case3　：GStrng会调用包含的闭包 无参GString会调用闭包并打印我们期待的结果到Writer
//def quote = "${-> name} , welcome"
//// 结果：阳仔 , welcome
//println quote
//// 注意这一行
//name = 'lisi'
//// 结果：lisi , welcome
//println quote

//
////闭包
////闭包中内置了很多迭代方法，如find、findAll、collect等等。
//
//def list = ['foo', 'bar']
//def newList = []
//list.collect(newList) {
//    it.toUpperCase()
//}
//println newList
//
////或者
//list = ['foo', 'bar']
//newList = []
//list.collect(newList, {
//    it.toUpperCase()
//});
//println newList
//
////在groovy中,闭包可以看成是一个 代码块，它可以没有参数和返回值；它像java 8以上的lambda语法 或者，像一个有一个方法的java内部类
////在groovy闭包中的隐含内置变量
////it，当闭包的方法中，没有定义任何参数时，也可以直接用it变量；
////
////this 跟java中的this一样
////
////owner 基本上跟this一样，只是除了一种情况，如果该闭包是在其他的闭包中定义的，owner就指向定义它的闭包对象。 如上面最后一种创建上下文：
//
//def a = {
//    println "a this:" + this
//    println "a owner:" + owner // ower指向b
//
//    def b = {
//        println "b this:" + this
//        println "b owner:" + owner // ower指向b
//    }
//    b.call()
//
//}
//a.call()


// delegate 基本上是跟owner的一样，除非它通过Closure.setDelegate()

//def scriptClosure = {
//    println "scriptClosure this:" + this
//    println "scriptClosure owner:" + owner
//    println "scriptClosure delegate:" + delegate
//}
//println "before setDelegate()"
//scriptClosure.call()
//scriptClosure.setDelegate("lly")
//println "after setDelegate()"
//scriptClosure.call()


////Switch变得更好用
////groovy中的switch可以允许专入list,对象，范围...等表达式作为case依据
////如：
//def x = 20;
//switch (x) {
//    case [1, 2, 3, 4, 5]:
//        println("aaaaaa")
//        break;
//    case "foo":
//        println("bbbbb")
//    case 10..1000:
//        println("ccccc")
//        break;
//    case Date:
//        println("dddddd")
//        break;
//}


//元编程
//在groovy中，可以使用 metaClass类来，对元对象添加属性和方法
//如：对String类，添加一个uppers方法

//String.metaClass.uppers = { -> toUpperCase() };
//println "aaa".uppers()
//
//Integer.metaClass.say = { -> "I am Interger" }
//def i = new Integer(100);
//println i.say()
//
//class Person {
//    String name;
//    Integer age;
//
//    String eat() {
//        println(name + "like eat")
//    }
//}
//def p = new Person(name: "阳仔", age: 18)
//p.eat()
//
//// 给对象添加属性
//p.metaClass.sex = '男'
//// 给对象添加方法
//p.metaClass.drink = {
//    -> println "喜欢喝饮料"
//}
//// 给对象添加静态方法
//p.metaClass.static.play = {
//    -> println "喜欢玩游戏"
//}
//
//println "${p.name}，今年${p.age}岁了，性別是${p.sex}"
//p.drink()
//p.play()


//用@TypeChecked注解进行强类型检查
//class Foos{
//    int  i = 42.0; //编译通过
//}
//
//@TypeChecked
//class Foo{
//    int  i = 42.0; //编译不通过
//}

//在闭包中，如果需要强类型检查，可以像java语法一样定义参数类型
//如：
//def list = ["a", "b", "c"]
//// 编译不通过
////def list = ["a","b","c", 1]
//list.collect {
//    String it -> it.toUpperCase()
//}
//println(list)


//Elvis Operator 运算
//进一步简化三元运算符
//def a = null;
//def b = a ?: "b"; // 在定义b变量时，先判断a是否有值，如果有，就取a的值作为b的值，否则就取值"b"
//println(b)


//安全访问

def person;
String name = person?.getName();//先判断person是否为不为null,然后，再调用getName方法
println(name)