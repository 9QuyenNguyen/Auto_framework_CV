# Automation Framework
This project is an automation framework designed for web automationexercise testing. It is structured to support modular and scalable test automation using Java, TestNG, and Maven. The framework includes utilities for reporting, logging, and managing test data.

---

## Table of Contents
- [Overview](#overview)
- [Project Structure](#project-structure)
- [Class Hierarchy](#class-structure)
- [Key Features](#key-features)
- [Prerequisites](#prerequisites)
- [Setup](#installation--setup)
- [Test Execution Flow](#test-execution-flow)
- [Contributing](#contributing)

---

## Overview
A comprehensive **Java-based UI automation framework** built with **Selenium WebDriver**, **TestNG**, and **ExtentReports** for automated testing of web applications.

---

## Project Structure
```
├── pom.xml
├── extentReport/
│   └── HTMLReportVersion5.html
├── logs/
│   └── [Log files for debugging and tracking test execution]
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── web_automationexercise/
│   │   │       ├── commons/       [Base classes and constants]
│   │   │       ├── pages_Actions/ [Page action classes]
│   │   │       ├── pages_UI/      [Page UI locators]
│   │   │       └── utils/         [Utility classes]
│   │   └── resources/             [Resource files like JSON data]
│   ├── test/
│   │   ├── java/                  [Test classes]
│   │   └── resources/             [Test configuration files]
├── target/                        [Generated files and reports]
├── test-output/                   [TestNG output reports]
```

---

### Class Hierarchy

```
BaseTest (Setup/Teardown)
    └── Sign_up_test (Test Cases)

BasePage (Common element interactions)
    ├── Login_UI (Login page locators)
    ├── SignUp_UI (Sign-up page locators)
    └── DashBoard_UI (Dashboard page locators)

Base_Actions (WebDriver operations)
    ├── Login (Login page actions)
    ├── SignUp (Sign-up page actions)
    └── DashBoard (Dashboard page actions)
```

---

## Key Features

### 🏗️ **Page Object Model (POM) Architecture**
- Separates page locators (`pages_UI`) from page actions (`pages_Actions`)
- Improves maintainability and reduces code duplication

### 🔄 **Reusable Base Classes**
- `BaseTest`: Manages WebDriver initialization and browser management
- `BasePage`: Provides common methods for element interaction
- `Base_Actions`: Contains generic WebDriver operations

### 📊 **Comprehensive Reporting**
- ExtentReports integration for visually appealing test reports
- Log4j2 logging with detailed execution traces
- TestNG built-in reporting

### 📝 **Data-Driven Testing**
- JSON-based test data management (`User_data.json`)
- Easy to add new test datasets and scenarios

### 🌐 **Multi-Browser Support**
- Supports Chrome, Firefox, and other browsers
- Parameterized browser selection via TestNG

### ⚙️ **Configuration Management**
- Centralized configuration via `GlobalConstants.java`
- Customizable timeouts, base URLs, and settings

### 📋 **Detailed Logging**
- Log4j2 integration for console and file logging
- Test step logging within ExtentReports

---

## Prerequisites
- **Java**: JDK 21
- **Maven**: Installed and configured
- **Browser Drivers**: Ensure the required browser drivers (e.g., ChromeDriver) are available in the system PATH.

---

## Setup and Execution

### 1. Clone the Repository
```bash
git clone <repository-url>
```

### 2. Install Dependencies
```bash
mvn clean install
```

### 3. Run Tests
```bash
mvn clean test
```

### 4. View Reports
- **TestNG Reports**: `test-output/ExtentReport.html`

---

## Test Execution Flow

1. **Initialize Test Setup**:
   - `BaseTest` initializes the browser and loads the configuration.
   - Browser is launched based on the `BrowserList` enum.

2. **Navigate to Application**:
   - The URL is fetched from `GlobalConstants`.
   - The browser navigates to the specified URL.

3. **Perform Actions**:
   - Page-specific actions are executed using classes in `pages_Actions`.
   - Locators are fetched from `pages_UI`.

4. **Log Results**:
   - Test results are logged using `ExtentListener` and `ExtentManager`.

5. **Generate Reports**:
   - Reports are generated in the `test-output` directories.

6. **Tear Down**:
   - Browser is closed, and resources are cleaned up.

---

## Contributing
1. Fork the repository.
2. Create a feature branch.
3. Commit your changes.
4. Open a pull request.

---

## Contact
For any queries or issues, please contact me.