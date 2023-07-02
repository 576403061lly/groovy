# groovy
groovy learn
![image](https://github.com/576403061lly/groovy/assets/19943444/e8bc2253-aa21-4877-9b43-8610d6771a6c)

为什么要学习Groovy
        作为Java为主语言的程序员，Groovy作为Java平台上的脚本语言（动态语言）在兼容方面是有得天独厚的优势。接触过Aandroid开发的同学大家都已经接触到啦Gradle构建项目（Gradle构建也支持Java项目的构建），Gradle就是采用Groovy实现的用于构建项目的框架。还有就是新版本的idea推荐使用Gradle进行插件开发。当然以上只是从客观方面阐述Groovy技术的发展趋势（包含但不仅限于这些方面）来说明我们需要学习，从自身层面来说多学多益，或者说有技术追求或者技术理想的同学，多学一门技术也是对自己的提升。接下来就让我们一起走进Groovy的世界吧。

# Groovy 介绍

        Apache Groovy是一种强大的、可选的类型和动态语言，具有静态类型和静态编译功能，用于Java平台，旨在通过简洁、熟悉和易于学习的语法提高开发人员的生产力。它可以与任何Java程序顺利集成，并立即为您的应用程序提供强大的功能，包括脚本功能、领域特定语言创作、运行时和编译时元编程以及函数式编程。
                                    -- groovy 官网
        以上是官网介绍，我个人的通俗理解如下，Groovy是用于Java虚拟机的一种敏捷的动态语言，是一种成熟的面向对象编程语言，又是一种纯粹的脚本语言。Groovy运行在JVM环境上，在语法上兼具java 语言和脚本语言特点，大大简化了语法。同时又具有闭包和动态语言中的其他特性，弥补了单纯的Java代码所不具备的动态性，我们可以在程序运行时任意修改代码逻辑，不需要重新发布。
        Groovy 1.0于2007年1月2日发布。 Groovy通过Apache License v 2.0发布。Groovy的官方网站是The Apache Groovy programming language
# Groovy 特点
Groovy中有以下特点（官网API文档：The Apache Groovy programming language - Groovy Development Kit）：
Groovy是基于Java虚拟机的一种面向对象的脚本语言，同时支持静态和动态类型。
Groovy对于Java开发人员来说很简单，因为Java和Groovy的语法非常相似，可以使用现有的Java库。
支持运算符重载。
本地语法列表和关联数组。
对正则表达式的本地支持。
各种标记语言，如XML和HTML原生支持。
Groovy扩展了java.lang.Object。
# 一、在Java中使用Groovy：
添加Groovy的依赖到Java项目中。

在Java代码中使用Groovy的类和脚本。Groovy代码可以直接在Java中执行，可以调用Groovy类的方法、访问其属性等。可以使用GroovyShell或GroovyClassLoader来执行Groovy脚本。
# 二、在Groovy中使用Java：
Groovy天生支持Java，可以直接使用Java类、调用Java方法等。Groovy代码可以与Java代码混合编写。

在Groovy代码中使用Java类时，不需要额外的导入，直接使用即可。

Groovy还提供了更简洁的语法和更强大的特性，例如闭包、扩展方法、动态类型等，可以更方便地编写代码。
# Java调用Groovy的类和方法：
描述：Java可以直接通过类路径访问Groovy的类和方法，将Groovy代码视为Java代码的一部分。可以调用Groovy类的方法、访问其属性等。

不同：Java可以无缝地调用Groovy类和方法，就像调用Java代码一样。

优点：简单直接，Groovy与Java代码混合编写非常方便。

缺点：对于Groovy独有的特性，如闭包、动态类型等，Java可能无法完全理解。
# Groovy调用Java的类和方法：
描述：Groovy天生支持Java，可以直接使用Java类、调用Java方法等。Groovy代码可以与Java代码混合编写，无需额外导入。

不同：Groovy与Java的集成非常融洽，可以自动导入Java类，直接使用Java的语法。

优点：无缝集成，可以充分利用Java的生态系统和已有的库。

缺点：Groovy在某些方面可能比Java更“动态”，这意味着在一些情况下可能会有性能和类型安全性的损失。

# 使用GroovyShell执行Groovy脚本：
描述：在Java代码中使用GroovyShell执行Groovy脚本代码块。可以动态加载和执行Groovy脚本。

不同：通过GroovyShell的evaluate方法，可以在Java中执行动态的Groovy脚本代码。

优点：能够在运行时动态执行Groovy脚本，灵活性高，方便快捷。

# 缺点：动态执行脚本可能会带来一定的性能影响，并且需要额外的语法检查。
使用GroovyClassLoader加载和执行Groovy脚本：

描述：在Java中通过GroovyClassLoader加载和执行Groovy脚本，可以实现更灵活的脚本执行。

不同：通过GroovyClassLoader加载Groovy脚本，可以获得对应的Class对象，并根据需要进行实例化和调用。

优点：可以灵活地加载和执行Groovy脚本，并与Java代码进行交互。缺点：相对于GroovyShell，使用GroovyClassLoader需要更多的代码来实现加载和执行。

# 下面是我的学习系列：欢迎大家三连
Groovy系列一 Groovy基础语法：https://blog.csdn.net/lly576403061/article/details/130913526

Groovy系列二 Groovy GDK：https://blog.csdn.net/lly576403061/article/details/130921886?spm=1001.2014.3001.5502

Groovy系列三 Java SpringBoot 整合 Groovy：https://blog.csdn.net/lly576403061/article/details/131505699?spm=1001.2014.3001.5501
