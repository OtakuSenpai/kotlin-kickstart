# kotlin-kickstart
Trying to be the simplist possible kotlin project with building and testing.

This is my attempt to illustrate best practices witha simple application.  This is not quite a template, as it will have some functioning code in it.  The main goals of this is: 

- Learning the languages and best practices around testing and deployment.
- Setting up as much as i could without an IDE to get a deeper learning of the inner workings of initializing a project and dependency management.
- Possibly using this as the canary in the coalmine for deployment methods.

# How I created this project
I added `.gitignore` information from [gitignore.io](https://www.gitignore.io/) for a `gradle` and `java` project.

I created a gradle project via the command line

```shell
gradle init --type java-library
```

I cleared out all the java files and renamed all the `java` code directories to `kotlin`

I worked through this by following the pluralsight course [here](https://app.pluralsight.com/library/courses/kotlin-getting-started/) by Kevin Jones. 

# Running
This is just a java library inside so the only thing that can be run are the tests, which you can do by just running:
```shell
gradle check
```

# Notable dependencies used
- `Spek` - Specification Framework - http://spekframework.org/
- `Kluent` - Fluent assertion library - https://markusamshove.github.io/Kluent/
- `Mockito-Kotlin` - moking library https://github.com/nhaarman/mockito-kotlin
- `Ktlint` - linter https://ktlint.github.io/
