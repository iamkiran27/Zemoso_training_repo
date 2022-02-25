-- 4. Find out the top 3 rented category of movies by “PATRICIA JOHNSON”.

use sakila;

select * from(select B.payment_id,B.first_name, B.last_name, inventory.film_id from 
(select A.payment_id,A.first_name,A.last_name,rental.inventory_id, rental.rental_id from 
(select payment.payment_id,payment.rental_id, customer.customer_id, customer.first_name, customer.last_name from payment 
inner join customer on payment.customer_id = customer.customer_id where customer.first_name like "%PATRICIA%" AND customer.last_name LIKE "%JOHNSON%") as A

inner join rental on A.rental_id = rental.rental_id) as B 

inner join inventory on inventory.inventory_id = B.inventory_id )as C

inner join film on film.film_id= C.film_id limit 3