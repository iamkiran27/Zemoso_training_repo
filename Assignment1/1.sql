-- SQL Query Assignment - 1
-- 1. Find out the PG-13 rated comedy movies. DO NOT use the film_list table.
select * from film inner join
 (select * from film_category where category_id=5) as result
 on film.film_id = result.film_id and film.rating="PG-13";
 

 