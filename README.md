# 🧪 TestNG + Maven Quick Start

This is a minimal **TestNG + Maven** project with **GitHub Actions CI** integration.

---

## 🚀 Quick Setup

### 1. Clone Repo
git clone https://github.com/YOUR_USERNAME/testng-maven-repo.git
cd testng-maven-repo

2. Install Requirements
JDK 11+
Maven 3+


3.Verify:
java -version
mvn -v


▶️ Run Tests
From IntelliJ
Right-click SimpleTest.java → Run 'SimpleTest'

Reports generated in:
test-output/index.html

From Maven
mvn clean test
Reports generated in:
test-output/index.html (TestNG native HTML report)
target/surefire-reports/ (Maven test reports)


Optional HTML site:
mvn surefire-report:report
open target/site/surefire-report.html


🤖 CI/CD with GitHub Actions
The workflow in .github/workflows/maven.yml runs automatically on every push/PR.
It:
Sets up JDK 11
Runs mvn test
Uploads test-output and surefire-reports as build artifacts

Build Status
![Java CI](https://github.com/YOUR_USERNAME/testng-maven-repo/actions/workflows/maven.yml/badge.svg
