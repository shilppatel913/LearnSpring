**What is Spring**
Spring is a Framework of java that uses dependency injection to make java applications loosely coupled.

**Different Layer**
UI Layer - Strut/JSF
Business Layer - Security , Transaction Management
Database Access Layer - JDBC ,ORM

**Modules**
![spring modules](https://user-images.githubusercontent.com/74822210/193542537-2cee877a-b2e2-4eef-8e7d-ac85709fac4e.jpg)

1) Core ,Beans,Context helps to achieve dependency injection
2) AOP achieves decoupling
3) ORM means integrating hibernate features into your spring application.
4) Spring Web is another module which offers all the web related modules like websocket,servlet.

**Spring IOC Container**
It is a predefined component of code.It handles the lifecycle of an object from creation till destruction.It consists of the following steps
1) Creating an object
2) Holding memory for an object
3) Implementing dependency injection between beans/Objects as and when required.

After this point the application code can simply get the objects from the container.

**Application Context**
It is a representation of Spring IOC container class.
It is an interface and has sub classes whose objects can be created (XML ,ANNOTATION,FILE)

**Types of Dependency Injection **
1) Using Setter method - Making setter methods to access the values of the attributes of the dependent class as well as the values of attributes of the class it is dependent on.
2) Using Constructor method - Making constructor methods to access the values of the attributes of the dependent class as well as the values of attributes of the class it is dependent on.

**Configuration File**
Configuration file is an XML file where we have to mention all the beans(the classes where dependency injection is needed) so that the IOC container can easily access
them and make changes accordingly.
Spring IOC supports primitive datatypes, Collection type and user defined types and works well with each of them equally.



