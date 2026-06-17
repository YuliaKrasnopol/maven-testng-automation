# UI Test Automation — Selenium + Java + TestNG

Automated end-to-end UI tests for the [DemoQA](https://demoqa.com) practice
website, built as part of an intensive QA automation retraining program
(Tel-Ran College, Israel, 2024–2025).

## Stack

- Java 11
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- JavaScript Executor (for scroll, JS-click, ad removal)
- DataProvider (data-driven testing)

## Project structure

```
src/
├── main/java/com/demoqa/
│   ├── pages/          # Base page + shared actions (click, type, waits, JS helpers)
│   └── bookStore/       # Page objects for the Book Store section (Login, Profile)
└── test/java/com/demoqa/tests/
    ├── TestBase.java         # Driver setup/teardown, shared test config
    ├── LoginTests.java        # Authentication: positive flow
    ├── AlertsTests.java       # Browser alert handling (accept/dismiss/prompt)
    ├── iFrameTests.java       # iFrame switching and element interaction
    ├── NewWindowTest.java     # Multi-window / multi-tab handling
    ├── PracticFormTest.java   # Data-driven form submission (DataProvider)
    └── SearchBook.java        # Book search functionality
```

## What's covered

- **Login flow** — authentication with valid credentials, profile verification
- **Alerts** — accept, dismiss, and prompt-type browser alerts
- **iFrames** — locating and interacting with elements inside frames
- **Multi-window handling** — switching between browser windows/tabs
- **Practice form** — data-driven submission covering personal info, gender,
  date picker, multi-select subjects/hobbies, file upload, and state/city
  dependent dropdowns
- **Book search** — search functionality on the Book Store page

## Key techniques

- `PageFactory` with `@FindBy` annotations for element location
- Explicit waits via `WebDriverWait` + `ExpectedConditions`
- `JavascriptExecutor` for scrolling, JS-based clicks, and hiding ad overlays
  that block element interaction
- Method chaining across page objects for readable test flows
- `DataProvider` for running the same test against multiple data sets

## How to run

```bash
mvn test
```

## Notes

This is a learning/practice project built against a public test site
(DemoQA), intended to demonstrate automation fundamentals: POM structure,
explicit waits, JS fallback strategies, and data-driven testing.
