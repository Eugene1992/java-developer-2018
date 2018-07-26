CREATE TABLE role (
  id   SERIAL PRIMARY KEY,
  name VARCHAR NOT NULL UNIQUE
);

INSERT INTO role (id, name) VALUES (1, 'admin');
INSERT INTO role (id, name) VALUES (2, 'user');
INSERT INTO role (id, name) VALUES (3, 'moderator');
INSERT INTO role (id, name) VALUES (4, 'guest');

CREATE TABLE user_detail (
  id     SERIAL PRIMARY KEY,
  phone  VARCHAR(64) NOT NULL UNIQUE,
  email  VARCHAR(64) NOT NULL UNIQUE,
  age    INT,
  gender VARCHAR(64)
);

INSERT INTO user_detail (id, phone, email, age, gender) VALUES (1, '801-101-6446', 'fschwartz0@cnet.com', 17, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (2, '492-609-4986', 'nsorrel1@liveinternet.ru', 51, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (3, '313-393-8163', 'eberthomieu2@vistaprint.com', 44, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (4, '836-502-2196', 'nharrowell3@ovh.net', 90, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (5, '443-583-4826', 'cromayne4@prnewswire.com', 13, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (6, '917-970-8297', 'mluca5@answers.com', 10, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (7, '992-865-6452', 'mzambon6@businesswire.com', 17, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (8, '212-287-1127', 'amaleck7@de.vu', 98, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (9, '546-918-8416', 'rbacks8@google.ru', 90, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (10, '271-420-2852', 'cfulham9@sbwire.com', 67, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (11, '718-714-2112', 'sdoudnya@nsw.gov.au', 66, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (12, '298-102-8906', 'hhatherleyb@discovery.com', 33, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (13, '515-822-1771', 'dsimkinc@indiegogo.com', 34, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (14, '687-494-1594', 'tiacobonid@un.org', 29, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (15, '350-246-1608', 'bhinckse@springer.com', 71, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (16, '475-977-8006', 'spilsworthf@squidoo.com', 45, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (17, '672-244-7047', 'jlonghig@salon.com', 96, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (18, '294-713-9052', 'femslieh@npr.org', 70, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (19, '972-454-5264', 'bfildei@exblog.jp', 31, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (20, '581-777-5133', 'rcanlandj@globo.com', 38, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (21, '561-231-3916', 'danstyk@ft.com', 70, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (22, '149-416-6401', 'knapperl@tripadvisor.com', 85, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (23, '954-186-3325', 'rearwickerm@canalblog.com', 51, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (24, '723-120-8261', 'dmiddlern@godaddy.com', 80, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (25, '403-877-0757', 'lcrooto@pbs.org', 95, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (26, '321-819-4470', 'iwarykp@trellian.com', 100, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (27, '875-415-0337', 'okilohq@thetimes.co.uk', 92, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (28, '315-947-1857', 'gbolwellr@geocities.jp', 41, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (29, '214-554-5673', 'dfumagallis@youku.com', 15, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (30, '311-662-0016', 'pabramoviczt@addthis.com', 44, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (31, '156-135-8832', 'tmackessocku@telegraph.co.uk', 21, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (32, '300-460-0380', 'stampionv@census.gov', 89, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (33, '410-703-8226', 'mquarlisw@exblog.jp', 93, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (34, '688-976-8369', 'bstrathdeex@123-reg.co.uk', 21, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (35, '430-540-7923', 'qcottely@uol.com.br', 50, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (36, '316-448-0029', 'wakhurstz@hibu.com', 27, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (37, '403-883-0096', 'bbrydone10@hud.gov', 40, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (38, '150-762-4745', 'etabart11@cargocollective.com', 85, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (39, '289-935-1011', 'lmoysey12@skyrock.com', 62, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (40, '212-129-4736', 'emellenby13@yelp.com', 98, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (41, '683-403-3873', 'hianne14@goodreads.com', 77, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (42, '824-806-9709', 'bhonatsch15@flavors.me', 12, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (43, '156-409-9066', 'kpaddeley16@bbb.org', 81, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (44, '906-961-6887', 'hblakebrough17@dyndns.org', 42, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (45, '176-329-4906', 'cbenardet18@livejournal.com', 85, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (46, '546-630-7591', 'dtrevallion19@stumbleupon.com', 40, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (47, '870-105-0398', 'foshiel1a@example.com', 39, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (48, '239-260-5289', 'cseares1b@microsoft.com', 56, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (49, '357-871-9713', 'rlloydwilliams1c@omniture.com', 85, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (50, '676-386-9815', 'gbishopp1d@gnu.org', 11, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (51, '985-709-4844', 'kparsand1e@squidoo.com', 17, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (52, '251-389-2424', 'lgranham1f@bloomberg.com', 93, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (53, '907-280-7298', 'amenci1g@stanford.edu', 60, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (54, '819-457-0845', 'gbrimman1h@wp.com', 53, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (55, '270-869-4239', 'uslay1i@indiatimes.com', 99, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (56, '863-689-0170', 'kbrittles1j@tripod.com', 53, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (57, '758-796-8021', 'jlillee1k@jugem.jp', 70, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (58, '767-301-0193', 'jnewlove1l@europa.eu', 86, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (59, '625-223-9834', 'apavel1m@google.nl', 69, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (60, '653-675-8189', 'cattenbrow1n@cocolog-nifty.com', 22, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (61, '885-278-6326', 'rlamburn1o@facebook.com', 84, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (62, '572-995-3835', 'sfolomkin1p@marriott.com', 68, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (63, '799-535-9071', 'oendle1q@java.com', 27, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (64, '595-577-0759', 'dtunuy1r@addtoany.com', 84, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (65, '728-586-3156', 'jbradie1s@walmart.com', 50, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (66, '711-245-7851', 'mdolley1t@oracle.com', 81, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (67, '863-917-7506', 'mhovy1u@ameblo.jp', 41, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (68, '601-628-5344', 'ewakeford1v@t.co', 91, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (69, '997-478-4282', 'tmangeot1w@elegantthemes.com', 71, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (70, '792-475-6812', 'rodams1x@tripod.com', 51, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (71, '177-738-6757', 'skillimister1y@fotki.com', 37, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (72, '943-740-2250', 'nlyenyng1z@aboutads.info', 84, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (73, '944-173-2424', 'kpo20@unblog.fr', 86, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (74, '761-865-2537', 'mcrichten21@wordpress.com', 35, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (75, '869-953-1877', 'barangy22@toplist.cz', 99, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (76, '842-668-2731', 'sburchall23@time.com', 12, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (77, '571-322-5331', 'cholston24@cisco.com', 89, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (78, '942-168-7671', 'esanders25@free.fr', 65, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (79, '772-642-9901', 'clindroos26@infoseek.co.jp', 97, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (80, '371-393-6826', 'bkilligrew27@discuz.net', 51, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (81, '116-555-1991', 'blehrer28@netvibes.com', 59, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (82, '587-540-1500', 'tgloster29@ucoz.com', 73, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (83, '711-325-5831', 'cbetteridge2a@mozilla.org', 94, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (84, '499-257-6106', 'cgoodanew2b@narod.ru', 61, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (85, '382-532-9563', 'eboost2c@amazonaws.com', 55, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (86, '967-611-8166', 'jbodycote2d@github.com', 24, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (87, '816-134-0692', 'dmanjot2e@arstechnica.com', 24, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (88, '400-668-4846', 'llindelof2f@pagesperso-orange.fr', 93, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (89, '525-292-5730', 'mcastledine2g@goo.ne.jp', 67, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (90, '452-769-2228', 'gpiesing2h@barnesandnoble.com', 60, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (91, '453-403-0832', 'hgisburn2i@instagram.com', 21, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (92, '647-400-7976', 'jewings2j@nih.gov', 15, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (93, '860-877-9455', 'agibke2k@storify.com', 82, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (94, '514-386-9280', 'mandreotti2l@seesaa.net', 49, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (95, '527-216-2853', 'blidyard2m@themeforest.net', 90, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (96, '418-344-0933', 'ipennrington2n@privacy.gov.au', 55, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (97, '867-858-6309', 'tsonier2o@canalblog.com', 15, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender) VALUES (98, '662-545-8191', 'chail2p@foxnews.com', 44, 'Male');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (99, '373-602-7846', 'mwitton2q@bbc.co.uk', 28, 'Female');
INSERT INTO user_detail (id, phone, email, age, gender)
VALUES (100, '983-516-6314', 'dmussalli2r@mtv.com', 89, 'Female');

CREATE TABLE "user" (
  id             SERIAL PRIMARY KEY,
  first_name     VARCHAR(64) NOT NULL,
  last_name      VARCHAR(64) NOT NULL,
  username       VARCHAR(64) UNIQUE,
  password       VARCHAR(64) NOT NULL,
  user_detail_id INT UNIQUE REFERENCES user_detail (id),
  role_id        INT REFERENCES role (id)
);

INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (1, 'Godwin', 'Humpatch', 'ghumpatch0', 'D7aRWJ', 1, 3);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (2, 'Arden', 'Simounet', 'asimounet1', 'UQNG8nu', 2, 4);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (3, 'Winonah', 'Tomkins', 'wtomkins2', 'lOubOMO3NH', 3, 4);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (4, 'Homer', 'Imlock', 'himlock3', 'snB0VP3bhp', 4, 4);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (5, 'Dorthea', 'Sturrock', 'dsturrock4', 'n9Z2v6', 5, 2);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (6, 'Benito', 'Seabrook', 'bseabrook5', 'PBK9vYk', 6, 3);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (7, 'Addia', 'Coultish', 'acoultish6', 'rbaOlWlFLg', 7, 1);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (8, 'Avictor', 'McIlherran', 'amcilherran7', 'QN9jSNC', 8, 2);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (9, 'Jard', 'Veelers', 'jveelers8', 'TuymgNjyl2FH', 9, 1);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (10, 'Jacquette', 'Wauchope', 'jwauchope9', 'jv2JG2Ym2cG', 10, 1);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (11, 'Christophe', 'Cundy', 'ccundya', 'n5HozjdVh3', 11, 3);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (12, 'Kirstyn', 'Cassius', 'kcassiusb', 'IIcZnCBjW', 12, 1);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (13, 'Kelcy', 'Hatt', 'khattc', 'sOQqZ7B', 13, 1);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (14, 'Krystyna', 'Matches', 'kmatchesd', 'hViFEOTpwsJ9', 14, 4);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (15, 'Lucius', 'Ongin', 'longine', 'XogUXjL', 15, 3);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (16, 'Lonnard', 'Hammerstone', 'lhammerstonef', 'Uziy3X', 16, 2);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (17, 'Meris', 'Smallsman', 'msmallsmang', 'y5pY5q51', 17, 2);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (18, 'Merrill', 'Gansbuhler', 'mgansbuhlerh', 'bZLkuohuqk', 18, 2);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (19, 'Yvon', 'Dearnley', 'ydearnleyi', 'OsbMNKqr', 19, 2);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (20, 'Jordanna', 'Wahlberg', 'jwahlbergj', 'HhQEFr1vVOSQ', 20, 3);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (21, 'Sandie', 'Colbrun', 'scolbrunk', 'Xngm2nOP1', 21, 2);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (22, 'Wilbert', 'Chaff', 'wchaffl', 'MCEbhaio', 22, 4);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (23, 'Sharai', 'Teague', 'steaguem', 'PrVg3MEmtz', 23, 4);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (24, 'Ferne', 'Bailess', 'fbailessn', 'PaIizXZY', 24, 1);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (25, 'Merilyn', 'Largen', 'mlargeno', '3PR4HnS', 25, 3);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (26, 'Bobbie', 'Plumb', 'bplumbp', 'glzKtwIf2L', 26, 4);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (27, 'Jon', 'Moffat', 'jmoffatq', 'rnVjqBx', 27, 1);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (28, 'Meggi', 'Dougherty', 'mdoughertyr', 'QCHAyLYF332h', 28, 1);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (29, 'Chariot', 'Beveridge', 'cbeveridges', 'NuyVnntP', 29, 2);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (30, 'Waylan', 'Sallis', 'wsallist', 'xjCKee', 30, 2);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (31, 'Alie', 'Murray', 'amurrayu', '5VUxiRnv0my7', 31, 1);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (32, 'Roda', 'Dauber', 'rdauberv', 'dUHgrfU0sYIq', 32, 1);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (33, 'Gabbey', 'Pea', 'gpeaw', 'VX2Fll', 33, 2);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (34, 'Gustav', 'Sivess', 'gsivessx', 'momYT8KE', 34, 1);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (35, 'Charlot', 'Leopard', 'cleopardy', 'xm1aTf', 35, 3);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (36, 'Marv', 'Ellin', 'mellinz', 'ZIOAZl2', 36, 4);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (37, 'Lark', 'Wanek', 'lwanek10', 'Co9MAm4R', 37, 1);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (38, 'Berkley', 'Arbor', 'barbor11', 'BeovgaScK8', 38, 1);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (39, 'Alene', 'Cuschieri', 'acuschieri12', 'GgNUBqlDFFOo', 39, 2);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (40, 'Katrina', 'Burbidge', 'kburbidge13', 'M3gyDTwFbx', 40, 3);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (41, 'Ellwood', 'Wickstead', 'ewickstead14', 'tQETxzNlFvmu', 41, 1);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (42, 'Janna', 'Frowen', 'jfrowen15', 'prvGAw3NrF8L', 42, 4);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (43, 'Darcy', 'Marlor', 'dmarlor16', 'iDMtiz0LaS', 43, 1);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (44, 'Sheilah', 'Canter', 'scanter17', 'lJoq2E', 44, 3);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (45, 'Nikki', 'Tacey', 'ntacey18', 'D5XdYxa', 45, 3);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (46, 'Jobey', 'Inglesent', 'jinglesent19', 'k1Yc5faUU', 46, 3);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (47, 'Tadeas', 'Fareweather', 'tfareweather1a', 'pxwiopxbFIjm', 47, 3);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (48, 'Theressa', 'Nicholes', 'tnicholes1b', 'YOmfPLo', 48, 2);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (49, 'Barry', 'Limming', 'blimming1c', 'Ab5Au70mVDR', 49, 4);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (50, 'Sondra', 'McNeigh', 'smcneigh1d', 'iYI5AOkqIR', 50, 1);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (51, 'Lonna', 'Otto', 'lotto1e', 'n6tQ9cO', 51, 3);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (52, 'Sly', 'Tomlett', 'stomlett1f', 'hNcfvik', 52, 2);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (53, 'Rena', 'Mishaw', 'rmishaw1g', 'YHWDbFsE5I91', 53, 2);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (54, 'Zane', 'Raffan', 'zraffan1h', 'uen0Vx401', 54, 1);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (55, 'Winna', 'Franzelini', 'wfranzelini1i', 'JOiOpVBOpxkn', 55, 2);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (56, 'Bessie', 'Giacomelli', 'bgiacomelli1j', 'CAGMa0LOcnLq', 56, 1);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (57, 'Giorgio', 'Rahill', 'grahill1k', 'JhHlkIADFsI', 57, 1);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (58, 'Debbie', 'Bellard', 'dbellard1l', 'pM5W1dvQyBa', 58, 4);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (59, 'Carl', 'Chatelain', 'cchatelain1m', 'aQyKegJQ', 59, 3);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (60, 'Eziechiele', 'Belfrage', 'ebelfrage1n', 'w5Xwf3m', 60, 2);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (61, 'Rosalinde', 'Redsall', 'rredsall1o', 'nVOuUAK6C9', 61, 4);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (62, 'Chip', 'Keyser', 'ckeyser1p', 'xRTJLlI6JYu4', 62, 2);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (63, 'Linet', 'Hail', 'lhail1q', 'paaF2Um28', 63, 4);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (64, 'Jillian', 'Lockhart', 'jlockhart1r', '4pvmlok', 64, 4);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (65, 'Delcina', 'Punchard', 'dpunchard1s', 'MnuIKKcQr', 65, 4);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (66, 'Rachael', 'Boulter', 'rboulter1t', 'pVPzHp5r0I', 66, 1);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (67, 'Mariska', 'Phillins', 'mphillins1u', 'LEntmI', 67, 4);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (68, 'Sue', 'Cannop', 'scannop1v', 'p6qsCn', 68, 2);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (69, 'Nappy', 'Hodgins', 'nhodgins1w', 'UxvCPw4B', 69, 3);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (70, 'Brigida', 'Corston', 'bcorston1x', 'xqa65PT3Gz30', 70, 2);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (71, 'Laurens', 'Illing', 'lilling1y', 'RHyxX53LuL', 71, 2);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (72, 'Mia', 'Altimas', 'maltimas1z', 'vF9BDol61C9', 72, 1);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (73, 'Alexia', 'Kelsell', 'akelsell20', 'ZxnbLLt', 73, 1);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (74, 'Tiphani', 'Spuner', 'tspuner21', 'nkHsoJZ7QM', 74, 4);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (75, 'Gilligan', 'Verzey', 'gverzey22', 'DlhgHexqV6', 75, 4);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (76, 'Anatola', 'Faughnan', 'afaughnan23', 'VAIhMWxv', 76, 3);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (77, 'Allyn', 'Virr', 'avirr24', 'Rms4f6', 77, 1);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (78, 'Jackson', 'Beche', 'jbeche25', 'YxTMsM8', 78, 2);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (79, 'Darleen', 'Teggin', 'dteggin26', 'RXwxJ4', 79, 2);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (80, 'Milton', 'Muirden', 'mmuirden27', 'OY9FrbDLrlWN', 80, 1);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (81, 'Chane', 'Antonellini', 'cantonellini28', 'gWlQLq', 81, 3);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (82, 'Wang', 'Trayling', 'wtrayling29', 'jGvo0w', 82, 4);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (83, 'Alvin', 'Patershall', 'apatershall2a', 'xMXsUoQsS', 83, 2);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (84, 'Agnella', 'Chave', 'achave2b', 'O40TpnxgmWIa', 84, 2);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (85, 'Bowie', 'Mosdill', 'bmosdill2c', 'eWw7ID97Qc', 85, 2);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (86, 'Marietta', 'Welbelove', 'mwelbelove2d', 'XKttnxq22', 86, 2);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (87, 'Kippie', 'Sealand', 'ksealand2e', 'vj7s2xJ7pv4', 87, 2);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (88, 'Hamlin', 'Petrovykh', 'hpetrovykh2f', 'M61SquRZ', 88, 2);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (89, 'Ced', 'Slimings', 'cslimings2g', 'wCV3IWnBCzbX', 89, 2);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (90, 'Consalve', 'McLugish', 'cmclugish2h', 'wSKGB1Q', 90, 2);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (91, 'Gus', 'Nevett', 'gnevett2i', 'O1GHv37Z1aR', 91, 3);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (92, 'Shelly', 'Smylie', 'ssmylie2j', 'FAw7HggWUskh', 92, 4);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (93, 'Minna', 'Dyne', 'mdyne2k', '2CpKEVmgn', 93, 2);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (94, 'Tyson', 'Chislett', 'tchislett2l', 'ke7Dp6StMB', 94, 1);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (95, 'Caitrin', 'Muspratt', 'cmuspratt2m', 'zDR50dn5JhhI', 95, 1);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (96, 'Abbie', 'Winterburn', 'awinterburn2n', 'JyEP2xE9rMoG', 96, 4);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (97, 'Beau', 'Beavors', 'bbeavors2o', 'VxTEX7', 97, 3);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (98, 'Ellyn', 'Di Biasi', 'edibiasi2p', 'KIBu86DsWq', 98, 2);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (99, 'Lizzie', 'Elnough', 'lelnough2q', 'QcYkE7w6ruS', 99, 4);
INSERT INTO "user" (id, first_name, last_name, username, password, user_detail_id, role_id)
VALUES (100, 'Hillyer', 'Bessett', 'hbessett2r', '8S8YkPy', 100, 3);

CREATE TABLE category (
  id           SERIAL PRIMARY KEY,
  name         VARCHAR(64)  NOT NULL,
  description  VARCHAR(500) NOT NULL,
  sub_category INT REFERENCES category (id)
);

INSERT INTO category (id, name, description, sub_category)
VALUES (1, 'sapien', 'pede libero quis orci nullam molestie nibh in lectus pellentesque', NULL);
INSERT INTO category (id, name, description, sub_category) VALUES (2, 'tincidunt',
                                                                   'eu interdum eu tincidunt in leo maecenas pulvinar lobortis est phasellus sit amet erat nulla tempus',
                                                                   NULL);
INSERT INTO category (id, name, description, sub_category) VALUES (3, 'nisl',
                                                                   'dapibus nulla suscipit ligula in lacus curabitur at ipsum ac tellus semper interdum mauris ullamcorper purus',
                                                                   NULL);
INSERT INTO category (id, name, description, sub_category) VALUES
  (4, 'pellentesque', 'dapibus dolor vel est donec odio justo sollicitudin ut suscipit a feugiat et eros vestibulum ac',
   NULL);
INSERT INTO category (id, name, description, sub_category)
VALUES (5, 'in', 'nisl nunc nisl duis bibendum felis sed interdum venenatis turpis enim blandit mi in porttitor', NULL);
INSERT INTO category (id, name, description, sub_category)
VALUES (6, 'sit', 'neque vestibulum eget vulputate ut ultrices vel augue vestibulum ante', NULL);
INSERT INTO category (id, name, description, sub_category)
VALUES (7, 'elit', 'rutrum ac lobortis vel dapibus at diam nam tristique tortor eu', NULL);
INSERT INTO category (id, name, description, sub_category) VALUES (8, 'sollicitudin',
                                                                   'vestibulum vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae nulla dapibus dolor vel est donec',
                                                                   NULL);
INSERT INTO category (id, name, description, sub_category)
VALUES (9, 'sed', 'odio odio elementum eu interdum eu tincidunt in leo maecenas pulvinar lobortis', NULL);
INSERT INTO category (id, name, description, sub_category) VALUES (10, 'est',
                                                                   'eleifend quam a odio in hac habitasse platea dictumst maecenas ut massa quis augue luctus tincidunt nulla mollis molestie',
                                                                   NULL);
INSERT INTO category (id, name, description, sub_category) VALUES (11, 'at',
                                                                   'dolor sit amet consectetuer adipiscing elit proin interdum mauris non ligula pellentesque ultrices phasellus',
                                                                   6);
INSERT INTO category (id, name, description, sub_category) VALUES (12, 'vel',
                                                                   'consectetuer eget rutrum at lorem integer tincidunt ante vel ipsum praesent blandit lacinia erat vestibulum sed magna',
                                                                   8);
INSERT INTO category (id, name, description, sub_category) VALUES
  (13, 'ligula', 'eu felis fusce posuere felis sed lacus morbi sem mauris laoreet ut rhoncus aliquet pulvinar sed nisl',
   3);
INSERT INTO category (id, name, description, sub_category) VALUES (14, 'justo',
                                                                   'id ligula suspendisse ornare consequat lectus in est risus auctor sed tristique in tempus sit amet sem',
                                                                   10);
INSERT INTO category (id, name, description, sub_category) VALUES
  (15, 'quis', 'sed sagittis nam congue risus semper porta volutpat quam pede lobortis ligula sit amet eleifend pede',
   5);
INSERT INTO category (id, name, description, sub_category)
VALUES (16, 'ut', 'tortor sollicitudin mi sit amet lobortis sapien sapien non mi integer', 8);
INSERT INTO category (id, name, description, sub_category) VALUES (17, 'dapibus',
                                                                   'sollicitudin ut suscipit a feugiat et eros vestibulum ac est lacinia nisi venenatis tristique fusce congue diam id',
                                                                   1);
INSERT INTO category (id, name, description, sub_category)
VALUES (18, 'vitae', 'luctus et ultrices posuere cubilia curae mauris viverra diam vitae quam suspendisse', 1);
INSERT INTO category (id, name, description, sub_category) VALUES (19, 'semper',
                                                                   'facilisi cras non velit nec nisi vulputate nonummy maecenas tincidunt lacus at velit vivamus vel nulla',
                                                                   9);
INSERT INTO category (id, name, description, sub_category)
VALUES (20, 'est', 'donec ut mauris eget massa tempor convallis nulla neque libero', 2);

CREATE TABLE product (
  id          SERIAL PRIMARY KEY,
  description VARCHAR(500)     NOT NULL,
  price       DOUBLE PRECISION NOT NULL,
  quantity    VARCHAR(64),
  active      BOOLEAN DEFAULT TRUE,
  category_id INT REFERENCES category (id),
  user_id     INT REFERENCES "user" (id)
);

INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (1,
                                                                                             'mattis egestas metus aenean fermentum donec ut mauris eget massa tempor convallis nulla neque libero convallis eget',
                                                                                             57937, 95, TRUE, 8, 44);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (2, 'in sagittis dui vel nisl duis ac nibh fusce lacus purus aliquet at feugiat', 2041, 73, TRUE, 9, 7);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (3, 'nulla elit ac nulla sed vel enim sit amet nunc viverra dapibus', 59864, 14, TRUE, 11, 41);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (4, 'quis orci nullam molestie nibh in lectus pellentesque at nulla suspendisse potenti cras in purus eu magna', 9923,
   7, FALSE, 19, 19);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (5,
                                                                                             'turpis elementum ligula vehicula consequat morbi a ipsum integer a nibh in quis justo maecenas rhoncus aliquam lacus morbi',
                                                                                             9224, 25, FALSE, 14, 20);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (6,
                                                                                             'vel enim sit amet nunc viverra dapibus nulla suscipit ligula in lacus curabitur at ipsum ac tellus semper interdum mauris',
                                                                                             35187, 88, TRUE, 5, 4);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (7, 'sed tristique in tempus sit amet sem fusce consequat nulla nisl nunc nisl duis bibendum felis sed', 65716, 49,
   FALSE, 10, 1);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (8,
                                                                                             'dapibus nulla suscipit ligula in lacus curabitur at ipsum ac tellus semper interdum mauris ullamcorper purus sit amet nulla quisque',
                                                                                             17610, 86, TRUE, 4, 49);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (9, 'iaculis congue vivamus metus arcu adipiscing molestie hendrerit at vulputate vitae', 28677, 24, FALSE, 10, 85);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (10,
                                                                                             'orci luctus et ultrices posuere cubilia curae donec pharetra magna vestibulum aliquet ultrices erat tortor sollicitudin mi sit amet',
                                                                                             64488, 25, FALSE, 18, 19);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (11, 'volutpat erat quisque erat eros viverra eget congue eget semper', 34706, 91, TRUE, 10, 15);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (12, 'fusce congue diam id ornare imperdiet sapien urna pretium nisl ut volutpat sapien', 10779, 4, TRUE, 19, 46);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (13, 'posuere cubilia curae duis faucibus accumsan odio curabitur convallis duis consequat dui nec', 63135, 74, FALSE,
   7, 38);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (14,
                                                                                             'massa volutpat convallis morbi odio odio elementum eu interdum eu tincidunt in leo maecenas pulvinar lobortis est phasellus',
                                                                                             61047, 77, TRUE, 4, 30);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (15,
                                                                                             'sit amet consectetuer adipiscing elit proin interdum mauris non ligula pellentesque ultrices phasellus id sapien in sapien iaculis congue vivamus',
                                                                                             15725, 41, FALSE, 19, 31);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (16, 'ullamcorper purus sit amet nulla quisque arcu libero rutrum ac lobortis vel dapibus at diam nam', 8284, 46,
   TRUE, 2, 11);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (17, 'vestibulum ac est lacinia nisi venenatis tristique fusce congue diam id', 4303, 42, TRUE, 7, 67);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (18, 'ac neque duis bibendum morbi non quam nec dui luctus rutrum nulla tellus in sagittis dui vel nisl duis', 20858,
   3, TRUE, 20, 21);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (19, 'lacinia aenean sit amet justo morbi ut odio cras mi', 35256, 6, TRUE, 19, 20);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (20, 'justo sollicitudin ut suscipit a feugiat et eros vestibulum ac est lacinia nisi venenatis tristique fusce',
   42370, 79, FALSE, 20, 8);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (21, 'orci vehicula condimentum curabitur in libero ut massa volutpat convallis morbi odio odio elementum', 36080, 45,
   FALSE, 2, 92);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (22, 'lectus pellentesque at nulla suspendisse potenti cras in purus eu', 61739, 24, TRUE, 12, 15);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (23,
                                                                                             'nisl nunc rhoncus dui vel sem sed sagittis nam congue risus semper porta volutpat quam pede lobortis ligula sit amet',
                                                                                             57312, 9, TRUE, 5, 5);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (24, 'amet eros suspendisse accumsan tortor quis turpis sed ante vivamus tortor duis mattis egestas', 51831, 41, TRUE,
   15, 57);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (25,
                                                                                             'cum sociis natoque penatibus et magnis dis parturient montes nascetur ridiculus mus vivamus vestibulum sagittis sapien cum sociis natoque penatibus',
                                                                                             94082, 66, TRUE, 3, 76);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (26, 'phasellus sit amet erat nulla tempus vivamus in felis eu sapien cursus vestibulum proin eu mi nulla', 49118, 63,
   TRUE, 8, 43);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (27, 'pede venenatis non sodales sed tincidunt eu felis fusce posuere felis sed', 86944, 23, FALSE, 2, 43);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (28, 'vivamus vestibulum sagittis sapien cum sociis natoque penatibus et magnis', 28378, 92, FALSE, 18, 16);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (29,
                                                                                             'curabitur gravida nisi at nibh in hac habitasse platea dictumst aliquam augue quam sollicitudin vitae consectetuer',
                                                                                             1623, 90, TRUE, 10, 87);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (30, 'pede lobortis ligula sit amet eleifend pede libero quis orci nullam', 57264, 91, TRUE, 6, 67);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (31,
                                                                                             'lacinia aenean sit amet justo morbi ut odio cras mi pede malesuada in imperdiet et commodo vulputate justo in blandit',
                                                                                             59930, 59, TRUE, 6, 37);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (32,
                                                                                             'lorem quisque ut erat curabitur gravida nisi at nibh in hac habitasse platea dictumst aliquam augue quam sollicitudin vitae consectetuer',
                                                                                             32106, 85, TRUE, 1, 49);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (33, 'sapien ut nunc vestibulum ante ipsum primis in faucibus orci', 36993, 40, FALSE, 13, 43);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (34,
                                                                                             'nunc proin at turpis a pede posuere nonummy integer non velit donec diam neque vestibulum eget vulputate ut ultrices',
                                                                                             6232, 56, FALSE, 8, 42);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (35,
                                                                                             'mus etiam vel augue vestibulum rutrum rutrum neque aenean auctor gravida sem praesent id massa id nisl venenatis',
                                                                                             1099, 81, FALSE, 16, 17);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (36,
                                                                                             'duis aliquam convallis nunc proin at turpis a pede posuere nonummy integer non velit donec diam neque vestibulum',
                                                                                             64140, 46, FALSE, 1, 86);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (37, 'luctus et ultrices posuere cubilia curae mauris viverra diam vitae quam suspendisse', 47873, 88, TRUE, 16, 40);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (38, 'laoreet ut rhoncus aliquet pulvinar sed nisl nunc rhoncus dui vel sem sed sagittis nam congue risus', 50189, 61,
   TRUE, 7, 26);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (39, 'vel augue vestibulum ante ipsum primis in faucibus orci luctus', 46889, 59, FALSE, 18, 59);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (40, 'erat eros viverra eget congue eget semper rutrum nulla nunc purus phasellus in felis donec semper sapien',
   17714, 70, TRUE, 7, 53);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (41, 'lacinia erat vestibulum sed magna at nunc commodo placerat praesent blandit nam nulla integer pede', 66564, 38,
   TRUE, 18, 36);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (42, 'nulla elit ac nulla sed vel enim sit amet nunc viverra dapibus', 94796, 70, FALSE, 6, 42);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (43, 'felis fusce posuere felis sed lacus morbi sem mauris laoreet ut rhoncus aliquet pulvinar sed', 99507, 64, TRUE,
   9, 8);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (44, 'a ipsum integer a nibh in quis justo maecenas rhoncus aliquam lacus morbi quis tortor id', 36291, 94, FALSE, 18,
   26);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (45, 'ultricies eu nibh quisque id justo sit amet sapien dignissim vestibulum', 53900, 17, FALSE, 20, 55);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (46,
                                                                                             'at velit eu est congue elementum in hac habitasse platea dictumst morbi vestibulum velit id pretium iaculis diam erat fermentum',
                                                                                             51338, 69, FALSE, 10, 97);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (47, 'massa id nisl venenatis lacinia aenean sit amet justo morbi ut odio', 26515, 83, TRUE, 19, 96);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (48, 'accumsan tortor quis turpis sed ante vivamus tortor duis mattis egestas metus aenean fermentum donec ut mauris',
   21536, 46, FALSE, 13, 68);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (49, 'ut tellus nulla ut erat id mauris vulputate elementum nullam varius nulla', 17386, 41, TRUE, 15, 64);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (50,
                                                                                             'aliquam sit amet diam in magna bibendum imperdiet nullam orci pede venenatis non sodales sed tincidunt eu felis',
                                                                                             84143, 96, TRUE, 12, 28);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (51, 'primis in faucibus orci luctus et ultrices posuere cubilia curae mauris viverra diam vitae quam', 82753, 17,
   FALSE, 10, 54);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (52,
                                                                                             'duis consequat dui nec nisi volutpat eleifend donec ut dolor morbi vel lectus in quam fringilla rhoncus mauris enim',
                                                                                             87504, 26, TRUE, 7, 98);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (53, 'sagittis dui vel nisl duis ac nibh fusce lacus purus aliquet at feugiat non pretium quis', 14527, 13, FALSE, 13,
   55);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (54, 'penatibus et magnis dis parturient montes nascetur ridiculus mus etiam vel augue vestibulum', 87335, 99, TRUE,
   17, 77);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (55, 'tortor duis mattis egestas metus aenean fermentum donec ut mauris eget massa tempor convallis nulla', 10239, 16,
   FALSE, 14, 36);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (56,
                                                                                             'nec nisi volutpat eleifend donec ut dolor morbi vel lectus in quam fringilla rhoncus mauris enim leo rhoncus sed vestibulum',
                                                                                             91030, 25, TRUE, 12, 10);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (57,
                                                                                             'consectetuer eget rutrum at lorem integer tincidunt ante vel ipsum praesent blandit lacinia erat vestibulum sed',
                                                                                             37613, 12, FALSE, 5, 79);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (58,
                                                                                             'tortor quis turpis sed ante vivamus tortor duis mattis egestas metus aenean fermentum donec ut mauris eget massa tempor convallis',
                                                                                             59734, 72, FALSE, 5, 14);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (59, 'integer pede justo lacinia eget tincidunt eget tempus vel pede morbi porttitor lorem', 24118, 21, FALSE, 14,
   71);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (60,
                                                                                             'lobortis ligula sit amet eleifend pede libero quis orci nullam molestie nibh in lectus pellentesque at nulla suspendisse',
                                                                                             37880, 50, FALSE, 18, 3);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (61, 'sit amet eros suspendisse accumsan tortor quis turpis sed ante vivamus tortor', 5046, 87, FALSE, 5, 22);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (62,
                                                                                             'fermentum donec ut mauris eget massa tempor convallis nulla neque libero convallis eget eleifend luctus ultricies eu nibh',
                                                                                             48559, 20, FALSE, 11, 44);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (63,
                                                                                             'duis bibendum felis sed interdum venenatis turpis enim blandit mi in porttitor pede justo eu massa donec dapibus duis at',
                                                                                             13099, 47, TRUE, 2, 11);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (64, 'ut massa volutpat convallis morbi odio odio elementum eu interdum eu tincidunt in leo maecenas', 78971, 8, TRUE,
   1, 54);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (65, 'purus phasellus in felis donec semper sapien a libero nam', 39307, 40, FALSE, 14, 37);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (66,
                                                                                             'lobortis convallis tortor risus dapibus augue vel accumsan tellus nisi eu orci mauris lacinia sapien quis libero',
                                                                                             86336, 98, FALSE, 15, 64);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (67,
                                                                                             'ultrices aliquet maecenas leo odio condimentum id luctus nec molestie sed justo pellentesque viverra pede ac diam cras',
                                                                                             32149, 82, TRUE, 9, 69);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (68, 'in est risus auctor sed tristique in tempus sit amet', 43957, 23, FALSE, 2, 58);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (69, 'eleifend pede libero quis orci nullam molestie nibh in lectus pellentesque at nulla suspendisse', 86356, 7,
   FALSE, 19, 15);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (70, 'sociis natoque penatibus et magnis dis parturient montes nascetur ridiculus mus etiam vel', 7752, 31, FALSE, 11,
   74);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (71, 'at vulputate vitae nisl aenean lectus pellentesque eget nunc donec', 92866, 20, FALSE, 2, 97);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (72, 'tortor id nulla ultrices aliquet maecenas leo odio condimentum id luctus nec molestie sed', 11768, 31, FALSE, 5,
   11);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (73, 'ante vivamus tortor duis mattis egestas metus aenean fermentum donec', 51113, 78, FALSE, 11, 28);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (74, 'fermentum justo nec condimentum neque sapien placerat ante nulla justo aliquam', 50699, 96, TRUE, 15, 59);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (75, 'ipsum dolor sit amet consectetuer adipiscing elit proin interdum mauris non', 68395, 92, FALSE, 4, 19);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (76, 'semper rutrum nulla nunc purus phasellus in felis donec semper sapien a libero nam', 33453, 76, FALSE, 20, 88);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (77, 'lacinia sapien quis libero nullam sit amet turpis elementum ligula vehicula consequat morbi', 45459, 61, FALSE,
   14, 53);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (78,
                                                                                             'convallis nulla neque libero convallis eget eleifend luctus ultricies eu nibh quisque id justo sit amet sapien dignissim',
                                                                                             86192, 87, FALSE, 11, 93);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (79,
                                                                                             'curabitur at ipsum ac tellus semper interdum mauris ullamcorper purus sit amet nulla quisque arcu libero rutrum ac lobortis vel',
                                                                                             86929, 6, TRUE, 4, 12);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (80, 'est donec odio justo sollicitudin ut suscipit a feugiat et eros vestibulum', 90359, 74, TRUE, 8, 51);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (81,
                                                                                             'congue etiam justo etiam pretium iaculis justo in hac habitasse platea dictumst etiam faucibus cursus urna ut tellus nulla ut',
                                                                                             10189, 51, TRUE, 18, 23);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (82,
                                                                                             'sociis natoque penatibus et magnis dis parturient montes nascetur ridiculus mus vivamus vestibulum sagittis sapien cum sociis natoque',
                                                                                             68032, 43, TRUE, 6, 86);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (83, 'lorem ipsum dolor sit amet consectetuer adipiscing elit proin risus praesent lectus vestibulum quam sapien',
   8748, 91, TRUE, 12, 84);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (84, 'in hac habitasse platea dictumst maecenas ut massa quis augue luctus tincidunt nulla', 41261, 77, TRUE, 6, 75);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (85, 'in faucibus orci luctus et ultrices posuere cubilia curae nulla dapibus dolor', 42947, 2, FALSE, 4, 8);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (86,
                                                                                             'ut ultrices vel augue vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae donec',
                                                                                             50047, 22, FALSE, 8, 100);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (87, 'cras mi pede malesuada in imperdiet et commodo vulputate justo in blandit ultrices enim lorem', 61394, 3, TRUE,
   3, 98);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (88,
                                                                                             'dapibus dolor vel est donec odio justo sollicitudin ut suscipit a feugiat et eros vestibulum ac est lacinia nisi',
                                                                                             92260, 8, TRUE, 19, 48);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (89,
                                                                                             'ac diam cras pellentesque volutpat dui maecenas tristique est et tempus semper est quam pharetra magna ac consequat',
                                                                                             15939, 82, TRUE, 12, 94);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (90, 'nisl venenatis lacinia aenean sit amet justo morbi ut odio cras mi pede malesuada in', 21004, 97, TRUE, 10, 82);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (91, 'quam fringilla rhoncus mauris enim leo rhoncus sed vestibulum sit amet cursus id turpis integer', 70526, 18,
   TRUE, 18, 6);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (92,
                                                                                             'leo pellentesque ultrices mattis odio donec vitae nisi nam ultrices libero non mattis pulvinar nulla pede ullamcorper',
                                                                                             13977, 43, FALSE, 12, 86);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (93, 'fusce posuere felis sed lacus morbi sem mauris laoreet ut rhoncus aliquet pulvinar', 54841, 23, TRUE, 18, 65);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (94,
                                                                                             'et ultrices posuere cubilia curae donec pharetra magna vestibulum aliquet ultrices erat tortor sollicitudin mi sit amet lobortis sapien sapien',
                                                                                             1212, 87, TRUE, 11, 78);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (95, 'cubilia curae donec pharetra magna vestibulum aliquet ultrices erat tortor sollicitudin mi sit amet', 14452, 36,
   FALSE, 9, 47);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (96, 'a suscipit nulla elit ac nulla sed vel enim sit amet nunc viverra dapibus nulla suscipit', 84542, 60, FALSE, 14,
   82);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (97, 'cubilia curae mauris viverra diam vitae quam suspendisse potenti nullam porttitor lacus', 9185, 43, FALSE, 10,
   63);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (98,
                                                                                             'mauris eget massa tempor convallis nulla neque libero convallis eget eleifend luctus ultricies eu nibh quisque id justo',
                                                                                             76131, 29, FALSE, 7, 91);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (99, 'ut mauris eget massa tempor convallis nulla neque libero convallis eget eleifend', 16367, 42, TRUE, 9, 11);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (100, 'sit amet cursus id turpis integer aliquet massa id lobortis convallis tortor risus dapibus augue', 36991, 92,
   FALSE, 4, 93);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (101,
                                                                                             'quis libero nullam sit amet turpis elementum ligula vehicula consequat morbi a ipsum integer a nibh in quis justo maecenas',
                                                                                             3685, 84, TRUE, 1, 49);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (102,
                                                                                             'faucibus orci luctus et ultrices posuere cubilia curae nulla dapibus dolor vel est donec odio justo sollicitudin ut',
                                                                                             21028, 55, TRUE, 2, 32);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (103,
                                                                                             'arcu adipiscing molestie hendrerit at vulputate vitae nisl aenean lectus pellentesque eget nunc donec quis orci eget orci vehicula',
                                                                                             42663, 59, FALSE, 5, 58);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (104, 'laoreet ut rhoncus aliquet pulvinar sed nisl nunc rhoncus dui vel sem', 12827, 92, TRUE, 19, 38);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (105, 'odio cras mi pede malesuada in imperdiet et commodo vulputate justo in blandit ultrices enim', 55991, 21, TRUE,
   10, 26);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (106,
                                                                                             'porta volutpat erat quisque erat eros viverra eget congue eget semper rutrum nulla nunc purus phasellus in felis',
                                                                                             31358, 49, FALSE, 6, 63);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (107,
                                                                                             'tempus sit amet sem fusce consequat nulla nisl nunc nisl duis bibendum felis sed interdum venenatis turpis enim blandit',
                                                                                             5473, 18, TRUE, 10, 8);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (108, 'eros viverra eget congue eget semper rutrum nulla nunc purus phasellus', 78999, 65, FALSE, 16, 52);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (109, 'aliquet massa id lobortis convallis tortor risus dapibus augue vel accumsan tellus nisi eu orci mauris', 5406,
   39, TRUE, 2, 61);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (110, 'habitasse platea dictumst aliquam augue quam sollicitudin vitae consectetuer eget rutrum at lorem', 71990, 98,
   TRUE, 10, 1);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (111, 'libero rutrum ac lobortis vel dapibus at diam nam tristique tortor', 68083, 89, TRUE, 9, 8);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (112, 'integer tincidunt ante vel ipsum praesent blandit lacinia erat vestibulum sed', 7795, 54, FALSE, 10, 6);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (113, 'leo odio porttitor id consequat in consequat ut nulla sed accumsan', 23899, 36, TRUE, 6, 75);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (114, 'ac nulla sed vel enim sit amet nunc viverra dapibus nulla suscipit ligula in lacus curabitur', 58395, 99,
   FALSE, 20, 94);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (115,
                                                                                             'eget vulputate ut ultrices vel augue vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae',
                                                                                             15358, 34, FALSE, 20, 12);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (116, 'est phasellus sit amet erat nulla tempus vivamus in felis eu sapien cursus', 91340, 17, TRUE, 11, 87);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (117, 'eros vestibulum ac est lacinia nisi venenatis tristique fusce congue diam id ornare imperdiet sapien', 66200,
   49, TRUE, 17, 94);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (118,
                                                                                             'mauris enim leo rhoncus sed vestibulum sit amet cursus id turpis integer aliquet massa id lobortis convallis tortor risus',
                                                                                             71548, 72, TRUE, 13, 25);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (119, 'vitae ipsum aliquam non mauris morbi non lectus aliquam sit amet diam', 51040, 88, FALSE, 15, 3);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (120, 'sit amet sem fusce consequat nulla nisl nunc nisl duis bibendum felis sed interdum venenatis', 53682, 66, TRUE,
   13, 42);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (121,
                                                                                             'in sapien iaculis congue vivamus metus arcu adipiscing molestie hendrerit at vulputate vitae nisl aenean lectus pellentesque eget nunc donec',
                                                                                             82225, 96, FALSE, 20, 71);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (122, 'non quam nec dui luctus rutrum nulla tellus in sagittis dui vel nisl duis', 9644, 74, FALSE, 17, 57);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (123, 'duis bibendum felis sed interdum venenatis turpis enim blandit mi', 3481, 24, TRUE, 3, 26);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (124, 'aliquet maecenas leo odio condimentum id luctus nec molestie sed justo pellentesque', 57349, 55, FALSE, 16,
   38);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (125, 'semper sapien a libero nam dui proin leo odio porttitor', 22377, 73, TRUE, 15, 7);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (126,
                                                                                             'ante vel ipsum praesent blandit lacinia erat vestibulum sed magna at nunc commodo placerat praesent blandit nam',
                                                                                             97681, 33, FALSE, 7, 23);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (127,
                                                                                             'dapibus nulla suscipit ligula in lacus curabitur at ipsum ac tellus semper interdum mauris ullamcorper purus sit amet nulla quisque',
                                                                                             79360, 34, FALSE, 9, 61);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (128,
                                                                                             'ultricies eu nibh quisque id justo sit amet sapien dignissim vestibulum vestibulum ante ipsum primis in faucibus orci',
                                                                                             58017, 32, TRUE, 10, 1);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (129,
                                                                                             'sociis natoque penatibus et magnis dis parturient montes nascetur ridiculus mus vivamus vestibulum sagittis sapien cum',
                                                                                             89911, 63, FALSE, 20, 87);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (130, 'accumsan felis ut at dolor quis odio consequat varius integer ac leo', 38995, 73, FALSE, 6, 29);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (131, 'etiam vel augue vestibulum rutrum rutrum neque aenean auctor gravida sem praesent id', 99502, 95, TRUE, 11,
   61);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (132, 'cursus vestibulum proin eu mi nulla ac enim in tempor turpis nec euismod scelerisque quam turpis adipiscing',
   60897, 93, TRUE, 11, 68);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (133,
                                                                                             'vulputate ut ultrices vel augue vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae donec',
                                                                                             13741, 20, FALSE, 4, 21);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (134, 'ultrices aliquet maecenas leo odio condimentum id luctus nec molestie sed', 64038, 72, TRUE, 20, 57);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (135,
                                                                                             'curabitur convallis duis consequat dui nec nisi volutpat eleifend donec ut dolor morbi vel lectus in quam fringilla rhoncus',
                                                                                             93513, 19, TRUE, 16, 12);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (136, 'congue eget semper rutrum nulla nunc purus phasellus in felis donec semper sapien', 99416, 68, FALSE, 13, 32);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (137, 'suscipit ligula in lacus curabitur at ipsum ac tellus semper interdum mauris', 78076, 78, FALSE, 18, 26);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (138,
                                                                                             'orci mauris lacinia sapien quis libero nullam sit amet turpis elementum ligula vehicula consequat morbi a ipsum integer a',
                                                                                             87708, 60, TRUE, 14, 15);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (139, 'ac tellus semper interdum mauris ullamcorper purus sit amet nulla quisque arcu libero', 55708, 41, FALSE, 15,
   77);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (140, 'quis turpis sed ante vivamus tortor duis mattis egestas metus aenean fermentum donec ut mauris', 45962, 43,
   FALSE, 13, 27);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (141, 'nascetur ridiculus mus etiam vel augue vestibulum rutrum rutrum neque aenean auctor', 11368, 65, FALSE, 12,
   38);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (142,
                                                                                             'integer aliquet massa id lobortis convallis tortor risus dapibus augue vel accumsan tellus nisi eu orci mauris lacinia sapien',
                                                                                             87977, 45, TRUE, 10, 11);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (143,
                                                                                             'enim leo rhoncus sed vestibulum sit amet cursus id turpis integer aliquet massa id lobortis convallis tortor risus dapibus',
                                                                                             7333, 69, FALSE, 2, 77);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (144, 'volutpat convallis morbi odio odio elementum eu interdum eu tincidunt in leo maecenas pulvinar lobortis',
   48873, 16, TRUE, 4, 48);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (145, 'venenatis non sodales sed tincidunt eu felis fusce posuere felis sed lacus morbi sem mauris laoreet', 29238,
   79, FALSE, 20, 77);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (146,
                                                                                             'ut mauris eget massa tempor convallis nulla neque libero convallis eget eleifend luctus ultricies eu nibh quisque id justo',
                                                                                             77059, 84, FALSE, 17, 30);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (147,
                                                                                             'tellus semper interdum mauris ullamcorper purus sit amet nulla quisque arcu libero rutrum ac lobortis vel dapibus at',
                                                                                             45289, 93, TRUE, 4, 86);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (148, 'sed magna at nunc commodo placerat praesent blandit nam nulla integer pede justo lacinia', 36888, 24, TRUE, 7,
   71);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (149, 'felis ut at dolor quis odio consequat varius integer ac leo pellentesque', 66725, 86, TRUE, 17, 40);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (150, 'justo in blandit ultrices enim lorem ipsum dolor sit amet consectetuer adipiscing elit proin interdum', 98021,
   35, TRUE, 17, 43);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (151,
                                                                                             'justo sit amet sapien dignissim vestibulum vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae',
                                                                                             81419, 2, FALSE, 16, 68);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (152, 'tellus nisi eu orci mauris lacinia sapien quis libero nullam sit amet turpis elementum', 94799, 68, TRUE, 16,
   83);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (153,
                                                                                             'ultrices posuere cubilia curae mauris viverra diam vitae quam suspendisse potenti nullam porttitor lacus at turpis donec posuere metus',
                                                                                             4113, 59, TRUE, 15, 7);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (154, 'nisl aenean lectus pellentesque eget nunc donec quis orci eget orci vehicula', 85103, 45, FALSE, 5, 53);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (155, 'at velit eu est congue elementum in hac habitasse platea dictumst morbi vestibulum velit', 7450, 94, FALSE, 18,
   100);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (156, 'eros vestibulum ac est lacinia nisi venenatis tristique fusce congue', 42683, 52, FALSE, 4, 61);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (157, 'curae duis faucibus accumsan odio curabitur convallis duis consequat dui nec nisi volutpat eleifend donec ut',
   7807, 57, TRUE, 20, 8);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (158, 'odio cras mi pede malesuada in imperdiet et commodo vulputate justo in blandit ultrices enim lorem', 69880, 56,
   FALSE, 10, 22);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (159,
                                                                                             'potenti cras in purus eu magna vulputate luctus cum sociis natoque penatibus et magnis dis parturient montes nascetur ridiculus',
                                                                                             92005, 100, FALSE, 11, 13);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (160, 'morbi porttitor lorem id ligula suspendisse ornare consequat lectus in est risus', 86365, 67, TRUE, 7, 82);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (161, 'dui vel nisl duis ac nibh fusce lacus purus aliquet at feugiat non pretium quis lectus suspendisse', 49673, 26,
   FALSE, 19, 33);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (162,
                                                                                             'maecenas tristique est et tempus semper est quam pharetra magna ac consequat metus sapien ut nunc vestibulum ante ipsum',
                                                                                             74022, 76, TRUE, 13, 72);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (163, 'vestibulum aliquet ultrices erat tortor sollicitudin mi sit amet lobortis sapien sapien non', 19902, 100, TRUE,
   19, 11);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (164, 'blandit lacinia erat vestibulum sed magna at nunc commodo placerat praesent blandit nam nulla', 9088, 65, TRUE,
   4, 51);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (165, 'turpis enim blandit mi in porttitor pede justo eu massa donec dapibus duis at velit', 62145, 68, FALSE, 20,
   86);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (166, 'ultrices mattis odio donec vitae nisi nam ultrices libero non mattis pulvinar', 31514, 22, FALSE, 11, 3);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (167,
                                                                                             'commodo vulputate justo in blandit ultrices enim lorem ipsum dolor sit amet consectetuer adipiscing elit proin interdum mauris non ligula',
                                                                                             87671, 45, TRUE, 2, 100);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (168,
                                                                                             'accumsan odio curabitur convallis duis consequat dui nec nisi volutpat eleifend donec ut dolor morbi vel lectus in quam fringilla',
                                                                                             99078, 36, TRUE, 1, 90);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (169,
                                                                                             'ut rhoncus aliquet pulvinar sed nisl nunc rhoncus dui vel sem sed sagittis nam congue risus semper porta volutpat',
                                                                                             27679, 47, FALSE, 3, 78);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (170,
                                                                                             'hendrerit at vulputate vitae nisl aenean lectus pellentesque eget nunc donec quis orci eget orci vehicula condimentum curabitur in',
                                                                                             36259, 38, FALSE, 12, 36);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (171, 'platea dictumst aliquam augue quam sollicitudin vitae consectetuer eget rutrum at lorem', 12909, 67, TRUE, 3,
   76);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (172, 'aliquet pulvinar sed nisl nunc rhoncus dui vel sem sed sagittis', 36247, 60, TRUE, 8, 91);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (173, 'vel augue vestibulum rutrum rutrum neque aenean auctor gravida sem praesent id', 2412, 85, FALSE, 11, 57);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (174,
                                                                                             'duis ac nibh fusce lacus purus aliquet at feugiat non pretium quis lectus suspendisse potenti in eleifend quam',
                                                                                             37342, 35, TRUE, 20, 15);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (175, 'mauris morbi non lectus aliquam sit amet diam in magna bibendum imperdiet nullam orci pede', 49675, 76, TRUE,
   7, 13);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (176, 'sed magna at nunc commodo placerat praesent blandit nam nulla integer pede', 71094, 18, FALSE, 8, 63);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (177, 'in faucibus orci luctus et ultrices posuere cubilia curae duis faucibus accumsan odio curabitur', 82627, 44,
   FALSE, 5, 74);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (178, 'in felis eu sapien cursus vestibulum proin eu mi nulla ac', 83643, 61, FALSE, 7, 72);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (179,
                                                                                             'nulla facilisi cras non velit nec nisi vulputate nonummy maecenas tincidunt lacus at velit vivamus vel nulla eget eros elementum',
                                                                                             47784, 94, TRUE, 4, 88);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (180, 'curae nulla dapibus dolor vel est donec odio justo sollicitudin ut suscipit', 35993, 2, FALSE, 7, 64);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (181,
                                                                                             'quis orci nullam molestie nibh in lectus pellentesque at nulla suspendisse potenti cras in purus eu magna vulputate luctus',
                                                                                             91161, 78, TRUE, 8, 2);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (182, 'dui proin leo odio porttitor id consequat in consequat ut nulla sed', 51309, 16, TRUE, 3, 91);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (183,
                                                                                             'at velit vivamus vel nulla eget eros elementum pellentesque quisque porta volutpat erat quisque erat eros viverra eget',
                                                                                             51093, 68, FALSE, 20, 9);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (184,
                                                                                             'eget rutrum at lorem integer tincidunt ante vel ipsum praesent blandit lacinia erat vestibulum sed magna at nunc commodo placerat',
                                                                                             86569, 12, TRUE, 17, 3);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (185,
                                                                                             'neque libero convallis eget eleifend luctus ultricies eu nibh quisque id justo sit amet sapien dignissim vestibulum vestibulum',
                                                                                             27432, 1, FALSE, 15, 100);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (186,
                                                                                             'aliquam augue quam sollicitudin vitae consectetuer eget rutrum at lorem integer tincidunt ante vel ipsum praesent blandit',
                                                                                             8246, 16, FALSE, 8, 99);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (187, 'nisl duis ac nibh fusce lacus purus aliquet at feugiat non pretium quis lectus', 35855, 99, FALSE, 17, 24);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (188, 'dapibus augue vel accumsan tellus nisi eu orci mauris lacinia sapien quis libero nullam sit amet', 80240, 24,
   FALSE, 7, 97);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (189,
                                                                                             'sit amet consectetuer adipiscing elit proin risus praesent lectus vestibulum quam sapien varius ut blandit non',
                                                                                             44161, 2, TRUE, 19, 78);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (190,
                                                                                             'quis lectus suspendisse potenti in eleifend quam a odio in hac habitasse platea dictumst maecenas ut massa quis',
                                                                                             81910, 40, TRUE, 3, 50);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (191, 'morbi ut odio cras mi pede malesuada in imperdiet et commodo', 30371, 41, TRUE, 16, 69);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (192, 'ac tellus semper interdum mauris ullamcorper purus sit amet nulla quisque arcu', 51935, 37, TRUE, 17, 73);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (193,
                                                                                             'molestie lorem quisque ut erat curabitur gravida nisi at nibh in hac habitasse platea dictumst aliquam augue quam sollicitudin vitae',
                                                                                             95948, 89, TRUE, 2, 92);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (194, 'pellentesque volutpat dui maecenas tristique est et tempus semper est quam pharetra magna ac', 28130, 93, TRUE,
   17, 79);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (195, 'felis eu sapien cursus vestibulum proin eu mi nulla ac enim in tempor turpis nec euismod', 8679, 92, FALSE, 6,
   24);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (196,
                                                                                             'metus arcu adipiscing molestie hendrerit at vulputate vitae nisl aenean lectus pellentesque eget nunc donec quis orci eget orci vehicula',
                                                                                             30785, 10, TRUE, 16, 8);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (197, 'mi nulla ac enim in tempor turpis nec euismod scelerisque quam turpis adipiscing lorem', 69393, 88, FALSE, 10,
   76);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (198,
                                                                                             'orci vehicula condimentum curabitur in libero ut massa volutpat convallis morbi odio odio elementum eu interdum eu',
                                                                                             62016, 87, FALSE, 2, 57);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (199,
                                                                                             'cras pellentesque volutpat dui maecenas tristique est et tempus semper est quam pharetra magna ac consequat metus',
                                                                                             55214, 25, TRUE, 12, 48);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (200,
                                                                                             'maecenas rhoncus aliquam lacus morbi quis tortor id nulla ultrices aliquet maecenas leo odio condimentum id luctus nec molestie sed',
                                                                                             57865, 49, FALSE, 14, 11);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (201,
                                                                                             'fermentum donec ut mauris eget massa tempor convallis nulla neque libero convallis eget eleifend luctus ultricies eu nibh quisque id',
                                                                                             85617, 70, TRUE, 10, 13);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (202, 'dapibus dolor vel est donec odio justo sollicitudin ut suscipit a', 40567, 55, TRUE, 17, 41);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (203, 'amet eleifend pede libero quis orci nullam molestie nibh in lectus pellentesque', 54883, 71, TRUE, 12, 26);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (204, 'auctor gravida sem praesent id massa id nisl venenatis lacinia aenean', 32086, 38, FALSE, 11, 96);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (205, 'sed vel enim sit amet nunc viverra dapibus nulla suscipit ligula', 58636, 52, FALSE, 12, 68);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (206, 'pharetra magna vestibulum aliquet ultrices erat tortor sollicitudin mi sit amet lobortis', 32335, 98, FALSE,
   17, 81);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (207, 'dolor sit amet consectetuer adipiscing elit proin risus praesent lectus vestibulum', 43364, 65, FALSE, 18, 37);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (208, 'libero nam dui proin leo odio porttitor id consequat in consequat ut nulla sed accumsan felis ut at dolor',
   32526, 1, TRUE, 4, 25);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (209, 'ut erat id mauris vulputate elementum nullam varius nulla facilisi cras', 89006, 88, FALSE, 16, 60);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (210, 'justo in hac habitasse platea dictumst etiam faucibus cursus urna ut tellus nulla ut erat id mauris vulputate',
   78333, 58, FALSE, 16, 95);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (211, 'mauris morbi non lectus aliquam sit amet diam in magna bibendum imperdiet nullam orci pede', 52314, 64, FALSE,
   11, 1);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (212, 'ligula suspendisse ornare consequat lectus in est risus auctor sed tristique in tempus', 91377, 43, TRUE, 3,
   14);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (213, 'mauris enim leo rhoncus sed vestibulum sit amet cursus id turpis integer aliquet massa id lobortis', 71433, 3,
   FALSE, 18, 22);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (214,
                                                                                             'nec molestie sed justo pellentesque viverra pede ac diam cras pellentesque volutpat dui maecenas tristique est et tempus semper est',
                                                                                             53545, 71, FALSE, 3, 92);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (215, 'primis in faucibus orci luctus et ultrices posuere cubilia curae duis faucibus', 54468, 51, FALSE, 5, 78);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (216,
                                                                                             'vivamus vel nulla eget eros elementum pellentesque quisque porta volutpat erat quisque erat eros viverra eget congue eget semper rutrum',
                                                                                             35339, 72, TRUE, 14, 79);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (217, 'at velit vivamus vel nulla eget eros elementum pellentesque quisque porta volutpat erat quisque', 89162, 88,
   FALSE, 3, 26);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (218,
                                                                                             'elementum pellentesque quisque porta volutpat erat quisque erat eros viverra eget congue eget semper rutrum nulla nunc purus phasellus',
                                                                                             22103, 78, TRUE, 19, 13);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (219,
                                                                                             'ut ultrices vel augue vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae donec',
                                                                                             49848, 34, FALSE, 1, 87);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (220,
                                                                                             'vel ipsum praesent blandit lacinia erat vestibulum sed magna at nunc commodo placerat praesent blandit nam nulla integer pede justo',
                                                                                             29586, 2, TRUE, 9, 67);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (221, 'et commodo vulputate justo in blandit ultrices enim lorem ipsum dolor sit amet', 5873, 89, TRUE, 8, 2);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (222, 'rhoncus mauris enim leo rhoncus sed vestibulum sit amet cursus id turpis integer aliquet massa', 82403, 72,
   FALSE, 16, 42);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (223, 'donec ut dolor morbi vel lectus in quam fringilla rhoncus mauris enim leo rhoncus sed vestibulum sit', 4959,
   34, TRUE, 3, 30);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (224,
                                                                                             'ultrices phasellus id sapien in sapien iaculis congue vivamus metus arcu adipiscing molestie hendrerit at vulputate vitae nisl',
                                                                                             40000, 33, TRUE, 19, 66);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (225, 'magna at nunc commodo placerat praesent blandit nam nulla integer pede justo lacinia eget', 15854, 74, FALSE,
   2, 57);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (226,
                                                                                             'malesuada in imperdiet et commodo vulputate justo in blandit ultrices enim lorem ipsum dolor sit amet consectetuer adipiscing',
                                                                                             82523, 93, TRUE, 3, 2);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (227, 'phasellus sit amet erat nulla tempus vivamus in felis eu sapien cursus vestibulum proin eu mi nulla', 92825,
   19, FALSE, 11, 1);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (228,
                                                                                             'sit amet eleifend pede libero quis orci nullam molestie nibh in lectus pellentesque at nulla suspendisse potenti',
                                                                                             21531, 92, FALSE, 3, 14);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (229, 'at nulla suspendisse potenti cras in purus eu magna vulputate luctus cum sociis natoque penatibus', 63096, 88,
   FALSE, 9, 7);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (230,
                                                                                             'congue elementum in hac habitasse platea dictumst morbi vestibulum velit id pretium iaculis diam erat fermentum',
                                                                                             88684, 98, TRUE, 6, 68);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (231, 'nullam sit amet turpis elementum ligula vehicula consequat morbi a', 7899, 2, TRUE, 11, 84);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (232, 'proin eu mi nulla ac enim in tempor turpis nec euismod scelerisque', 47086, 81, TRUE, 5, 30);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (233,
                                                                                             'ut erat id mauris vulputate elementum nullam varius nulla facilisi cras non velit nec nisi vulputate nonummy maecenas',
                                                                                             36509, 45, TRUE, 15, 17);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (234, 'tellus in sagittis dui vel nisl duis ac nibh fusce lacus purus', 36178, 95, TRUE, 16, 60);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (235, 'sit amet sem fusce consequat nulla nisl nunc nisl duis bibendum felis', 35111, 12, TRUE, 14, 50);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (236, 'erat eros viverra eget congue eget semper rutrum nulla nunc purus phasellus', 52436, 63, TRUE, 4, 30);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (237,
                                                                                             'orci eget orci vehicula condimentum curabitur in libero ut massa volutpat convallis morbi odio odio elementum eu',
                                                                                             42658, 29, FALSE, 7, 81);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (238,
                                                                                             'ut mauris eget massa tempor convallis nulla neque libero convallis eget eleifend luctus ultricies eu nibh quisque id justo',
                                                                                             56585, 19, FALSE, 18, 22);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (239, 'felis sed lacus morbi sem mauris laoreet ut rhoncus aliquet pulvinar sed nisl nunc rhoncus', 28203, 80, TRUE,
   20, 57);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (240,
                                                                                             'in faucibus orci luctus et ultrices posuere cubilia curae donec pharetra magna vestibulum aliquet ultrices erat tortor',
                                                                                             87723, 35, TRUE, 11, 44);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (241,
                                                                                             'orci luctus et ultrices posuere cubilia curae donec pharetra magna vestibulum aliquet ultrices erat tortor sollicitudin mi sit amet lobortis',
                                                                                             77925, 6, FALSE, 9, 93);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (242, 'sapien urna pretium nisl ut volutpat sapien arcu sed augue aliquam erat volutpat', 73409, 91, TRUE, 15, 55);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (243, 'rutrum neque aenean auctor gravida sem praesent id massa id nisl', 40654, 51, TRUE, 16, 18);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (244, 'consequat metus sapien ut nunc vestibulum ante ipsum primis in faucibus', 44042, 10, TRUE, 15, 58);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (245, 'turpis a pede posuere nonummy integer non velit donec diam neque vestibulum eget vulputate ut ultrices vel',
   19642, 77, TRUE, 20, 47);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (246, 'tincidunt eu felis fusce posuere felis sed lacus morbi sem mauris laoreet', 55510, 76, FALSE, 4, 35);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (247,
                                                                                             'ultrices posuere cubilia curae donec pharetra magna vestibulum aliquet ultrices erat tortor sollicitudin mi sit',
                                                                                             28999, 37, FALSE, 9, 43);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (248, 'ac enim in tempor turpis nec euismod scelerisque quam turpis adipiscing lorem vitae', 14350, 100, TRUE, 13, 6);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (249, 'sit amet lobortis sapien sapien non mi integer ac neque duis bibendum morbi non quam', 63795, 70, FALSE, 15,
   56);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (250, 'quis turpis eget elit sodales scelerisque mauris sit amet eros', 75730, 42, TRUE, 15, 28);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (251, 'id sapien in sapien iaculis congue vivamus metus arcu adipiscing molestie hendrerit at vulputate vitae', 29077,
   73, TRUE, 2, 28);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (252, 'duis at velit eu est congue elementum in hac habitasse platea dictumst morbi vestibulum velit id', 93564, 9,
   FALSE, 6, 7);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (253, 'eu interdum eu tincidunt in leo maecenas pulvinar lobortis est phasellus sit amet erat nulla tempus vivamus',
   75322, 2, FALSE, 4, 81);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (254, 'quam sollicitudin vitae consectetuer eget rutrum at lorem integer tincidunt ante', 29687, 30, FALSE, 3, 68);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (255, 'turpis enim blandit mi in porttitor pede justo eu massa donec dapibus duis at', 23465, 84, FALSE, 5, 33);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (256,
                                                                                             'nulla mollis molestie lorem quisque ut erat curabitur gravida nisi at nibh in hac habitasse platea dictumst aliquam augue',
                                                                                             19084, 94, FALSE, 4, 46);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (257, 'tincidunt nulla mollis molestie lorem quisque ut erat curabitur gravida nisi at nibh', 99957, 98, FALSE, 20,
   79);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (258, 'quam suspendisse potenti nullam porttitor lacus at turpis donec posuere metus', 83996, 91, FALSE, 6, 82);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (259, 'mi pede malesuada in imperdiet et commodo vulputate justo in', 99991, 45, FALSE, 20, 36);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (260, 'nulla eget eros elementum pellentesque quisque porta volutpat erat quisque erat eros viverra eget', 52465, 96,
   FALSE, 10, 22);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (261, 'convallis nunc proin at turpis a pede posuere nonummy integer non', 38347, 86, TRUE, 2, 97);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (262, 'augue vestibulum rutrum rutrum neque aenean auctor gravida sem praesent id', 91363, 64, FALSE, 6, 99);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (263, 'ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae donec', 14901, 55, FALSE, 15, 96);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (264, 'a libero nam dui proin leo odio porttitor id consequat in consequat ut', 41187, 72, TRUE, 10, 58);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (265, 'nam dui proin leo odio porttitor id consequat in consequat ut nulla sed accumsan felis', 1988, 53, FALSE, 17,
   25);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (266, 'duis bibendum morbi non quam nec dui luctus rutrum nulla tellus in sagittis dui', 87137, 75, FALSE, 18, 88);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (267, 'sollicitudin ut suscipit a feugiat et eros vestibulum ac est', 90689, 95, TRUE, 10, 77);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (268, 'elementum in hac habitasse platea dictumst morbi vestibulum velit id', 57103, 90, TRUE, 10, 39);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (269,
                                                                                             'eget nunc donec quis orci eget orci vehicula condimentum curabitur in libero ut massa volutpat convallis morbi odio',
                                                                                             66612, 61, FALSE, 1, 9);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (270, 'pede posuere nonummy integer non velit donec diam neque vestibulum eget vulputate ut ultrices vel augue',
   26023, 32, FALSE, 16, 81);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (271, 'dui vel sem sed sagittis nam congue risus semper porta volutpat', 7048, 5, FALSE, 17, 63);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (272, 'sapien varius ut blandit non interdum in ante vestibulum ante ipsum primis in faucibus orci luctus', 58240, 57,
   FALSE, 15, 65);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (273, 'fermentum justo nec condimentum neque sapien placerat ante nulla justo aliquam', 59136, 84, FALSE, 1, 48);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (274, 'nam ultrices libero non mattis pulvinar nulla pede ullamcorper augue a suscipit nulla elit ac nulla sed',
   23822, 73, TRUE, 6, 56);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (275, 'tempus sit amet sem fusce consequat nulla nisl nunc nisl duis bibendum', 95999, 5, TRUE, 13, 74);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (276, 'dapibus duis at velit eu est congue elementum in hac habitasse platea dictumst', 25948, 70, FALSE, 4, 6);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (277, 'eu sapien cursus vestibulum proin eu mi nulla ac enim in', 83478, 44, FALSE, 9, 43);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (278, 'malesuada in imperdiet et commodo vulputate justo in blandit ultrices enim lorem', 54535, 91, FALSE, 7, 16);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (279, 'luctus nec molestie sed justo pellentesque viverra pede ac diam cras pellentesque volutpat dui maecenas',
   68913, 45, TRUE, 19, 45);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (280, 'mi sit amet lobortis sapien sapien non mi integer ac neque duis bibendum morbi non quam nec dui luctus', 1283,
   43, FALSE, 20, 83);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (281, 'velit eu est congue elementum in hac habitasse platea dictumst morbi vestibulum velit id pretium', 59156, 13,
   TRUE, 13, 60);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (282,
                                                                                             'congue risus semper porta volutpat quam pede lobortis ligula sit amet eleifend pede libero quis orci nullam molestie nibh',
                                                                                             1536, 33, FALSE, 4, 28);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (283, 'sem duis aliquam convallis nunc proin at turpis a pede', 81956, 91, TRUE, 7, 26);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (284, 'facilisi cras non velit nec nisi vulputate nonummy maecenas tincidunt lacus at velit vivamus vel nulla eget',
   94277, 3, TRUE, 7, 14);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (285,
                                                                                             'faucibus orci luctus et ultrices posuere cubilia curae mauris viverra diam vitae quam suspendisse potenti nullam porttitor lacus at turpis',
                                                                                             67834, 64, FALSE, 8, 75);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (286, 'consequat varius integer ac leo pellentesque ultrices mattis odio donec vitae nisi', 66222, 49, FALSE, 15, 77);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (287,
                                                                                             'sed sagittis nam congue risus semper porta volutpat quam pede lobortis ligula sit amet eleifend pede libero quis orci nullam',
                                                                                             13389, 63, FALSE, 19, 75);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (288,
                                                                                             'interdum eu tincidunt in leo maecenas pulvinar lobortis est phasellus sit amet erat nulla tempus vivamus in felis',
                                                                                             66492, 1, TRUE, 8, 3);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (289, 'eu felis fusce posuere felis sed lacus morbi sem mauris', 57405, 38, TRUE, 16, 41);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (290, 'ac neque duis bibendum morbi non quam nec dui luctus rutrum nulla tellus', 89567, 33, TRUE, 17, 42);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (291,
                                                                                             'nec condimentum neque sapien placerat ante nulla justo aliquam quis turpis eget elit sodales scelerisque mauris sit amet eros suspendisse',
                                                                                             43846, 39, TRUE, 10, 39);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (292,
                                                                                             'eget tincidunt eget tempus vel pede morbi porttitor lorem id ligula suspendisse ornare consequat lectus in est risus',
                                                                                             70959, 82, FALSE, 4, 88);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (293, 'nulla ut erat id mauris vulputate elementum nullam varius nulla facilisi cras non', 43365, 4, TRUE, 2, 95);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (294, 'odio cras mi pede malesuada in imperdiet et commodo vulputate justo in', 91323, 41, FALSE, 10, 92);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (295,
                                                                                             'massa id nisl venenatis lacinia aenean sit amet justo morbi ut odio cras mi pede malesuada in imperdiet et commodo',
                                                                                             81013, 14, TRUE, 4, 6);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (296, 'justo nec condimentum neque sapien placerat ante nulla justo aliquam quis turpis eget elit sodales', 61442, 37,
   FALSE, 15, 8);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (297, 'nulla suspendisse potenti cras in purus eu magna vulputate luctus cum sociis natoque penatibus et magnis',
   8448, 30, FALSE, 11, 9);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES
  (298, 'turpis nec euismod scelerisque quam turpis adipiscing lorem vitae mattis nibh ligula nec sem', 67043, 5, FALSE,
   12, 25);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id) VALUES (299,
                                                                                             'venenatis non sodales sed tincidunt eu felis fusce posuere felis sed lacus morbi sem mauris laoreet ut rhoncus aliquet pulvinar',
                                                                                             46207, 70, TRUE, 18, 13);
INSERT INTO product (id, description, price, quantity, active, category_id, user_id)
VALUES (300, 'ut nulla sed accumsan felis ut at dolor quis odio consequat', 22778, 30, FALSE, 3, 22);


CREATE TABLE order_status (
  id   SERIAL PRIMARY KEY,
  name VARCHAR NOT NULL UNIQUE
);

INSERT INTO order_status (id, name) VALUES (1, 'open');
INSERT INTO order_status (id, name) VALUES (2, 'canceled');
INSERT INTO order_status (id, name) VALUES (3, 'in progress');
INSERT INTO order_status (id, name) VALUES (4, 'closed');

CREATE TABLE "order" (
  id              SERIAL PRIMARY KEY,
  serial_number   VARCHAR(50) NOT NULL UNIQUE,
  order_status_id INT REFERENCES order_status (id)
);

INSERT INTO "order" (id, serial_number, order_status_id) VALUES (1, '3865671764', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (2, '2563362768', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (3, '8253342195', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (4, '3118696141', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (5, '0164449744', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (6, '3102949754', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (7, '4006323107', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (8, '9196327499', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (9, '8261391299', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (10, '0981372066', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (11, '1471198804', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (12, '2980046221', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (13, '3833311398', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (14, '3879550336', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (15, '7076777533', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (16, '8879711415', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (17, '7724947295', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (18, '6557483242', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (19, '8709741046', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (20, '5273654491', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (21, '0743374576', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (22, '0091998832', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (23, '0975822217', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (24, '2053143177', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (25, '9397621378', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (26, '8749065262', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (27, '0411764330', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (28, '3782643240', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (29, '3654534929', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (30, '3504185562', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (31, '5703249627', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (32, '6543645431', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (33, '8944370737', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (34, '3231910218', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (35, '7597260075', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (36, '0624048543', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (37, '7608727292', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (38, '6564923856', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (39, '9052849056', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (40, '4966221730', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (41, '0497910470', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (42, '6973751326', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (43, '9162157752', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (44, '1171792077', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (45, '5421246329', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (46, '1480122084', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (47, '5710361038', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (48, '7706025497', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (49, '6264184039', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (50, '8243805931', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (51, '7281333005', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (52, '6526320252', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (53, '5957932663', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (54, '9322022388', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (55, '8534404461', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (56, '6313532147', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (57, '7212562335', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (58, '3050233915', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (59, '4817378204', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (60, '6429117537', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (61, '7823957663', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (62, '3796459250', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (63, '7604017673', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (64, '0383089344', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (65, '1679386581', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (66, '1546469346', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (67, '6419817951', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (68, '4039104501', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (69, '9683618189', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (70, '1138752428', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (71, '1121192602', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (72, '1430705051', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (73, '9439182210', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (74, '0768726182', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (75, '2516535686', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (76, '9758894919', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (77, '3559589347', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (78, '0668655151', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (79, '6553143994', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (80, '3541782501', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (81, '5347943890', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (82, '6848274003', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (83, '4725166529', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (84, '6614155644', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (85, '6010164753', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (86, '9078724765', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (87, '5367701639', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (88, '1980436452', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (89, '5061146603', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (90, '4480291628', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (91, '3738138315', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (92, '2273710739', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (93, '7191009969', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (94, '5326230712', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (95, '9535167537', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (96, '6704737251', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (97, '4747579540', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (98, '9863371432', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (99, '6224370508', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (100, '2034692098', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (101, '9641013130', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (102, '8606110205', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (103, '5614838368', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (104, '3283490805', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (105, '5847536828', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (106, '5595802820', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (107, '9967439106', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (108, '2151243206', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (109, '1172561370', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (110, '2665908026', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (111, '5724780909', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (112, '8587034081', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (113, '8561615869', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (114, '8941644275', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (115, '8251007321', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (116, '8219318201', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (117, '2840623544', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (118, '7404997208', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (119, '2770530100', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (120, '3122330768', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (121, '9806246632', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (122, '7446249935', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (123, '2803314541', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (124, '3595139666', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (125, '1151834866', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (126, '5007982016', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (127, '0384019390', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (128, '0402609212', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (129, '2531001891', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (130, '4168124002', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (131, '0466661851', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (132, '3446789154', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (133, '9433650948', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (134, '2897675128', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (135, '3865590519', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (136, '7577149438', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (137, '3385255481', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (138, '8707704747', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (139, '3955681211', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (140, '0924740027', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (141, '2472636504', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (142, '0858964414', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (143, '5813057331', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (144, '9615159883', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (145, '9645353904', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (146, '4362648917', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (147, '9521087358', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (148, '9068631063', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (149, '7620039317', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (150, '0907533604', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (151, '7211306319', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (152, '5381421141', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (153, '5083441047', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (154, '0945502168', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (155, '3472962224', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (156, '1063085322', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (157, '8837547668', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (158, '8826215723', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (159, '2966421754', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (160, '1087935113', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (161, '4856726110', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (162, '1403580421', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (163, '6303248209', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (164, '3006676122', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (165, '4587375721', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (166, '6999721297', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (167, '7120557939', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (168, '8761032298', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (169, '7856392517', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (170, '8530777611', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (171, '9235909627', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (172, '1906114447', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (173, '4235221795', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (174, '2429889838', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (175, '5993102683', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (176, '5847816464', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (177, '4483720651', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (178, '4827944997', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (179, '7772607563', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (180, '4031536585', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (181, '5997553612', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (182, '0762618833', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (183, '1167884310', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (184, '5383560068', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (185, '1965287158', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (186, '0468646833', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (187, '0348731485', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (188, '3934867383', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (189, '4289950973', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (190, '1388129019', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (191, '8825685807', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (192, '2743188871', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (193, '1985311887', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (194, '2091915351', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (195, '3762787557', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (196, '8399961795', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (197, '1269213156', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (198, '5337964305', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (199, '3916633953', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (200, '5860676425', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (201, '1188819828', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (202, '2599065097', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (203, '7793610075', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (204, '8791934222', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (205, '2099439958', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (206, '4596602638', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (207, '5179186161', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (208, '0500682372', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (209, '2797324188', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (210, '6523201759', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (211, '9336230247', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (212, '9743594043', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (213, '0588367265', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (214, '7593186962', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (215, '3015349244', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (216, '5906246517', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (217, '6960663342', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (218, '5912814580', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (219, '8391461572', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (220, '7642163290', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (221, '0699934052', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (222, '5333461287', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (223, '1544113269', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (224, '7553231509', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (225, '2691677338', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (226, '5822534716', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (227, '3505770558', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (228, '5300871222', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (229, '3896223682', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (230, '0328403563', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (231, '1545198004', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (232, '1356624081', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (233, '4995314768', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (234, '9691076756', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (235, '2165061199', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (236, '0895992574', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (237, '7156481061', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (238, '3452275191', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (239, '0061524220', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (240, '6099823492', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (241, '0931843545', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (242, '4645196456', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (243, '2203848375', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (244, '8254899363', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (245, '3869323353', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (246, '6998661517', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (247, '0880732822', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (248, '4934442731', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (249, '6579727640', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (250, '3698302624', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (251, '4573044833', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (252, '9718534695', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (253, '1674597029', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (254, '3483237615', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (255, '5638764135', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (256, '9023837762', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (257, '5651432418', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (258, '0350403899', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (259, '6882690774', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (260, '0314320822', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (261, '1991007094', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (262, '3320681125', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (263, '7102112963', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (264, '1091614113', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (265, '5435401151', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (266, '1375486446', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (267, '8873394795', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (268, '2540571328', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (269, '1189322218', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (270, '8573687665', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (271, '1645029573', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (272, '9973752058', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (273, '9717317577', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (274, '8649807070', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (275, '2080348450', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (276, '8252020054', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (277, '4894092875', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (278, '8718258220', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (279, '8678033568', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (280, '4417137099', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (281, '2010882768', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (282, '7819080116', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (283, '3946873588', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (284, '3070336922', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (285, '0546876315', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (286, '9066880759', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (287, '6197482606', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (288, '0364391375', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (289, '3884256513', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (290, '1727254368', 1);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (291, '4973017388', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (292, '3411860960', 3);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (293, '1006647767', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (294, '2064603018', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (295, '8921849378', 4);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (296, '2650388331', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (297, '0977118800', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (298, '6433682111', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (299, '4279827311', 2);
INSERT INTO "order" (id, serial_number, order_status_id) VALUES (300, '3485864986', 3);

CREATE TABLE order_product (
  id         SERIAL PRIMARY KEY,
  product_id INT REFERENCES product (id),
  order_id   INT REFERENCES "order" (id)
);

INSERT INTO order_product (id, product_id, order_id) VALUES (1, 98, 74);
INSERT INTO order_product (id, product_id, order_id) VALUES (2, 226, 228);
INSERT INTO order_product (id, product_id, order_id) VALUES (3, 149, 34);
INSERT INTO order_product (id, product_id, order_id) VALUES (4, 231, 264);
INSERT INTO order_product (id, product_id, order_id) VALUES (5, 143, 81);
INSERT INTO order_product (id, product_id, order_id) VALUES (6, 180, 141);
INSERT INTO order_product (id, product_id, order_id) VALUES (7, 244, 298);
INSERT INTO order_product (id, product_id, order_id) VALUES (8, 215, 276);
INSERT INTO order_product (id, product_id, order_id) VALUES (9, 216, 226);
INSERT INTO order_product (id, product_id, order_id) VALUES (10, 227, 100);
INSERT INTO order_product (id, product_id, order_id) VALUES (11, 184, 127);
INSERT INTO order_product (id, product_id, order_id) VALUES (12, 241, 140);
INSERT INTO order_product (id, product_id, order_id) VALUES (13, 293, 212);
INSERT INTO order_product (id, product_id, order_id) VALUES (14, 109, 252);
INSERT INTO order_product (id, product_id, order_id) VALUES (15, 249, 32);
INSERT INTO order_product (id, product_id, order_id) VALUES (16, 278, 290);
INSERT INTO order_product (id, product_id, order_id) VALUES (17, 182, 238);
INSERT INTO order_product (id, product_id, order_id) VALUES (18, 101, 95);
INSERT INTO order_product (id, product_id, order_id) VALUES (19, 224, 182);
INSERT INTO order_product (id, product_id, order_id) VALUES (20, 118, 49);
INSERT INTO order_product (id, product_id, order_id) VALUES (21, 196, 121);
INSERT INTO order_product (id, product_id, order_id) VALUES (22, 58, 237);
INSERT INTO order_product (id, product_id, order_id) VALUES (23, 233, 147);
INSERT INTO order_product (id, product_id, order_id) VALUES (24, 116, 175);
INSERT INTO order_product (id, product_id, order_id) VALUES (25, 126, 283);
INSERT INTO order_product (id, product_id, order_id) VALUES (26, 234, 258);
INSERT INTO order_product (id, product_id, order_id) VALUES (27, 269, 134);
INSERT INTO order_product (id, product_id, order_id) VALUES (28, 252, 278);
INSERT INTO order_product (id, product_id, order_id) VALUES (29, 121, 203);
INSERT INTO order_product (id, product_id, order_id) VALUES (30, 12, 214);
INSERT INTO order_product (id, product_id, order_id) VALUES (31, 181, 243);
INSERT INTO order_product (id, product_id, order_id) VALUES (32, 227, 188);
INSERT INTO order_product (id, product_id, order_id) VALUES (33, 193, 263);
INSERT INTO order_product (id, product_id, order_id) VALUES (34, 21, 100);
INSERT INTO order_product (id, product_id, order_id) VALUES (35, 69, 137);
INSERT INTO order_product (id, product_id, order_id) VALUES (36, 150, 283);
INSERT INTO order_product (id, product_id, order_id) VALUES (37, 31, 46);
INSERT INTO order_product (id, product_id, order_id) VALUES (38, 120, 34);
INSERT INTO order_product (id, product_id, order_id) VALUES (39, 27, 180);
INSERT INTO order_product (id, product_id, order_id) VALUES (40, 280, 215);
INSERT INTO order_product (id, product_id, order_id) VALUES (41, 268, 57);
INSERT INTO order_product (id, product_id, order_id) VALUES (42, 287, 139);
INSERT INTO order_product (id, product_id, order_id) VALUES (43, 174, 230);
INSERT INTO order_product (id, product_id, order_id) VALUES (44, 156, 111);
INSERT INTO order_product (id, product_id, order_id) VALUES (45, 66, 25);
INSERT INTO order_product (id, product_id, order_id) VALUES (46, 239, 259);
INSERT INTO order_product (id, product_id, order_id) VALUES (47, 170, 4);
INSERT INTO order_product (id, product_id, order_id) VALUES (48, 200, 204);
INSERT INTO order_product (id, product_id, order_id) VALUES (49, 68, 77);
INSERT INTO order_product (id, product_id, order_id) VALUES (50, 51, 54);
INSERT INTO order_product (id, product_id, order_id) VALUES (51, 138, 297);
INSERT INTO order_product (id, product_id, order_id) VALUES (52, 233, 267);
INSERT INTO order_product (id, product_id, order_id) VALUES (53, 134, 211);
INSERT INTO order_product (id, product_id, order_id) VALUES (54, 131, 153);
INSERT INTO order_product (id, product_id, order_id) VALUES (55, 215, 177);
INSERT INTO order_product (id, product_id, order_id) VALUES (56, 239, 281);
INSERT INTO order_product (id, product_id, order_id) VALUES (57, 122, 248);
INSERT INTO order_product (id, product_id, order_id) VALUES (58, 99, 53);
INSERT INTO order_product (id, product_id, order_id) VALUES (59, 274, 215);
INSERT INTO order_product (id, product_id, order_id) VALUES (60, 164, 236);
INSERT INTO order_product (id, product_id, order_id) VALUES (61, 3, 33);
INSERT INTO order_product (id, product_id, order_id) VALUES (62, 294, 51);
INSERT INTO order_product (id, product_id, order_id) VALUES (63, 151, 154);
INSERT INTO order_product (id, product_id, order_id) VALUES (64, 188, 204);
INSERT INTO order_product (id, product_id, order_id) VALUES (65, 93, 200);
INSERT INTO order_product (id, product_id, order_id) VALUES (66, 42, 187);
INSERT INTO order_product (id, product_id, order_id) VALUES (67, 152, 180);
INSERT INTO order_product (id, product_id, order_id) VALUES (68, 206, 144);
INSERT INTO order_product (id, product_id, order_id) VALUES (69, 213, 104);
INSERT INTO order_product (id, product_id, order_id) VALUES (70, 190, 78);
INSERT INTO order_product (id, product_id, order_id) VALUES (71, 221, 209);
INSERT INTO order_product (id, product_id, order_id) VALUES (72, 130, 69);
INSERT INTO order_product (id, product_id, order_id) VALUES (73, 120, 266);
INSERT INTO order_product (id, product_id, order_id) VALUES (74, 189, 37);
INSERT INTO order_product (id, product_id, order_id) VALUES (75, 276, 62);
INSERT INTO order_product (id, product_id, order_id) VALUES (76, 12, 38);
INSERT INTO order_product (id, product_id, order_id) VALUES (77, 175, 221);
INSERT INTO order_product (id, product_id, order_id) VALUES (78, 101, 97);
INSERT INTO order_product (id, product_id, order_id) VALUES (79, 179, 145);
INSERT INTO order_product (id, product_id, order_id) VALUES (80, 177, 102);
INSERT INTO order_product (id, product_id, order_id) VALUES (81, 63, 135);
INSERT INTO order_product (id, product_id, order_id) VALUES (82, 53, 117);
INSERT INTO order_product (id, product_id, order_id) VALUES (83, 268, 171);
INSERT INTO order_product (id, product_id, order_id) VALUES (84, 87, 112);
INSERT INTO order_product (id, product_id, order_id) VALUES (85, 214, 72);
INSERT INTO order_product (id, product_id, order_id) VALUES (86, 197, 161);
INSERT INTO order_product (id, product_id, order_id) VALUES (87, 125, 293);
INSERT INTO order_product (id, product_id, order_id) VALUES (88, 110, 190);
INSERT INTO order_product (id, product_id, order_id) VALUES (89, 45, 232);
INSERT INTO order_product (id, product_id, order_id) VALUES (90, 218, 296);
INSERT INTO order_product (id, product_id, order_id) VALUES (91, 190, 259);
INSERT INTO order_product (id, product_id, order_id) VALUES (92, 121, 100);
INSERT INTO order_product (id, product_id, order_id) VALUES (93, 186, 182);
INSERT INTO order_product (id, product_id, order_id) VALUES (94, 169, 73);
INSERT INTO order_product (id, product_id, order_id) VALUES (95, 203, 287);
INSERT INTO order_product (id, product_id, order_id) VALUES (96, 260, 237);
INSERT INTO order_product (id, product_id, order_id) VALUES (97, 23, 178);
INSERT INTO order_product (id, product_id, order_id) VALUES (98, 225, 155);
INSERT INTO order_product (id, product_id, order_id) VALUES (99, 99, 292);
INSERT INTO order_product (id, product_id, order_id) VALUES (100, 89, 106);
INSERT INTO order_product (id, product_id, order_id) VALUES (101, 89, 208);
INSERT INTO order_product (id, product_id, order_id) VALUES (102, 135, 196);
INSERT INTO order_product (id, product_id, order_id) VALUES (103, 14, 85);
INSERT INTO order_product (id, product_id, order_id) VALUES (104, 198, 111);
INSERT INTO order_product (id, product_id, order_id) VALUES (105, 101, 157);
INSERT INTO order_product (id, product_id, order_id) VALUES (106, 32, 266);
INSERT INTO order_product (id, product_id, order_id) VALUES (107, 300, 198);
INSERT INTO order_product (id, product_id, order_id) VALUES (108, 171, 75);
INSERT INTO order_product (id, product_id, order_id) VALUES (109, 154, 92);
INSERT INTO order_product (id, product_id, order_id) VALUES (110, 197, 141);
INSERT INTO order_product (id, product_id, order_id) VALUES (111, 176, 58);
INSERT INTO order_product (id, product_id, order_id) VALUES (112, 106, 154);
INSERT INTO order_product (id, product_id, order_id) VALUES (113, 63, 188);
INSERT INTO order_product (id, product_id, order_id) VALUES (114, 59, 215);
INSERT INTO order_product (id, product_id, order_id) VALUES (115, 193, 284);
INSERT INTO order_product (id, product_id, order_id) VALUES (116, 192, 290);
INSERT INTO order_product (id, product_id, order_id) VALUES (117, 59, 220);
INSERT INTO order_product (id, product_id, order_id) VALUES (118, 111, 213);
INSERT INTO order_product (id, product_id, order_id) VALUES (119, 33, 243);
INSERT INTO order_product (id, product_id, order_id) VALUES (120, 176, 27);
INSERT INTO order_product (id, product_id, order_id) VALUES (121, 187, 135);
INSERT INTO order_product (id, product_id, order_id) VALUES (122, 256, 213);
INSERT INTO order_product (id, product_id, order_id) VALUES (123, 137, 243);
INSERT INTO order_product (id, product_id, order_id) VALUES (124, 60, 146);
INSERT INTO order_product (id, product_id, order_id) VALUES (125, 281, 178);
INSERT INTO order_product (id, product_id, order_id) VALUES (126, 115, 238);
INSERT INTO order_product (id, product_id, order_id) VALUES (127, 170, 247);
INSERT INTO order_product (id, product_id, order_id) VALUES (128, 247, 85);
INSERT INTO order_product (id, product_id, order_id) VALUES (129, 35, 84);
INSERT INTO order_product (id, product_id, order_id) VALUES (130, 188, 169);
INSERT INTO order_product (id, product_id, order_id) VALUES (131, 41, 102);
INSERT INTO order_product (id, product_id, order_id) VALUES (132, 289, 198);
INSERT INTO order_product (id, product_id, order_id) VALUES (133, 44, 125);
INSERT INTO order_product (id, product_id, order_id) VALUES (134, 31, 107);
INSERT INTO order_product (id, product_id, order_id) VALUES (135, 252, 275);
INSERT INTO order_product (id, product_id, order_id) VALUES (136, 157, 2);
INSERT INTO order_product (id, product_id, order_id) VALUES (137, 51, 71);
INSERT INTO order_product (id, product_id, order_id) VALUES (138, 208, 37);
INSERT INTO order_product (id, product_id, order_id) VALUES (139, 101, 130);
INSERT INTO order_product (id, product_id, order_id) VALUES (140, 96, 34);
INSERT INTO order_product (id, product_id, order_id) VALUES (141, 208, 134);
INSERT INTO order_product (id, product_id, order_id) VALUES (142, 52, 36);
INSERT INTO order_product (id, product_id, order_id) VALUES (143, 194, 33);
INSERT INTO order_product (id, product_id, order_id) VALUES (144, 41, 267);
INSERT INTO order_product (id, product_id, order_id) VALUES (145, 126, 154);
INSERT INTO order_product (id, product_id, order_id) VALUES (146, 96, 35);
INSERT INTO order_product (id, product_id, order_id) VALUES (147, 118, 149);
INSERT INTO order_product (id, product_id, order_id) VALUES (148, 74, 173);
INSERT INTO order_product (id, product_id, order_id) VALUES (149, 198, 30);
INSERT INTO order_product (id, product_id, order_id) VALUES (150, 287, 245);
INSERT INTO order_product (id, product_id, order_id) VALUES (151, 116, 188);
INSERT INTO order_product (id, product_id, order_id) VALUES (152, 235, 6);
INSERT INTO order_product (id, product_id, order_id) VALUES (153, 63, 278);
INSERT INTO order_product (id, product_id, order_id) VALUES (154, 65, 8);
INSERT INTO order_product (id, product_id, order_id) VALUES (155, 283, 104);
INSERT INTO order_product (id, product_id, order_id) VALUES (156, 151, 119);
INSERT INTO order_product (id, product_id, order_id) VALUES (157, 202, 104);
INSERT INTO order_product (id, product_id, order_id) VALUES (158, 270, 160);
INSERT INTO order_product (id, product_id, order_id) VALUES (159, 32, 220);
INSERT INTO order_product (id, product_id, order_id) VALUES (160, 224, 167);
INSERT INTO order_product (id, product_id, order_id) VALUES (161, 106, 262);
INSERT INTO order_product (id, product_id, order_id) VALUES (162, 138, 25);
INSERT INTO order_product (id, product_id, order_id) VALUES (163, 233, 182);
INSERT INTO order_product (id, product_id, order_id) VALUES (164, 222, 239);
INSERT INTO order_product (id, product_id, order_id) VALUES (165, 273, 260);
INSERT INTO order_product (id, product_id, order_id) VALUES (166, 198, 97);
INSERT INTO order_product (id, product_id, order_id) VALUES (167, 128, 280);
INSERT INTO order_product (id, product_id, order_id) VALUES (168, 134, 157);
INSERT INTO order_product (id, product_id, order_id) VALUES (169, 150, 115);
INSERT INTO order_product (id, product_id, order_id) VALUES (170, 281, 142);
INSERT INTO order_product (id, product_id, order_id) VALUES (171, 97, 158);
INSERT INTO order_product (id, product_id, order_id) VALUES (172, 104, 205);
INSERT INTO order_product (id, product_id, order_id) VALUES (173, 254, 62);
INSERT INTO order_product (id, product_id, order_id) VALUES (174, 42, 168);
INSERT INTO order_product (id, product_id, order_id) VALUES (175, 60, 107);
INSERT INTO order_product (id, product_id, order_id) VALUES (176, 80, 75);
INSERT INTO order_product (id, product_id, order_id) VALUES (177, 225, 257);
INSERT INTO order_product (id, product_id, order_id) VALUES (178, 189, 19);
INSERT INTO order_product (id, product_id, order_id) VALUES (179, 44, 191);
INSERT INTO order_product (id, product_id, order_id) VALUES (180, 115, 24);
INSERT INTO order_product (id, product_id, order_id) VALUES (181, 93, 79);
INSERT INTO order_product (id, product_id, order_id) VALUES (182, 194, 11);
INSERT INTO order_product (id, product_id, order_id) VALUES (183, 31, 239);
INSERT INTO order_product (id, product_id, order_id) VALUES (184, 175, 220);
INSERT INTO order_product (id, product_id, order_id) VALUES (185, 68, 63);
INSERT INTO order_product (id, product_id, order_id) VALUES (186, 285, 9);
INSERT INTO order_product (id, product_id, order_id) VALUES (187, 278, 189);
INSERT INTO order_product (id, product_id, order_id) VALUES (188, 31, 66);
INSERT INTO order_product (id, product_id, order_id) VALUES (189, 278, 49);
INSERT INTO order_product (id, product_id, order_id) VALUES (190, 19, 282);
INSERT INTO order_product (id, product_id, order_id) VALUES (191, 257, 65);
INSERT INTO order_product (id, product_id, order_id) VALUES (192, 226, 266);
INSERT INTO order_product (id, product_id, order_id) VALUES (193, 276, 123);
INSERT INTO order_product (id, product_id, order_id) VALUES (194, 11, 184);
INSERT INTO order_product (id, product_id, order_id) VALUES (195, 206, 172);
INSERT INTO order_product (id, product_id, order_id) VALUES (196, 109, 167);
INSERT INTO order_product (id, product_id, order_id) VALUES (197, 246, 4);
INSERT INTO order_product (id, product_id, order_id) VALUES (198, 67, 174);
INSERT INTO order_product (id, product_id, order_id) VALUES (199, 116, 132);
INSERT INTO order_product (id, product_id, order_id) VALUES (200, 87, 201);
INSERT INTO order_product (id, product_id, order_id) VALUES (201, 91, 117);
INSERT INTO order_product (id, product_id, order_id) VALUES (202, 56, 147);
INSERT INTO order_product (id, product_id, order_id) VALUES (203, 300, 136);
INSERT INTO order_product (id, product_id, order_id) VALUES (204, 128, 115);
INSERT INTO order_product (id, product_id, order_id) VALUES (205, 100, 147);
INSERT INTO order_product (id, product_id, order_id) VALUES (206, 239, 278);
INSERT INTO order_product (id, product_id, order_id) VALUES (207, 97, 268);
INSERT INTO order_product (id, product_id, order_id) VALUES (208, 226, 199);
INSERT INTO order_product (id, product_id, order_id) VALUES (209, 260, 181);
INSERT INTO order_product (id, product_id, order_id) VALUES (210, 8, 62);
INSERT INTO order_product (id, product_id, order_id) VALUES (211, 169, 219);
INSERT INTO order_product (id, product_id, order_id) VALUES (212, 167, 180);
INSERT INTO order_product (id, product_id, order_id) VALUES (213, 242, 267);
INSERT INTO order_product (id, product_id, order_id) VALUES (214, 293, 206);
INSERT INTO order_product (id, product_id, order_id) VALUES (215, 5, 209);
INSERT INTO order_product (id, product_id, order_id) VALUES (216, 205, 28);
INSERT INTO order_product (id, product_id, order_id) VALUES (217, 90, 250);
INSERT INTO order_product (id, product_id, order_id) VALUES (218, 203, 164);
INSERT INTO order_product (id, product_id, order_id) VALUES (219, 78, 50);
INSERT INTO order_product (id, product_id, order_id) VALUES (220, 102, 299);
INSERT INTO order_product (id, product_id, order_id) VALUES (221, 204, 296);
INSERT INTO order_product (id, product_id, order_id) VALUES (222, 111, 151);
INSERT INTO order_product (id, product_id, order_id) VALUES (223, 161, 120);
INSERT INTO order_product (id, product_id, order_id) VALUES (224, 254, 204);
INSERT INTO order_product (id, product_id, order_id) VALUES (225, 101, 281);
INSERT INTO order_product (id, product_id, order_id) VALUES (226, 88, 164);
INSERT INTO order_product (id, product_id, order_id) VALUES (227, 109, 286);
INSERT INTO order_product (id, product_id, order_id) VALUES (228, 154, 34);
INSERT INTO order_product (id, product_id, order_id) VALUES (229, 31, 90);
INSERT INTO order_product (id, product_id, order_id) VALUES (230, 199, 100);
INSERT INTO order_product (id, product_id, order_id) VALUES (231, 132, 267);
INSERT INTO order_product (id, product_id, order_id) VALUES (232, 57, 119);
INSERT INTO order_product (id, product_id, order_id) VALUES (233, 5, 169);
INSERT INTO order_product (id, product_id, order_id) VALUES (234, 158, 96);
INSERT INTO order_product (id, product_id, order_id) VALUES (235, 107, 142);
INSERT INTO order_product (id, product_id, order_id) VALUES (236, 61, 27);
INSERT INTO order_product (id, product_id, order_id) VALUES (237, 213, 63);
INSERT INTO order_product (id, product_id, order_id) VALUES (238, 167, 241);
INSERT INTO order_product (id, product_id, order_id) VALUES (239, 226, 112);
INSERT INTO order_product (id, product_id, order_id) VALUES (240, 28, 103);
INSERT INTO order_product (id, product_id, order_id) VALUES (241, 13, 255);
INSERT INTO order_product (id, product_id, order_id) VALUES (242, 183, 132);
INSERT INTO order_product (id, product_id, order_id) VALUES (243, 211, 114);
INSERT INTO order_product (id, product_id, order_id) VALUES (244, 263, 189);
INSERT INTO order_product (id, product_id, order_id) VALUES (245, 164, 26);
INSERT INTO order_product (id, product_id, order_id) VALUES (246, 16, 30);
INSERT INTO order_product (id, product_id, order_id) VALUES (247, 15, 234);
INSERT INTO order_product (id, product_id, order_id) VALUES (248, 133, 232);
INSERT INTO order_product (id, product_id, order_id) VALUES (249, 190, 265);
INSERT INTO order_product (id, product_id, order_id) VALUES (250, 151, 172);
INSERT INTO order_product (id, product_id, order_id) VALUES (251, 65, 233);
INSERT INTO order_product (id, product_id, order_id) VALUES (252, 4, 156);
INSERT INTO order_product (id, product_id, order_id) VALUES (253, 207, 229);
INSERT INTO order_product (id, product_id, order_id) VALUES (254, 234, 34);
INSERT INTO order_product (id, product_id, order_id) VALUES (255, 28, 180);
INSERT INTO order_product (id, product_id, order_id) VALUES (256, 297, 73);
INSERT INTO order_product (id, product_id, order_id) VALUES (257, 132, 187);
INSERT INTO order_product (id, product_id, order_id) VALUES (258, 43, 87);
INSERT INTO order_product (id, product_id, order_id) VALUES (259, 247, 17);
INSERT INTO order_product (id, product_id, order_id) VALUES (260, 57, 198);
INSERT INTO order_product (id, product_id, order_id) VALUES (261, 102, 249);
INSERT INTO order_product (id, product_id, order_id) VALUES (262, 24, 15);
INSERT INTO order_product (id, product_id, order_id) VALUES (263, 47, 186);
INSERT INTO order_product (id, product_id, order_id) VALUES (264, 60, 9);
INSERT INTO order_product (id, product_id, order_id) VALUES (265, 116, 132);
INSERT INTO order_product (id, product_id, order_id) VALUES (266, 200, 19);
INSERT INTO order_product (id, product_id, order_id) VALUES (267, 121, 25);
INSERT INTO order_product (id, product_id, order_id) VALUES (268, 76, 253);
INSERT INTO order_product (id, product_id, order_id) VALUES (269, 13, 159);
INSERT INTO order_product (id, product_id, order_id) VALUES (270, 96, 77);
INSERT INTO order_product (id, product_id, order_id) VALUES (271, 270, 261);
INSERT INTO order_product (id, product_id, order_id) VALUES (272, 252, 176);
INSERT INTO order_product (id, product_id, order_id) VALUES (273, 167, 286);
INSERT INTO order_product (id, product_id, order_id) VALUES (274, 201, 193);
INSERT INTO order_product (id, product_id, order_id) VALUES (275, 20, 296);
INSERT INTO order_product (id, product_id, order_id) VALUES (276, 172, 40);
INSERT INTO order_product (id, product_id, order_id) VALUES (277, 161, 74);
INSERT INTO order_product (id, product_id, order_id) VALUES (278, 191, 144);
INSERT INTO order_product (id, product_id, order_id) VALUES (279, 146, 97);
INSERT INTO order_product (id, product_id, order_id) VALUES (280, 230, 63);
INSERT INTO order_product (id, product_id, order_id) VALUES (281, 10, 9);
INSERT INTO order_product (id, product_id, order_id) VALUES (282, 251, 264);
INSERT INTO order_product (id, product_id, order_id) VALUES (283, 280, 261);
INSERT INTO order_product (id, product_id, order_id) VALUES (284, 57, 169);
INSERT INTO order_product (id, product_id, order_id) VALUES (285, 184, 193);
INSERT INTO order_product (id, product_id, order_id) VALUES (286, 186, 276);
INSERT INTO order_product (id, product_id, order_id) VALUES (287, 161, 30);
INSERT INTO order_product (id, product_id, order_id) VALUES (288, 162, 285);
INSERT INTO order_product (id, product_id, order_id) VALUES (289, 134, 63);
INSERT INTO order_product (id, product_id, order_id) VALUES (290, 253, 107);
INSERT INTO order_product (id, product_id, order_id) VALUES (291, 54, 208);
INSERT INTO order_product (id, product_id, order_id) VALUES (292, 285, 9);
INSERT INTO order_product (id, product_id, order_id) VALUES (293, 36, 99);
INSERT INTO order_product (id, product_id, order_id) VALUES (294, 37, 263);
INSERT INTO order_product (id, product_id, order_id) VALUES (295, 14, 224);
INSERT INTO order_product (id, product_id, order_id) VALUES (296, 247, 215);
INSERT INTO order_product (id, product_id, order_id) VALUES (297, 296, 166);
INSERT INTO order_product (id, product_id, order_id) VALUES (298, 287, 18);
INSERT INTO order_product (id, product_id, order_id) VALUES (299, 267, 73);
INSERT INTO order_product (id, product_id, order_id) VALUES (300, 282, 90);

CREATE TABLE "comment" (
  id         SERIAL PRIMARY KEY,
  title      VARCHAR(64) NOT NULL,
  text       VARCHAR(300),
  is_deleted BOOLEAN DEFAULT FALSE,
  order_id   INT REFERENCES "order" (id)
);

INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (1, 'augue a suscipit nulla', 'sagittis sapien cum sociis natoque penatibus et magnis dis parturient', TRUE, 116);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (2, 'amet consectetuer adipiscing elit proin',
                                                                      'id turpis integer aliquet massa id lobortis convallis tortor risus dapibus',
                                                                      FALSE, 183);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (3, 'sem mauris laoreet ut',
                                                                      'pretium nisl ut volutpat sapien arcu sed augue aliquam erat volutpat in congue etiam justo etiam pretium iaculis justo',
                                                                      TRUE, 247);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (4, 'in congue etiam justo etiam',
                                                                      'nulla tellus in sagittis dui vel nisl duis ac nibh fusce lacus purus aliquet at feugiat non pretium quis lectus',
                                                                      TRUE, 161);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (5, 'volutpat dui maecenas tristique est',
                                                                      'convallis morbi odio odio elementum eu interdum eu tincidunt in leo maecenas pulvinar',
                                                                      FALSE, 25);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (6, 'amet consectetuer adipiscing elit',
                                                                      'quam a odio in hac habitasse platea dictumst maecenas ut massa quis augue luctus tincidunt',
                                                                      TRUE, 123);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (7, 'maecenas leo odio condimentum id',
                                                                      'sem praesent id massa id nisl venenatis lacinia aenean sit amet justo morbi ut odio cras mi pede malesuada in',
                                                                      TRUE, 171);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (8, 'donec quis orci eget orci', 'leo rhoncus sed vestibulum sit amet cursus id turpis integer aliquet massa', TRUE,
   198);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (9, 'id nisl venenatis lacinia',
                                                                      'quis augue luctus tincidunt nulla mollis molestie lorem quisque ut erat curabitur gravida nisi at',
                                                                      TRUE, 43);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (10, 'vulputate vitae nisl',
                                                                      'a pede posuere nonummy integer non velit donec diam neque vestibulum eget vulputate ut ultrices vel augue vestibulum ante',
                                                                      FALSE, 44);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (11, 'ac nibh fusce lacus',
                                                                      'pede lobortis ligula sit amet eleifend pede libero quis orci nullam molestie nibh in lectus pellentesque',
                                                                      TRUE, 11);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (12, 'eget vulputate ut ultrices', 'viverra dapibus nulla suscipit ligula in lacus curabitur at ipsum ac', FALSE,
   256);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (13, 'enim lorem ipsum dolor',
                                                                      'quam pede lobortis ligula sit amet eleifend pede libero quis orci nullam molestie nibh in lectus pellentesque at nulla suspendisse',
                                                                      FALSE, 244);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (14, 'platea dictumst maecenas',
                                                                      'dis parturient montes nascetur ridiculus mus vivamus vestibulum sagittis sapien cum sociis natoque penatibus et magnis dis parturient montes',
                                                                      FALSE, 237);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (15, 'libero ut massa volutpat convallis',
                                                                      'vel est donec odio justo sollicitudin ut suscipit a feugiat et eros vestibulum ac est lacinia nisi venenatis tristique fusce',
                                                                      FALSE, 147);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (16, 'nulla eget eros elementum',
                                                                      'pellentesque ultrices phasellus id sapien in sapien iaculis congue vivamus metus arcu adipiscing molestie hendrerit at vulputate vitae nisl',
                                                                      FALSE, 99);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (17, 'non mauris morbi',
                                                                      'molestie nibh in lectus pellentesque at nulla suspendisse potenti cras in purus eu magna vulputate luctus',
                                                                      FALSE, 127);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (18, 'nunc proin at turpis a', 'dapibus nulla suscipit ligula in lacus curabitur at ipsum ac tellus semper interdum',
   FALSE, 78);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (19, 'congue diam id ornare imperdiet', 'sodales sed tincidunt eu felis fusce posuere felis sed lacus morbi', TRUE,
   27);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (20, 'metus sapien ut nunc', 'venenatis lacinia aenean sit amet justo morbi ut odio cras mi pede malesuada in', TRUE,
   51);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (21, 'etiam pretium iaculis justo',
                                                                      'quisque id justo sit amet sapien dignissim vestibulum vestibulum ante ipsum primis in faucibus orci luctus',
                                                                      TRUE, 24);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (22, 'vestibulum sit amet cursus id',
                                                                      'cubilia curae donec pharetra magna vestibulum aliquet ultrices erat tortor sollicitudin mi sit amet lobortis',
                                                                      TRUE, 257);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (23, 'fringilla rhoncus mauris enim',
                                                                      'tristique fusce congue diam id ornare imperdiet sapien urna pretium nisl ut volutpat sapien',
                                                                      TRUE, 298);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (24, 'natoque penatibus et',
                                                                      'lacus curabitur at ipsum ac tellus semper interdum mauris ullamcorper purus sit amet nulla quisque arcu libero rutrum ac',
                                                                      FALSE, 29);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (25, 'non velit nec nisi', 'curae donec pharetra magna vestibulum aliquet ultrices erat tortor sollicitudin mi sit',
   TRUE, 169);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (26, 'est phasellus sit',
                                                                      'adipiscing elit proin risus praesent lectus vestibulum quam sapien varius ut blandit non interdum in',
                                                                      TRUE, 208);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (27, 'eu interdum eu',
                                                                      'id turpis integer aliquet massa id lobortis convallis tortor risus dapibus augue vel accumsan tellus nisi eu orci mauris',
                                                                      FALSE, 171);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (28, 'quam fringilla rhoncus',
                                                                      'curabitur at ipsum ac tellus semper interdum mauris ullamcorper purus sit amet nulla quisque arcu',
                                                                      FALSE, 212);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (29, 'mus vivamus vestibulum sagittis sapien',
                                                                      'non lectus aliquam sit amet diam in magna bibendum imperdiet nullam orci',
                                                                      TRUE, 56);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (30, 'nulla nunc purus phasellus in',
                                                                      'augue quam sollicitudin vitae consectetuer eget rutrum at lorem integer tincidunt ante vel ipsum',
                                                                      FALSE, 244);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (31, 'ut mauris eget massa tempor',
                                                                      'at dolor quis odio consequat varius integer ac leo pellentesque ultrices mattis odio donec vitae nisi nam',
                                                                      TRUE, 260);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (32, 'elementum nullam varius', 'lectus pellentesque at nulla suspendisse potenti cras in purus eu magna vulputate',
   FALSE, 6);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (33, 'ridiculus mus etiam',
                                                                      'ut at dolor quis odio consequat varius integer ac leo pellentesque ultrices mattis odio donec vitae nisi',
                                                                      TRUE, 228);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (34, 'tincidunt eu felis',
                                                                      'nisi venenatis tristique fusce congue diam id ornare imperdiet sapien urna pretium nisl ut volutpat sapien arcu sed augue',
                                                                      TRUE, 31);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (35, 'bibendum morbi non quam',
                                                                      'suspendisse ornare consequat lectus in est risus auctor sed tristique in tempus sit amet sem fusce',
                                                                      FALSE, 132);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (36, 'ultrices libero non mattis',
                                                                      'lacus curabitur at ipsum ac tellus semper interdum mauris ullamcorper purus sit amet nulla',
                                                                      FALSE, 229);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (37, 'tincidunt lacus at velit',
                                                                      'odio cras mi pede malesuada in imperdiet et commodo vulputate justo in blandit ultrices enim lorem ipsum',
                                                                      FALSE, 265);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (38, 'ipsum primis in faucibus',
                                                                      'tempus vivamus in felis eu sapien cursus vestibulum proin eu mi nulla ac enim in tempor turpis nec euismod',
                                                                      FALSE, 154);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (39, 'tortor id nulla ultrices aliquet',
                                                                      'justo aliquam quis turpis eget elit sodales scelerisque mauris sit amet eros suspendisse accumsan tortor quis turpis sed',
                                                                      FALSE, 222);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (40, 'id justo sit',
                                                                      'sociis natoque penatibus et magnis dis parturient montes nascetur ridiculus mus etiam vel augue vestibulum rutrum',
                                                                      TRUE, 135);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (41, 'quam nec dui luctus rutrum', 'ipsum praesent blandit lacinia erat vestibulum sed magna at nunc', TRUE, 274);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (42, 'mus etiam vel augue vestibulum', 'condimentum neque sapien placerat ante nulla justo aliquam quis turpis eget',
   FALSE, 129);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (43, 'pede lobortis ligula sit amet',
                                                                      'potenti in eleifend quam a odio in hac habitasse platea dictumst maecenas ut massa quis augue luctus tincidunt nulla',
                                                                      TRUE, 61);
INSERT INTO "comment" (id, title, text, is_deleted, order_id)
VALUES (44, 'est risus auctor sed', 'dui luctus rutrum nulla tellus in sagittis dui vel nisl duis', FALSE, 98);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (45, 'in tempus sit amet sem',
                                                                      'odio consequat varius integer ac leo pellentesque ultrices mattis odio donec vitae nisi nam ultrices libero non mattis pulvinar nulla',
                                                                      TRUE, 97);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (46, 'ut ultrices vel augue vestibulum',
                                                                      'ultrices aliquet maecenas leo odio condimentum id luctus nec molestie sed justo pellentesque viverra pede ac diam',
                                                                      TRUE, 147);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (47, 'morbi odio odio', 'justo morbi ut odio cras mi pede malesuada in imperdiet et commodo vulputate', FALSE, 167);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (48, 'orci luctus et',
                                                                      'morbi non lectus aliquam sit amet diam in magna bibendum imperdiet nullam orci pede venenatis non sodales sed tincidunt',
                                                                      FALSE, 266);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (49, 'sit amet nunc',
                                                                      'consectetuer eget rutrum at lorem integer tincidunt ante vel ipsum praesent blandit lacinia erat vestibulum sed magna at nunc',
                                                                      FALSE, 91);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (50, 'nunc proin at turpis a',
                                                                      'at lorem integer tincidunt ante vel ipsum praesent blandit lacinia erat vestibulum sed magna at nunc commodo placerat praesent blandit',
                                                                      FALSE, 109);
INSERT INTO "comment" (id, title, text, is_deleted, order_id)
VALUES (51, 'quam turpis adipiscing lorem', 'proin at turpis a pede posuere nonummy integer non velit', TRUE, 101);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (52, 'ac consequat metus sapien',
                                                                      'commodo placerat praesent blandit nam nulla integer pede justo lacinia eget tincidunt eget tempus vel pede morbi porttitor',
                                                                      TRUE, 36);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (53, 'viverra diam vitae quam suspendisse', 'ultrices vel augue vestibulum ante ipsum primis in faucibus orci', TRUE,
   86);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (54, 'mattis nibh ligula nec sem',
                                                                      'augue luctus tincidunt nulla mollis molestie lorem quisque ut erat curabitur gravida nisi at nibh in hac habitasse platea dictumst',
                                                                      TRUE, 115);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (55, 'eget tempus vel pede morbi', 'eget orci vehicula condimentum curabitur in libero ut massa volutpat', FALSE, 89);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (56, 'aliquet at feugiat',
                                                                      'diam erat fermentum justo nec condimentum neque sapien placerat ante nulla justo aliquam quis turpis eget elit sodales',
                                                                      FALSE, 115);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (57, 'habitasse platea dictumst',
                                                                      'porta volutpat quam pede lobortis ligula sit amet eleifend pede libero quis orci nullam molestie',
                                                                      FALSE, 42);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (58, 'metus sapien ut nunc',
                                                                      'nulla suscipit ligula in lacus curabitur at ipsum ac tellus semper interdum mauris ullamcorper',
                                                                      FALSE, 145);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (59, 'congue risus semper',
                                                                      'vivamus vel nulla eget eros elementum pellentesque quisque porta volutpat erat quisque erat',
                                                                      TRUE, 263);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (60, 'congue risus semper porta volutpat',
                                                                      'vestibulum rutrum rutrum neque aenean auctor gravida sem praesent id massa id nisl venenatis lacinia aenean sit',
                                                                      FALSE, 16);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (61, 'cum sociis natoque penatibus',
                                                                      'massa volutpat convallis morbi odio odio elementum eu interdum eu tincidunt in leo maecenas pulvinar',
                                                                      FALSE, 1);
INSERT INTO "comment" (id, title, text, is_deleted, order_id)
VALUES (62, 'sagittis dui vel', 'lobortis est phasellus sit amet erat nulla tempus vivamus in felis eu', TRUE, 83);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (63, 'ac leo pellentesque', 'tempor convallis nulla neque libero convallis eget eleifend luctus ultricies eu', FALSE,
   36);
INSERT INTO "comment" (id, title, text, is_deleted, order_id)
VALUES (64, 'arcu sed augue aliquam', 'dapibus augue vel accumsan tellus nisi eu orci mauris lacinia', FALSE, 202);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (65, 'nulla pede ullamcorper',
                                                                      'volutpat dui maecenas tristique est et tempus semper est quam pharetra magna ac consequat metus',
                                                                      TRUE, 281);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (66, 'bibendum imperdiet nullam orci pede',
                                                                      'nulla ut erat id mauris vulputate elementum nullam varius nulla facilisi cras non velit nec nisi vulputate',
                                                                      FALSE, 154);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (67, 'mauris lacinia sapien',
                                                                      'sit amet sapien dignissim vestibulum vestibulum ante ipsum primis in faucibus orci luctus',
                                                                      TRUE, 126);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (68, 'quam a odio in hac', 'duis consequat dui nec nisi volutpat eleifend donec ut dolor morbi vel lectus in quam',
   TRUE, 252);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (69, 'mollis molestie lorem quisque ut',
                                                                      'integer non velit donec diam neque vestibulum eget vulputate ut ultrices vel augue vestibulum ante ipsum primis',
                                                                      FALSE, 145);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (70, 'luctus et ultrices posuere cubilia',
                                                                      'turpis nec euismod scelerisque quam turpis adipiscing lorem vitae mattis nibh ligula nec sem duis aliquam convallis nunc',
                                                                      FALSE, 87);
INSERT INTO "comment" (id, title, text, is_deleted, order_id)
VALUES (71, 'sit amet nulla', 'amet eleifend pede libero quis orci nullam molestie nibh in lectus', FALSE, 207);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (72, 'in libero ut',
                                                                      'hac habitasse platea dictumst aliquam augue quam sollicitudin vitae consectetuer eget rutrum at lorem integer tincidunt',
                                                                      FALSE, 105);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (73, 'quam sapien varius ut',
                                                                      'placerat praesent blandit nam nulla integer pede justo lacinia eget tincidunt eget tempus vel pede morbi porttitor lorem',
                                                                      TRUE, 20);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (74, 'nam dui proin leo', 'posuere cubilia curae mauris viverra diam vitae quam suspendisse potenti nullam', TRUE,
   74);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (75, 'bibendum felis sed interdum venenatis',
                                                                      'volutpat in congue etiam justo etiam pretium iaculis justo in hac habitasse platea dictumst etiam faucibus',
                                                                      FALSE, 155);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (76, 'odio in hac habitasse platea',
                                                                      'posuere felis sed lacus morbi sem mauris laoreet ut rhoncus aliquet pulvinar sed nisl nunc rhoncus dui',
                                                                      TRUE, 121);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (77, 'non mi integer ac neque',
                                                                      'ultrices vel augue vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae',
                                                                      FALSE, 117);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (78, 'eros viverra eget congue eget', 'orci vehicula condimentum curabitur in libero ut massa volutpat convallis',
   FALSE, 194);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (79, 'nonummy maecenas tincidunt lacus at',
                                                                      'enim sit amet nunc viverra dapibus nulla suscipit ligula in lacus curabitur at ipsum ac',
                                                                      TRUE, 208);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (80, 'quis orci nullam molestie nibh',
                                                                      'et ultrices posuere cubilia curae mauris viverra diam vitae quam suspendisse potenti nullam porttitor lacus',
                                                                      FALSE, 234);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (81, 'varius ut blandit non',
                                                                      'justo etiam pretium iaculis justo in hac habitasse platea dictumst etiam faucibus cursus urna ut tellus',
                                                                      TRUE, 163);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (82, 'lacinia erat vestibulum sed',
                                                                      'libero quis orci nullam molestie nibh in lectus pellentesque at nulla suspendisse potenti cras in purus eu magna vulputate',
                                                                      TRUE, 5);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (83, 'eget congue eget',
                                                                      'nibh in hac habitasse platea dictumst aliquam augue quam sollicitudin vitae consectetuer eget rutrum at',
                                                                      TRUE, 253);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (84, 'lobortis est phasellus sit amet',
                                                                      'iaculis diam erat fermentum justo nec condimentum neque sapien placerat ante nulla justo aliquam quis turpis eget',
                                                                      FALSE, 300);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (85, 'purus eu magna vulputate luctus',
                                                                      'iaculis diam erat fermentum justo nec condimentum neque sapien placerat ante nulla justo aliquam quis turpis eget elit',
                                                                      FALSE, 42);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (86, 'pellentesque ultrices phasellus id sapien',
                                                                      'ligula sit amet eleifend pede libero quis orci nullam molestie nibh',
                                                                      TRUE, 3);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (87, 'tempor convallis nulla',
                                                                      'dis parturient montes nascetur ridiculus mus vivamus vestibulum sagittis sapien cum sociis natoque penatibus et magnis dis parturient',
                                                                      FALSE, 154);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (88, 'diam erat fermentum', 'sapien placerat ante nulla justo aliquam quis turpis eget elit sodales', FALSE, 272);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (89, 'sociis natoque penatibus et magnis',
                                                                      'phasellus sit amet erat nulla tempus vivamus in felis eu sapien cursus vestibulum proin eu',
                                                                      TRUE, 144);
INSERT INTO "comment" (id, title, text, is_deleted, order_id)
VALUES (90, 'risus semper porta volutpat', 'nullam orci pede venenatis non sodales sed tincidunt eu felis', FALSE, 266);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (91, 'tristique in tempus sit amet',
                                                                      'sodales sed tincidunt eu felis fusce posuere felis sed lacus morbi sem mauris laoreet ut rhoncus aliquet pulvinar sed',
                                                                      FALSE, 140);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (92, 'ipsum primis in faucibus orci',
                                                                      'integer a nibh in quis justo maecenas rhoncus aliquam lacus morbi quis tortor id nulla ultrices aliquet maecenas',
                                                                      FALSE, 295);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (93, 'sem mauris laoreet ut',
                                                                      'ultrices posuere cubilia curae nulla dapibus dolor vel est donec odio justo sollicitudin ut suscipit a feugiat',
                                                                      TRUE, 72);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (94, 'imperdiet et commodo',
                                                                      'mi in porttitor pede justo eu massa donec dapibus duis at velit eu est congue elementum in hac habitasse',
                                                                      TRUE, 109);
INSERT INTO "comment" (id, title, text, is_deleted, order_id)
VALUES (95, 'justo in blandit', 'eget tempus vel pede morbi porttitor lorem id ligula suspendisse', FALSE, 201);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (96, 'vestibulum proin eu',
                                                                      'in sagittis dui vel nisl duis ac nibh fusce lacus purus aliquet at feugiat non pretium quis',
                                                                      TRUE, 185);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (97, 'blandit nam nulla',
                                                                      'sapien dignissim vestibulum vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia',
                                                                      TRUE, 162);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (98, 'maecenas tristique est', 'dolor morbi vel lectus in quam fringilla rhoncus mauris enim leo rhoncus', TRUE, 221);
INSERT INTO "comment" (id, title, text, is_deleted, order_id)
VALUES (99, 'urna pretium nisl', 'amet turpis elementum ligula vehicula consequat morbi a ipsum integer', TRUE, 206);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (100, 'nisi at nibh',
                                                                      'lacus purus aliquet at feugiat non pretium quis lectus suspendisse potenti in eleifend quam a odio',
                                                                      FALSE, 202);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (101, 'amet consectetuer adipiscing elit', 'vivamus metus arcu adipiscing molestie hendrerit at vulputate vitae nisl',
   FALSE, 179);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (102, 'vulputate elementum nullam varius nulla', 'ullamcorper augue a suscipit nulla elit ac nulla sed vel', TRUE,
   107);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (103, 'at nibh in hac',
                                                                      'nisi nam ultrices libero non mattis pulvinar nulla pede ullamcorper augue a suscipit nulla elit ac',
                                                                      FALSE, 45);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (104, 'sed interdum venenatis turpis',
                                                                      'duis bibendum morbi non quam nec dui luctus rutrum nulla tellus in sagittis dui vel nisl duis',
                                                                      TRUE, 160);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (105, 'in eleifend quam a odio', 'duis mattis egestas metus aenean fermentum donec ut mauris eget massa', FALSE, 221);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (106, 'habitasse platea dictumst etiam',
                                                                      'iaculis congue vivamus metus arcu adipiscing molestie hendrerit at vulputate vitae',
                                                                      TRUE, 173);
INSERT INTO "comment" (id, title, text, is_deleted, order_id)
VALUES (107, 'dui vel nisl duis ac', 'lectus suspendisse potenti in eleifend quam a odio in hac', FALSE, 234);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (108, 'sed justo pellentesque',
                                                                      'eu tincidunt in leo maecenas pulvinar lobortis est phasellus sit amet erat nulla tempus vivamus in felis eu sapien',
                                                                      FALSE, 95);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (109, 'suspendisse potenti nullam porttitor lacus',
                                                                      'duis faucibus accumsan odio curabitur convallis duis consequat dui nec',
                                                                      TRUE, 146);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (110, 'ipsum dolor sit amet consectetuer', 'eget semper rutrum nulla nunc purus phasellus in felis donec', FALSE,
   221);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (111, 'fusce consequat nulla',
                                                                      'amet eros suspendisse accumsan tortor quis turpis sed ante vivamus tortor duis mattis egestas metus aenean fermentum donec ut',
                                                                      FALSE, 121);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (112, 'libero convallis eget eleifend', 'sit amet eros suspendisse accumsan tortor quis turpis sed ante', TRUE, 50);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (113, 'lacus curabitur at ipsum', 'sem fusce consequat nulla nisl nunc nisl duis bibendum felis sed interdum', TRUE,
   152);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (114, 'maecenas pulvinar lobortis est',
                                                                      'quam turpis adipiscing lorem vitae mattis nibh ligula nec sem duis aliquam convallis nunc proin at turpis a pede posuere',
                                                                      TRUE, 280);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (115, 'urna ut tellus nulla',
                                                                      'eget massa tempor convallis nulla neque libero convallis eget eleifend luctus ultricies eu nibh quisque id justo sit amet',
                                                                      TRUE, 140);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (116, 'justo in hac habitasse platea',
                                                                      'primis in faucibus orci luctus et ultrices posuere cubilia curae duis faucibus accumsan odio curabitur',
                                                                      FALSE, 15);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (117, 'vel lectus in quam fringilla',
                                                                      'integer ac neque duis bibendum morbi non quam nec dui luctus rutrum nulla tellus in sagittis',
                                                                      FALSE, 136);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (118, 'urna ut tellus',
                                                                      'quis turpis eget elit sodales scelerisque mauris sit amet eros suspendisse accumsan tortor quis turpis sed ante vivamus tortor',
                                                                      TRUE, 221);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (119, 'vel enim sit amet nunc',
                                                                      'porttitor lorem id ligula suspendisse ornare consequat lectus in est risus auctor sed tristique in tempus sit amet sem fusce',
                                                                      TRUE, 66);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (120, 'sed nisl nunc rhoncus',
                                                                      'eget rutrum at lorem integer tincidunt ante vel ipsum praesent blandit lacinia erat vestibulum sed',
                                                                      FALSE, 122);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (121, 'suspendisse ornare consequat',
                                                                      'ridiculus mus vivamus vestibulum sagittis sapien cum sociis natoque penatibus et magnis dis',
                                                                      TRUE, 243);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (122, 'nulla integer pede',
                                                                      'et commodo vulputate justo in blandit ultrices enim lorem ipsum dolor sit amet consectetuer',
                                                                      TRUE, 253);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (123, 'dictumst aliquam augue quam sollicitudin',
                                                                      'elementum eu interdum eu tincidunt in leo maecenas pulvinar lobortis est phasellus sit amet erat',
                                                                      TRUE, 253);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (124, 'luctus et ultrices posuere cubilia', 'erat volutpat in congue etiam justo etiam pretium iaculis justo in hac',
   FALSE, 8);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (125, 'eget semper rutrum',
                                                                      'mattis egestas metus aenean fermentum donec ut mauris eget massa tempor convallis nulla neque libero convallis eget eleifend luctus',
                                                                      FALSE, 209);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (126, 'nunc donec quis',
                                                                      'ridiculus mus etiam vel augue vestibulum rutrum rutrum neque aenean auctor gravida sem praesent id',
                                                                      FALSE, 263);
INSERT INTO "comment" (id, title, text, is_deleted, order_id)
VALUES (127, 'quisque ut erat', 'blandit lacinia erat vestibulum sed magna at nunc commodo placerat', FALSE, 161);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (128, 'sed ante vivamus',
                                                                      'amet erat nulla tempus vivamus in felis eu sapien cursus vestibulum proin eu mi nulla ac enim in',
                                                                      TRUE, 217);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (129, 'rhoncus aliquet pulvinar sed nisl',
                                                                      'in congue etiam justo etiam pretium iaculis justo in hac habitasse platea dictumst etiam faucibus cursus',
                                                                      TRUE, 94);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (130, 'lobortis est phasellus sit',
                                                                      'felis ut at dolor quis odio consequat varius integer ac leo pellentesque ultrices mattis odio donec',
                                                                      TRUE, 114);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (131, 'morbi odio odio elementum', 'pellentesque eget nunc donec quis orci eget orci vehicula condimentum', TRUE, 54);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (132, 'integer ac neque duis bibendum',
                                                                      'varius ut blandit non interdum in ante vestibulum ante ipsum primis in faucibus',
                                                                      FALSE, 82);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (133, 'ante ipsum primis',
                                                                      'in eleifend quam a odio in hac habitasse platea dictumst maecenas ut massa quis augue luctus tincidunt',
                                                                      TRUE, 30);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (134, 'quam turpis adipiscing lorem',
                                                                      'eleifend pede libero quis orci nullam molestie nibh in lectus pellentesque at nulla suspendisse potenti cras',
                                                                      FALSE, 138);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (135, 'cubilia curae donec pharetra magna',
                                                                      'pretium quis lectus suspendisse potenti in eleifend quam a odio in hac habitasse platea dictumst',
                                                                      TRUE, 90);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (136, 'sed vestibulum sit', 'elit proin risus praesent lectus vestibulum quam sapien varius ut blandit', TRUE, 120);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (137, 'porttitor id consequat in consequat',
                                                                      'vel augue vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae donec pharetra magna',
                                                                      TRUE, 13);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (138, 'in faucibus orci', 'quis orci nullam molestie nibh in lectus pellentesque at nulla suspendisse', TRUE, 245);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (139, 'lacus morbi sem mauris laoreet',
                                                                      'faucibus orci luctus et ultrices posuere cubilia curae donec pharetra magna vestibulum aliquet ultrices erat tortor sollicitudin mi',
                                                                      TRUE, 176);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (140, 'varius ut blandit non interdum',
                                                                      'in quam fringilla rhoncus mauris enim leo rhoncus sed vestibulum sit amet cursus id turpis integer aliquet',
                                                                      FALSE, 114);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (141, 'diam cras pellentesque volutpat dui',
                                                                      'aenean auctor gravida sem praesent id massa id nisl venenatis lacinia aenean sit amet justo morbi ut',
                                                                      FALSE, 85);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (142, 'aliquam sit amet',
                                                                      'nulla suscipit ligula in lacus curabitur at ipsum ac tellus semper interdum mauris ullamcorper',
                                                                      FALSE, 36);
INSERT INTO "comment" (id, title, text, is_deleted, order_id)
VALUES (143, 'cursus urna ut', 'quisque arcu libero rutrum ac lobortis vel dapibus at diam nam', TRUE, 3);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (144, 'nulla suscipit ligula',
                                                                      'pretium quis lectus suspendisse potenti in eleifend quam a odio in hac habitasse platea dictumst maecenas ut massa',
                                                                      FALSE, 171);
INSERT INTO "comment" (id, title, text, is_deleted, order_id)
VALUES (145, 'non quam nec', 'non mattis pulvinar nulla pede ullamcorper augue a suscipit nulla elit ac', TRUE, 36);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (146, 'ante ipsum primis',
                                                                      'elit proin risus praesent lectus vestibulum quam sapien varius ut blandit non interdum in ante vestibulum ante ipsum',
                                                                      FALSE, 29);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (147, 'viverra pede ac diam',
                                                                      'molestie nibh in lectus pellentesque at nulla suspendisse potenti cras in purus eu magna vulputate luctus cum sociis natoque',
                                                                      TRUE, 280);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (148, 'non velit donec diam neque',
                                                                      'platea dictumst etiam faucibus cursus urna ut tellus nulla ut erat id mauris vulputate elementum nullam',
                                                                      FALSE, 171);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (149, 'at ipsum ac',
                                                                      'vel nulla eget eros elementum pellentesque quisque porta volutpat erat quisque erat eros viverra eget congue eget semper rutrum nulla',
                                                                      FALSE, 37);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (150, 'nec nisi vulputate nonummy',
                                                                      'vel accumsan tellus nisi eu orci mauris lacinia sapien quis libero nullam sit amet turpis elementum ligula vehicula',
                                                                      TRUE, 286);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (151, 'ut mauris eget massa tempor',
                                                                      'hac habitasse platea dictumst morbi vestibulum velit id pretium iaculis diam erat fermentum justo nec condimentum neque sapien',
                                                                      FALSE, 297);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (152, 'luctus tincidunt nulla',
                                                                      'diam id ornare imperdiet sapien urna pretium nisl ut volutpat sapien arcu sed augue aliquam erat volutpat in congue',
                                                                      TRUE, 16);
INSERT INTO "comment" (id, title, text, is_deleted, order_id)
VALUES (153, 'donec semper sapien a', 'lectus pellentesque eget nunc donec quis orci eget orci vehicula', TRUE, 276);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (154, 'eu mi nulla ac',
                                                                      'amet diam in magna bibendum imperdiet nullam orci pede venenatis non sodales sed tincidunt eu felis fusce posuere felis',
                                                                      TRUE, 133);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (155, 'lacus curabitur at ipsum', 'nullam molestie nibh in lectus pellentesque at nulla suspendisse potenti cras',
   FALSE, 290);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (156, 'vestibulum vestibulum ante ipsum primis',
                                                                      'nec condimentum neque sapien placerat ante nulla justo aliquam quis turpis eget elit',
                                                                      TRUE, 31);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (157, 'risus auctor sed', 'facilisi cras non velit nec nisi vulputate nonummy maecenas tincidunt lacus', TRUE, 63);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (158, 'sapien placerat ante nulla',
                                                                      'est lacinia nisi venenatis tristique fusce congue diam id ornare imperdiet sapien urna pretium',
                                                                      TRUE, 86);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (159, 'ultrices libero non mattis pulvinar',
                                                                      'bibendum imperdiet nullam orci pede venenatis non sodales sed tincidunt eu',
                                                                      FALSE, 272);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (160, 'vestibulum ac est lacinia',
                                                                      'velit donec diam neque vestibulum eget vulputate ut ultrices vel augue vestibulum ante ipsum',
                                                                      FALSE, 22);
INSERT INTO "comment" (id, title, text, is_deleted, order_id)
VALUES (161, 'platea dictumst etiam', 'nisi at nibh in hac habitasse platea dictumst aliquam augue quam', FALSE, 248);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (162, 'pede venenatis non sodales sed', 'nam nulla integer pede justo lacinia eget tincidunt eget tempus vel pede',
   FALSE, 237);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (163, 'sapien a libero nam',
                                                                      'urna ut tellus nulla ut erat id mauris vulputate elementum nullam varius nulla facilisi cras non velit nec nisi vulputate',
                                                                      TRUE, 59);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (164, 'magna vulputate luctus cum sociis',
                                                                      'etiam pretium iaculis justo in hac habitasse platea dictumst etiam faucibus cursus urna',
                                                                      TRUE, 282);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (165, 'rhoncus mauris enim leo rhoncus',
                                                                      'sagittis nam congue risus semper porta volutpat quam pede lobortis ligula sit amet eleifend pede libero quis',
                                                                      TRUE, 231);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (166, 'purus aliquet at feugiat non',
                                                                      'sit amet turpis elementum ligula vehicula consequat morbi a ipsum integer a nibh in quis justo maecenas rhoncus aliquam lacus',
                                                                      TRUE, 78);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (167, 'consequat ut nulla sed',
                                                                      'a suscipit nulla elit ac nulla sed vel enim sit amet nunc viverra dapibus nulla suscipit ligula',
                                                                      FALSE, 258);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (168, 'diam in magna bibendum imperdiet',
                                                                      'odio in hac habitasse platea dictumst maecenas ut massa quis augue luctus tincidunt nulla mollis molestie lorem quisque',
                                                                      FALSE, 80);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (169, 'luctus ultricies eu', 'ut nulla sed accumsan felis ut at dolor quis odio consequat varius integer', FALSE,
   186);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (170, 'metus arcu adipiscing molestie',
                                                                      'donec diam neque vestibulum eget vulputate ut ultrices vel augue vestibulum ante ipsum',
                                                                      TRUE, 40);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (171, 'sed tincidunt eu felis fusce',
                                                                      'porttitor pede justo eu massa donec dapibus duis at velit eu est congue elementum in hac habitasse platea',
                                                                      FALSE, 285);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (172, 'ultrices posuere cubilia',
                                                                      'consequat morbi a ipsum integer a nibh in quis justo maecenas rhoncus aliquam lacus morbi quis tortor id nulla',
                                                                      FALSE, 46);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (173, 'tortor duis mattis egestas metus',
                                                                      'dictumst morbi vestibulum velit id pretium iaculis diam erat fermentum justo nec condimentum neque sapien',
                                                                      FALSE, 229);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (174, 'elementum nullam varius nulla facilisi',
                                                                      'urna ut tellus nulla ut erat id mauris vulputate elementum nullam varius nulla facilisi cras non velit nec nisi vulputate',
                                                                      FALSE, 144);
INSERT INTO "comment" (id, title, text, is_deleted, order_id)
VALUES (175, 'odio in hac habitasse', 'non sodales sed tincidunt eu felis fusce posuere felis sed', TRUE, 169);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (176, 'maecenas leo odio',
                                                                      'ornare consequat lectus in est risus auctor sed tristique in tempus sit amet sem fusce consequat nulla nisl',
                                                                      FALSE, 92);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (177, 'viverra pede ac diam cras', 'morbi quis tortor id nulla ultrices aliquet maecenas leo odio condimentum id',
   TRUE, 216);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (178, 'odio cras mi pede malesuada',
                                                                      'justo in blandit ultrices enim lorem ipsum dolor sit amet consectetuer adipiscing elit proin interdum mauris non ligula pellentesque',
                                                                      TRUE, 5);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (179, 'sed sagittis nam congue risus', 'morbi a ipsum integer a nibh in quis justo maecenas rhoncus aliquam', FALSE,
   153);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (180, 'congue vivamus metus', 'sem mauris laoreet ut rhoncus aliquet pulvinar sed nisl nunc rhoncus dui vel', TRUE,
   23);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (181, 'in hac habitasse platea dictumst',
                                                                      'vivamus vel nulla eget eros elementum pellentesque quisque porta volutpat erat quisque erat eros viverra eget congue eget',
                                                                      FALSE, 3);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (182, 'tortor duis mattis', 'mattis egestas metus aenean fermentum donec ut mauris eget massa tempor convallis nulla',
   TRUE, 161);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (183, 'nonummy maecenas tincidunt lacus',
                                                                      'cras mi pede malesuada in imperdiet et commodo vulputate justo in blandit ultrices enim',
                                                                      FALSE, 10);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (184, 'at velit eu est congue',
                                                                      'ac consequat metus sapien ut nunc vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae mauris',
                                                                      FALSE, 210);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (185, 'nibh quisque id justo sit', 'aliquam lacus morbi quis tortor id nulla ultrices aliquet maecenas', TRUE, 11);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (186, 'lacus curabitur at ipsum',
                                                                      'in imperdiet et commodo vulputate justo in blandit ultrices enim lorem ipsum dolor sit amet consectetuer adipiscing elit proin interdum',
                                                                      FALSE, 200);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (187, 'eget massa tempor convallis',
                                                                      'nulla ultrices aliquet maecenas leo odio condimentum id luctus nec molestie sed justo pellentesque viverra',
                                                                      FALSE, 182);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (188, 'nulla eget eros elementum pellentesque',
                                                                      'vehicula consequat morbi a ipsum integer a nibh in quis justo maecenas rhoncus aliquam lacus morbi quis tortor id',
                                                                      FALSE, 199);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (189, 'et eros vestibulum',
                                                                      'risus semper porta volutpat quam pede lobortis ligula sit amet eleifend pede libero quis orci',
                                                                      TRUE, 53);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (190, 'consequat nulla nisl nunc nisl', 'accumsan odio curabitur convallis duis consequat dui nec nisi volutpat',
   FALSE, 106);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (191, 'ornare consequat lectus in',
                                                                      'a suscipit nulla elit ac nulla sed vel enim sit amet nunc viverra dapibus nulla suscipit ligula in',
                                                                      TRUE, 116);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (192, 'ante vivamus tortor', 'eu interdum eu tincidunt in leo maecenas pulvinar lobortis est phasellus sit', FALSE,
   296);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (193, 'aliquam augue quam sollicitudin',
                                                                      'sapien urna pretium nisl ut volutpat sapien arcu sed augue aliquam erat volutpat',
                                                                      FALSE, 300);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (194, 'rutrum nulla tellus in sagittis', 'duis aliquam convallis nunc proin at turpis a pede posuere nonummy', FALSE,
   161);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (195, 'maecenas leo odio condimentum',
                                                                      'metus vitae ipsum aliquam non mauris morbi non lectus aliquam sit amet diam in',
                                                                      FALSE, 174);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (196, 'pellentesque volutpat dui maecenas tristique', 'mauris enim leo rhoncus sed vestibulum sit amet cursus id',
   FALSE, 186);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (197, 'semper interdum mauris ullamcorper',
                                                                      'consectetuer eget rutrum at lorem integer tincidunt ante vel ipsum praesent',
                                                                      TRUE, 123);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (198, 'vestibulum velit id pretium iaculis',
                                                                      'eu mi nulla ac enim in tempor turpis nec euismod scelerisque quam turpis adipiscing',
                                                                      TRUE, 140);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (199, 'vel augue vestibulum ante', 'nunc vestibulum ante ipsum primis in faucibus orci luctus et ultrices', FALSE,
   72);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (200, 'praesent blandit nam',
                                                                      'vestibulum aliquet ultrices erat tortor sollicitudin mi sit amet lobortis sapien sapien non mi integer ac neque duis',
                                                                      TRUE, 61);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (201, 'nullam orci pede venenatis non',
                                                                      'mauris vulputate elementum nullam varius nulla facilisi cras non velit nec nisi vulputate nonummy maecenas tincidunt lacus at velit',
                                                                      TRUE, 248);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (202, 'venenatis tristique fusce',
                                                                      'vehicula condimentum curabitur in libero ut massa volutpat convallis morbi odio odio elementum eu interdum eu tincidunt in leo',
                                                                      TRUE, 299);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (203, 'magnis dis parturient',
                                                                      'convallis nulla neque libero convallis eget eleifend luctus ultricies eu nibh quisque id justo sit amet sapien dignissim vestibulum vestibulum',
                                                                      FALSE, 138);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (204, 'vehicula condimentum curabitur',
                                                                      'id mauris vulputate elementum nullam varius nulla facilisi cras non velit nec nisi vulputate nonummy maecenas tincidunt',
                                                                      TRUE, 148);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (205, 'lectus in quam fringilla rhoncus',
                                                                      'lacus at velit vivamus vel nulla eget eros elementum pellentesque quisque porta volutpat erat quisque erat eros',
                                                                      TRUE, 287);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (206, 'morbi sem mauris',
                                                                      'luctus et ultrices posuere cubilia curae donec pharetra magna vestibulum aliquet ultrices erat',
                                                                      FALSE, 205);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (207, 'mauris sit amet eros suspendisse',
                                                                      'mollis molestie lorem quisque ut erat curabitur gravida nisi at nibh in hac habitasse platea dictumst aliquam augue',
                                                                      TRUE, 157);
INSERT INTO "comment" (id, title, text, is_deleted, order_id)
VALUES (208, 'lectus in est risus', 'ultrices libero non mattis pulvinar nulla pede ullamcorper augue a', TRUE, 250);
INSERT INTO "comment" (id, title, text, is_deleted, order_id)
VALUES (209, 'rutrum at lorem integer', 'cursus urna ut tellus nulla ut erat id mauris vulputate', FALSE, 281);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (210, 'justo in blandit ultrices',
                                                                      'in faucibus orci luctus et ultrices posuere cubilia curae donec pharetra magna vestibulum',
                                                                      FALSE, 32);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (211, 'nec dui luctus rutrum',
                                                                      'mauris laoreet ut rhoncus aliquet pulvinar sed nisl nunc rhoncus dui vel sem sed sagittis nam congue',
                                                                      FALSE, 102);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (212, 'amet turpis elementum ligula vehicula',
                                                                      'dapibus duis at velit eu est congue elementum in hac habitasse platea dictumst morbi vestibulum velit id pretium iaculis',
                                                                      FALSE, 103);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (213, 'sit amet nulla quisque',
                                                                      'dis parturient montes nascetur ridiculus mus vivamus vestibulum sagittis sapien cum sociis natoque penatibus et magnis',
                                                                      TRUE, 262);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (214, 'vulputate justo in',
                                                                      'mauris non ligula pellentesque ultrices phasellus id sapien in sapien iaculis congue vivamus metus arcu',
                                                                      FALSE, 129);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (215, 'nulla ac enim in',
                                                                      'orci luctus et ultrices posuere cubilia curae mauris viverra diam vitae quam suspendisse potenti nullam porttitor lacus at',
                                                                      TRUE, 118);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (216, 'consectetuer adipiscing elit', 'lobortis sapien sapien non mi integer ac neque duis bibendum', FALSE, 297);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (217, 'donec pharetra magna',
                                                                      'habitasse platea dictumst morbi vestibulum velit id pretium iaculis diam erat fermentum justo nec condimentum',
                                                                      FALSE, 124);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (218, 'aliquam convallis nunc proin',
                                                                      'erat tortor sollicitudin mi sit amet lobortis sapien sapien non mi integer ac neque duis bibendum morbi non quam',
                                                                      TRUE, 229);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (219, 'pellentesque quisque porta volutpat',
                                                                      'erat volutpat in congue etiam justo etiam pretium iaculis justo in hac habitasse platea dictumst etiam faucibus cursus',
                                                                      FALSE, 189);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (220, 'elit proin interdum mauris',
                                                                      'luctus et ultrices posuere cubilia curae duis faucibus accumsan odio curabitur convallis duis consequat dui nec nisi volutpat eleifend donec',
                                                                      FALSE, 85);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (221, 'orci luctus et', 'pede malesuada in imperdiet et commodo vulputate justo in blandit ultrices enim', TRUE, 281);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (222, 'rutrum nulla nunc purus phasellus',
                                                                      'pretium iaculis diam erat fermentum justo nec condimentum neque sapien placerat ante nulla justo aliquam quis',
                                                                      TRUE, 94);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (223, 'pellentesque quisque porta volutpat erat',
                                                                      'urna ut tellus nulla ut erat id mauris vulputate elementum nullam varius',
                                                                      FALSE, 134);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (224, 'elementum in hac', 'curae donec pharetra magna vestibulum aliquet ultrices erat tortor sollicitudin mi sit',
   TRUE, 118);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (225, 'sollicitudin ut suscipit a',
                                                                      'vivamus tortor duis mattis egestas metus aenean fermentum donec ut mauris eget massa tempor',
                                                                      FALSE, 144);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (226, 'aenean auctor gravida',
                                                                      'consectetuer adipiscing elit proin risus praesent lectus vestibulum quam sapien varius ut blandit non interdum in ante vestibulum ante ipsum',
                                                                      TRUE, 72);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (227, 'mollis molestie lorem quisque ut',
                                                                      'mauris enim leo rhoncus sed vestibulum sit amet cursus id turpis integer aliquet',
                                                                      FALSE, 234);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (228, 'integer pede justo lacinia eget',
                                                                      'morbi non quam nec dui luctus rutrum nulla tellus in sagittis dui vel nisl duis ac nibh',
                                                                      TRUE, 107);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (229, 'mauris lacinia sapien quis libero',
                                                                      'congue risus semper porta volutpat quam pede lobortis ligula sit amet eleifend pede libero quis orci nullam molestie nibh in',
                                                                      FALSE, 55);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (230, 'et ultrices posuere cubilia',
                                                                      'morbi non lectus aliquam sit amet diam in magna bibendum imperdiet nullam orci pede venenatis non sodales sed tincidunt eu',
                                                                      TRUE, 148);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (231, 'convallis nulla neque libero convallis',
                                                                      'blandit nam nulla integer pede justo lacinia eget tincidunt eget tempus vel pede morbi porttitor lorem id ligula',
                                                                      TRUE, 273);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (232, 'in blandit ultrices enim', 'donec posuere metus vitae ipsum aliquam non mauris morbi non lectus aliquam sit',
   FALSE, 221);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (233, 'habitasse platea dictumst morbi',
                                                                      'sed augue aliquam erat volutpat in congue etiam justo etiam pretium iaculis',
                                                                      FALSE, 27);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (234, 'duis bibendum felis sed',
                                                                      'donec odio justo sollicitudin ut suscipit a feugiat et eros vestibulum ac est lacinia nisi venenatis tristique',
                                                                      FALSE, 216);
INSERT INTO "comment" (id, title, text, is_deleted, order_id)
VALUES (235, 'nam nulla integer', 'lobortis ligula sit amet eleifend pede libero quis orci nullam', TRUE, 251);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (236, 'nulla mollis molestie lorem quisque',
                                                                      'mauris vulputate elementum nullam varius nulla facilisi cras non velit nec nisi vulputate nonummy maecenas tincidunt lacus at velit',
                                                                      FALSE, 298);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (237, 'id lobortis convallis tortor',
                                                                      'orci luctus et ultrices posuere cubilia curae nulla dapibus dolor vel est donec odio',
                                                                      TRUE, 263);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (238, 'nulla pede ullamcorper augue',
                                                                      'mattis odio donec vitae nisi nam ultrices libero non mattis pulvinar nulla pede ullamcorper augue a suscipit nulla elit',
                                                                      FALSE, 25);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (239, 'sit amet eleifend pede',
                                                                      'aenean lectus pellentesque eget nunc donec quis orci eget orci vehicula condimentum curabitur in libero',
                                                                      TRUE, 279);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (240, 'vulputate vitae nisl',
                                                                      'ac nulla sed vel enim sit amet nunc viverra dapibus nulla suscipit ligula in lacus curabitur at ipsum ac tellus',
                                                                      TRUE, 235);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (241, 'morbi ut odio',
                                                                      'convallis nunc proin at turpis a pede posuere nonummy integer non velit donec diam neque vestibulum eget vulputate ut',
                                                                      TRUE, 75);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (242, 'vel accumsan tellus nisi eu',
                                                                      'duis mattis egestas metus aenean fermentum donec ut mauris eget massa tempor convallis nulla neque libero convallis',
                                                                      TRUE, 281);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (243, 'eleifend donec ut',
                                                                      'morbi odio odio elementum eu interdum eu tincidunt in leo maecenas pulvinar lobortis est phasellus',
                                                                      TRUE, 258);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (244, 'lorem integer tincidunt ante vel',
                                                                      'iaculis congue vivamus metus arcu adipiscing molestie hendrerit at vulputate vitae nisl aenean lectus pellentesque eget nunc',
                                                                      FALSE, 253);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (245, 'morbi vel lectus in quam',
                                                                      'arcu sed augue aliquam erat volutpat in congue etiam justo etiam pretium iaculis justo in hac habitasse platea dictumst',
                                                                      FALSE, 71);
INSERT INTO "comment" (id, title, text, is_deleted, order_id)
VALUES (246, 'etiam faucibus cursus', 'aenean lectus pellentesque eget nunc donec quis orci eget orci', TRUE, 265);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (247, 'rhoncus mauris enim leo rhoncus', 'vel lectus in quam fringilla rhoncus mauris enim leo rhoncus', FALSE, 87);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (248, 'pellentesque ultrices mattis odio donec',
                                                                      'aliquet pulvinar sed nisl nunc rhoncus dui vel sem sed sagittis nam',
                                                                      FALSE, 71);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (249, 'quam a odio in',
                                                                      'sollicitudin ut suscipit a feugiat et eros vestibulum ac est lacinia nisi venenatis tristique fusce congue',
                                                                      FALSE, 262);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (250, 'massa id nisl venenatis',
                                                                      'viverra dapibus nulla suscipit ligula in lacus curabitur at ipsum ac tellus semper interdum mauris',
                                                                      FALSE, 111);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (251, 'et ultrices posuere cubilia curae',
                                                                      'vel lectus in quam fringilla rhoncus mauris enim leo rhoncus sed vestibulum sit amet cursus id turpis',
                                                                      FALSE, 158);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (252, 'sapien iaculis congue', 'morbi odio odio elementum eu interdum eu tincidunt in leo maecenas pulvinar lobortis',
   FALSE, 183);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (253, 'erat eros viverra eget',
                                                                      'quam pede lobortis ligula sit amet eleifend pede libero quis orci nullam molestie nibh in lectus',
                                                                      TRUE, 130);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (254, 'egestas metus aenean',
                                                                      'velit eu est congue elementum in hac habitasse platea dictumst morbi vestibulum velit id pretium iaculis diam erat fermentum justo',
                                                                      FALSE, 282);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (255, 'in quis justo maecenas',
                                                                      'ultrices libero non mattis pulvinar nulla pede ullamcorper augue a suscipit nulla elit ac nulla sed vel',
                                                                      FALSE, 181);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (256, 'condimentum id luctus', 'felis sed lacus morbi sem mauris laoreet ut rhoncus aliquet pulvinar', TRUE, 120);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (257, 'ut suscipit a feugiat et', 'massa id nisl venenatis lacinia aenean sit amet justo morbi ut odio cras mi pede',
   TRUE, 39);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (258, 'nec euismod scelerisque quam',
                                                                      'maecenas ut massa quis augue luctus tincidunt nulla mollis molestie lorem quisque ut',
                                                                      TRUE, 30);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (259, 'tincidunt ante vel',
                                                                      'orci vehicula condimentum curabitur in libero ut massa volutpat convallis morbi odio odio',
                                                                      TRUE, 137);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (260, 'dis parturient montes nascetur',
                                                                      'interdum eu tincidunt in leo maecenas pulvinar lobortis est phasellus sit amet erat nulla',
                                                                      TRUE, 1);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (261, 'vulputate nonummy maecenas tincidunt lacus',
                                                                      'gravida sem praesent id massa id nisl venenatis lacinia aenean sit amet justo',
                                                                      FALSE, 15);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (262, 'venenatis lacinia aenean sit amet', 'auctor sed tristique in tempus sit amet sem fusce consequat nulla nisl',
   TRUE, 115);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (263, 'fringilla rhoncus mauris enim leo',
                                                                      'pellentesque ultrices phasellus id sapien in sapien iaculis congue vivamus metus arcu adipiscing molestie hendrerit at vulputate vitae nisl aenean',
                                                                      FALSE, 200);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (264, 'ante ipsum primis',
                                                                      'curae duis faucibus accumsan odio curabitur convallis duis consequat dui nec nisi volutpat eleifend',
                                                                      FALSE, 9);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (265, 'vestibulum ante ipsum',
                                                                      'semper interdum mauris ullamcorper purus sit amet nulla quisque arcu libero rutrum ac lobortis vel dapibus at diam nam',
                                                                      TRUE, 38);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (266, 'ac diam cras pellentesque volutpat',
                                                                      'erat eros viverra eget congue eget semper rutrum nulla nunc purus phasellus',
                                                                      TRUE, 296);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (267, 'odio curabitur convallis duis consequat',
                                                                      'pede posuere nonummy integer non velit donec diam neque vestibulum eget vulputate ut ultrices vel augue vestibulum ante ipsum primis',
                                                                      FALSE, 284);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (268, 'donec semper sapien a libero',
                                                                      'auctor sed tristique in tempus sit amet sem fusce consequat nulla nisl nunc nisl duis bibendum',
                                                                      FALSE, 55);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (269, 'odio justo sollicitudin ut', 'vel nisl duis ac nibh fusce lacus purus aliquet at feugiat non pretium', FALSE,
   96);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (270, 'orci mauris lacinia sapien',
                                                                      'ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae duis faucibus accumsan odio curabitur convallis duis consequat',
                                                                      FALSE, 242);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (271, 'donec ut dolor morbi', 'suspendisse potenti nullam porttitor lacus at turpis donec posuere metus vitae ipsum',
   FALSE, 124);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (272, 'metus vitae ipsum', 'aliquam erat volutpat in congue etiam justo etiam pretium iaculis justo in hac', TRUE,
   234);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (273, 'vestibulum ante ipsum',
                                                                      'fermentum donec ut mauris eget massa tempor convallis nulla neque libero convallis eget eleifend luctus ultricies eu nibh',
                                                                      TRUE, 217);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (274, 'adipiscing elit proin', 'molestie nibh in lectus pellentesque at nulla suspendisse potenti cras in purus',
   FALSE, 18);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (275, 'lacus morbi sem mauris',
                                                                      'nisl nunc nisl duis bibendum felis sed interdum venenatis turpis enim blandit mi in porttitor pede',
                                                                      TRUE, 233);
INSERT INTO "comment" (id, title, text, is_deleted, order_id)
VALUES (276, 'vitae mattis nibh', 'lacus at velit vivamus vel nulla eget eros elementum pellentesque', TRUE, 273);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (277, 'interdum eu tincidunt in leo',
                                                                      'magna bibendum imperdiet nullam orci pede venenatis non sodales sed tincidunt eu',
                                                                      TRUE, 10);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (278, 'eget eleifend luctus ultricies',
                                                                      'donec pharetra magna vestibulum aliquet ultrices erat tortor sollicitudin mi sit amet lobortis sapien sapien',
                                                                      FALSE, 272);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (279, 'ut massa quis',
                                                                      'amet justo morbi ut odio cras mi pede malesuada in imperdiet et commodo vulputate justo in blandit',
                                                                      FALSE, 49);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (280, 'adipiscing molestie hendrerit at vulputate',
                                                                      'augue vestibulum rutrum rutrum neque aenean auctor gravida sem praesent id massa id',
                                                                      TRUE, 53);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (281, 'turpis a pede', 'erat id mauris vulputate elementum nullam varius nulla facilisi cras non velit nec', FALSE,
   33);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (282, 'vel nulla eget eros elementum',
                                                                      'purus phasellus in felis donec semper sapien a libero nam dui proin leo odio porttitor id consequat in consequat ut',
                                                                      TRUE, 126);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (283, 'nulla sed accumsan felis',
                                                                      'in congue etiam justo etiam pretium iaculis justo in hac habitasse platea dictumst etiam faucibus cursus',
                                                                      FALSE, 291);
INSERT INTO "comment" (id, title, text, is_deleted, order_id)
VALUES (284, 'nisi at nibh in hac', 'eu sapien cursus vestibulum proin eu mi nulla ac enim in tempor', FALSE, 47);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (285, 'eget eleifend luctus ultricies eu',
                                                                      'sapien varius ut blandit non interdum in ante vestibulum ante ipsum primis in faucibus orci luctus et',
                                                                      FALSE, 57);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (286, 'tempus vel pede',
                                                                      'magnis dis parturient montes nascetur ridiculus mus vivamus vestibulum sagittis sapien cum sociis natoque',
                                                                      TRUE, 169);
INSERT INTO "comment" (id, title, text, is_deleted, order_id)
VALUES (287, 'sagittis nam congue risus', 'eleifend donec ut dolor morbi vel lectus in quam fringilla', TRUE, 258);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (288, 'eros suspendisse accumsan tortor',
                                                                      'odio condimentum id luctus nec molestie sed justo pellentesque viverra pede ac diam cras pellentesque volutpat dui maecenas',
                                                                      TRUE, 281);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (289, 'sit amet justo',
                                                                      'consectetuer adipiscing elit proin interdum mauris non ligula pellentesque ultrices phasellus',
                                                                      FALSE, 75);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (290, 'pellentesque volutpat dui maecenas',
                                                                      'quam fringilla rhoncus mauris enim leo rhoncus sed vestibulum sit amet cursus id turpis integer',
                                                                      TRUE, 128);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (291, 'libero convallis eget', 'lacinia nisi venenatis tristique fusce congue diam id ornare imperdiet sapien urna',
   TRUE, 223);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (292, 'morbi porttitor lorem id ligula',
                                                                      'in faucibus orci luctus et ultrices posuere cubilia curae duis faucibus accumsan odio curabitur convallis duis consequat dui',
                                                                      FALSE, 60);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (293, 'tellus semper interdum mauris ullamcorper',
                                                                      'nisi vulputate nonummy maecenas tincidunt lacus at velit vivamus vel nulla eget eros elementum pellentesque',
                                                                      FALSE, 255);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (294, 'cubilia curae mauris viverra', 'lorem id ligula suspendisse ornare consequat lectus in est risus', FALSE, 281);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (295, 'ipsum primis in faucibus orci',
                                                                      'elementum pellentesque quisque porta volutpat erat quisque erat eros viverra eget congue eget semper rutrum nulla nunc purus phasellus',
                                                                      FALSE, 281);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (296, 'volutpat convallis morbi odio odio',
                                                                      'curae duis faucibus accumsan odio curabitur convallis duis consequat dui nec',
                                                                      FALSE, 52);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (297, 'lobortis est phasellus sit amet',
                                                                      'praesent id massa id nisl venenatis lacinia aenean sit amet justo morbi ut odio',
                                                                      FALSE, 24);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES
  (298, 'potenti cras in purus', 'consequat in consequat ut nulla sed accumsan felis ut at dolor quis', FALSE, 298);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (299, 'sed magna at nunc',
                                                                      'pede ac diam cras pellentesque volutpat dui maecenas tristique est et tempus semper est quam pharetra magna ac',
                                                                      FALSE, 204);
INSERT INTO "comment" (id, title, text, is_deleted, order_id) VALUES (300, 'in purus eu magna vulputate',
                                                                      'proin eu mi nulla ac enim in tempor turpis nec euismod scelerisque quam turpis adipiscing lorem',
                                                                      TRUE, 220);


CREATE TABLE address (
  id        SERIAL PRIMARY KEY,
  city      VARCHAR(64) NOT NULL,
  country   VARCHAR(64) NOT NULL,
  post_code INT         NOT NULL,
  user_id   INT UNIQUE REFERENCES "user" (id)
);

INSERT INTO address (id, city, country, post_code, user_id) VALUES (1, 'Malie', 'Samoa', 6611, 1);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (2, 'Tengrela', 'Ivory Coast', 8663, 2);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (3, 'Shanggu', 'China', 9746, 3);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (4, 'Jablanovec', 'Croatia', 4684, 4);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (5, 'Bojonggaling', 'Indonesia', 8017, 5);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (6, 'Borova', 'Ukraine', 2918, 6);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (7, 'Dulyapino', 'Russia', 2975, 7);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (8, 'AgnibilГ©krou', 'Ivory Coast', 6480, 8);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (9, 'Vale de Vila', 'Portugal', 5323, 9);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (10, 'Kasturi', 'Indonesia', 9435, 10);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (11, 'Lourido', 'Portugal', 4276, 11);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (12, 'Magarao', 'Philippines', 9871, 12);
INSERT INTO address (id, city, country, post_code, user_id)
VALUES (13, 'Thб»‹ TrбєҐn Viб»‡t LГўm', 'Vietnam', 1377, 13);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (14, 'Khyzy', 'Azerbaijan', 1215, 14);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (15, 'Hongmei', 'China', 5218, 15);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (16, 'ThaМЈnh HoМЃa', 'Vietnam', 9665, 16);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (17, 'Mem Martins', 'Portugal', 9004, 17);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (18, 'Anjihai', 'China', 5748, 18);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (19, 'Yihe', 'China', 5933, 19);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (20, 'Berlin', 'Germany', 9992, 20);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (21, 'Pa Mok', 'Thailand', 3379, 21);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (22, 'Masumbwe', 'Tanzania', 6378, 22);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (23, 'Sundsvall', 'Sweden', 6649, 23);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (24, 'MelГ­ssia', 'Greece', 6861, 24);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (25, 'Pakemitan', 'Indonesia', 3261, 25);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (26, 'Freiburg im Breisgau', 'Germany', 4853, 26);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (27, 'VГ¤sterГҐs', 'Sweden', 3215, 27);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (28, 'Phibun Mangsahan', 'Thailand', 6346, 28);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (29, 'Neiguan', 'China', 3151, 29);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (30, 'Zhenziliang', 'China', 8811, 30);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (31, 'Helong', 'China', 6814, 31);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (32, 'Ndeaboh', 'Nigeria', 2577, 32);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (33, 'Zakroczym', 'Poland', 1024, 33);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (34, 'San Carlos', 'Philippines', 5844, 34);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (35, 'Bandhagen', 'Sweden', 3609, 35);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (36, 'Kadubera', 'Indonesia', 1244, 36);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (37, 'Rognedino', 'Russia', 5711, 37);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (38, 'Ketangi', 'Indonesia', 2098, 38);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (39, 'BerГ«zovyy', 'Russia', 3766, 39);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (40, 'Р’РѕР»РѕС‡Р°РµРІСЃРєРѕРµ', 'Russia', 6465, 40);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (41, 'Balengbeng', 'Indonesia', 7442, 41);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (42, 'Znamenskoye', 'Russia', 7532, 42);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (43, 'Wobulenzi', 'Uganda', 8375, 43);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (44, 'San Rafael', 'Philippines', 6307, 44);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (45, 'La Ronge', 'Canada', 5650, 45);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (46, 'Sijing', 'China', 7660, 46);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (47, 'AДџdaЕџ', 'Azerbaijan', 8672, 47);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (48, 'Columbia', 'United States', 7058, 48);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (49, 'Poigar', 'Indonesia', 5609, 49);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (50, 'Xinyu', 'China', 7463, 50);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (51, 'Sete Cidades', 'Portugal', 2462, 51);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (52, 'Non Narai', 'Thailand', 8645, 52);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (53, 'SioguГ­ Arriba', 'Panama', 9194, 53);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (54, 'Assiniboia', 'Canada', 9138, 54);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (55, 'Guangshan', 'China', 8472, 55);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (56, 'Lwengo', 'Uganda', 5926, 56);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (57, 'Labuhan Deli', 'Indonesia', 4455, 57);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (58, 'Vitrolles', 'France', 4543, 58);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (59, 'RoborГ©', 'Bolivia', 4714, 59);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (60, 'Giemdiem', 'Vietnam', 2288, 60);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (61, 'Dayeuhluhur', 'Indonesia', 2527, 61);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (62, 'Kirkland Lake', 'Canada', 2959, 62);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (63, 'Zhuangshi', 'China', 7813, 63);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (64, 'AnГЎpolis', 'Brazil', 1577, 64);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (65, 'New Brunswick', 'United States', 5451, 65);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (66, 'Langchuan', 'China', 9005, 66);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (67, 'Yuktae-dong', 'North Korea', 9309, 67);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (68, 'Paoay', 'Philippines', 6866, 68);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (69, 'Stockholm', 'Sweden', 7607, 69);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (70, 'San Luis', 'Philippines', 8327, 70);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (71, 'MilГіwka', 'Poland', 1068, 71);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (72, 'Mб»№ XuyГЄn', 'Vietnam', 4853, 72);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (73, 'Cruz', 'Portugal', 3788, 73);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (74, 'La Concepcion', 'Mexico', 8286, 74);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (75, 'JakubГіw', 'Poland', 1048, 75);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (76, 'Kalilu', 'Indonesia', 8661, 76);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (77, 'Nanmuping', 'China', 1210, 77);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (78, 'Shixi', 'China', 7092, 78);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (79, 'Bipolo', 'Indonesia', 6258, 79);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (80, 'Gajiram', 'Nigeria', 2919, 80);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (81, 'Fufang', 'China', 8502, 81);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (82, 'StrГЎЕѕnГЎ', 'Czech Republic', 4885, 82);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (83, 'Calingcuan', 'Philippines', 5871, 83);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (84, 'Stende', 'Latvia', 2312, 84);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (85, 'Zhongzi', 'China', 3775, 85);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (86, 'Liulin', 'China', 3629, 86);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (87, 'SГЈo Filipe', 'Cape Verde', 9026, 87);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (88, 'Owczarnia', 'Poland', 3849, 88);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (89, 'Е»arГіw', 'Poland', 2975, 89);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (90, 'BujakГіw', 'Poland', 5663, 90);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (91, 'Gorno-Altaysk', 'Russia', 4797, 91);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (92, 'Brakas', 'Indonesia', 6132, 92);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (93, 'Tianxin', 'China', 5279, 93);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (94, 'Sinop', 'Brazil', 6357, 94);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (95, 'Washington', 'United States', 1173, 95);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (96, 'EstГўncia Velha', 'Brazil', 6957, 96);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (97, 'Castro Daire', 'Portugal', 1910, 97);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (98, 'RegnГіw', 'Poland', 4705, 98);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (99, 'Sindanghayu', 'Indonesia', 1187, 99);
INSERT INTO address (id, city, country, post_code, user_id) VALUES (100, 'Panagyurishte', 'Bulgaria', 5214, 100);


CREATE TABLE tag (
  id         SERIAL PRIMARY KEY,
  name       VARCHAR(64) NOT NULL,
  product_id INT REFERENCES "product" (id)
);

INSERT INTO tag (id, name, product_id) VALUES (1, 'blandit', 213);
INSERT INTO tag (id, name, product_id) VALUES (2, 'cum', 212);
INSERT INTO tag (id, name, product_id) VALUES (3, 'suscipit', 203);
INSERT INTO tag (id, name, product_id) VALUES (4, 'cursus', 261);
INSERT INTO tag (id, name, product_id) VALUES (5, 'praesent', 216);
INSERT INTO tag (id, name, product_id) VALUES (6, 'et', 281);
INSERT INTO tag (id, name, product_id) VALUES (7, 'tincidunt', 73);
INSERT INTO tag (id, name, product_id) VALUES (8, 'vulputate', 158);
INSERT INTO tag (id, name, product_id) VALUES (9, 'curabitur', 143);
INSERT INTO tag (id, name, product_id) VALUES (10, 'tempor', 293);
INSERT INTO tag (id, name, product_id) VALUES (11, 'cum', 69);
INSERT INTO tag (id, name, product_id) VALUES (12, 'turpis', 211);
INSERT INTO tag (id, name, product_id) VALUES (13, 'velit', 79);
INSERT INTO tag (id, name, product_id) VALUES (14, 'est', 257);
INSERT INTO tag (id, name, product_id) VALUES (15, 'magna', 293);
INSERT INTO tag (id, name, product_id) VALUES (16, 'in', 285);
INSERT INTO tag (id, name, product_id) VALUES (17, 'vulputate', 199);
INSERT INTO tag (id, name, product_id) VALUES (18, 'pretium', 272);
INSERT INTO tag (id, name, product_id) VALUES (19, 'eu', 17);
INSERT INTO tag (id, name, product_id) VALUES (20, 'consequat', 88);
INSERT INTO tag (id, name, product_id) VALUES (21, 'malesuada', 111);
INSERT INTO tag (id, name, product_id) VALUES (22, 'metus', 80);
INSERT INTO tag (id, name, product_id) VALUES (23, 'dis', 61);
INSERT INTO tag (id, name, product_id) VALUES (24, 'ut', 103);
INSERT INTO tag (id, name, product_id) VALUES (25, 'aenean', 160);
INSERT INTO tag (id, name, product_id) VALUES (26, 'id', 15);
INSERT INTO tag (id, name, product_id) VALUES (27, 'morbi', 222);
INSERT INTO tag (id, name, product_id) VALUES (28, 'adipiscing', 122);
INSERT INTO tag (id, name, product_id) VALUES (29, 'leo', 98);
INSERT INTO tag (id, name, product_id) VALUES (30, 'interdum', 281);
INSERT INTO tag (id, name, product_id) VALUES (31, 'pellentesque', 124);
INSERT INTO tag (id, name, product_id) VALUES (32, 'ut', 46);
INSERT INTO tag (id, name, product_id) VALUES (33, 'in', 124);
INSERT INTO tag (id, name, product_id) VALUES (34, 'eget', 26);
INSERT INTO tag (id, name, product_id) VALUES (35, 'lacus', 53);
INSERT INTO tag (id, name, product_id) VALUES (36, 'pellentesque', 103);
INSERT INTO tag (id, name, product_id) VALUES (37, 'eleifend', 221);
INSERT INTO tag (id, name, product_id) VALUES (38, 'arcu', 84);
INSERT INTO tag (id, name, product_id) VALUES (39, 'libero', 33);
INSERT INTO tag (id, name, product_id) VALUES (40, 'non', 25);
INSERT INTO tag (id, name, product_id) VALUES (41, 'a', 21);
INSERT INTO tag (id, name, product_id) VALUES (42, 'lorem', 122);
INSERT INTO tag (id, name, product_id) VALUES (43, 'purus', 26);
INSERT INTO tag (id, name, product_id) VALUES (44, 'semper', 116);
INSERT INTO tag (id, name, product_id) VALUES (45, 'tortor', 40);
INSERT INTO tag (id, name, product_id) VALUES (46, 'ipsum', 30);
INSERT INTO tag (id, name, product_id) VALUES (47, 'non', 189);
INSERT INTO tag (id, name, product_id) VALUES (48, 'sed', 259);
INSERT INTO tag (id, name, product_id) VALUES (49, 'ut', 196);
INSERT INTO tag (id, name, product_id) VALUES (50, 'est', 239);
INSERT INTO tag (id, name, product_id) VALUES (51, 'feugiat', 16);
INSERT INTO tag (id, name, product_id) VALUES (52, 'libero', 247);
INSERT INTO tag (id, name, product_id) VALUES (53, 'scelerisque', 25);
INSERT INTO tag (id, name, product_id) VALUES (54, 'vel', 22);
INSERT INTO tag (id, name, product_id) VALUES (55, 'turpis', 243);
INSERT INTO tag (id, name, product_id) VALUES (56, 'nulla', 39);
INSERT INTO tag (id, name, product_id) VALUES (57, 'nulla', 199);
INSERT INTO tag (id, name, product_id) VALUES (58, 'lacinia', 124);
INSERT INTO tag (id, name, product_id) VALUES (59, 'vestibulum', 52);
INSERT INTO tag (id, name, product_id) VALUES (60, 'nulla', 218);
INSERT INTO tag (id, name, product_id) VALUES (61, 'in', 62);
INSERT INTO tag (id, name, product_id) VALUES (62, 'metus', 6);
INSERT INTO tag (id, name, product_id) VALUES (63, 'et', 170);
INSERT INTO tag (id, name, product_id) VALUES (64, 'ultrices', 5);
INSERT INTO tag (id, name, product_id) VALUES (65, 'fringilla', 272);
INSERT INTO tag (id, name, product_id) VALUES (66, 'convallis', 277);
INSERT INTO tag (id, name, product_id) VALUES (67, 'nisl', 269);
INSERT INTO tag (id, name, product_id) VALUES (68, 'diam', 196);
INSERT INTO tag (id, name, product_id) VALUES (69, 'amet', 272);
INSERT INTO tag (id, name, product_id) VALUES (70, 'sit', 233);
INSERT INTO tag (id, name, product_id) VALUES (71, 'vehicula', 19);
INSERT INTO tag (id, name, product_id) VALUES (72, 'lectus', 280);
INSERT INTO tag (id, name, product_id) VALUES (73, 'lobortis', 69);
INSERT INTO tag (id, name, product_id) VALUES (74, 'nonummy', 202);
INSERT INTO tag (id, name, product_id) VALUES (75, 'ullamcorper', 27);
INSERT INTO tag (id, name, product_id) VALUES (76, 'elit', 32);
INSERT INTO tag (id, name, product_id) VALUES (77, 'posuere', 258);
INSERT INTO tag (id, name, product_id) VALUES (78, 'habitasse', 291);
INSERT INTO tag (id, name, product_id) VALUES (79, 'leo', 289);
INSERT INTO tag (id, name, product_id) VALUES (80, 'ligula', 86);
INSERT INTO tag (id, name, product_id) VALUES (81, 'amet', 194);
INSERT INTO tag (id, name, product_id) VALUES (82, 'primis', 59);
INSERT INTO tag (id, name, product_id) VALUES (83, 'mauris', 224);
INSERT INTO tag (id, name, product_id) VALUES (84, 'lorem', 222);
INSERT INTO tag (id, name, product_id) VALUES (85, 'pede', 171);
INSERT INTO tag (id, name, product_id) VALUES (86, 'non', 168);
INSERT INTO tag (id, name, product_id) VALUES (87, 'amet', 299);
INSERT INTO tag (id, name, product_id) VALUES (88, 'aliquam', 197);
INSERT INTO tag (id, name, product_id) VALUES (89, 'vulputate', 22);
INSERT INTO tag (id, name, product_id) VALUES (90, 'in', 269);
INSERT INTO tag (id, name, product_id) VALUES (91, 'nisi', 213);
INSERT INTO tag (id, name, product_id) VALUES (92, 'libero', 4);
INSERT INTO tag (id, name, product_id) VALUES (93, 'ultrices', 175);
INSERT INTO tag (id, name, product_id) VALUES (94, 'id', 24);
INSERT INTO tag (id, name, product_id) VALUES (95, 'imperdiet', 184);
INSERT INTO tag (id, name, product_id) VALUES (96, 'ligula', 206);
INSERT INTO tag (id, name, product_id) VALUES (97, 'vulputate', 86);
INSERT INTO tag (id, name, product_id) VALUES (98, 'feugiat', 119);
INSERT INTO tag (id, name, product_id) VALUES (99, 'volutpat', 300);
INSERT INTO tag (id, name, product_id) VALUES (100, 'iaculis', 230);
INSERT INTO tag (id, name, product_id) VALUES (101, 'vel', 175);
INSERT INTO tag (id, name, product_id) VALUES (102, 'dui', 176);
INSERT INTO tag (id, name, product_id) VALUES (103, 'arcu', 106);
INSERT INTO tag (id, name, product_id) VALUES (104, 'mi', 44);
INSERT INTO tag (id, name, product_id) VALUES (105, 'semper', 55);
INSERT INTO tag (id, name, product_id) VALUES (106, 'in', 298);
INSERT INTO tag (id, name, product_id) VALUES (107, 'vestibulum', 276);
INSERT INTO tag (id, name, product_id) VALUES (108, 'rutrum', 138);
INSERT INTO tag (id, name, product_id) VALUES (109, 'dapibus', 21);
INSERT INTO tag (id, name, product_id) VALUES (110, 'sed', 238);
INSERT INTO tag (id, name, product_id) VALUES (111, 'maecenas', 233);
INSERT INTO tag (id, name, product_id) VALUES (112, 'et', 53);
INSERT INTO tag (id, name, product_id) VALUES (113, 'viverra', 246);
INSERT INTO tag (id, name, product_id) VALUES (114, 'nunc', 193);
INSERT INTO tag (id, name, product_id) VALUES (115, 'volutpat', 52);
INSERT INTO tag (id, name, product_id) VALUES (116, 'turpis', 132);
INSERT INTO tag (id, name, product_id) VALUES (117, 'convallis', 285);
INSERT INTO tag (id, name, product_id) VALUES (118, 'quisque', 251);
INSERT INTO tag (id, name, product_id) VALUES (119, 'posuere', 285);
INSERT INTO tag (id, name, product_id) VALUES (120, 'diam', 203);
INSERT INTO tag (id, name, product_id) VALUES (121, 'libero', 282);
INSERT INTO tag (id, name, product_id) VALUES (122, 'lectus', 210);
INSERT INTO tag (id, name, product_id) VALUES (123, 'lobortis', 54);
INSERT INTO tag (id, name, product_id) VALUES (124, 'ut', 277);
INSERT INTO tag (id, name, product_id) VALUES (125, 'maecenas', 282);
INSERT INTO tag (id, name, product_id) VALUES (126, 'praesent', 5);
INSERT INTO tag (id, name, product_id) VALUES (127, 'nunc', 28);
INSERT INTO tag (id, name, product_id) VALUES (128, 'suspendisse', 182);
INSERT INTO tag (id, name, product_id) VALUES (129, 'lorem', 192);
INSERT INTO tag (id, name, product_id) VALUES (130, 'vulputate', 46);
INSERT INTO tag (id, name, product_id) VALUES (131, 'ultricies', 279);
INSERT INTO tag (id, name, product_id) VALUES (132, 'sit', 269);
INSERT INTO tag (id, name, product_id) VALUES (133, 'in', 195);
INSERT INTO tag (id, name, product_id) VALUES (134, 'et', 206);
INSERT INTO tag (id, name, product_id) VALUES (135, 'accumsan', 57);
INSERT INTO tag (id, name, product_id) VALUES (136, 'pulvinar', 293);
INSERT INTO tag (id, name, product_id) VALUES (137, 'malesuada', 292);
INSERT INTO tag (id, name, product_id) VALUES (138, 'porta', 169);
INSERT INTO tag (id, name, product_id) VALUES (139, 'sapien', 5);
INSERT INTO tag (id, name, product_id) VALUES (140, 'dui', 4);
INSERT INTO tag (id, name, product_id) VALUES (141, 'dolor', 114);
INSERT INTO tag (id, name, product_id) VALUES (142, 'vehicula', 220);
INSERT INTO tag (id, name, product_id) VALUES (143, 'in', 131);
INSERT INTO tag (id, name, product_id) VALUES (144, 'sit', 174);
INSERT INTO tag (id, name, product_id) VALUES (145, 'integer', 171);
INSERT INTO tag (id, name, product_id) VALUES (146, 'pede', 296);
INSERT INTO tag (id, name, product_id) VALUES (147, 'varius', 262);
INSERT INTO tag (id, name, product_id) VALUES (148, 'eu', 95);
INSERT INTO tag (id, name, product_id) VALUES (149, 'et', 247);
INSERT INTO tag (id, name, product_id) VALUES (150, 'posuere', 77);
INSERT INTO tag (id, name, product_id) VALUES (151, 'congue', 60);
INSERT INTO tag (id, name, product_id) VALUES (152, 'turpis', 79);
INSERT INTO tag (id, name, product_id) VALUES (153, 'suspendisse', 161);
INSERT INTO tag (id, name, product_id) VALUES (154, 'imperdiet', 209);
INSERT INTO tag (id, name, product_id) VALUES (155, 'orci', 211);
INSERT INTO tag (id, name, product_id) VALUES (156, 'hac', 95);
INSERT INTO tag (id, name, product_id) VALUES (157, 'interdum', 6);
INSERT INTO tag (id, name, product_id) VALUES (158, 'id', 34);
INSERT INTO tag (id, name, product_id) VALUES (159, 'pretium', 11);
INSERT INTO tag (id, name, product_id) VALUES (160, 'magna', 36);
INSERT INTO tag (id, name, product_id) VALUES (161, 'ut', 49);
INSERT INTO tag (id, name, product_id) VALUES (162, 'eu', 214);
INSERT INTO tag (id, name, product_id) VALUES (163, 'etiam', 213);
INSERT INTO tag (id, name, product_id) VALUES (164, 'luctus', 223);
INSERT INTO tag (id, name, product_id) VALUES (165, 'dictumst', 188);
INSERT INTO tag (id, name, product_id) VALUES (166, 'erat', 156);
INSERT INTO tag (id, name, product_id) VALUES (167, 'risus', 127);
INSERT INTO tag (id, name, product_id) VALUES (168, 'orci', 185);
INSERT INTO tag (id, name, product_id) VALUES (169, 'sed', 178);
INSERT INTO tag (id, name, product_id) VALUES (170, 'lectus', 44);
INSERT INTO tag (id, name, product_id) VALUES (171, 'aliquet', 27);
INSERT INTO tag (id, name, product_id) VALUES (172, 'non', 232);
INSERT INTO tag (id, name, product_id) VALUES (173, 'mus', 202);
INSERT INTO tag (id, name, product_id) VALUES (174, 'hendrerit', 270);
INSERT INTO tag (id, name, product_id) VALUES (175, 'velit', 5);
INSERT INTO tag (id, name, product_id) VALUES (176, 'et', 122);
INSERT INTO tag (id, name, product_id) VALUES (177, 'tincidunt', 186);
INSERT INTO tag (id, name, product_id) VALUES (178, 'molestie', 27);
INSERT INTO tag (id, name, product_id) VALUES (179, 'nisl', 64);
INSERT INTO tag (id, name, product_id) VALUES (180, 'vitae', 48);
INSERT INTO tag (id, name, product_id) VALUES (181, 'orci', 122);
INSERT INTO tag (id, name, product_id) VALUES (182, 'phasellus', 189);
INSERT INTO tag (id, name, product_id) VALUES (183, 'vehicula', 240);
INSERT INTO tag (id, name, product_id) VALUES (184, 'pretium', 281);
INSERT INTO tag (id, name, product_id) VALUES (185, 'sit', 237);
INSERT INTO tag (id, name, product_id) VALUES (186, 'aliquet', 235);
INSERT INTO tag (id, name, product_id) VALUES (187, 'congue', 104);
INSERT INTO tag (id, name, product_id) VALUES (188, 'ut', 44);
INSERT INTO tag (id, name, product_id) VALUES (189, 'proin', 153);
INSERT INTO tag (id, name, product_id) VALUES (190, 'quam', 170);
INSERT INTO tag (id, name, product_id) VALUES (191, 'proin', 256);
INSERT INTO tag (id, name, product_id) VALUES (192, 'ut', 112);
INSERT INTO tag (id, name, product_id) VALUES (193, 'pulvinar', 34);
INSERT INTO tag (id, name, product_id) VALUES (194, 'tortor', 85);
INSERT INTO tag (id, name, product_id) VALUES (195, 'aenean', 94);
INSERT INTO tag (id, name, product_id) VALUES (196, 'eu', 182);
INSERT INTO tag (id, name, product_id) VALUES (197, 'purus', 61);
INSERT INTO tag (id, name, product_id) VALUES (198, 'sed', 56);
INSERT INTO tag (id, name, product_id) VALUES (199, 'convallis', 151);
INSERT INTO tag (id, name, product_id) VALUES (200, 'in', 65);
INSERT INTO tag (id, name, product_id) VALUES (201, 'sit', 220);
INSERT INTO tag (id, name, product_id) VALUES (202, 'vel', 80);
INSERT INTO tag (id, name, product_id) VALUES (203, 'proin', 197);
INSERT INTO tag (id, name, product_id) VALUES (204, 'nulla', 265);
INSERT INTO tag (id, name, product_id) VALUES (205, 'justo', 53);
INSERT INTO tag (id, name, product_id) VALUES (206, 'nisi', 232);
INSERT INTO tag (id, name, product_id) VALUES (207, 'vestibulum', 176);
INSERT INTO tag (id, name, product_id) VALUES (208, 'leo', 131);
INSERT INTO tag (id, name, product_id) VALUES (209, 'nullam', 249);
INSERT INTO tag (id, name, product_id) VALUES (210, 'nullam', 77);
INSERT INTO tag (id, name, product_id) VALUES (211, 'eros', 198);
INSERT INTO tag (id, name, product_id) VALUES (212, 'nonummy', 87);
INSERT INTO tag (id, name, product_id) VALUES (213, 'ut', 50);
INSERT INTO tag (id, name, product_id) VALUES (214, 'sagittis', 192);
INSERT INTO tag (id, name, product_id) VALUES (215, 'nullam', 292);
INSERT INTO tag (id, name, product_id) VALUES (216, 'scelerisque', 72);
INSERT INTO tag (id, name, product_id) VALUES (217, 'ullamcorper', 179);
INSERT INTO tag (id, name, product_id) VALUES (218, 'purus', 29);
INSERT INTO tag (id, name, product_id) VALUES (219, 'pede', 163);
INSERT INTO tag (id, name, product_id) VALUES (220, 'amet', 207);
INSERT INTO tag (id, name, product_id) VALUES (221, 'ligula', 95);
INSERT INTO tag (id, name, product_id) VALUES (222, 'vel', 293);
INSERT INTO tag (id, name, product_id) VALUES (223, 'sagittis', 148);
INSERT INTO tag (id, name, product_id) VALUES (224, 'quis', 280);
INSERT INTO tag (id, name, product_id) VALUES (225, 'convallis', 149);
INSERT INTO tag (id, name, product_id) VALUES (226, 'sollicitudin', 240);
INSERT INTO tag (id, name, product_id) VALUES (227, 'turpis', 171);
INSERT INTO tag (id, name, product_id) VALUES (228, 'facilisi', 24);
INSERT INTO tag (id, name, product_id) VALUES (229, 'a', 195);
INSERT INTO tag (id, name, product_id) VALUES (230, 'molestie', 148);
INSERT INTO tag (id, name, product_id) VALUES (231, 'est', 253);
INSERT INTO tag (id, name, product_id) VALUES (232, 'ultrices', 148);
INSERT INTO tag (id, name, product_id) VALUES (233, 'magna', 47);
INSERT INTO tag (id, name, product_id) VALUES (234, 'nisi', 294);
INSERT INTO tag (id, name, product_id) VALUES (235, 'quis', 187);
INSERT INTO tag (id, name, product_id) VALUES (236, 'pulvinar', 298);
INSERT INTO tag (id, name, product_id) VALUES (237, 'dictumst', 297);
INSERT INTO tag (id, name, product_id) VALUES (238, 'quis', 63);
INSERT INTO tag (id, name, product_id) VALUES (239, 'feugiat', 146);
INSERT INTO tag (id, name, product_id) VALUES (240, 'vitae', 94);
INSERT INTO tag (id, name, product_id) VALUES (241, 'mi', 283);
INSERT INTO tag (id, name, product_id) VALUES (242, 'vivamus', 100);
INSERT INTO tag (id, name, product_id) VALUES (243, 'cursus', 8);
INSERT INTO tag (id, name, product_id) VALUES (244, 'nibh', 155);
INSERT INTO tag (id, name, product_id) VALUES (245, 'amet', 34);
INSERT INTO tag (id, name, product_id) VALUES (246, 'tortor', 53);
INSERT INTO tag (id, name, product_id) VALUES (247, 'non', 153);
INSERT INTO tag (id, name, product_id) VALUES (248, 'tortor', 228);
INSERT INTO tag (id, name, product_id) VALUES (249, 'pellentesque', 134);
INSERT INTO tag (id, name, product_id) VALUES (250, 'ullamcorper', 76);
INSERT INTO tag (id, name, product_id) VALUES (251, 'eget', 72);
INSERT INTO tag (id, name, product_id) VALUES (252, 'metus', 49);
INSERT INTO tag (id, name, product_id) VALUES (253, 'vehicula', 118);
INSERT INTO tag (id, name, product_id) VALUES (254, 'eu', 293);
INSERT INTO tag (id, name, product_id) VALUES (255, 'eget', 165);
INSERT INTO tag (id, name, product_id) VALUES (256, 'lorem', 282);
INSERT INTO tag (id, name, product_id) VALUES (257, 'posuere', 238);
INSERT INTO tag (id, name, product_id) VALUES (258, 'sapien', 129);
INSERT INTO tag (id, name, product_id) VALUES (259, 'diam', 40);
INSERT INTO tag (id, name, product_id) VALUES (260, 'nisl', 199);
INSERT INTO tag (id, name, product_id) VALUES (261, 'rhoncus', 49);
INSERT INTO tag (id, name, product_id) VALUES (262, 'vel', 259);
INSERT INTO tag (id, name, product_id) VALUES (263, 'morbi', 70);
INSERT INTO tag (id, name, product_id) VALUES (264, 'non', 234);
INSERT INTO tag (id, name, product_id) VALUES (265, 'pulvinar', 62);
INSERT INTO tag (id, name, product_id) VALUES (266, 'est', 294);
INSERT INTO tag (id, name, product_id) VALUES (267, 'nulla', 226);
INSERT INTO tag (id, name, product_id) VALUES (268, 'quam', 270);
INSERT INTO tag (id, name, product_id) VALUES (269, 'ac', 286);
INSERT INTO tag (id, name, product_id) VALUES (270, 'ut', 175);
INSERT INTO tag (id, name, product_id) VALUES (271, 'bibendum', 37);
INSERT INTO tag (id, name, product_id) VALUES (272, 'vestibulum', 16);
INSERT INTO tag (id, name, product_id) VALUES (273, 'vel', 148);
INSERT INTO tag (id, name, product_id) VALUES (274, 'vitae', 31);
INSERT INTO tag (id, name, product_id) VALUES (275, 'rhoncus', 124);
INSERT INTO tag (id, name, product_id) VALUES (276, 'tristique', 188);
INSERT INTO tag (id, name, product_id) VALUES (277, 'diam', 64);
INSERT INTO tag (id, name, product_id) VALUES (278, 'primis', 60);
INSERT INTO tag (id, name, product_id) VALUES (279, 'sem', 5);
INSERT INTO tag (id, name, product_id) VALUES (280, 'diam', 252);
INSERT INTO tag (id, name, product_id) VALUES (281, 'sagittis', 283);
INSERT INTO tag (id, name, product_id) VALUES (282, 'est', 153);
INSERT INTO tag (id, name, product_id) VALUES (283, 'ornare', 221);
INSERT INTO tag (id, name, product_id) VALUES (284, 'montes', 279);
INSERT INTO tag (id, name, product_id) VALUES (285, 'justo', 186);
INSERT INTO tag (id, name, product_id) VALUES (286, 'mattis', 175);
INSERT INTO tag (id, name, product_id) VALUES (287, 'in', 87);
INSERT INTO tag (id, name, product_id) VALUES (288, 'in', 17);
INSERT INTO tag (id, name, product_id) VALUES (289, 'ante', 48);
INSERT INTO tag (id, name, product_id) VALUES (290, 'amet', 280);
INSERT INTO tag (id, name, product_id) VALUES (291, 'in', 166);
INSERT INTO tag (id, name, product_id) VALUES (292, 'tellus', 284);
INSERT INTO tag (id, name, product_id) VALUES (293, 'eleifend', 245);
INSERT INTO tag (id, name, product_id) VALUES (294, 'lectus', 75);
INSERT INTO tag (id, name, product_id) VALUES (295, 'in', 266);
INSERT INTO tag (id, name, product_id) VALUES (296, 'id', 281);
INSERT INTO tag (id, name, product_id) VALUES (297, 'sollicitudin', 228);
INSERT INTO tag (id, name, product_id) VALUES (298, 'fusce', 250);
INSERT INTO tag (id, name, product_id) VALUES (299, 'id', 126);
INSERT INTO tag (id, name, product_id) VALUES (300, 'mauris', 162);
INSERT INTO tag (id, name, product_id) VALUES (301, 'lacinia', 190);
INSERT INTO tag (id, name, product_id) VALUES (302, 'nibh', 191);
INSERT INTO tag (id, name, product_id) VALUES (303, 'augue', 235);
INSERT INTO tag (id, name, product_id) VALUES (304, 'in', 269);
INSERT INTO tag (id, name, product_id) VALUES (305, 'lectus', 40);
INSERT INTO tag (id, name, product_id) VALUES (306, 'erat', 181);
INSERT INTO tag (id, name, product_id) VALUES (307, 'fermentum', 124);
INSERT INTO tag (id, name, product_id) VALUES (308, 'eget', 133);
INSERT INTO tag (id, name, product_id) VALUES (309, 'viverra', 151);
INSERT INTO tag (id, name, product_id) VALUES (310, 'vel', 54);
INSERT INTO tag (id, name, product_id) VALUES (311, 'tempus', 87);
INSERT INTO tag (id, name, product_id) VALUES (312, 'cubilia', 18);
INSERT INTO tag (id, name, product_id) VALUES (313, 'vestibulum', 269);
INSERT INTO tag (id, name, product_id) VALUES (314, 'luctus', 55);
INSERT INTO tag (id, name, product_id) VALUES (315, 'tincidunt', 114);
INSERT INTO tag (id, name, product_id) VALUES (316, 'placerat', 77);
INSERT INTO tag (id, name, product_id) VALUES (317, 'amet', 117);
INSERT INTO tag (id, name, product_id) VALUES (318, 'eleifend', 40);
INSERT INTO tag (id, name, product_id) VALUES (319, 'arcu', 192);
INSERT INTO tag (id, name, product_id) VALUES (320, 'nunc', 164);
INSERT INTO tag (id, name, product_id) VALUES (321, 'enim', 198);
INSERT INTO tag (id, name, product_id) VALUES (322, 'ante', 7);
INSERT INTO tag (id, name, product_id) VALUES (323, 'nulla', 45);
INSERT INTO tag (id, name, product_id) VALUES (324, 'leo', 160);
INSERT INTO tag (id, name, product_id) VALUES (325, 'amet', 56);
INSERT INTO tag (id, name, product_id) VALUES (326, 'vestibulum', 181);
INSERT INTO tag (id, name, product_id) VALUES (327, 'natoque', 76);
INSERT INTO tag (id, name, product_id) VALUES (328, 'at', 162);
INSERT INTO tag (id, name, product_id) VALUES (329, 'lorem', 205);
INSERT INTO tag (id, name, product_id) VALUES (330, 'massa', 43);
INSERT INTO tag (id, name, product_id) VALUES (331, 'blandit', 275);
INSERT INTO tag (id, name, product_id) VALUES (332, 'enim', 10);
INSERT INTO tag (id, name, product_id) VALUES (333, 'ipsum', 33);
INSERT INTO tag (id, name, product_id) VALUES (334, 'euismod', 155);
INSERT INTO tag (id, name, product_id) VALUES (335, 'leo', 49);
INSERT INTO tag (id, name, product_id) VALUES (336, 'interdum', 34);
INSERT INTO tag (id, name, product_id) VALUES (337, 'mattis', 66);
INSERT INTO tag (id, name, product_id) VALUES (338, 'morbi', 251);
INSERT INTO tag (id, name, product_id) VALUES (339, 'potenti', 156);
INSERT INTO tag (id, name, product_id) VALUES (340, 'curae', 245);
INSERT INTO tag (id, name, product_id) VALUES (341, 'lorem', 229);
INSERT INTO tag (id, name, product_id) VALUES (342, 'morbi', 20);
INSERT INTO tag (id, name, product_id) VALUES (343, 'orci', 144);
INSERT INTO tag (id, name, product_id) VALUES (344, 'nisl', 182);
INSERT INTO tag (id, name, product_id) VALUES (345, 'in', 288);
INSERT INTO tag (id, name, product_id) VALUES (346, 'vestibulum', 109);
INSERT INTO tag (id, name, product_id) VALUES (347, 'amet', 235);
INSERT INTO tag (id, name, product_id) VALUES (348, 'parturient', 33);
INSERT INTO tag (id, name, product_id) VALUES (349, 'potenti', 3);
INSERT INTO tag (id, name, product_id) VALUES (350, 'sed', 47);
INSERT INTO tag (id, name, product_id) VALUES (351, 'non', 227);
INSERT INTO tag (id, name, product_id) VALUES (352, 'venenatis', 25);
INSERT INTO tag (id, name, product_id) VALUES (353, 'semper', 52);
INSERT INTO tag (id, name, product_id) VALUES (354, 'turpis', 102);
INSERT INTO tag (id, name, product_id) VALUES (355, 'eget', 112);
INSERT INTO tag (id, name, product_id) VALUES (356, 'erat', 7);
INSERT INTO tag (id, name, product_id) VALUES (357, 'nisl', 50);
INSERT INTO tag (id, name, product_id) VALUES (358, 'rutrum', 24);
INSERT INTO tag (id, name, product_id) VALUES (359, 'ut', 281);
INSERT INTO tag (id, name, product_id) VALUES (360, 'integer', 198);
INSERT INTO tag (id, name, product_id) VALUES (361, 'accumsan', 262);
INSERT INTO tag (id, name, product_id) VALUES (362, 'nisl', 217);
INSERT INTO tag (id, name, product_id) VALUES (363, 'volutpat', 219);
INSERT INTO tag (id, name, product_id) VALUES (364, 'sit', 160);
INSERT INTO tag (id, name, product_id) VALUES (365, 'pede', 214);
INSERT INTO tag (id, name, product_id) VALUES (366, 'rhoncus', 42);
INSERT INTO tag (id, name, product_id) VALUES (367, 'nunc', 222);
INSERT INTO tag (id, name, product_id) VALUES (368, 'ac', 212);
INSERT INTO tag (id, name, product_id) VALUES (369, 'sapien', 107);
INSERT INTO tag (id, name, product_id) VALUES (370, 'elementum', 83);
INSERT INTO tag (id, name, product_id) VALUES (371, 'nunc', 206);
INSERT INTO tag (id, name, product_id) VALUES (372, 'pede', 44);
INSERT INTO tag (id, name, product_id) VALUES (373, 'ridiculus', 191);
INSERT INTO tag (id, name, product_id) VALUES (374, 'tempus', 121);
INSERT INTO tag (id, name, product_id) VALUES (375, 'luctus', 209);
INSERT INTO tag (id, name, product_id) VALUES (376, 'orci', 285);
INSERT INTO tag (id, name, product_id) VALUES (377, 'magna', 41);
INSERT INTO tag (id, name, product_id) VALUES (378, 'libero', 34);
INSERT INTO tag (id, name, product_id) VALUES (379, 'tincidunt', 281);
INSERT INTO tag (id, name, product_id) VALUES (380, 'amet', 233);
INSERT INTO tag (id, name, product_id) VALUES (381, 'placerat', 90);
INSERT INTO tag (id, name, product_id) VALUES (382, 'sed', 220);
INSERT INTO tag (id, name, product_id) VALUES (383, 'in', 38);
INSERT INTO tag (id, name, product_id) VALUES (384, 'rutrum', 174);
INSERT INTO tag (id, name, product_id) VALUES (385, 'nullam', 75);
INSERT INTO tag (id, name, product_id) VALUES (386, 'tellus', 163);
INSERT INTO tag (id, name, product_id) VALUES (387, 'felis', 1);
INSERT INTO tag (id, name, product_id) VALUES (388, 'elit', 137);
INSERT INTO tag (id, name, product_id) VALUES (389, 'cursus', 9);
INSERT INTO tag (id, name, product_id) VALUES (390, 'sociis', 245);
INSERT INTO tag (id, name, product_id) VALUES (391, 'tristique', 128);
INSERT INTO tag (id, name, product_id) VALUES (392, 'lectus', 74);
INSERT INTO tag (id, name, product_id) VALUES (393, 'aliquam', 183);
INSERT INTO tag (id, name, product_id) VALUES (394, 'vivamus', 137);
INSERT INTO tag (id, name, product_id) VALUES (395, 'massa', 32);
INSERT INTO tag (id, name, product_id) VALUES (396, 'ipsum', 226);
INSERT INTO tag (id, name, product_id) VALUES (397, 'quam', 34);
INSERT INTO tag (id, name, product_id) VALUES (398, 'luctus', 107);
INSERT INTO tag (id, name, product_id) VALUES (399, 'lorem', 298);
INSERT INTO tag (id, name, product_id) VALUES (400, 'ut', 22);
INSERT INTO tag (id, name, product_id) VALUES (401, 'pede', 112);
INSERT INTO tag (id, name, product_id) VALUES (402, 'metus', 264);
INSERT INTO tag (id, name, product_id) VALUES (403, 'vel', 18);
INSERT INTO tag (id, name, product_id) VALUES (404, 'donec', 66);
INSERT INTO tag (id, name, product_id) VALUES (405, 'aliquam', 283);
INSERT INTO tag (id, name, product_id) VALUES (406, 'in', 290);
INSERT INTO tag (id, name, product_id) VALUES (407, 'nisi', 216);
INSERT INTO tag (id, name, product_id) VALUES (408, 'hac', 238);
INSERT INTO tag (id, name, product_id) VALUES (409, 'faucibus', 284);
INSERT INTO tag (id, name, product_id) VALUES (410, 'luctus', 154);
INSERT INTO tag (id, name, product_id) VALUES (411, 'aliquet', 12);
INSERT INTO tag (id, name, product_id) VALUES (412, 'aliquam', 295);
INSERT INTO tag (id, name, product_id) VALUES (413, 'nullam', 291);
INSERT INTO tag (id, name, product_id) VALUES (414, 'maecenas', 137);
INSERT INTO tag (id, name, product_id) VALUES (415, 'a', 36);
INSERT INTO tag (id, name, product_id) VALUES (416, 'suspendisse', 190);
INSERT INTO tag (id, name, product_id) VALUES (417, 'nibh', 69);
INSERT INTO tag (id, name, product_id) VALUES (418, 'consectetuer', 210);
INSERT INTO tag (id, name, product_id) VALUES (419, 'montes', 208);
INSERT INTO tag (id, name, product_id) VALUES (420, 'ultrices', 93);
INSERT INTO tag (id, name, product_id) VALUES (421, 'vulputate', 1);
INSERT INTO tag (id, name, product_id) VALUES (422, 'vivamus', 277);
INSERT INTO tag (id, name, product_id) VALUES (423, 'amet', 111);
INSERT INTO tag (id, name, product_id) VALUES (424, 'pede', 252);
INSERT INTO tag (id, name, product_id) VALUES (425, 'velit', 46);
INSERT INTO tag (id, name, product_id) VALUES (426, 'primis', 152);
INSERT INTO tag (id, name, product_id) VALUES (427, 'donec', 230);
INSERT INTO tag (id, name, product_id) VALUES (428, 'rhoncus', 125);
INSERT INTO tag (id, name, product_id) VALUES (429, 'amet', 44);
INSERT INTO tag (id, name, product_id) VALUES (430, 'molestie', 79);
INSERT INTO tag (id, name, product_id) VALUES (431, 'a', 212);
INSERT INTO tag (id, name, product_id) VALUES (432, 'consequat', 265);
INSERT INTO tag (id, name, product_id) VALUES (433, 'eget', 7);
INSERT INTO tag (id, name, product_id) VALUES (434, 'amet', 221);
INSERT INTO tag (id, name, product_id) VALUES (435, 'congue', 123);
INSERT INTO tag (id, name, product_id) VALUES (436, 'sed', 254);
INSERT INTO tag (id, name, product_id) VALUES (437, 'turpis', 289);
INSERT INTO tag (id, name, product_id) VALUES (438, 'venenatis', 196);
INSERT INTO tag (id, name, product_id) VALUES (439, 'sapien', 173);
INSERT INTO tag (id, name, product_id) VALUES (440, 'lectus', 31);
INSERT INTO tag (id, name, product_id) VALUES (441, 'praesent', 207);
INSERT INTO tag (id, name, product_id) VALUES (442, 'enim', 84);
INSERT INTO tag (id, name, product_id) VALUES (443, 'integer', 103);
INSERT INTO tag (id, name, product_id) VALUES (444, 'donec', 231);
INSERT INTO tag (id, name, product_id) VALUES (445, 'amet', 199);
INSERT INTO tag (id, name, product_id) VALUES (446, 'mauris', 2);
INSERT INTO tag (id, name, product_id) VALUES (447, 'odio', 276);
INSERT INTO tag (id, name, product_id) VALUES (448, 'augue', 119);
INSERT INTO tag (id, name, product_id) VALUES (449, 'nisi', 63);
INSERT INTO tag (id, name, product_id) VALUES (450, 'quis', 277);
INSERT INTO tag (id, name, product_id) VALUES (451, 'et', 207);
INSERT INTO tag (id, name, product_id) VALUES (452, 'lectus', 265);
INSERT INTO tag (id, name, product_id) VALUES (453, 'quam', 191);
INSERT INTO tag (id, name, product_id) VALUES (454, 'primis', 82);
INSERT INTO tag (id, name, product_id) VALUES (455, 'cras', 291);
INSERT INTO tag (id, name, product_id) VALUES (456, 'ligula', 193);
INSERT INTO tag (id, name, product_id) VALUES (457, 'cras', 246);
INSERT INTO tag (id, name, product_id) VALUES (458, 'curabitur', 239);
INSERT INTO tag (id, name, product_id) VALUES (459, 'ridiculus', 23);
INSERT INTO tag (id, name, product_id) VALUES (460, 'morbi', 221);
INSERT INTO tag (id, name, product_id) VALUES (461, 'elementum', 102);
INSERT INTO tag (id, name, product_id) VALUES (462, 'maecenas', 251);
INSERT INTO tag (id, name, product_id) VALUES (463, 'fusce', 170);
INSERT INTO tag (id, name, product_id) VALUES (464, 'ipsum', 209);
INSERT INTO tag (id, name, product_id) VALUES (465, 'fusce', 221);
INSERT INTO tag (id, name, product_id) VALUES (466, 'in', 64);
INSERT INTO tag (id, name, product_id) VALUES (467, 'mus', 216);
INSERT INTO tag (id, name, product_id) VALUES (468, 'tellus', 283);
INSERT INTO tag (id, name, product_id) VALUES (469, 'pretium', 71);
INSERT INTO tag (id, name, product_id) VALUES (470, 'viverra', 298);
INSERT INTO tag (id, name, product_id) VALUES (471, 'mauris', 148);
INSERT INTO tag (id, name, product_id) VALUES (472, 'porta', 231);
INSERT INTO tag (id, name, product_id) VALUES (473, 'nec', 9);
INSERT INTO tag (id, name, product_id) VALUES (474, 'metus', 122);
INSERT INTO tag (id, name, product_id) VALUES (475, 'dictumst', 120);
INSERT INTO tag (id, name, product_id) VALUES (476, 'enim', 258);
INSERT INTO tag (id, name, product_id) VALUES (477, 'hac', 20);
INSERT INTO tag (id, name, product_id) VALUES (478, 'nec', 286);
INSERT INTO tag (id, name, product_id) VALUES (479, 'aliquet', 292);
INSERT INTO tag (id, name, product_id) VALUES (480, 'integer', 8);
INSERT INTO tag (id, name, product_id) VALUES (481, 'et', 285);
INSERT INTO tag (id, name, product_id) VALUES (482, 'adipiscing', 27);
INSERT INTO tag (id, name, product_id) VALUES (483, 'ut', 235);
INSERT INTO tag (id, name, product_id) VALUES (484, 'dui', 15);
INSERT INTO tag (id, name, product_id) VALUES (485, 'in', 30);
INSERT INTO tag (id, name, product_id) VALUES (486, 'ante', 113);
INSERT INTO tag (id, name, product_id) VALUES (487, 'non', 265);
INSERT INTO tag (id, name, product_id) VALUES (488, 'erat', 129);
INSERT INTO tag (id, name, product_id) VALUES (489, 'lacus', 21);
INSERT INTO tag (id, name, product_id) VALUES (490, 'lobortis', 219);
INSERT INTO tag (id, name, product_id) VALUES (491, 'volutpat', 197);
INSERT INTO tag (id, name, product_id) VALUES (492, 'purus', 224);
INSERT INTO tag (id, name, product_id) VALUES (493, 'nisl', 164);
INSERT INTO tag (id, name, product_id) VALUES (494, 'blandit', 205);
INSERT INTO tag (id, name, product_id) VALUES (495, 'lobortis', 99);
INSERT INTO tag (id, name, product_id) VALUES (496, 'ac', 237);
INSERT INTO tag (id, name, product_id) VALUES (497, 'id', 184);
INSERT INTO tag (id, name, product_id) VALUES (498, 'est', 274);
INSERT INTO tag (id, name, product_id) VALUES (499, 'in', 66);
INSERT INTO tag (id, name, product_id) VALUES (500, 'integer', 4);

SELECT
  c.name      AS category,
  count(p.id) AS product_amount
FROM product p
  INNER JOIN category c ON p.category_id = c.id
  INNER JOIN "user" u ON p.user_id = u.id
  INNER JOIN order_product op ON p.id = op.product_id
  INNER JOIN "order" o ON op.order_id = o.id
  INNER JOIN comment c2 ON o.id = c2.order_id
GROUP BY c.name, u.role_id
HAVING u.role_id IN (SELECT id
                     FROM role
                     WHERE name IN ('admin', 'user')) AND count(c2.id) > 5;

SELECT
  a.country,
  sum(p.price) AS total_price
FROM product p
  INNER JOIN "user" u ON p.user_id = u.id
  INNER JOIN address a ON u.id = a.user_id
GROUP BY a.country;

-- ДЗ --

-- Выбрать категории, кол-во продуктов, принадлежащих каждой из них,
-- и тэги, примененные к данным продуктам (по категориям).
-- Упорядочить по возрастанию кол-ва продуктов.
SELECT
  c.name                   AS category,
  count(p.id)              AS product_amount,
  (SELECT string_agg(t.name, ',')
   FROM tag t
     INNER JOIN product p ON t.product_id = p.id
     INNER JOIN category ca ON p.category_id = ca.id
   WHERE ca.name = c.name) AS tags
FROM category c
  INNER JOIN product p ON c.id = p.category_id
  INNER JOIN tag t ON p.id = t.product_id
GROUP BY c.name
ORDER BY product_amount;

-- Выбрать серийники, статусы и кол-во не удаленных комментариев тех заказов,
-- которые были осуществлены админом или модератором, а продукты - активны.
-- Упорядочить по убыванию кол-ва комментовю
SELECT
  o.serial_number AS serial_number,
  os.name         AS status,
  count(c.id)     AS comment_amount
FROM "order" o
  INNER JOIN order_status os ON o.order_status_id = os.id
  INNER JOIN comment c ON o.id = c.order_id
  INNER JOIN order_product op ON o.id = op.order_id
  INNER JOIN product p ON op.product_id = p.id
  INNER JOIN "user" u ON p.user_id = u.id
GROUP BY o.id, os.name, c.is_deleted, p.id, u.role_id
HAVING c.is_deleted = FALSE AND p.id IN (SELECT id
                                         FROM product
                                         WHERE active = TRUE) AND u.role_id IN (SELECT id
                                                                                FROM role
                                                                                WHERE name IN ('admin', 'moderator'))
ORDER BY comment_amount DESC;
