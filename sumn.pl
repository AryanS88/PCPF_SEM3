prod_list([], 1).
prod_list([H|T], prodd) :-
   prod_list(T, Rest),
prodd is H * Rest.
