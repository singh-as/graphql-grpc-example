DROP TABLE IF EXISTS cost;

CREATE TABLE cost (
  id INTEGER        NOT NULL AUTO_INCREMENT,
  code              VARCHAR(10) NOT NULL,
  empl_covrg_rate   DECIMAL(10, 2),
  emplr_covrg_rate  DECIMAL(10, 2)
);