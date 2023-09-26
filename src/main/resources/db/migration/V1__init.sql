CREATE TABLE IF NOT EXISTS `author` (
    `name`            VARCHAR(200) NOT NULL  PRIMARY KEY,
    `friendly_name`    VARCHAR(200)
    )
ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE IF NOT EXISTS `post` (
    `id`                  BIGINT(20)    NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `title`               VARCHAR(200)  NOT NULL,
    `author_id`           VARCHAR(200)  NOT NULL
    )
ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 collate = utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS `comment` (
    `id`                  BIGINT(20)    NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `content`             VARCHAR(200)  NOT NULL,
    `post_id`             BIGINT(20)
    )
ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 collate = utf8mb4_unicode_ci;


INSERT INTO `author` (name,friendly_name) VALUES ('Alex','Dumas');