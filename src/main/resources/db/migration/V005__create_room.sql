CREATE TABLE `room` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(64) NOT NULL,
  `description` VARCHAR(128) NOT NULL,
  `account_1_id` INT,
  `account_2_id` INT,
  `start_game_time` DATETIME,
  PRIMARY KEY (`id`)
);