INSERT INTO `user` (`username`,`password`,`role`,`enabled`)
VALUES ('admin',
        '$2a$12$BrCKYUHhzNwddhTObgKvO.gxvF0bL7cN3UTX8t/XyYjXgaDj95E8.',
        'ROLE_ADMIN', 1);

INSERT INTO student (name)
VALUES ('Lee Kar Weng');

INSERT INTO student (name)
VALUES ('Test 1');

INSERT INTO student (name)
VALUES ('Test 2');

INSERT INTO student (name)
VALUES ('Test 3');

ALTER TABLE department AUTO_INCREMENT = 1;
INSERT INTO department (name) VALUES
                                  ('Computer Science'),
                                  ('Applied Science'),
                                  ('Advanced Technology'),
                                  ('IT');
ALTER TABLE lecturer AUTO_INCREMENT = 1;
INSERT INTO lecturer (name,salary,department_id) VALUES
                                                     ('John Doe',5000,1),
                                                     ('Fatimah Alam',6000,2),
                                                     ('Yeti Dew',5000,3),
                                                     ('Maine Cambridgeshire',7000,4),
                                                     ('Vermont Jim',3400,1),
                                                     ('Goodman Will',9000,2),
                                                     ('Zack Mark',9000,3),
                                                     ('Cameroon Mooney',10000,4);
ALTER TABLE course AUTO_INCREMENT = 1;
INSERT INTO course (name,credits,department_id) VALUES
                                                    ('Problem Solving',2,1),
                                                    ('Internet Programming',2,2),
                                                    ('Theory of Computer Science',3,3),
                                                    ('Critical Thinking',4,4),
                                                    ('Economy',1,1),
                                                    ('Science',2,2),
                                                    ('Digital Logic',3,3),
                                                    ('Database',4,4);
ALTER TABLE schedule AUTO_INCREMENT = 1;
INSERT INTO schedule (course_id,lecturer_id,semester,`year`) VALUES
                                                                 (1,1,1,2025),
                                                                 (1,1,1,2024),
                                                                 (1,1,1,2023),
                                                                 (1,1,1,2022),
                                                                 (2,2,1,2025),
                                                                 (2,3,1,2024),
                                                                 (2,2,1,2023),
                                                                 (2,2,1,2022),
                                                                 (3,1,1,2025),
                                                                 (3,4,1,2024);
INSERT INTO schedule (course_id,lecturer_id,semester,`year`) VALUES
                                                                 (3,5,1,2023),
                                                                 (3,1,1,2022),
                                                                 (4,3,1,2025),
                                                                 (4,3,1,2024),
                                                                 (4,4,1,2023),
                                                                 (4,5,1,2022),
                                                                 (5,1,1,2025),
                                                                 (5,6,1,2024),
                                                                 (5,7,1,2023),
                                                                 (5,4,1,2022);
INSERT INTO schedule (course_id,lecturer_id,semester,`year`) VALUES
                                                                 (6,4,1,2025),
                                                                 (6,6,1,2024),
                                                                 (6,7,1,2023),
                                                                 (6,4,1,2022),
                                                                 (7,1,1,2025),
                                                                 (7,6,1,2024),
                                                                 (7,7,1,2023),
                                                                 (7,4,1,2022),
                                                                 (8,3,1,2025),
                                                                 (8,3,1,2024);
INSERT INTO schedule (course_id,lecturer_id,semester,`year`) VALUES
                                                                 (8,5,1,2023),
                                                                 (8,4,1,2022);