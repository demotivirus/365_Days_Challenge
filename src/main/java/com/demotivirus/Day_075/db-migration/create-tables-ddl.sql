DROP TABLE IF EXISTS russian CASCADE;

CREATE TABLE russian
(
    id   bigserial   not null
        constraint russian_id primary key,
    word varchar(64) not null
);

DROP TABLE IF EXISTS english CASCADE;

CREATE TABLE english
(
    id   bigserial   not null
        constraint english_id primary key,
    word varchar(64) not null
);

DROP TABLE IF EXISTS russian_english CASCADE;

CREATE TABLE russian_english
(
    russian_id bigint not null,
    english_id bigint not null
);

DROP TABLE IF EXISTS english_phrases CASCADE;

CREATE TABLE english_phrases
(
    id     bigserial    not null
        constraint english_phrases_id primary key,
    phrase varchar(512) unique not null
);

DROP TABLE IF EXISTS public.english_phrases_relationship CASCADE;

CREATE TABLE english_phrases_relationship
(
    english_id bigint not null,
    phrase_id  bigint not null
);
---------WORDS-----------

CREATE UNIQUE INDEX russian_english_index ON russian_english (russian_id, english_id);

alter table russian_english
    add constraint russian_english_rus_id_fk
        foreign key (russian_id) references russian;

alter table russian_english
    add constraint russian_english_eng_id_fk foreign key (english_id) references english;

---------PHRASES-----------

CREATE UNIQUE INDEX english_phrases_relationship_index ON english_phrases_relationship (english_id, phrase_id);

alter table english_phrases_relationship
    add constraint english_phrases_relationship_english_id_fk
        foreign key (english_id) references english;

alter table english_phrases_relationship
    add constraint english_phrases_relationship_phrase_id_fk
        foreign key (phrase_id) references english_phrases;