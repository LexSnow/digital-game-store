INSERT INTO address(id, street, city, country, house_number, postal_code)
VALUES ('1', '150th Ave NE', 'Redmond', 'USA', '4600', 'WA 98052');
INSERT INTO address(id, street, city, country, house_number, postal_code)
VALUES ('2', 'Jagiellońska', 'Warszawa', 'Polska', '74E', '03-301');
INSERT INTO address(id, street, city, country, house_number, postal_code)
VALUES ('3', 'Pacific Coast Hwy', 'El Segundo', 'CA 90245', '999 N', 'CA 90245');
INSERT INTO address(id, street, city, country, house_number, postal_code)
VALUES ('4', '36th St.', 'Seattle', 'USA', 'Suite 200', 'WA 98103');
INSERT INTO company(id, name, address_id)
VALUES ('1', 'Nintendo', '1');
INSERT INTO company(id, name, address_id)
VALUES ('2', 'CD Projekt Red', '2');
INSERT INTO company(id, name, address_id)
VALUES ('3', 'SQUARE ENIX', '3');
INSERT INTO company(id, name, address_id)
VALUES ('4', 'Concerned Ape', '4');
INSERT INTO company_type(company_id, type)
VALUES ('1', 'DEVELOPER');
INSERT INTO company_type(company_id, type)
VALUES ('1', 'PUBLISHER');
INSERT INTO company_type(company_id, type)
VALUES ('2', 'DEVELOPER');
INSERT INTO company_type(company_id, type)
VALUES ('2', 'PUBLISHER');
INSERT INTO company_type(company_id, type)
VALUES ('3', 'DEVELOPER');
INSERT INTO company_type(company_id, type)
VALUES ('3', 'PUBLISHER');
INSERT INTO company_type(company_id, type)
VALUES ('4', 'DEVELOPER');
INSERT INTO company_type(company_id, type)
VALUES ('4', 'PUBLISHER');
INSERT INTO series(id, title)
VALUES ('1', 'The Legend of Zelda');
INSERT INTO series(id, title)
VALUES ('2', 'The Witcher');
INSERT INTO series(id, title)
VALUES ('3', 'Final Fantasy');
INSERT INTO game (id, title, release_date, price, currency, developer_id, publisher_id, platform, series_id)
VALUES ('1', 'The Legend of Zelda: Breath of the Wild', '2017-03-03', '50.00', 'USD', '1', '1', 'NINTENDO_SWITCH','1');
INSERT INTO game (id, title, release_date, price, currency, developer_id, publisher_id, platform, series_id)
VALUES ('2', 'The Legend of Zelda: Breath of the Wild', '2017-03-03', '50.00', 'USD', '1', '1', 'WII_U', '1');
INSERT INTO game (id, title, release_date, price, currency, developer_id, publisher_id, platform, series_id)
VALUES ('3', 'The Witcher 3: Wild Hunt', '2015-10-09', '40.00', 'USD', '2', '2', 'PC', '2');
INSERT INTO game (id, title, release_date, price, currency, developer_id, publisher_id, platform, series_id)
VALUES ('4', 'The Witcher 3: Wild Hunt', '2015-10-09', '40.00', 'USD', '2', '2', 'XBOX', '2');
INSERT INTO game (id, title, release_date, price, currency, developer_id, publisher_id, platform, series_id)
VALUES ('5', 'The Witcher 3: Wild Hunt', '2019-10-15', '40.00', 'USD', '2', '2', 'NINTENDO_SWITCH', '2');
INSERT INTO game (id, title, release_date, price, currency, developer_id, publisher_id, platform, series_id)
VALUES ('6', 'The Witcher 2: Assassins of Kings', '2011-05-17', '30.00', 'USD', '2', '2', 'PC', '2');
INSERT INTO game (id, title, release_date, price, currency, developer_id, publisher_id, platform, series_id)
VALUES ('7', 'Final Fantasy VII', '1997-01-31', '15.00', 'USD', '3', '3', 'PC', '3');
INSERT INTO game (id, title, release_date, price, currency, developer_id, publisher_id, platform)
VALUES ('8', 'Stardew Valley', '2016-02-26', '15.00', 'USD', '4', '4', 'PC');
INSERT INTO game_genre(game_id, genre)
VALUES ('1', 'ADVENTURE');
INSERT INTO game_genre(game_id, genre)
VALUES ('1', 'ROLE_PLAYING');
INSERT INTO game_genre(game_id, genre)
VALUES ('2', 'ADVENTURE');
INSERT INTO game_genre(game_id, genre)
VALUES ('2', 'ROLE_PLAYING');
INSERT INTO game_genre(game_id, genre)
VALUES ('3', 'ADVENTURE');
INSERT INTO game_genre(game_id, genre)
VALUES ('3', 'ROLE_PLAYING');
INSERT INTO game_genre(game_id, genre)
VALUES ('4', 'ADVENTURE');
INSERT INTO game_genre(game_id, genre)
VALUES ('4', 'ROLE_PLAYING');
INSERT INTO game_genre(game_id, genre)
VALUES ('5', 'ADVENTURE');
INSERT INTO game_genre(game_id, genre)
VALUES ('5', 'ROLE_PLAYING');
INSERT INTO game_genre(game_id, genre)
VALUES ('6', 'ADVENTURE');
INSERT INTO game_genre(game_id, genre)
VALUES ('6', 'ROLE_PLAYING');
INSERT INTO game_genre(game_id, genre)
VALUES ('7', 'ADVENTURE');
INSERT INTO game_genre(game_id, genre)
VALUES ('8', 'SIMULATION');
INSERT INTO game_genre(game_id, genre)
VALUES ('8', 'INDIE');