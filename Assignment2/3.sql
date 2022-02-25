

-- 3. Find out the total sales from Animation movies.


use sakila;

select count(distinct table1.customer_id) as totalCustomers from (select A.payment_id,A.customer_id, inventory.film_id from (select payment.payment_id ,payment.customer_id, payment.rental_id, rental.inventory_id from payment
 inner join rental on rental.rental_id = payment.rental_id order by payment.payment_id) as A inner join inventory on A.inventory_id= inventory.inventory_id order by A.payment_id )as table1 inner join  


(select film_category.film_id,category.name from film_category inner join category on film_category.category_id= category.category_id where category.name like "Animation") as table2 on table1.film_id=table2.film_id 


-- Altenative

SELECT * FROM sakila.sales_by_film_category where sakila.sales_by_film_category.category like "Animation";
