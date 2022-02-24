DROP TABLE IF EXISTS document;

CREATE TABLE document (
  id INTEGER        NOT NULL AUTO_INCREMENT,
  title             VARCHAR(10) NOT NULL,
  description       VARCHAR(50),
  path              VARCHAR(80)
);