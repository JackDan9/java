---
title: jackdan_test
tags: java, single, test
author: jackdan

---
# jackdan_test
## A single jackdan_test and Java Learning Path
### `HelloWorld.java`:
- `HelloWorld.java` is the first procedure.
```
public class HelloWorld {
	public static void main(String args[]) {
		System.out.println();
	}
}
```
- Java源文件名必须与类名相同. Java源文件后缀名必须是`.java`;
```
// 文件名: NameTest.java
public class NameTest {}
```
- 类的内容就是类名后面的一对大括号`{}`括起来的内容.

------

### 方法(Method): 物体的功能
- 方法是什么? 方法是类的功能, 是一段程序的载体. 
- 方法也有名字, 方法的内容也是用一对大括号括起来的.
```
public static void main(String args[]) {}
```
- `public static void` 都是用来修饰方法的, 方法名叫做`main()`.
- `String args[]` 是这个方法的参数.
- 什么是参数了？
	- 参数就是这个方法运行时需要的数据.
 - `{}` 内部就是方法的真正内容.
 - 方法也有方法名, 有方法体. 方法体是方法的主要内容.
 - 方法必须源于某个类.

------

### `main()`方法: 所有Java程序执行的起点:
- `main()`方法是Java程序的入口. 当尝试直接运行一个没有`main()`方法的程序时, Java平台会因为找不到`main()`方法而抛出一个错误.

------

## JDK和Java平台:
- JDK也被称为Java平台是用Java构建世界的基础, Java也不可能制造空中楼阁.

### Java Compiler:
- **编译器**会将一个Java源程序转换成Java世界可以理解的物体.
- 命令行输入的`javac`就是这样的功能.

### Java Class Libraries:
- Java类库是Java提供给自己的组建Java世界的各种元素.

### Java Virtual Machine:
- Java虚拟机的作用是去执行一个Java程序. 通过命令行使用`java`命令来启动Java虚拟机.
- `javac HelloWorld.java` -> `HelloWorld.class`;
- `java HelloWorld`; 
- 所以对于`.class`文件而言, Java虚拟机就相当于Windows.

------

## 搭建自己的集成开发环境:
- "工欲善其事，必先利其器", Java中的**器**就是Integrated Development Environment(集成开发环境), 简称IDE.
- 集成开发环境是具有多种功能的供工程师使用的软件.
- 包含的功能有:
	- 编写源代码;
	- 编译源代码;
	- 执行程序;
	- 即时错误信息提示;
	- 项目管理;
	- 程序调试;
	- 程序发布;
	- 等等.
- IDE的环境有哪些(Java):
	- `NetBeans`:
		- `NetBeans`是由开发Java语言的Sun公司开发的一个IDE. 其图形化界面(Graphics User Interface, GUI)使用`Java Swing`开发的.
		- 特点: 免费的、开源的.
	- `JBuilder`:
		- `JBuilder`是由著名的专门开发IDE的公司——宝蓝(Borland)公司开发的`Java IDE`.
		- 特点: 收费的(并且价格不菲)、不开源的.
	- `Eclipse`:
		- 开始主要由`IBM`公司支持开发的, 后面交由开源社区开发和维护.
		- 特点: 免费的、开源的. 
- `Eclipse`的安装以及使用会在Blog中进行阐述.

------

## Java中的基本数据类型和运算符:

### Java中的基本数据类型:
- 编写数据是离不开处理数据的, 计算机中的一个文本文件, 一张图片, 一段视频等都是由数据组成的.
- **基本数据类型**就是一门编程语言所支持的最底层的数据类型.

#### 基本数据类型——编程语言中的数据原子:
- 编写Java程序, 就是使用Java处理数据.
- 在Java的世界中, 虽然数据类型千变万化, 有字符串、图片、文件、音频、视频数据和视频数据等等, 但是构成所有数据类型的基础数据, 只有为数不多的几种.
- **值**和**值域(取值范围)**是Java基本数据类型的两个重要的属性.
- 基本数据类型与数学中的数字类型有一个很不一样的地方就是: 编程语言中的**值域**都是有限的.
- 基本数据类型的种类以及值域:
	- `byte`类型: 
		- 用来表示整数的. 
		- 值域为`[-128, 127]` or `[-2^7, 2^7-1]`.
		- 一个`byte`的值必须是整数, 且不能小于-128, 不能大于127.
	- `short`类型:
		- 用来表示整数的.
		- 值域为`[-32768, 32767]` or  `[-2^15, 2^15-1]`.
	- `int`类型:
		- Java中最常用来表示整数的类型.
		- 值域是`[-2147483648, 2147483647]` or `[-2^31, 2^31-1]`.
	- `long`类型:
		- 用来表示整数的.
		- 值域是[-922 337 203 685 477 5808, 922 337 203 685 477 5807] or [-2^63, 2^63-1].
	- `float`类型:
		- 用来表示有理数的, 在编程语言中被称为浮点数.
		- 值域是[1.4E-45, 3.4028235E38], 但是没有研究的必要.
		- 浮点数的精度:
			- 在计算机系统中, 整数和浮点数的存储是完全不同的. 整数的值是确定的, 1就是1. 浮点数的值是近似的, 对于1.1这个浮点数, 计算机只能够"近似的"将它表示出来而不能完全精确地表示出来.
	- `double`类型:
		- 用来表示浮点数的.
		- 与`float`比较起来就是它的精度更高, 误差更小.
		- 它是Java中最常用来表示浮点数的数据类型.
		- 值域是[4.9E-324, 1.7976931348623157E308], 但是没有研究的必要.
	- `char`类型:
		- 用来表示一个字符的.
		- 字符包括英文字符, 汉字字符以及其他语言中的字符, 所以值域也就是所有字符.
	- `boolean`类型:
		- 用来表示逻辑值`true`和`false`.
		- boolean类型的值只能是`true`和`false`. `true`和`false`都是Java中的关键字, 可以认为`true`就是1, `false`就是0, boolean类型就是一个只能取1或者0的数据类型.
- Java中表示数字的类型的精度从小到大依次是: `byte`, `short`, `int`, `long`, `float`和`double`. 

#### Java运算符:
- 变量(`Variable`): 程序中使用的数据, 可以将变量用于计算.
	- 变量名(Variable Name);
	- 变量类型(Variable Type);
	- 变量的值(Variable Value);
- 变量就是数的载体, 在程序中就是通过创建一个变量来使用基本数据类型的. 数据类型可以说是一个抽象的规定, 而一个变量则是符合这个规定的、可以使用的具体.
- Java中, 分号可以代表一行语句的结束. 以分号为结束的语句是Java中最简单的语句.
- Java中还有复杂的语句, 它们是由Java语法定义的一个语法结构. 根据Java对应的语法规定, 其中可能包含多个由分号组成的Java简单语句.
- 变量的基本语法: "数据类型" + "空格" + "合法的变量名".
```
int varTest
```    
- `int`表示该变量的数据类型是整型.
- `varTest`是变量的名字.
- 变量名必须是Java中一个合法的标识符`identifier`, 规范如下;
	- 标识符必须以英文字母(包括大写和小写或者下划线(`_`)开头;
	- 标识符除开头之外的字符, 允许使用英文字符(包括大写或者小写), 下划线(`_`)和数字. 其余字符都不可以使用;
	- 标识符区分大小写. 也就是`a`和`A`是两个不同的变量名;
	- 标识符不能是Java中的关键字;
	- 标识符不能重名.
- Java中的关键字表:

| abstract   | continue    | for     | new   |	switch	|
| --- | --- | --- | --- | --- |
| assert | default | if | package | synchronized |
| boolean | do | goto | private | this |
| break | double | implements | protected | throw |
| byte | else | import | public | throws |
| case | enum | instanceof | return | transient |
| catch | extends | int | short | try |
| char | final | interface | static | void |
| class | finally | long | strictfp | volatile |
| const | float | native | super | while |

- 变量名不能重名.
```
public class DuplicatedVariableName {
	public static void main(String[] args) {
		int varTest;
		int varTest;
	}
}
```
- 报错信息:
```
DuplicatedVariableName.java:5: 已在main(java.lang.String[]) 中定义 varTest
int varTest
```
- 在实际中给变量一个有意义的名字是一个好习惯, 这会增加程序的可读性.
- 变量的个数以及变量的长度都是有限制的, 但是这个限制的范围足够大.

------

### 基本运算符的类型:
#### 赋值运算符(`=`):
- 用来给变量赋值的.
```
public class PrintInt {
	public static void main(String[] args) {
		int a; // 创建一个变量
		a = 5; // 给变量赋值
		System.out.println(a);
	}
}
``` 
- `// 创建一个变量`是注释, 注释是帮助理解程序的, 是对程序的说明.
- 注释的内容是`//`后面的所有内容, 直至换行.
- 注释的内容在编译过程中将不会被编译器处理.
- Java中, **操作符**的左右两边都是可以有0个到多个空格的, 空格没有任何语法意义, 唯一的作用就是让程序看起来更美观.
- `a = 5`, 赋值符号的左右两边各有一个空格, 把这个空格去掉`a=5`程序依旧可以正常运行.
- 变量类型与变量名之间至少存在一个空格, 这个空格不能去掉`int a`.
```
int a;
a = 5.5;
```
- 不能将一个不合法的赋值给一个变量, 如果这样做了，编译的时候就会报错。
```
PrintInt.java:5: 错误: 不兼容的类型: 从double转换到int可能会有损失
                a = 5.5;
                    ^
1 个错误
```
```
double b;
b = 5;
```
``` java
public class PrintInt {
	public static void main(String[] args) {
		int a;
		// a = 5;
		System.out.println(a);
	}
}
```
- 需要给一个变量赋值才能打印;
```
PrintInt.java:5: 错误: 可能尚未初始化变量a
                System.out.println(a);
                                   ^
1 个错误
```
- `b = 5`5在double的值域中, 所以程序正常运行.
- 赋值运算符要求其右面的值在左面的变量类型的值域中的.
- Java语法规定, 一行Java程序代码的结束需要伴随一个分号`;`.

#### 四则运算符:
- 加法运算符(`+`)、减法运算符(`-`)、乘法运算符(`*`)以及除法运算符(`/`).
- 四则运算符可以用在Java中的整型数据以及浮点型数据上.
```
public class SimpleCount {
	public static void main(String[] args) {
		int a = 1; // 创建a, b和c三个变量, 并分别赋值
		int b = 2;
		int c = 0;
		c = a+b; // 将a加b的运算结果赋值给c
		System.out.println(c); // 输出变量c的值
	}
}
```
- 在Java中, 运行一行声明多个变量`int a = 1, b = 2, c = a+b;`, 但是为了程序代码的可读性以及规范性, 不建议这样做.

#### 括号运算符:
- 括号运算符(`()`)是用来改变运算优先级的, 在`main()`中的`()`不是运算符.
```
public class BracketsTest {
	public static void main(String[] args) {
		int a = 1; // 创建3个变量并且给它们赋值
		int b = 3;
		int c = 0;
		c = ((a + 5) * 3) - b; // 使用括号改变运算符顺序
		System.out.println(c);
	}
}
```
- 小括号一定要左右匹配.

#### 余数运算符:
- 余数运算符是一个百分号(`%`), 用来计算除法中的余数.
- `5%3`的结果是2.
- 余数运算符的优先级与乘法运算符和除法运算符的优先级一样.

------

### 布尔运算符:
- 布尔运算符的结果就是true或者false. 可以将布尔运算符的值赋给一个boolean变量.
- 布尔运算符的优先级低于所有四则运算符.

#### 值对比相关的布尔运算符:
- 值对比运算符有`==`, `!=`, `>`, `<`, `>=`和`<=`. 
- 用来比较**两个值**的.
- 相等运算符(`===`): 是两个连续的等号`=`.
- 用来判断左右两边的值是否相等, 如果相等, 则运算结果为`true`, 否则运算结果为`false`.
```
public class EqualOperator {
	public static void main(String[] args) {
		boolean test = false; // 创建一个boolean变量test, 并且赋值false
		int a = 5;
		int b = 5;
		// test = a==b; // 将表达式a == b的值赋给test
		test = (a==b); // 更容易理解的一种表达式
		System.out.println(test);
	}
}
```
- 运行结果:
```
true
```
- 不等运算符(`!=`): 和相等运算符正好相反, 不等运算符在两个值不想等的时候返回`true`, 在两个值相等的时候返回`false`.
```
public class UnEqualOperator {
	public static void main(String[] args) {
		boolean test = false; // 创建一个boolean变量test, 并且赋值false
		int a = 5;
		int b = 5;
		test = (a!=b); // 将表达式赋值给test
		System.out.println(test);
	}
}

// false
```
- 大于运算符(`>`)和小于运算符(`<`): 大于运算符在左边的值大于右边的值时, 运算结果是`true`, 反之则是`false`, 小于运算符正好相反`<`.
```
public class BiggerOperator {
	public static void main(String[] args) {
		int a = 5;
		int b = 1;
		boolean bigger = (a > b); // 计算a>b的值, 并将结果赋值给boolean变量bigger
		System.out.println(bigger);
	}
}

// true
```
- 大于或等于运算符(`>=`)和小于或等于运算符(`<=`): 大于等于运算符(`>=`)在操作符左边的值大于或者等于右边的值时, 运算结果是`true`, 反之就是`false`.小于或者等于运算符则是操作符左边的值小于或者等于右边的值时, 运算结果是`true`, 反之就是`false`.
```
public class BiggerOrEqualOperator {
	public static void main(String[] args) {
		boolean test = false; 
		int a = 5;
		int b = 5;
		test = (a >= 5);
		System.out.println(test);
	}
}

//true
```

------

### 逻辑运算符

#### **和**运算符(`&`, `&&`):
- `&`(读作`and`):
-922- 它是一个二元操作符;
-922- 运算符左右两边的boolean变量的值都是`true`的时候, 运算结果是`true`, 其余的情况下运算结果是`false`.
```
public class AndOperator {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		boolean c = true;
		boolean value = false;
		value = a & b;
		System.out.println(value);
		value = a & c;
		System.out.println(value);
	}
}
```
- 程序中`&`替换为`&&`运行结果一样, 但是`&&`(读作`and and`)比起`&`更加的智能, `&&`如果左边的boolean变量值是false就会直接返回`false`, 这样就不用去得到右边的boolean变量值.

#### **或**运算符(`|`, `||`读作`or`):
- 也是二元操作符, 并且两个操作数也必须是boolean变量.
- 运算规则是: 当两个boolean变量都是`false`的时候, 运算结果为`false`; 当有一个boolean变量的值为`true`的时候, 运算结果为`true`.
```
public class OrOperator {
	public static void main(String[] args) {
		boolean a = false;
		boolean b = false;
		boolean c = true;
		boolean value = false;
		value = a | b;
		System.out.println(value);
		value = a | c;
		System.out.println(value);
	}
}
```
- `|`与`||`区别也是后者更加智能一些.

#### 取反算符(`!`):
- 取反算符只能用于`boolean`类型的变量.
- 单元操作符.
- 运算规则是: 如果操作数的值为`true`, 则运算结果为`false`; 
``` java
public class Revert {
	public static void main(String[] args) {
		boolean boolValue = false;
		boolean revert = (!boolValue);
		System.out.println(revert);
	}
}
```
- 取反运算符(`!`)是一个单元操作符, 使用时操作数放在它的右边. 它只能用在boolean变量上.

------

### 基本数据类型运算的难点:

#### 强制类型转换:
```java
public class ForceConvert {
	public static void main(String[] args) { // main
		double doubleValue = 9.9; // create a double variable and an int variable
		int intValue = 0;
		intValue = doubleValue;
		System.out.println(intValue);
	}
}
```
- `javac ForceConvert.java`
```
C:\projects\java\JavaTest\src\HelloWorld>javac ForceConvert.java
ForceConvert.java:6: 错误: 不兼容的类型: 从double转换到int可能会有损失
                intValue = doubleValue;
                           ^
1 个错误
```
- 这说明不能把`double`类型的数据值赋值给`int`类型. 那可不可以把`int`类型的数据赋值给`double`类型了?
```
public class DefaultConvert {
	public static void main(String[] args) { // main
		double doubleValue = 0; // create a double variable and an int variable
		int intValue = 5;
		doubleValue = intValue;
		System.out.println(intValue);
	}
}
```
- 运行状态:
```
C:\projects\java\JavaTest\src\HelloWorld>javac ForceConvert.java

C:\projects\java\JavaTest\src\HelloWorld>java ForceConvert
5.0

C:\projects\java\JavaTest\src\HelloWorld>
```
- 以上可以说明可以把`int`类型的数据值赋值给`double`类型, 从数据类型的范围可以得出`double`范围攘括了`int`的范围, 所以默认的话可以把小范围的数据类型的数据值赋值给大范围的数据类型.
- 如果想把大范围的数据类型赋值给小范围的数据类型, 该怎么办了？
```
public class ForceConvert {
	public static void main(String[] args) { // main
		double doubleValue = 9.9; // create a double variable and an int variable
		int intValue = 0;
		intValue = (int)doubleValue;
		System.out.println(intValue);
	}
}
```
- 命令行运行状态:
```
C:\projects\java\JavaTest\src\HelloWorld>javac ForceConvert.java

C:\projects\java\JavaTest\src\HelloWorld>java ForceConvert
9

C:\projects\java\JavaTest\src\HelloWorld>
```
- `intValue = (int)doubleValue;`——强制类型转换, 语法是**"(" + "目标类型" + ")" + "想要转换的值" .
- `(int)doubleValue`就是将一个`double`类型的变量`doubleValue`的值转换成`int`的值.
- 但是上述的输出结果可能会大家会想不通?为什么不是10而是9了？这是Java的特殊处理.
- 在Java中如果将一个浮点数强制转换为一个整数时, Java是不会进行四舍五入操作的, 而是直接将浮点数的小数部分全部删除.
- 也就是说, 如果将0.9进行强制类型转换, 那么得到的结果也是0. 很多人都不能接收, 所以可以书写四舍五入的代码:
```
public class ForceConvert {
	public static void main(String[] args) {
		double doubleValue = 0.9;
		int intValue = 0;
		intValue = (int)(doubleValue + 0.5);
		System.out.println(intValue);
	}
}
```
- 命令行运行结果:
```
C:\projects\java\JavaTest\src\HelloWorld>javac ForceConvert.java

C:\projects\java\JavaTest\src\HelloWorld>java ForceConvert
1

C:\projects\java\JavaTest\src\HelloWorld>
```

- 整数类型之间, 如果将一个高精度类型的值赋值给一个低精度类型的变量, 也是需要进行强制类型转换的.
```
public class ForceConvertIntType {
	public static void main(String[] args) {
		byte byteValue = 0; // create an int variable and a byte varibale.
		int intValue = 9;
		byteValue = (byte)intValue;
		System.out.println(byteValue);
	}
}
```
- 对于Java中的数字类型, Java中允许直接将一个低精度的值赋给高精度的变量(比上面更合理的说法).
- 如果需要将一个高精度的值转换成低精度的值时, 需要对高精度的值进行强制类型转换. Java中强制类型转换的语法是:**"(" + "目标类型" + ")" + "想要转换的值"**.
- 在将一个高精度的值转换成低精度的值时, 需要确定这个高精度类型变量的值能够在低精度中表示, 否则, 结果可能是意料之外的.

#### 类型的转换在运算中悄悄的进行:
- 在很多运算的情况下, 很可能需要将一个`int`类型的变量和一个`double`类型的变量相加. 
- 其实在对两个不同类型的变量进行运算时, Java会先将精度低的变量转换成高精度的变量(Java可以将高精度变量值转换成低精度变量值, 也可以反过来转换). 然后对两个同类型的变量进行运算, 最后返回的精度也是高精度的.
```java
public class CountAndConvert {
	public static void main(String[] args) {
		double doubleValue = 9.9;
		int intValue = 9;

		double result = doubleValue + intValue;
		System.out.println(result);
	}
}
```
- 将`double`的变量`doubleValue`和`int`的变量`intValue`进行相加. Java在运算的时候发现这两个操作数的类型是不一致的(一个为`int`, 一个为`double`), Java首先找到的是精度低的类型变量, 也就是`intValue`, 然后将它的值转换为精度高的类型, 在代码中就是`double`类型.
- 然后Java就会将两个`double`的变量值进行相加. 加法执行的结果也是`double`类型的数据. 如果在这里把result的值设置为`int`, 则会发生前面**强制类型转换**中提示的错误.
```java
C:\projects\java\JavaTest\src\HelloWorld>javac ForceConvert.java
ForceConvert.java:6: 错误: 不兼容的类型: 从double转换到int可能会有损失
                intValue = doubleValue;
                           ^
1 个错误
```
- 同样地, 对于其他运算符`-`, `*`, `/`以及`%`也满足运算类型的转换, Java对于它们做的是同样的处理. 运算结果的类型就是所有操作数中精度最高的那个.
- 如果直接写一个数字, 那么它是什么类型?
```java
public class AutoConvert {
	public static void main(String[] args) {
		byte byteValue = 9/4;
	}
}
```
- 大家看到上面的代码, 可能会疑惑, 对于在程序中直接出现的数字, 如果是整数, Java会使用`int`类型变量来表示它, 如果是浮点数, Java就会使用`double`的类型去表示它.上面程序代码中的运算结果岂不是一个`int`类型吗? 但是jackdan运行运行之后发现并没有出现类型转换的错误, 这又是为什么了?.
- 实际上, 如果jackdan电脑上的JDK版本是旧版本的话, 其实以上的程序代码会报出类型转换错误.
- 最新的JDK版本, Java会自动将运算的结果转换为我们想要的结果(这正是jackdan所想要的).
- 所以上面的程序代码Java会自动把运算结果转换成`byte`数据类型.
```java
public class AutoConvert {
	public static void main(String[] args) {
		// byte byteValue = 9/4;
		int intValue = 9;
		byte byteValue = intValue/4;

	}
}
```
- 运行代码结果:
```java
AutoConvert.java:5: 错误: 不兼容的类型: 从int转换到byte可能会有损失
                byte byteValue = intValue/4;
                                         ^
1 个错误
```
- 因为在这里的`intValue`是一个**变量**, 而不是一个**直接的数值**.
```java
public class AutoConvert {
	public static void main(String[] args) {
		// byte byteValue = 9/4;
		// int intValue = 9;
		// byte byteValue = intValue/4;
		double doubleValue = 9/4;
		System.out.println(doubleValue);
	}
}
```
- 程序代码运行结果:
```
2.0
```
- 为什么是2.0?
- 对于直接写在程序中的整数, Java是使用`int`来计算的. 
- 所以, `9/4`就是两个`int`值的除法, 它不会保留小数部分, 所以它的值就是2.
- 然后Java会将这个2转换为`double`类型并赋给`doubleValue`变量, 那么`doubleValue`变量就应该是`2.0`(对于浮点数, 就算小数部分是0也要加上, 以表示它是一个浮点数).
- 当操作符的操作数有不同的精度时, Java会将低精度的操作数转换成高精度的操作数, 然后进行运算. 运算的结果也是高精度的值.
- 对于直接出现在程序中的整数, Java会当作`int`类型进行处理; 对于浮点数, Java会当作`double`处理.

#### 强制类型转换最优先:
- **强制类型转换**的运算优先级**高于** **算数运算符**的.
```java
public class ForceConvert {
	public static void main(String[] args) {
		double doubleValue = 9.9;
		int intValue = 0;
		intValue = (int)doubleValue + 0.5;
		System.out.println(intValue);
	}
}
```   
- 这可能会报出一个错误, 为什么了？
- 因为Java中强制类型转换运算的优先级高于算数运算符. 所以`(int)doubleValue + 0.5`的运算顺序就是先把变量`doubleValue`强制类型转换成`int`类型, 然后再与`0.5`进行加法操作. `0.5`是一个`double`变量, 那么就是`int`变量和`double`变量进行加法运算, 所有报错了.
- 强制类型转换运算的优先级高于算数运算.
- 使用强制类型运算的时候, 一个好习惯是将转换的**变量**或者**表达式**用**小括号括起来**. 这样可以有效地避免出错, 而且可以让程序更加易读.

#### 等号其实不简单:
- 等号除了赋值还有更丰富的用法.
```java
public class ContinueAssign {
	public static void main(String[] args) {
		int a = 0;
		int b = (a = 5);
		System.out.println(a);
		System.out.println(b);
	}
}
```
- `int b = (a = 5);`
- `a=5`不仅仅是完成了赋值, 它其实也会返回一个结果, 它的结果就是完成赋值操作后等号左边的变量值.所以它相当于:
```java
a = 5;
int b = a;
```
- Java的等号有了这个功能就可以连续地给变量赋值了.
```java
public class UseInAssign {
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		b = a+b;
		System.out.println(b);
	}
}
```
- 等号(`=`)除了会完成操作以外, 也跟其他运算符一样, 会返回一个值.
- 在等号左边的表达式中可以使用等号右边的变量.

#### 小心使用浮点数:



