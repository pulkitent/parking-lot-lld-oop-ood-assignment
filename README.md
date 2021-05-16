# PROBLEM STATEMENT:

**We will focus on the following set of requirements while designing the parking lot:**

1. The parking lot should have multiple floors where customers can park their cars - **Done**

2. The parking lot should have multiple entry and exit points - **Done**

3. Customers can collect a parking ticket from the entry points and can pay the parking fee at the exit points on their way out - **Done**

4. The system should not allow more vehicles than the maximum capacity of the parking lot. If the parking is full, the system should be able to show a message at the entrance panel and on the parking display board on the ground floor - **Done**

5. Each parking floor will have many parking spots. The system should support multiple types of parking spots such as Small, Medium, Large etc - **Done**

6. Each parking floor should have a display board showing any free parking spot for each spot type - **Done**

7. Customers can pay the tickets at the automated exit panel or to the parking attendant. - **TODO**

8. Customers can pay via both cash and credit cards. - **TODO**

9. The Parking lot should have some parking spots specified for electric cars. These spots should have an electric panel through which customers can pay and charge their vehicles. - **TODO**

10. Customers should also be able to pay the parking fee at the customer’s info portal on each floor. If the customer has paid at the info portal, they don’t have to pay at the exit. - **TODO**

11. The system should support a per-hour parking fee model. For example, customers have to pay $4 for the first hour, $3.5 for the second and third hours, and $2.5 for all the remaining hours. - **TODO**

PS - This project also containes some TODO. You can be my guest and can raise a PR with these TODO implemented :P

# What the company is looking for or What are the company's expectations?

They are looking for people who can write code that has flexibility built in, by
adhering to the principles of Object Oriented Development, and have the ability to
deal with the real-life constraints/trade-offs while designing a system.

It is important to note that they are not looking for a GUI and they are not assessing
you on the capabilities around code required to do the I/O. The focus is on the
overall design. So, while building a solution.
Following is a list of things to keep in mind, before you submit your code :

1. Is behaviour of an object distinguished from its state and is the state
encapsulated?
   
2. Have you applied SOLID principles to your code?
   
3. Have you applied principles of YAGNI and KISS (additional info here)?
   
4. Have you looked at basic refactoring to improve design of your code?
   
5. Finally, and foremost, are the principles applied in a pragmatic way.

Simplicity is the strongest of the trait of a piece of code. However, easily
written code may not necessarily be simple code.

So this is a gradle based project on java. It's an Objected Oriented Design(OOD) problem generally asked in interviews. Main reason behind asking these kind of problems in interview is to see whether a candidate can do following :

1. Can a candidate write a working code in given short span of time.

2. Can a candidate write higly readbale code. Intention must be clear by reading the code.

3. Can a candidate follow the principle the of DRY (Don't Repeat Yourself) and avoid to break encapsulation by following Domain Driven Design(DDD).

4. Can a candidate achieve the solution with minimum number of elements using YAGNI principle (that is without creating unnecesarry interfaces etc).


# Things I tried to follow :

1. Tried to create all the required domain entities/models as per problem statement

2. Tried not to break encapsulation by avoiding getters & setters (as much as possible)

3. Tried to have immutable state with value objects (as much as possible) so as to avoid 
concurrency issues (Thread safety)

4. Tried to have readable methods & variables naming so as to clear the intention 
(4 rules of simple design).
 
5. Tried to have small & logical commits

6. Tried to avoid code duplication by refactoring/reusing duplicate code (DRY) 
but still code duplication can be improved if given more time

7. Didn't make interfaces as per YAGNI principles because for now I don't feel 
the need for the same (Yes, I am aware of this principle also - "Program to interfaces rather 
than concrete implementation")

8. Tried to put some comments so as to make business logic more understandable

9. Wrote the job on every class so as to clear it's use case


# Things I could have done/improved if given more time :

1. TDD with 100% code coverage

2. Code duplication can be further reduced at some extent

3. Level of indentation can be further reduced in some methods by breaking them into smaller methods

4. Encapsulation of behaviour in some classes can be further improved

5. More mocking and stubbing of test data in unit tests
