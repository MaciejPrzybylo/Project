-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema projectdb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema projectdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `projectdb` DEFAULT CHARACTER SET latin1 ;
USE `projectdb` ;

-- -----------------------------------------------------
-- Table `projectdb`.`user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `projectdb`.`user` ;

CREATE TABLE IF NOT EXISTS `projectdb`.`user` (
  `u_id` INT(11) NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(100) NOT NULL,
  `pass` VARCHAR(45) NOT NULL,
  `email` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`u_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `projectdb`.`list`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `projectdb`.`list` ;

CREATE TABLE IF NOT EXISTS `projectdb`.`list` (
  `l_id` INT(11) NOT NULL AUTO_INCREMENT,
  `list_name` VARCHAR(150) NOT NULL,
  `u_id` INT(11) NOT NULL,
  PRIMARY KEY (`l_id`),
  INDEX `u_id` (`u_id` ASC),
  CONSTRAINT `list_ibfk_1`
    FOREIGN KEY (`u_id`)
    REFERENCES `projectdb`.`user` (`u_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `projectdb`.`task`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `projectdb`.`task` ;

CREATE TABLE IF NOT EXISTS `projectdb`.`task` (
  `t_id` INT(11) NOT NULL AUTO_INCREMENT,
  `priority` INT(11) NULL DEFAULT NULL,
  `desc` VARCHAR(2000) NOT NULL,
  `status` TINYINT(1) NOT NULL,
  `list_id` INT(11) NOT NULL,
  PRIMARY KEY (`t_id`),
  INDEX `list_id` (`list_id` ASC),
  CONSTRAINT `task_ibfk_1`
    FOREIGN KEY (`list_id`)
    REFERENCES `projectdb`.`list` (`l_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
