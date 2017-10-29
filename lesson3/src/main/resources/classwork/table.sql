CREATE TABLE IF NOT EXISTS `course` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(45) NOT NULL,
  `first_Name` VARCHAR(45) NOT NULL,
  `second_Name` VARCHAR(45) NOT NULL,
  `patronymic` VARCHAR(45) NULL,
  `time` INT NOT NULL,
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  PRIMARY KEY (`id`))
  ENGINE = InnoDB;


INSERT INTO `course` (`id`,`title`,`first_Name`,`second_Name`,`patronymic`,`time`) VALUES (NULL,'coursera','Egor','Rodor','Egoryich',120);
INSERT INTO `course` (`id`,`title`,`first_Name`,`second_Name`,`patronymic`,`time`) VALUES (NULL,'exct','EEE','Jhg',NULL,130);
INSERT INTO `course` (`id`,`title`,`first_Name`,`second_Name`,`patronymic`,`time`) VALUES (NULL,'pos','Egor','Rodor','Egoryich',120);
INSERT INTO `course` (`id`,`title`,`first_Name`,`second_Name`,`patronymic`,`time`) VALUES (NULL,'God help','noEgor','Rodor','Egoryich',125);
INSERT INTO `course` (`id`,`title`,`first_Name`,`second_Name`,`patronymic`,`time`) VALUES (NULL,'OCST','Rod','Lysii','Promt',3500);
