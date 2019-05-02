# SpringBoot 项目模块化

这是一个简单的SpringBoot模块化的demon。

Clone到本地后直接在IDE中运行web模块下的ModulesApplication
的主函数就可以运行了。

然后访问 http://locaohost:8080/monkey 就可以看到返回值了。

## 如何基于Maven搭建SpringBoot的模块化工程？

1. 使用Spring Init 初始化一个SpringBoot的项目，作为父项目

2. 将父项目的打包方式修改为pom

3. 创建module。这个在IDEA中直接在根目录上右键 -> 新建module即可。
   
   新建的一个Maven空工程就行了
   
4. 然后看下我的demo，和普通的项目基本类似