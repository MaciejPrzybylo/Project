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
-- Table `projectdb`.`list`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `projectdb`.`list` (
  `l_id` INT(11) NOT NULL AUTO_INCREMENT,
  `list_name` VARCHAR(150) NOT NULL,
  `u_id` INT(11) NOT NULL,
  PRIMARY KEY (`l_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `projectdb`.`task`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `projectdb`.`task` (
  `t_id` INT(11) NOT NULL AUTO_INCREMENT,
  `priority` INT(11) NULL DEFAULT NULL,
  `desc` VARCHAR(2000) NOT NULL,
  `status` TINYINT(1) NOT NULL,
  `list_id` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`t_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `projectdb`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `projectdb`.`user` (
  `u_id` INT(11) NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(100) NOT NULL,
  `pass` VARCHAR(45) NOT NULL,
  `email` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`u_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
