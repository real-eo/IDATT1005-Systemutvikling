# Help Me Help (HmH) Application

A JavaFX desktop application designed to help users donate to trustworthy organizations verified by Innsamlingskontrollen (IK).

## Course Information
- **Course:** IDATx1005 - System Development
- **Institution:** NTNU (Norwegian University of Science and Technology)
- **Academic Year:** 2026

## Project Description

The Help Me Help application provides a user-friendly platform for making donations to verified charitable organizations. The application ensures transparency and trust by integrating with Innsamlingskontrollen's verification system.

### Key Features
- Browse verified charitable organizations
- Make secure donations to organizations
- Track personal donation history
- Manage user profile and preferences
- Filter organizations by category and verification status

## Team Members

<!-- Add team member information here -->
- Team Member 1: [Name] - [Role]
- Team Member 2: [Name] - [Role]
- Team Member 3: [Name] - [Role]
- Team Member 4: [Name] - [Role]

## Project Structure

```
hmh-application/
├── pom.xml                          # Maven project configuration
├── README.md                        # Project documentation
├── .gitignore                       # Git ignore rules
└── src/
    ├── main/
    │   ├── java/
    │   │   └── no/ntnu/idatx1005/hmh/
    │   │       ├── HmHApp.java             # Main application class
    │   │       ├── model/                   # Data models
    │   │       │   ├── User.java
    │   │       │   ├── Organization.java
    │   │       │   ├── Donation.java
    │   │       │   └── Profile.java
    │   │       ├── view/                    # View layer (deprecated, see resources/fxml)
    │   │       ├── controller/              # JavaFX controllers
    │   │       │   ├── MainController.java
    │   │       │   ├── UserProfileController.java
    │   │       │   ├── OrganizationListController.java
    │   │       │   └── DonationController.java
    │   │       ├── dao/                     # Data Access Objects
    │   │       │   ├── DatabaseConnection.java
    │   │       │   ├── UserDAO.java
    │   │       │   ├── OrganizationDAO.java
    │   │       │   └── DonationDAO.java
    │   │       ├── service/                 # Business logic layer
    │   │       │   ├── UserService.java
    │   │       │   ├── OrganizationService.java
    │   │       │   ├── DonationService.java
    │   │       │   └── InnsamlingsKontrollenService.java
    │   │       └── util/                    # Utility classes
    │   │           ├── ValidationUtil.java
    │   │           └── DateUtil.java
    │   └── resources/
    │       ├── fxml/                        # FXML view files
    │       │   ├── MainView.fxml
    │       │   ├── UserProfileView.fxml
    │       │   ├── OrganizationListView.fxml
    │       │   └── DonationView.fxml
    │       ├── css/                         # Stylesheets
    │       │   └── styles.css
    │       ├── images/                      # Image assets
    │       └── database/                    # Database schemas
    │           └── schema.sql
    └── test/
        └── java/
            └── no/ntnu/idatx1005/hmh/       # Test classes
                ├── model/
                ├── service/
                └── dao/
```

## Architecture

The application follows the Model-View-Controller (MVC) architectural pattern:

- **Model:** Data entities (User, Organization, Donation, Profile)
- **View:** FXML files defining the user interface
- **Controller:** JavaFX controllers managing user interactions
- **DAO:** Database access layer for CRUD operations
- **Service:** Business logic layer between controllers and DAOs

## Technologies Used

- **Java 17:** Programming language
- **JavaFX 21:** UI framework
- **Maven:** Build and dependency management
- **SQLite:** Embedded database
- **JUnit 5:** Testing framework

## Prerequisites

- Java Development Kit (JDK) 17 or higher
- Maven 3.6 or higher
- JavaFX SDK 21 (automatically managed by Maven)

## Building the Project

### 1. Clone the repository

```bash
git clone <repository-url>
cd hmh-application
```

### 2. Build with Maven

```bash
mvn clean install
```

### 3. Run tests

```bash
mvn test
```

## Running the Application

### Using Maven

```bash
mvn javafx:run
```

### Using Java directly (after building)

```bash
java --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml -jar target/hmh-application-1.0.0-SNAPSHOT.jar
```

## Development Guidelines

### Code Quality Standards

- Follow Java naming conventions (camelCase for variables/methods, PascalCase for classes)
- Write JavaDoc comments for all public classes and methods
- Maintain high cohesion and low coupling
- Include meaningful comments for complex logic
- Ensure proper encapsulation (private fields, public getters/setters)

### Accessibility (WCAG 2.0 Principle 1: Perceivable)

The application follows WCAG 2.0 guidelines for perceivability:
- High contrast color schemes (minimum 4.5:1 ratio)
- Clear visual hierarchy with consistent font sizes
- Readable sans-serif fonts (Segoe UI, Helvetica Neue, Arial)
- Keyboard navigation support
- Focus indicators for interactive elements

### AI Tool Usage

All AI-assisted code must be documented with comments indicating:
- Which AI tool was used
- What functionality was generated
- Any modifications made to the generated code

Example:
```java
// Generated with GitHub Copilot: Basic validation logic
// Modified: Added custom email validation regex
```

## Database

The application uses SQLite for data persistence. The database schema is automatically initialized on first run from `src/main/resources/database/schema.sql`.

### Database Tables

- **users:** User account information
- **organizations:** Charitable organizations
- **donations:** Donation records
- **user_preferred_causes:** User preferences for causes

## Testing

Test classes are organized to mirror the main source structure:

- **Model tests:** Test entity classes (getters, setters, equals, hashCode)
- **Service tests:** Test business logic and validation
- **DAO tests:** Test database operations

Run all tests:
```bash
mvn test
```

Run specific test class:
```bash
mvn test -Dtest=UserTest
```

## Contributing

1. Create a feature branch from `main`
2. Follow the coding standards
3. Write tests for new functionality
4. Ensure all tests pass
5. Submit a pull request

## Sprints

This project is developed across three iterations:

- **Sprint 1:** Foundation and core MVC structure (Current)
- **Sprint 2:** Core functionalities implementation
- **Sprint 3:** Final features and polish

## License

This is an educational project for IDATx1005 course at NTNU.

## Contact

For questions or issues, please contact the development team through the course management system.

---

**Last Updated:** January 2026
**Version:** 1.0.0-SNAPSHOT
