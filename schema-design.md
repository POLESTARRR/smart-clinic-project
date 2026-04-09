# MySQL Database Schema Design

### 1. Doctor Table
* `doctor_id` (INT, Primary Key, Auto-increment)
* `name` (VARCHAR)
* `speciality` (VARCHAR)
* `email` (VARCHAR, Unique)

### 2. Patient Table
* `patient_id` (INT, Primary Key, Auto-increment)
* `name` (VARCHAR)
* `email` (VARCHAR, Unique)
* `phone_number` (VARCHAR)

### 3. Appointment Table
* `appointment_id` (INT, Primary Key, Auto-increment)
* `doctor_id` (INT, Foreign Key referencing Doctor)
* `patient_id` (INT, Foreign Key referencing Patient)
* `appointment_time` (DATETIME)
* `status` (VARCHAR)

### 4. Prescription Table
* `prescription_id` (INT, Primary Key, Auto-increment)
* `appointment_id` (INT, Foreign Key referencing Appointment)
* `medication_details` (TEXT)
