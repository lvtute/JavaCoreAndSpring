# JavaCoreAndSpring
*Credit: luv2code.com*
## Spring in a Nutshell

- Very popular framework
- Initially a simpler and lightweight alternative to J2EE.
- Provides a large number of helper classes... makes things easier.

## Why Spring?
- Simplify Java Enterprise Development.
## Goal of Spring
- Lightweight development with Java POJOs (Plain-Old-Java-Objects).
- Dependency injection to promote loose coupling.
- Declerative programming with Aspect-Oriented-Programming (AOP).
- Minimize boilerplate Java code.
## What are Spring "projects"?
  - Additional Spring *modules* built-on top of the core Spring Framework.
  - Only use what you need...
    * Spring cloud, Spring data...
    * Spring batch, Spring security...
    * Spring for Android, Spring Web Flow...
    * Spring Web Services, Spring LDAP...
## Inversion of Control (IoC)
- **The approach of outsourcing the construction and management of objects**
- Outsource to a object factory.
## Some basic Spring Core projects with explaination
### 1. spring-demo-one
 **Coding scenerio**

![image](https://user-images.githubusercontent.com/16172615/89800375-e7283b80-db58-11ea-8579-dcd4a0e5bdbf.png)
- App should be configurable.
- Easily change the coach for another sport
	* Hockey, Cricket, Tennis, Gymnastics, ect...

**Ideal solution**

![image](https://user-images.githubusercontent.com/16172615/89854940-67818780-dbbf-11ea-8411-4a6df9a2342f.png)
**Spring Container**
- Primary functions
	- Create and manage objects (Inversion of Control)
	- Inject object's dependencies (Dependency Injection)

![image](https://user-images.githubusercontent.com/16172615/89855189-0c9c6000-dbc0-11ea-83cd-718a2502cf13.png)

**Configuring Spring Container** (3 ways)
- XML Configuration file *(legacy, but most legacy app still use this)*
- Java annotation *(modern)*
- Java Source code *(modern)*

**Spring Development process**
1. Configure your Spring Beans.
2. Create a Spring Container.
3. Retrieve Beans from Spring Container.

**Step 1: Configure your Spring Beans**
File: applicationContext.xml

```xml
<beans ...>

	<bean id="myCoach"
		class="com.thuan.springdemo.BaseballCoach" >
	</bean>
</beans>
```
**Step 2: Create a Spring Container**
```java
ClassPathXmlApplicationContext context = 
	new ClassPathXmlApplicationContext("applicationContext.xml");
```
- Spring Container is generically known as **Application Context**.
- Specialized implementations
	- ClassPathXmlApplicationContext
	- AnnotationConfigApplicationContext
	- GenericWebApplicationContext
	- other...

**Step 3:  Retrieve Beans from Container**
```java
// create a Spring Container
ClassPathXmlApplicationContext context = 
	new ClassPathXmlApplicationContext("applicationContext.xml");
// retrieve bean from Spring Container
Coach theCoach = context.getBean("myCoach", Coach.class);
// "myCoach" is id of the bean
// Coach.class: the interface that BaseballCoach implements.
```

*What is a **Spring Bean**?*
- A "Spring Bean" is simply a Java object.
- When Java objects are created by the Spring Container, then Spring refers to them as "Spring Beans".
- Spring Beans are created from normal Java classes .... just like Java objects.

> In Spring, the objects that form the backbone of your application and that are managed by the Spring IoC container are called *beans*. A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container. Otherwise, a bean is simply one of many objects in your application. Beans, and the dependencies among them, are reflected in the configuration metadata used by a container.

**Dependency injection**

![image](https://user-images.githubusercontent.com/16172615/89857602-bda5f900-dbc6-11ea-87f7-833e55fbd75c.png)
- "dependency" same thing as "helper object".
- **Injcection types**:
	- There are many types of injection with Spring
	- 2 most common:
		- **Construction injection**
		- **Setter injection**
	- Will talk about "auto-wiring" in the Annotations section later

**Bean Scopes**
- Scope refers to the lifecycle of the beans.
- How long does a bean live?
- How many instances are created?
- How is the bean shared?

**Bean is Singleton**
- The Singleton scope is default.
- Spring makes use of Singleton, it'll create only one bean and then share it for everyone who requested that bean.
- **Additional Spring bean scopes**:
![image](https://user-images.githubusercontent.com/16172615/89923383-b57fa500-dc2a-11ea-8d19-59171d8f12cd.png)

### 2. spring-demo-annotation
**What are Java annotation?**
- Special labels/markers added to Java classes.
- Provide meta-data about the classes.
- Processed at compile time or run-time for special processing.

**Spring also supports Default Bean IDs**
- Default bean ID: the class name, *make first letter lower-case*.
![image](https://user-images.githubusercontent.com/16172615/91728107-d3f31380-ebcc-11ea-86a8-0c3cef8d08ce.png)

**What is Spring Autowiring?**
- For dependency injection, Spring can use autowiring.
- Spring will look for a class that *matches* the property
	- matches by type: class or interface.
- Spring will inject it automatically... hence it is autowired.

**Autowiring Injection types**
- Constructor injection 
- Setter injection 
- Field injection
**Bean lifecycle methods/ Hooks**
- You can add custom code during bean initialization
	- Calling custom business logic methods
	- Setting up handles to resources(db, socket, files).
- You can add code during bean destruction
	- Calling custom business logic method
	- Clean up handles to resources(db, socket, files, ect).
- *Development process*
	1. Define your method for init and destroy
	2. Add annotations: @PostConstruc and @PreDestroy


**Java Configuration**
- Instead of configuring Spring container using XML.
- Configure the Spring container with Java code. => no XML.

**3 Ways of configuring Spring container**
1. Full XML config
![image](https://user-images.githubusercontent.com/16172615/91971905-230f8480-ed44-11ea-817d-a714cba29128.png)

2. XML Component Scan
![image](https://user-images.githubusercontent.com/16172615/91971998-3fabbc80-ed44-11ea-8b46-91121eb94bdf.png)

3. Java configuration class
![image](https://user-images.githubusercontent.com/16172615/91972118-6c5fd400-ed44-11ea-91f6-da3f08c6f71f.png)

**Spring MVC overview**
- What is Spring MVC?
	- Framework for building web application in Java.
	- Based on Model-View-Controller design pattern.
	- Leverages features of the core spring framework (IoC, IJ)
	
### 3. spring-mvc-demo
- __@Controller__ inherits from __@Component__... supports scanning.
- @RequestParam

**Spring MVC Form Tags**
- Form Tags will generate HTMl for you.


**Spring Validation Annotation**
spring-mvc-validation-required-fields

**Hibernate**
- How does Hibernate relate to JDBC?
- Hibernate uses JDBC for all database communications

![image](https://user-images.githubusercontent.com/16172615/96584790-ec4bf880-1308-11eb-9237-15bfb30f979d.png)


- Hibernate config with annotation


**Service**
Purposes of Service Layer
- Service Facade design pattern.
- Intermediate layer for custom business logic.
- Integrate data from multiple sources (DAO/repository)

![image](https://user-images.githubusercontent.com/16172615/97334505-68b57d00-18af-11eb-842f-3eb8c75f362b.png)


**Aspects**
- Aspects can be used at multiple locations.
- Same aspect/ class ... applied based on configuration.

![image](https://user-images.githubusercontent.com/16172615/97336214-55a3ac80-18b1-11eb-8cec-04d6542d5572.png)

**AOP solution**
![image](https://user-images.githubusercontent.com/16172615/97336345-7cfa7980-18b1-11eb-80ff-0fd46145ebe1.png)

**Benefits of AOP**
- Code for Aspect is defined in a single class
	- Much better than being scattered everywhere
	- Promotes code reuse and easier to change
- Business code in your application is cleaner
	- Only applies to business functionality: addAccount
	- Reduces code complexity
- Configurable
	- Based on configuration, apply Aspects selectively to different parts of app
	- No need to make changes to main application code... very important!

**Additional AOP Use Cases**
- Most common
	- logging, security, transactions
- Audit loggin
	- who, what, when, where
- Exception handling
	- log exception and notify DevOps team via SMS/email
- API Management
	- how many times has a method been called user
	- analytics: what are peak time? what is average load? who is top user?

**AOP: Advantages and disadvantages**
![image](https://user-images.githubusercontent.com/16172615/97337283-aec01000-18b2-11eb-92be-c08271825ddf.png)

**AOP Terminology**
- Aspect: module of code for a cross-cutting concern (logging, security)
- Advice: What action is taken and when it should be applied
- Join Point: When to apply code during program execution
- Pointcut: A predicate expression for where advice should be applied.

***Advice Types***
- Before advoce: run before the method
- After finally advice: run after the method (finally)
- After returning Advice:  run after the method (success execution)
- After throwing advice: run after method (if exception thrown)
- Around advice: run befor and after method

**Weaving**
- Connecting aspects to target objects to create an advised object

**JpaRepository**
- Spring Data Jpa
- Spring Data Rest (springboot-starter-data-rest)

- HATEOAS: Hypermedia as the Engine of Application State
- Hypermedia-driven site provide information to access REST interfaces.
	- Think of it as meta-data for REST data.

- Spring Data REST advanced features:
	- Pagination, sorting and searching.
	- Extending and adding custom queries with JPQL
	- Query Domain Specific Language (Query DSL)
	@PostConstruct
