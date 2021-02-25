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

DROP TABLE IF EXISTS english_phrases;

CREATE TABLE english_phrases
(
    english_id bigint       not null,
    phrase     varchar(512) not null
);

CREATE UNIQUE INDEX russian_english_index ON russian_english (russian_id, english_id);

alter table russian_english
    add constraint russian_english_rus_id_fk
        foreign key (russian_id) references russian;

alter table russian_english
    add constraint russian_english_eng_id_fk foreign key (english_id) references english;

--------------------

alter table english_phrases
    add constraint english_phrases_eng_id_fk foreign key (english_id) references english;