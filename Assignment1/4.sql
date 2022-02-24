
-- 4. Find out the list of customers from Canada who have rented “NICK WAHLBERG” movies.

use sakila;

select table4.film_id, table4.actor_id, actor.first_name, actor.last_name, table4.country, table4.customer_id from (select table3.film_id, table3.customer_id, table3.country, film_actor.actor_id from (select table1.customer_id, table2.film_id, table1.country from (select B.customer_id,B.country_id,country.country, B.city from
  (select A.customer_id, city.country_id, city.city  from
 (select customer.customer_id, customer.address_id, address.city_id from customer 
 inner join address on customer.address_id = address.address_id) as A 
  inner join city on A.city_id = city.city_id )  
 as B  
 inner join country on  B.country_id = country.country_id where country.country = "Canada" ) as table1 inner join 
 
(select A.customer_id, A.film_id from
 (select rental.customer_id, inventory.inventory_id, inventory.film_id from  
 rental inner join inventory on rental.inventory_id = inventory.inventory_id ) 
 as A inner join film_category on film_category.film_id = A.film_id)  as table2 on table1.customer_id= table2.customer_id order by table1.customer_id) as table3 inner join 
 
 film_actor on table3.film_id = film_actor.film_id where film_actor.actor_id=2 ) as table4 inner join actor on table4.actor_id = actor.actor_id ;

