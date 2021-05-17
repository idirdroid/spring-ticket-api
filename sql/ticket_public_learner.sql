create table learner
(
    id_learner   serial not null
        constraint learner_pk
            primary key,
    lastname     varchar(100),
    firstname    varchar(100),
    id_promotion integer
        constraint learner_promotion_fk
            references promotions
);

alter table learner
    owner to postgres;

INSERT INTO public.learner (id_learner, lastname, firstname, id_promotion) VALUES (8, 'DIOP', 'Thioro', 1);
INSERT INTO public.learner (id_learner, lastname, firstname, id_promotion) VALUES (6, 'JOUINI', 'Nadia', 1);
INSERT INTO public.learner (id_learner, lastname, firstname, id_promotion) VALUES (7, 'MAGHOUB', 'Sabrine', 1);
INSERT INTO public.learner (id_learner, lastname, firstname, id_promotion) VALUES (4, 'ABED', 'Idir', 1);
INSERT INTO public.learner (id_learner, lastname, firstname, id_promotion) VALUES (5, 'BEUZART', 'Clara', 1);
INSERT INTO public.learner (id_learner, lastname, firstname, id_promotion) VALUES (16, 'DELARD', 'Didier', 3);