CREATE TABLE IF NOT EXISTS BEERS (
  id                     VARCHAR(60)  DEFAULT RANDOM_UUID() PRIMARY KEY,
  name                   VARCHAR      NOT NULL
);
