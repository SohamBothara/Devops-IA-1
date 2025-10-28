# 🧪 TestNG + Maven Project (DevOps Case Study)

This repository demonstrates how to use **TestNG** with **Maven** and **GitHub Actions CI**.  
It is part of a DevOps case study project showing how automated testing fits into modern pipelines.

---

## 🚀 Quick Start

1. Clone Repo
git clone https://github.com/YOUR_USERNAME/testng-maven-repo.git
cd testng-maven-repo




3. Run Tests-> From IntelliJ IDEA ->Right-click SimpleTest.java → Run 'SimpleTest'

Report generated at:
test-output/index.html


From Maven CLI
mvn clean test
Reports generated in:
test-output/index.html (TestNG native HTML report)
target/surefire-reports/ (Maven test reports)

Optional full HTML site:
mvn surefire-report:report
open target/site/surefire-report.html


⚡ Features
TestNG framework with annotations (@Test, @BeforeClass, etc.)
Sample tests with assertions and soft asserts
Suite configuration via testng.xml
Maven build & Surefire plugin integration
GitHub Actions workflow:
Runs tests automatically on push/PR
Uploads test-output and surefire-reports as artifacts

🤖 Continuous Integration (GitHub Actions)
Workflow: .github/workflows/maven.yml
It runs automatically on push/PR to main or dev:
Checks out repo
Sets up JDK 11
Runs mvn clean test
