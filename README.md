# SpringBoot 项目模块化

这是一个简单的SpringBoot模块化的demon。

Clone到本地后直接在IDE中运行web模块下的ModulesApplication
的主函数就可以运行了。

然后访问 http://locaohost:8080/monkey 就可以看到返回值了。

`./web`是我们的web层，主程序就在这里面。

`./service`是模拟的service层，我们的web层依赖了它。

### Maven 模块化
模块间的继承关系和依赖关系是不一样的
- 父模块定义的依赖子模块不能继承，但是子模块可以继承父模块的版本号
- 子模块A依赖子模块B的话，可以发生依赖传递

### 如何基于Maven搭建SpringBoot的模块化工程？

1. 使用Spring Init 初始化一个SpringBoot的项目，作为父项目

2. 将父项目的打包方式修改为pom

3. 创建module。这个在IDEA中直接在根目录上右键 -> 新建module即可。
   
   新建的一个Maven空工程就行了
   
4. 然后看下我的demo，和普通的项目基本类似

### 如何编写多模块的单元测试？
编写多模块的单元测试需要一些技巧
- 每个模块都需要一个SpringBoot启动类来进行单元测试，但是一个项目只能有一个SpringBoot启动类。所以可以将非主模块的启动类放在test目录下
- 每个模块自身的测试配置文件可以放在测试目录下