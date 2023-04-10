CREATE TABLE Address
(
    id           int NOT NULL,
    street       nvarchar(50) NOT NULL,
    city         nvarchar(100) NOT NULL,
    country      nvarchar(100) NOT NULL,
    house_number nvarchar(20) NOT NULL,
    postal_code  nvarchar(10) NOT NULL,
    CONSTRAINT Address_pk PRIMARY KEY (id)
);
CREATE TABLE Company
(
    id         int NOT NULL,
    name       nvarchar(500) NOT NULL,
    address_id int NOT NULL,
    CONSTRAINT Company_pk PRIMARY KEY (id),
    FOREIGN KEY (address_id)
        REFERENCES Address (id)
);
CREATE TABLE Series
(
    id    int NOT NULL,
    title nvarchar(300) NOT NULL,
    CONSTRAINT Series_pk PRIMARY KEY (id)
);
CREATE TABLE Game
(
    id           int           NOT NULL,
    title        nvarchar(300) NOT NULL,
    release_date date          NOT NULL,
    price        numeric(6, 2) NOT NULL,
    currency     nvarchar(3) NOT NULL,
    developer_id int           NOT NULL,
    publisher_id int           NOT NULL,
    platform nvarchar(50) NOT NULL,
    series_id    int          NULL,
    CONSTRAINT Game_pk PRIMARY KEY (id),
    FOREIGN KEY (developer_id)
        REFERENCES Company (id),
    FOREIGN KEY (publisher_id)
        REFERENCES Company (id),
    FOREIGN KEY (series_id)
        REFERENCES Series (id)
);
CREATE TABLE Company_Type
(
    company_id int NOT NULL,
    type       nvarchar(50) NOT NULL,
    FOREIGN KEY (company_id)
        REFERENCES Company (id)
);
CREATE TABLE Game_Genre
(
    game_id int NOT NULL,
    genre   nvarchar(50) NOT NULL,
    FOREIGN KEY (game_id)
        REFERENCES Game (id)
);