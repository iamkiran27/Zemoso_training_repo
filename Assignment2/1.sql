-- 1. Find out the number of documentaries with deleted scenes.

use sakila;

 select count(A.film_id) as totalDoumentaries from (select film_category.film_id from film_category inner join category on category.category_id= film_category.category_id where category.name like "Documentary" ) as A
 inner join film on film.film_id = A.film_id where film.special_features like "%Deleted Scenes%"