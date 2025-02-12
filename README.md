# Hotel Management System

## Overview
The Hotel Management System is a Java-based application developed by three developers. It provides essential features for managing hotel bookings, room availability, and customer information. The system is designed for ease of use and future scalability.

---

## Features

### Admin Features:
- Add, update, and delete hotel rooms.
- View and manage bookings.
- Generate reports.
- Manage room availability.

### Customer Features:
- View available rooms based on dates, type, and price.
- Make a booking (without payment processing).
- View booking history.
- Cancel bookings.

### Room Management:
- Different types of rooms (e.g., single, double, suite).
- Set room availability (available or booked).

### Booking Process:
- Customers can view available rooms based on their dates and preferences.
- Customers can make a booking by selecting a room.
- Ability to check-in/check-out (without payment processing).

### Customer Information:
- Track customer information (name, contact details).

### Search & Filtering:
- Search rooms by check-in/check-out dates, room type, or price.

### Status Tracking:
- Track room status (available, booked, under maintenance).

### Optional Features:
- Email confirmations for bookings.
- Booking reminders.

---

## System Requirements

### Functional Requirements:
- Support multiple users.
- Authentication for registered users to make bookings.
- Basic user management with usernames and passwords.
- User-friendly interface for both admins and customers.
- Easily extendable for additional features like payment processing and detailed reports.

### Technical Requirements:
- **Programming Language:** Java
- **GUI Framework:** JavaFX or Swing
- **Database:** Relational database (MySQL)
- **Java Version:** 8 or higher
- **Development Tools:**
  - IntelliJ IDEA, Eclipse, or NetBeans
  - Maven or Gradle for dependency management
  - Git for version control

---

## Database Schema

### Customers Table:
- `customer_id` (Primary Key)
- `name`
- `email`
- `phone_number`

### Rooms Table:
- `room_id` (Primary Key)
- `room_type` (e.g., single, double, suite)
- `price`
- `availability_status` (available, booked, under maintenance)

### Bookings Table:
- `booking_id` (Primary Key)
- `customer_id` (Foreign Key to Customers)
- `room_id` (Foreign Key to Rooms)
- `check_in_date`
- `check_out_date`
- `status` (confirmed, canceled, completed)

---

## User Roles & Responsibilities

### Admin:
- Adds available rooms to the system (e.g., 10 single rooms, 5 double rooms, etc.).
- Manages bookings and room availability.
- Generates reports and updates booking statuses.
- Marks guests as checked-in and checked-out.

### Customer:
- Searches for available rooms based on check-in and check-out dates.
- Makes a booking and confirms it.
- Views and manages their booking history.
- Cancels their booking if needed.

---

## User Guide

### Customer Actions:
- Create an account (sign up with username/password).
- Log in and view booking history.
- Check room availability for specific dates.
- Cancel a booking if needed.

### Admin Actions:
- Add new rooms, modify room details, and set availability status.
- View all bookings and update their status (confirmed, canceled, completed).
- Generate reports and manage the overall hotel system.

---

## Future Enhancements
- Implement online payment processing.
- Add detailed financial reports.
- Integrate automated email and SMS notifications.
- Enhance security with role-based access control.

---

## Contributors
This system was developed by a team of three developers. Contributions and suggestions for improvements are always welcome!

## Contributors

- **AJ E CATLI           1** (Role - Backend Development & Database)
- **ARED ABELLERA        2** (Role - UI & Database)
- **ARAVHEIYL FELICISIMO 3** (Role - UI & Testing)

---

## License
This project is open-source and available for modification and distribution under the MIT License.





