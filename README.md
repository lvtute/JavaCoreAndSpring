# JavaCoreAndSpring
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

**Step 3: R**

<!--stackedit_data:
eyJkaXNjdXNzaW9ucyI6eyJ6Zno3RVlZTTF6WDNVWlVHIjp7In
N0YXJ0IjoyMDU3LCJlbmQiOjIwNjYsInRleHQiOiJcIm15Q29h
Y2hcIiJ9fSwiY29tbWVudHMiOnsiUVNCbThlWlBPRXpkdFZJdi
I6eyJkaXNjdXNzaW9uSWQiOiJ6Zno3RVlZTTF6WDNVWlVHIiwi
c3ViIjoiZ286MTAzNzg5Nzk4NTgwOTMxNDA3MDc5IiwidGV4dC
I6IklkIGlzIGxpa2UgYW4gYWxpYXMiLCJjcmVhdGVkIjoxNTk3
MTE4NDMwNjI2fX0sImhpc3RvcnkiOlsxOTU4ODU5ODcwLDQwMT
IyNzAyMSw0MDEyMjcwMjEsMTk1OTA0ODI3MiwxNzQyOTMwNzQz
LDg5OTYyNDczMSwtMzk5NjM0MjQ2XX0=
-->