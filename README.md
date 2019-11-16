This is a gradle based on java. It's an Objected Oriented Design(OOD) problem generally askied in interviews. Main reason behind asking these kind of problems in interview is to see whether a candidate can do following :
1. Can a candidate write a working code in given short span of time.
2. Can a candidate write higly readbale code. Intention must be clear by reading the code.
3. Can a candidate follow the principle the of DRY (Don't Repeat Yourself) and avoid to break encapsulation by following Domain Driven Design(DDD).
4. Can a candidate achieve the solution with minimum number of elements using YAGNI principle (that is without creating unnecesarry interfaces etc).

**PROBLEM STATEMENT**

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
