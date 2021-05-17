create table promotions
(
    id_promotion   serial not null
        constraint promotions_pk
            primary key,
    promotion_name varchar
);

alter table promotions
    owner to postgres;

INSERT INTO public.promotions (id_promotion, promotion_name) VALUES (1, 'Natixis 1');
INSERT INTO public.promotions (id_promotion, promotion_name) VALUES (3, 'La poste');
INSERT INTO public.promotions (id_promotion, promotion_name) VALUES (4, 'BNP Paribas');