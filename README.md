# Application: java-ee-game

### ===== Start Gradle Game Application =====
* `gradle bootRun` - Start application from command line

### ===== Create Jar File =====
* `gradle clean` - Clean the project.
* `gradle bootJar` - The Jar is created under the `java-ee-game/build/libs/` folder.

### ===== Run Jar file =====
* `java -jar build/libs/java-ee-game-0.0.1-SNAPSHOT.jar` - Clean the project.

### ===== Flyway MySql migrations =====
Spring boot start migrations automatically when we start App, but sometime we need to fix something, you can use the following commands for it:
* `gradle flywayMigrate` - Migrates the database
* `gradle flywayClean` - Drops all objects in the configured schemas
* `gradle flywayInfo` - Prints the details and status information about all the migrations
* `gradle flywayValidate` - Validates the applied migrations against the ones available on the classpath
* `gradle flywayBaseline` - Baselines an existing database, excluding all migrations up to and including baselineVersion
* `gradle flywayRepair` - Repairs the schema history table
