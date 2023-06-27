# Public Suffix MPL

This repository contains only sources for generating POM file with metadata (like name, authors, license)
of [Public Suffix List](https://publicsuffix.org/).
It does **not** contain any public suffix data!

### Usage

Add the following dependency to the module where Gradle plugin which discovering licenses is applied.
Usually it is an application module (not top-level nor library).

<details>
  <summary>Groovy</summary>

  ```groovy
  dependencies {
    compileOnly "pl.droidsonroids.gradle:publicsuffix:1.0.0"
  }
  ```
</details>

<details open>
  <summary>Kotlin</summary>

  ```kotlin
  dependencies {
    compileOnly("pl.droidsonroids.gradle:publicsuffix:1.0.0")
  }
  ```
</details>

### Motivation
Public Suffix List itself is not a Maven library.
However, it is used by some Maven libraries eg. [okhttp](https://github.com/square/okhttp/issues/4569).

Artifact containing this POM can act as the metadata source for tools automatically discovering library licenses
like [About Libraries](https://github.com/mikepenz/AboutLibraries).

### Disclaimer

This repository is **not** affiliated with Public Suffix List nor Mozilla Foundation.
Only issues about files contained in this repository will be accepted.

See [publicsuffix/list](https://github.com/publicsuffix/list) for any issues about the list itself.

### License

Mozilla Public License Version 2.0
See [LICENSE](LICENSE)
