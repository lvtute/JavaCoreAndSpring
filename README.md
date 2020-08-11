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

<!--stackedit_data:
eyJkaXNjdXNzaW9ucyI6eyJ6Zno3RVlZTTF6WDNVWlVHIjp7In
N0YXJ0IjoyMDgxLCJlbmQiOjIwOTAsInRleHQiOiJcIm15Q29h
Y2hcIiJ9fSwiY29tbWVudHMiOnsiUVNCbThlWlBPRXpkdFZJdi
I6eyJkaXNjdXNzaW9uSWQiOiJ6Zno3RVlZTTF6WDNVWlVHIiwi
c3ViIjoiZ286MTAzNzg5Nzk4NTgwOTMxNDA3MDc5IiwidGV4dC
I6IklkIGlzIGxpa2UgYW4gYWxpYXMiLCJjcmVhdGVkIjoxNTk3
MTE4NDMwNjI2fX0sImhpc3RvcnkiOlsxNTU3NzMxNTY4LDE3OT
k0NjQ0MDUsLTExODczMzA5MDgsNDAxMjI3MDIxLDQwMTIyNzAy
MSwxOTU5MDQ4MjcyLDE3NDI5MzA3NDMsODk5NjI0NzMxLC0zOT
k2MzQyNDZdfQ==
-->