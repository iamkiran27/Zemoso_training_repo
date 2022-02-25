-- 3. Find out the list of customers from India who have rented sports movies.


use sakila;


select table1.customer_id, table1.city from (select B.customer_id,B.country_id,country.country, B.city from
  (select A.customer_id, city.country_id, city.city  from
 (select customer.customer_id, customer.address_id, address.city_id from customer 
 inner join address on customer.address_id = address.address_id) as A 
  inner join city on A.city_id = city.city_id )  
 as B  
 inner join country on  B.country_id = country.country_id where country.country = "India" ) as table1 inner join 
(select A.customer_id from
 (select rental.customer_id, inventory.inventory_id, inventory.film_id from  
 rental inner join inventory on rental.inventory_id = inventory.inventory_id ) 
 as A inner join film_category on film_category.film_id = A.film_id where film_category.category_id = 15 group by A.customer_id )  as table2 on table1.customer_id= table2.customer_id order by table1.customer_id;


