INSERT INTO address(street, city, country, house_number, postal_code)
VALUES ('150th Ave NE', 'Redmond', 'USA', '4600', 'WA 98052');
INSERT INTO address(street, city, country, house_number, postal_code)
VALUES ('Jagiellońska', 'Warszawa', 'Polska', '74E', '03-301');
INSERT INTO address(street, city, country, house_number, postal_code)
VALUES ('Pacific Coast Hwy', 'El Segundo', 'CA 90245', '999 N', 'CA 90245');
INSERT INTO address(street, city, country, house_number, postal_code)
VALUES ('36th St.', 'Seattle', 'USA', 'Suite 200', 'WA 98103');
INSERT INTO company(name, address_id)
VALUES ('Nintendo', '1');
INSERT INTO company(name, address_id)
VALUES ('CD Projekt Red', '2');
INSERT INTO company(name, address_id)
VALUES ('SQUARE ENIX', '3');
INSERT INTO company(name, address_id)
VALUES ('Concerned Ape', '4');
INSERT INTO company_type(company_id, type)
VALUES ('1','DEVELOPER');
INSERT INTO company_type(company_id, type)
VALUES ('1','PUBLISHER');
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
INSERT INTO series(title)
VALUES ('The Legend of Zelda');
INSERT INTO series(title)
VALUES ('The Witcher');
INSERT INTO series(title)
VALUES ('Final Fantasy');
INSERT INTO game (title, release_date, price, currency, developer_id, publisher_id, platform, series_id)
VALUES ('The Legend of Zelda: Breath of the Wild', '2017-03-03', '50.00', 'USD', '1', '1', 'NINTENDO_SWITCH','1');
INSERT INTO game (title, release_date, price, currency, developer_id, publisher_id, platform, series_id)
VALUES ('The Legend of Zelda: Breath of the Wild', '2017-03-03', '50.00', 'USD', '1', '1', 'WII_U', '1');
INSERT INTO game (title, release_date, price, currency, developer_id, publisher_id, platform, series_id)
VALUES ('The Witcher 3: Wild Hunt', '2015-10-09', '40.00', 'USD', '2', '2', 'PC', '2');
INSERT INTO game (title, release_date, price, currency, developer_id, publisher_id, platform, series_id)
VALUES ('The Witcher 3: Wild Hunt', '2015-10-09', '40.00', 'USD', '2', '2', 'XBOX', '2');
INSERT INTO game (title, release_date, price, currency, developer_id, publisher_id, platform, series_id)
VALUES ('The Witcher 3: Wild Hunt', '2019-10-15', '40.00', 'USD', '2', '2', 'NINTENDO_SWITCH', '2');
INSERT INTO game (title, release_date, price, currency, developer_id, publisher_id, platform, series_id)
VALUES ('The Witcher 2: Assassins of Kings', '2011-05-17', '30.00', 'USD', '2', '2', 'PC', '2');
INSERT INTO game ( title, release_date, price, currency, developer_id, publisher_id, platform, series_id)
VALUES ('Final Fantasy VII', '1997-01-31', '15.00', 'USD', '3', '3', 'PC', '3');
INSERT INTO game (title, release_date, price, currency, developer_id, publisher_id, platform)
VALUES ('Stardew Valley', '2016-02-26', '15.00', 'USD', '4', '4', 'PC');
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