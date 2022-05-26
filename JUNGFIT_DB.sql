-- DB 이름 : jungfit 
-- DB 생성
DROP DATABASE IF EXISTS jungfit;
CREATE DATABASE jungfit;
USE jungfit;

-- 테이블 정리
DROP TABLE IF EXISTS managers;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS video_reviews;
DROP TABLE IF EXISTS trainer_reviews;
DROP TABLE IF EXISTS videos;
DROP TABLE IF EXISTS trainers;
DROP TABLE IF EXISTS zzims;
DROP TABLE IF EXISTS followers;
DROP TABLE IF EXISTS messages;
DROP TABLE IF EXISTS comments;
DROP TABLE IF EXISTS promotions;

-- 테이블 생성
CREATE TABLE `managers` (
    `manager_id` VARCHAR(40) NOT NULL,
    `password` VARCHAR(400) NOT NULL,
    `name` VARCHAR(40) NOT NULL,
    `email` VARCHAR(40) NOT NULL,
    `office_num` VARCHAR(40) NOT NULL,
    `pos` VARCHAR(40) NOT NULL
)ENGINE=InnoDB;

CREATE TABLE `trainers` (
	`trainer_id` VARCHAR(40) NOT NULL PRIMARY KEY,
    `password` VARCHAR(400) NOT NULL,
	`name` VARCHAR(40) NOT NULL,
    `email` VARCHAR(40) NOT NULL,
    `info` text
)ENGINE=InnoDB;

CREATE TABLE `users` (
	`seq` INT(10) UNIQUE NOT NULL AUTO_INCREMENT,
    `user_id` VARCHAR(40) NOT NULL PRIMARY KEY,
    `password` VARCHAR(400) NOT NULL,
    `name` VARCHAR(40) NOT NULL,
    `email` VARCHAR(40) NOT NULL,
    `address` VARCHAR(200) NOT NULL,
    `bmi` FLOAT DEFAULT 0,
    `height` INT(10) DEFAULT 0,
    `weight` INT(10) DEFAULT 0,
    `age` INT(10) DEFAULT 0,
    `membership` TINYINT(1),
    `trainer_id` VARCHAR(40),
    `file_name` VARCHAR(50),
	`file_uri` VARCHAR(500),
    FOREIGN KEY (trainer_id) REFERENCES trainers (trainer_id)
)ENGINE=InnoDB;

CREATE TABLE `videos` (
	`video_id` VARCHAR(40) NOT NULL PRIMARY KEY,
    `title` VARCHAR(100) NOT NULL,
    `part` VARCHAR(10),
    `view_cnt` INT(10),
    `trainer_id` VARCHAR(40),
	FOREIGN KEY (trainer_id) REFERENCES trainers (trainer_id)
)ENGINE=InnoDB;

CREATE TABLE `video_reviews` (
	`review_id` INT(10) PRIMARY KEY NOT NULL AUTO_INCREMENT,
	`video_id` VARCHAR(40) NOT NULL,
	`user_id` varchar(40) NOT NULL,
	`title` VARCHAR(100) NOT NULL,
    `reg_date` DATETIME DEFAULT now(),
	`content` TEXT,
    `view_cnt` INT(10) DEFAULT 0,
    FOREIGN KEY (video_id) REFERENCES videos (video_id), 
    FOREIGN KEY (user_id) REFERENCES users (user_id)
)ENGINE=InnoDB;

CREATE TABLE `trainer_reviews` (
	`review_id` INT(10) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    `trainer_id` VARCHAR(40) NOT NULL,
    `user_id` VARCHAR (40) NOT NULL,
    `title` VARCHAR(200) NOT NULL,
    `reg_date` DATETIME DEFAULT now(),
    `content` text,
    `view_cnt` INT(10) DEFAULT 0,
    FOREIGN KEY (trainer_id) REFERENCES trainers (trainer_id),
	FOREIGN KEY (user_id) REFERENCES users (user_id)
)ENGINE=InnoDB;

-- CREATE TABLE `schedules`(
--	`user_id` VARCHAR(40) NOT NULL,
--    `trainer_id` VARCHAR(40) NOT NULL,
--    `meet_date` DATETIME,
--    FOREIGN KEY (trainer_id) REFERENCES trainers (trainer_id),
--	FOREIGN KEY (user_id) REFERENCES users (user_id)
-- )ENGINE=InnoDB;

-- CREATE TABLE `zzims` (
--	`user_id` VARCHAR(40) NOT NULL,
--  `video_id`  VARCHAR(40) NOT NULL,
--  FOREIGN KEY (user_id) REFERENCES users (user_id),
--    FOREIGN KEY (video_id) REFERENCES videos (video_id)
-- )ENGINE=InnoDB;

CREATE TABLE `followers` (
	`my_id` varchar(40) NOT NULL,
    `your_id`  VARCHAR(40) NOT NULL,
    FOREIGN KEY (my_id) REFERENCES users (user_id),
    FOREIGN KEY (your_id) REFERENCES users (user_id)
)ENGINE=InnoDB;

-- CREATE TABLE `promotions`(
--   `p_code` VARCHAR(40) NOT NULL
-- )ENGINE=InnoDB;

CREATE TABLE `messages` (
	`no` INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	`send_id` VARCHAR(40) NOT NULL,
    `receive_id` VARCHAR(40) NOT NULL,
    `message` text,
    `view` TINYINT(1),
	FOREIGN KEY (send_id) REFERENCES users (user_id),
	FOREIGN KEY (receive_id) REFERENCES users (user_id)
)ENGINE=InnoDB;






