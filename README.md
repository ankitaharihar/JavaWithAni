# JavaWithAni

Maven-based Java workspace using the package layout below:

```text
JavaWithAni
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com/ani/app
│   │   │        ├── Main.java
│   │   │        ├── model
│   │   │        │     └── Student.java
│   │   │        ├── service
│   │   │        │     └── StudentService.java
│   │   │        └── util
│   │   │              └── Helper.java
│   │   └── resources
│   └── test
│       └── java
├── pom.xml
└── README.md
```

## Run

```powershell
mvn compile
java -cp target/classes com.ani.app.Main
```

If you want, I can also add a Maven exec configuration so the app runs with a single command.
