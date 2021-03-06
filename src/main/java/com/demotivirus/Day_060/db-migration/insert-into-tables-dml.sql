insert into public.eng (word) --id1
values ('him');
insert into public.eng (word) --id2
values ('which');
insert into public.eng (word) --id3
values ('universe');
insert into public.eng (word) --id4
values ('world');
insert into public.eng (word) --id5
values ('peace');
insert into public.eng (word) --id6
values ('shine');
insert into public.eng (word) --id7
values ('light');

--------------------------------------------

insert into public.rus (word) --id1
values ('его');
insert into public.rus (word) --id2
values ('ему');
insert into public.rus (word) --id3
values ('какой');
insert into public.rus (word) --id4
values ('который');
insert into public.rus (word) --id5
values ('что');
insert into public.rus (word) --id6
values ('мир');
insert into public.rus (word) --id7
values ('свет');
insert into public.rus (word) --id8
values ('вселенная');
insert into public.rus (word) --id9
values ('покой');
insert into public.rus (word) --id10
values ('спокойствие');

--------------------------------------------

insert into public.rus_eng (rus_id, eng_id)
values (1, 1);
insert into public.rus_eng (rus_id, eng_id)
values (2, 1);
insert into public.rus_eng (rus_id, eng_id)
values (3, 2);
insert into public.rus_eng (rus_id, eng_id)
values (4, 2);
insert into public.rus_eng (rus_id, eng_id)
values (5, 2);
insert into public.rus_eng (rus_id, eng_id)
values (6, 3);
-- insert into public.rus_eng (rus_id, eng_id)
-- values (6, 4);
insert into public.rus_eng (rus_id, eng_id)
values (6, 5);
insert into public.rus_eng (rus_id, eng_id)
values (7, 4);
insert into public.rus_eng (rus_id, eng_id)
values (8, 4);
insert into public.rus_eng (rus_id, eng_id)
values (9, 5);
insert into public.rus_eng (rus_id, eng_id)
values (10, 5);
insert into public.rus_eng (rus_id, eng_id)
values (7, 6);
insert into public.rus_eng (rus_id, eng_id)
values (7, 7);

--------------------------------------------

insert into public.eng_phrases (eng_id, phrase)
values (1, 'Winston Smith, his chin nuzzled into his breast in an effort
to escape the vile wind, slipped quickly through the glass doors of
Victory Mansions, though not quickly enough to prevent a swirl of gritty
dust from entering along with him.');
insert into public.eng_phrases (eng_id, phrase)
values (1, 'He tried to squeeze out some childhood
memory that should tell him whether London had always been quite like
this.');
insert into public.eng_phrases (eng_id, phrase)
values (1, 'Winston poured out nearly a teacupful,
nerved himself for a shock, and gulped it down like a dose of medicine.');
insert into public.eng_phrases (eng_id, phrase)
values (1, 'It was partly the unusual geography of the room that had suggested to him the thing that he was now about to do.');
insert into public.eng_phrases (eng_id, phrase)
values (1, 'A sense of complete helplessness had descended upon him.');

insert into public.eng_phrases (eng_id, phrase)
values (2, 'It was one of those pictures which
are so contrived that the eyes follow you about when you move.');
insert into public.eng_phrases (eng_id, phrase)
values (2, 'Inside the flat a fruity voice was reading out a list of figures which
had something to do with the production of pig iron.');
insert into public.eng_phrases (eng_id, phrase)
values (2, 'The voice came from
an oblong metal plaque like a dulled mirror which formed part of the
surface of the right-hand wall.');
insert into public.eng_phrases (eng_id, phrase)
values (2, 'He moved over to the window: a
smallish, frail figure, the meagerness of his body merely emphasized by
the blue overalls which were the uniform of the Party.');
insert into public.eng_phrases (eng_id, phrase)
values (2, 'Any sound
that Winston made, above the level of a very low whisper, would be
picked up by it; moreover, so long as he remained within the field of
vision which the metal plaque commanded, he could be seen as well as
heard.');