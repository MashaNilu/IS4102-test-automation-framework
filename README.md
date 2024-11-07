# IS4102 Test Automation Framework

## Overview

The **IS4102 Test Automation Framework** is a robust, Java-based framework utilizing Selenium WebDriver for automated testing of web applications. Built with scalability and ease of maintenance in mind, this framework supports cross-browser testing, modular test design, and comprehensive reporting.

## Key Features

- **Cross-Browser Testing**: Compatibility with major browsers using Selenium WebDriver.
- **Data-Driven Testing**: Enables parameterized tests with flexible data sources.
- **Modular & Scalable**: Built for easy expansion and maintenance.
- **Detailed Test Reports**: Generates in-depth reports for test analysis.

## Prerequisites

- **Java JDK** (version 8 or later)
- **Maven** (for dependency management)
- **Selenium WebDriver** (installed and configured for target browsers)

## Installation

1. Clone this repository:
   ```bash
   git clone https://github.com/MashaNilu/IS4102-test-automation-framework.git
2. Navigate to the project directory:
   cd IS4102-test-automation-framework
3. Install dependencies:
   mvn install

## Configuration

1. Set browser preferences and environment configurations in the src/test/resources/config.properties file.
2. Update WebDriver paths and other specific settings as needed.

## Running Tests

To run tests, use the following Maven command:

mvn test

## Project Structure

- src/main/java: Contains core framework modules and utility classes.
- src/test/java: Contains all test case definitions.
- src/test/resources: Stores configuration files and test data files.
- target: Holds test reports and compiled files after test execution.

## Writing Tests

1. Create new test classes in src/test/java.
2. Follow the framework's structure for test naming and organization.
3. Use data-driven principles if needed, placing test data in src/test/resources.

## Reporting

Upon running tests, reports are generated in the target directory. These reports include:
- Test Results: A summary of passed and failed tests.
- Detailed Logs: In-depth logs for each test case execution.
- Screenshots: Automatically captured for failed tests, if configured.
