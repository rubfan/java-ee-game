CREATE TABLE `role` (
  `role_id` INT NOT NULL AUTO_INCREMENT,
  `role` VARCHAR(255) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
);

CREATE TABLE `user_role` (
  `user_id` INT NOT NULL,
  `role_id` INT NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`)#,
#  KEY `FK_role_id` (`role_id`),
#  CONSTRAINT `FK_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
#  CONSTRAINT `FK_role_id` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`)
);