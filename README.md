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

**Types of Dependency Injection**
1) Using Setter method - Making setter methods to access the values of the attributes of the dependent class as well as the values of attributes of the class it is dependent on.
2) Using Constructor method - Making constructor methods to access the values of the attributes of the dependent class as well as the values of attributes of the class it is dependent on.

**Configuration File**
Configuration file is an XML file where we have to mention all the beans(the classes where dependency injection is needed) so that the IOC container can easily access
them and make changes accordingly.
Spring IOC supports primitive datatypes, Collection type and user defined types and works well with each of them equally.

**Lifecycle methods of Spring IOC**
There are two important methods which will be called while creating a bean in our configuration file.
1) public void init()- You can change the function name but not the signature
2) public void destroy()- You can change the function name but not the signature

The init() method initializes all the work beforehand like connecting to the db or integrating a particular webservice in the configuration file.
The destroy() method closes all the open connections or webservices and stores the work for later purposes when the user is not using the system anymore.

The sequential steps while creating a bean are as follows :
1) Creating object of the bean.
2) Setting the values of the attributes of that object with setter and constructor injection.
3) Calling init() method
4) Reading and using the bean.
5) destroy() method is called.
6) Closing the bean.

**Configure technique**
1) Using xml 
2) Using spring interface
3) Using Annotation

**Autowiring**
It is a very useful feature of spring framework in which spring container injects the dependencies automatically.
Manual injection is no more needed in auto wiring.
It only works on referencing type that is objects.

**You can do autowiring with help of two things**
1) Using XML
  Autowiring modes :
    no mode
    byName
    byType
    constructor
    auto-detect - deprecated in spring3
    
 2) Using Annotation
  @Autowire annotation can be used to perform autowiring.
  
  
  **Standalone Collections**
  Until now we have been creating a collection specific to a particular property using the list tag. Now with the help of util schema we can 
  create standalone collections where we can mention the type of the class of a particular interface and declare it globally so that we can use 
  the same list/set/map in multiple beans without having to copy paste it again and again.


**Stereotyoe Annotation**
We can use @Component annotation to declare a bean rather than using a bean tag inside the xml file
The <context:component-scan base-package="" /> will declare a bean for you given you have used the @Component annotation
The object name will be in the camel case format by default , you can also change it inside the compnent args according to your need.
You can set the value of the attributes using @Value annotation above every attribute and mentioning the value.



**Bean Scope**
When we are accessing the object of a bean there are different types of scopes associated with it.
1) Singleton - Everytime you get the object the same object will be referenced for you if the scope is singleton
2) Prototyope - Everytime you get the object different object will be created for you if the scope is prototype
3) Request 
4) Session
5) GlobalSession

We can mention the scope in the bean tag or using annotations with @Component annotation only.

**Spring Expression Language**
We can perform certain computations in the form of an expression language and pass it inside the @Value annotation.
The expression can contain a simple computation ,static method which is returning a value , static variable, an object etc.
General Format @Value("#{expression}")


**Removing XML file and configuring beans with only annotations**
We can remove the whole xml file and we can create a new java class which is our configuration file and  declare beans using @componentScan annotation
or directly the @Bean annotation.This way we can get rid of the xml configuration.

__________________________________________________________________________________________________________________________________________________________



