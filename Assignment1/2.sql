-- 2. Find out the top 3 rented horror movies.


use sakila;

select  table3.film_id,  table3.totalCustomers, film_list.title , film_list.category from ( select table2.film_id,count(table2.customer_id)as totalCustomers from (select film_category.category_id, film_category.film_id, category.name from film_category inner join category on category.category_id= film_category.category_id where category.name like "%Horror%") as table1 inner join 


 (select A.customer_id,inventory.film_id from (select payment.payment_id,payment.customer_id,payment.rental_id ,rental.inventory_id from payment inner join rental where payment.rental_id= rental.rental_id) as A

inner join inventory on inventory.inventory_id= A.inventory_id) as table2 on table1.film_id = table2.film_id group by table2.film_id  order by totalCustomers desc  limit 3 ) as table3 inner join
film_list on table3.film_id = film_list.FID