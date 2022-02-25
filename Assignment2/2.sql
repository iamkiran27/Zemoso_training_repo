-- 2. Find out the number of sci-fi movies rented by the store managed by Jon Stephens.


use sakila ;

select C.film_id , D.first_name,D.last_name, C.name,C.title, C.description, C.release_year, C.special_features, C.rental_rate  from 
(select film.film_id, B.name, film.title, film.description, film.release_year, film.special_features, film.rental_rate from
 (select film_category.film_id, category.name from film_category inner join category on category.category_id = film_category.category_id where category.name like "Sci-Fi") 
 as B inner join film on B.film_id= film.film_id) as C inner join 

(select A.first_name, A.last_name, inventory.film_id from
 (select staff.staff_id,store.store_id, staff.first_name,  staff.last_name from staff inner join store on staff.store_id = store.store_id where (staff.first_name like "Jon" and staff.last_name like "Stephens") ) as A 
 inner join inventory on A.store_id = inventory.store_id) as D on C.film_id= D.film_id;