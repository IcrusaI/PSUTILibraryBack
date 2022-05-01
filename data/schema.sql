DROP TABLE IF EXISTS authors;

CREATE TABLE authors
(
    id   BIGINT AUTO_INCREMENT NOT NULL,
    name VARCHAR(255),
    CONSTRAINT pk_authors PRIMARY KEY (id)
);

DROP TABLE IF EXISTS books;

CREATE TABLE books
(
    id            BIGINT AUTO_INCREMENT NOT NULL,
    title         VARCHAR(255),
    author_id     BIGINT,
    faculty       VARCHAR(255),
    semester      INT,
    download_link VARCHAR(255),
    CONSTRAINT pk_books PRIMARY KEY (id)
);

ALTER TABLE books
    ADD CONSTRAINT FK_BOOKS_ON_AUTHOR FOREIGN KEY (author_id) REFERENCES authors (id);
