create table ticket
(
    id          serial                  not null
        constraint ticket_pk
            primary key,
    date        timestamp default now() not null,
    description varchar(1000),
    id_learner  integer                 not null
        constraint ticket_learner_fk
            references learner,
    open        boolean   default true  not null
);

alter table ticket
    owner to postgres;

INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (29, '2021-05-14 00:00:00.000000', 'test de ticket manuel', 5, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (30, '2021-05-14 00:00:00.000000', 'test de ticket manuel', 5, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (31, '2021-05-14 00:00:00.000000', 'test de ticket manuel', 4, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (32, '2021-05-14 00:00:00.000000', 'test de ticket manuel', 5, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (33, '2021-05-14 00:00:00.000000', 'test de ticket manuel', 4, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (34, '2021-05-14 00:00:00.000000', 'test de ticket manuel', 4, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (35, '2021-05-14 00:00:00.000000', 'test de ticket manuel', 4, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (36, '2021-05-14 00:00:00.000000', 'test de ticket manuel', 4, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (37, '2021-05-14 00:00:00.000000', 'test de ticket manuel', 4, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (38, '2021-05-14 00:00:00.000000', 'test de ticket manuel', 4, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (39, '2021-05-14 00:00:00.000000', 'test de ticket manuel', 4, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (40, '2021-05-14 00:00:00.000000', 'test de ticket manuel', 5, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (41, '2021-05-14 00:00:00.000000', 'test de ticket manuel', 5, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (42, '2021-05-14 00:00:00.000000', 'test de ticket manuel', 5, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (43, '2021-05-14 00:00:00.000000', 'test de ticket manuel', 5, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (44, '2021-05-14 00:00:00.000000', 'test de ticket manuel', 4, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (45, '2021-05-14 10:51:27.896340', 'test de ticket manuel', 4, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (46, '2021-05-14 11:09:10.681837', 'test de ticket manuel', 4, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (47, '2021-05-14 11:27:29.777248', 'test de ticket manuel', 6, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (48, '2021-05-14 11:27:33.960537', 'test de ticket manuel', 8, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (49, '2021-05-14 12:07:11.586891', 'test de ticket manuel', 4, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (50, '2021-05-14 12:07:14.989062', 'test de ticket manuel', 4, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (51, '2021-05-14 12:09:37.637490', 'test de ticket manuel', 7, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (52, '2021-05-14 12:09:41.458934', 'test de ticket manuel', 7, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (53, '2021-05-14 12:09:48.569462', 'test de ticket manuel', 7, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (54, '2021-05-14 12:10:45.985902', 'test de ticket manuel', 8, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (55, '2021-05-14 12:12:41.718476', 'test de ticket manuel', 8, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (56, '2021-05-14 12:13:01.112693', 'test de ticket manuel', 8, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (57, '2021-05-14 12:13:33.168386', 'test de ticket manuel', 5, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (58, '2021-05-14 12:13:35.903582', 'test de ticket manuel', 4, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (59, '2021-05-14 12:14:55.195636', 'test de ticket manuel', 4, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (60, '2021-05-14 12:15:06.596139', 'test de ticket manuel', 4, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (61, '2021-05-14 12:16:17.888127', 'test de ticket manuel', 4, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (62, '2021-05-14 12:21:00.561637', 'test de ticket manuel', 4, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (63, '2021-05-14 12:21:09.862094', 'test de ticket manuel', 4, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (64, '2021-05-14 12:21:13.309910', 'test de ticket manuel', 5, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (65, '2021-05-14 12:21:54.665249', 'test de ticket manuel', 4, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (66, '2021-05-14 12:21:58.750989', 'test de ticket manuel', 7, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (67, '2021-05-14 12:24:52.650474', 'test de ticket manuel', 4, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (68, '2021-05-14 12:26:53.278657', 'test de ticket manuel', 4, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (69, '2021-05-14 12:26:58.625319', 'test de ticket manuel', 4, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (70, '2021-05-14 12:27:01.970804', 'test de ticket manuel', 5, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (71, '2021-05-14 12:31:13.749010', 'test de ticket manuel', 6, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (72, '2021-05-14 12:31:22.266030', 'test de ticket manuel', 8, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (75, '2021-05-14 15:43:47.169993', 'test de ticket manuel', 7, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (76, '2021-05-15 23:52:51.045405', 'test de ticket manuel', 4, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (77, '2021-05-15 23:57:34.698787', 'test de ticket manuel', 6, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (81, '2021-05-16 00:14:53.451773', 'Je Veux de l''aide', 16, true);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (78, '2021-05-16 00:02:27.229048', 'test de ticket manuel', 5, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (79, '2021-05-16 00:06:26.886128', 'test de ticket manuel', 8, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (80, '2021-05-16 00:11:39.562849', 'test de ticket manuel', 4, false);
INSERT INTO public.ticket (id, date, description, id_learner, open) VALUES (82, '2021-05-17 14:08:50.222333', 'Je Veux de l''aide', 8, true);