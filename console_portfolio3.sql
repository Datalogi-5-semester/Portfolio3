CREATE TABLE Student
(
    studentID INT,
    studentName TEXT,
    cityName    TEXT,
    PRIMARY KEY (studentID),
    FOREIGN KEY (cityName) REFERENCES City
);

INSERT INTO Student VALUES (1, 'Aisha Lincoln', 'Nykøbing F');
INSERT INTO Student VALUES (2, 'Anya Nielsen', 'Nykøbing F');
INSERT INTO Student VALUES (3, 'Alfred Jensen', 'Camas');
INSERT INTO Student VALUES (4, 'Berta Bertelsen', 'Billund');
INSERT INTO Student VALUES (5, 'Albert Antonsen', 'Sorø');
INSERT INTO Student VALUES (6, 'Eske Eriksen', 'Eskilstrup');
INSERT INTO Student VALUES (7, 'Olaf Olesen', 'Odense');
INSERT INTO Student VALUES (8, 'Salma Simonsen', 'Stockholm');
INSERT INTO Student VALUES (9, 'Theis Thomasen', 'Tølløse');
INSERT INTO Student VALUES (10, 'Janet Jensen', 'Jyllinge');


CREATE TABLE Grade
(
    studentID  INT,
    courseName TEXT,
    grade      INT,
    PRIMARY KEY (studentID, courseName),
    FOREIGN KEY (courseName) REFERENCES Course,
    FOREIGN KEY (studentID) REFERENCES Student
);

INSERT INTO Grade VALUES (1, 'SD 2019 autumn', 12);
INSERT INTO Grade VALUES (1, 'ES1 2029 autumn', 10);

INSERT INTO Grade VALUES (2, 'SD 2020 spring', NULL);
INSERT INTO Grade VALUES (2, 'ES1 2019 autumn', 12);

INSERT INTO Grade VALUES (3, 'SD 2019 autumn', 7);
INSERT INTO Grade VALUES (3, 'ES1 2019 autumn', 10);

INSERT INTO Grade VALUES (4, 'SD 2020 spring', NULL);
INSERT INTO Grade VALUES (4, 'ES1 2019 autumn', 2);

INSERT INTO Grade VALUES (5, 'SD 2019 autumn', 10);
INSERT INTO Grade VALUES (5, 'ES1 2019 autumn', 7);

INSERT INTO Grade VALUES (6, 'SD 2020 spring', NULL);
INSERT INTO Grade VALUES (6, 'ES1 2019 autumn', 10);

INSERT INTO Grade VALUES (7, 'SD 2019 autumn', 4);
INSERT INTO Grade VALUES (7, 'ES1 2019 autumn', 12);

INSERT INTO Grade VALUES (8, 'SD 2020 spring', NULL);
INSERT INTO Grade VALUES (8, 'ES1 2019 autumn', 12);

INSERT INTO Grade VALUES (9, 'SD 2019 autumn', 12);
INSERT INTO Grade VALUES (9, 'ES1 2019 autumn', 12);

INSERT INTO Grade VALUES (10, 'SD 2020 spring', NULL);
INSERT INTO Grade VALUES (10, 'ES1 2019 autumn', 7);


CREATE TABLE Course
(
    courseName TEXT,
    teacher    TEXT,
    PRIMARY KEY (courseName)
);

INSERT INTO Course VALUES ('SD 2019 autumn', 'Line');
INSERT INTO Course VALUES ('SD 2020 spring', 'Line');
INSERT INTO Course VALUES ('ES1 2019 autumn', 'Ebbe');


CREATE TABLE City
(
    cityName STRING,
    PRIMARY KEY (cityName)
);

INSERT INTO City VALUES ('Nykøbing F');
INSERT INTO City VALUES ('Camas');
INSERT INTO City VALUES ('Billund');
INSERT INTO City VALUES ('Sorø');
INSERT INTO City VALUES ('Eskilstrup');
INSERT INTO City VALUES ('Odense');
INSERT INTO City VALUES ('Stockholm');
INSERT INTO City VALUES ('Tølløse');
INSERT INTO City VALUES ('Jyllinge');
