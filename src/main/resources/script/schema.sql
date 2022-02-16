CREATE TABLE course
(
    id            INTEGER NOT NULL auto_increment,
    credits       INTEGER NOT NULL,
    name          VARCHAR(255) NOT NULL,
    department_id INTEGER NOT NULL,
    PRIMARY KEY (id)
)
    engine=innodb;

CREATE TABLE department
(
    id   INTEGER NOT NULL auto_increment,
    name VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
)
    engine=innodb;

CREATE TABLE lecturer
(
    id            INTEGER NOT NULL auto_increment,
    name          VARCHAR(255) NOT NULL,
    salary        INTEGER NOT NULL,
    department_id INTEGER NOT NULL,
    PRIMARY KEY (id)
)
    engine=innodb;

CREATE TABLE schedule
(
    id          INTEGER NOT NULL auto_increment,
    semester    INTEGER NOT NULL,
    year        INTEGER NOT NULL,
    course_id   INTEGER NOT NULL,
    lecturer_id INTEGER NOT NULL,
    PRIMARY KEY (id)
)
    engine=innodb;

CREATE TABLE student
(
    id   INTEGER NOT NULL auto_increment,
    name VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
)
    engine=innodb;

CREATE TABLE student_schedule
(
    id          INTEGER NOT NULL auto_increment,
    schedule_id INTEGER,
    student_id  INTEGER,
    PRIMARY KEY (id)
)
    engine=innodb;

CREATE TABLE user
(
    id       INTEGER NOT NULL auto_increment,
    enabled  BIT NOT NULL,
    password VARCHAR(255),
    role     VARCHAR(255),
    username VARCHAR(255),
    PRIMARY KEY (id)
)
    engine=innodb;

ALTER TABLE course
    ADD CONSTRAINT fki1btm7ma8n3gaj6afdno300wm FOREIGN KEY (department_id)
        REFERENCES department (id);

ALTER TABLE lecturer
    ADD CONSTRAINT fklhb1ml4s9e5g7t1mx3cxvq3nk FOREIGN KEY (department_id)
        REFERENCES department (id);

ALTER TABLE schedule
    ADD CONSTRAINT fk1psrumo7fgkd16p438etda0i6 FOREIGN KEY (course_id) REFERENCES
        course (id);

ALTER TABLE schedule
    ADD CONSTRAINT fkdo0os4mi50u1t4lbpyv050707 FOREIGN KEY (lecturer_id)
        REFERENCES lecturer (id);

ALTER TABLE student_schedule
    ADD CONSTRAINT fkflbrh0ee3ua9ubbpa4qlvwxxg FOREIGN KEY (schedule_id)
        REFERENCES schedule (id);

ALTER TABLE student_schedule
    ADD CONSTRAINT fkn4t161l2i6cg6l06f18uc4bqt FOREIGN KEY (student_id) REFERENCES
        student (id);