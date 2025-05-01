LinkedIn Automation Framework 📱🧪
This project is a Mobile Automation Testing Framework built for the official LinkedIn Android App using Appium. It automates key real-world user workflows like logging in, job searching, sending connection requests, and interacting with posts.

🚀 Features Automated
🔐 Login Page: Validates user authentication with credentials.

💼 Search Job: Automates job search functionality.

📌 Save Job: Verifies the save feature for searched jobs.

👤 Search User: Searches for other LinkedIn users.

➕ Send Connection Request: Sends connection requests to other users.

❤️ Like Post: Likes posts in the feed.

🚪 Logout Page: Automates the logout process.

🔁 Scroll Support: Scroll up/down using W3C Actions API for gesture simulation.

🧰 Tech Stack & Tools
Appium: For automating Android application testing.

Java: Core programming language for the framework.

TestNG: Testing framework for structuring test cases.

Log4j2: For comprehensive and structured logging.

Extent Reports: Rich HTML reporting for execution results.

Allure Reports: Advanced test reporting with annotations and screenshots.

Jenkins: CI/CD pipeline integration for automated test execution.

📷 Reporting & Debugging Enhancements
📸 Screenshot Capture: Captures screenshots at every test step for better traceability.

📊 Extent Report: Visually detailed reports with pass/fail status and embedded screenshots.

📈 Allure Report: Includes test descriptions, severity levels, and step-by-step breakdown.

🪵 Logging: Step-level logs using Log4j2 to assist with real-time debugging and test transparency.

🔄 CI/CD Integration
This framework is fully integrated with Jenkins, enabling:

Automated test execution on every build.

Report generation after each run.

Log monitoring and feedback on test results.

📁 Project Structure Overview
pages/ – Page Object Model classes for LinkedIn app screens.

tests/ – Test classes organized by LinkedIn feature (login, job search, etc.).

utils/ – Utility classes for actions like scrolling, screenshot capture, wait conditions.

reports/ – Output directory for Extent and Allure reports.

logs/ – Centralized log files using Log4j2.

🧪 Test Execution Strategy
Designed using the Page Object Model (POM) for maintainability.

Integrated explicit waits for stable UI interaction.

Modular and scalable structure to easily add new features.

