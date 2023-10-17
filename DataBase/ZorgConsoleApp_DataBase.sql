-- Gebruik de database ZorgAPP
USE ZorgConsoleApp;
GO

-- Maak de tabel Patient aan
CREATE TABLE Patient (
    PatientID INT IDENTITY(1,1) PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    DateOfBirth DATE,
    PatientHeight DECIMAL,
    PatienWeight DECIMAL
);
GO

-- Maak de tabel User aan
CREATE TABLE Users (
    UserID INT IDENTITY(1,1) PRIMARY KEY,
    UserName VARCHAR(50),
    UserType VARCHAR(20)
);
GO

CREATE TABLE Roles (
    role_id INT IDENTITY(1,1) PRIMARY KEY,
    role_name VARCHAR(50) NOT NULL
);

CREATE TABLE User_Role (
    user_role_id INT IDENTITY(1,1) PRIMARY KEY,
    UserID INT,
    role_id INT,
    FOREIGN KEY (UserID) REFERENCES Users(UserID),
    FOREIGN KEY (role_id) REFERENCES Roles(role_id)
);

-- Maak de tabel Medications aan
CREATE TABLE Medications (
    MedicationID INT IDENTITY(1,1) PRIMARY KEY,
    MedicationName VARCHAR(100),
    Dosage VARCHAR(50),
    PatientID INT,
    FOREIGN KEY (PatientID) REFERENCES Patient(PatientID)
);
GO
