-- 5. Find out the number of movies in which “SEAN WILLIAMS” acted.


use sakila;
  select  
   A.actor_id, A.totalMovies, actor.first_name, actor.last_name
  from ( SELECT actor_id, count(film_id) as totalMovies FROM film_actor  where actor_id=72 group by actor_id) as A inner join actor on actor.actor_id = A.actor_id;