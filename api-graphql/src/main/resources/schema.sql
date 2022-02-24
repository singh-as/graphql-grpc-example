DROP TABLE IF EXISTS plan;

CREATE TABLE plan (
  id INTEGER    NOT NULL AUTO_INCREMENT,
  code          VARCHAR(10) NOT NULL,
  name          VARCHAR(20) NOT NULL,
  benefit_type  VARCHAR(10) NOT NULL,
  carrier       VARCHAR(20) NOT NULL
);

DROP TABLE IF EXISTS plan_attribute;

CREATE TABLE plan_attribute (
  id INTEGER    NOT NULL AUTO_INCREMENT,
  plan_id       INTEGER NOT NULL,
  name          VARCHAR(50) NOT NULL,
  value         VARCHAR(100) NOT NULL
);