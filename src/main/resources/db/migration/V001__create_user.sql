CREATE TABLE `user` (
  `user_id` INT NOT NULL AUTO_INCREMENT,
  `active` INT DEFAULT NULL,
  `email` VARCHAR(255) NOT NULL,
  `last_name` VARCHAR(255) NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`user_id`)
);
