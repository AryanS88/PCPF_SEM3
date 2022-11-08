prod_list([], 0).
prod_list([H|T], prodd) :-
   prod_list(T, Rest),
prodd is H * Rest.
