plugins {
    `maven-publish`
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {

            groupId = "pl.droidsonroids"
            artifactId = "publicsuffix"
            version = "0.0.1"

            pom {
                name.set("The Public Suffix List")
                description.set("A \"public suffix\" is one under which Internet users can (or historically could) directly register names")
                url.set("https://publicsuffix.org/")
                licenses {
                    license {
                        name.set("MPL-2.0")
                        url.set("https://mozilla.org/MPL/2.0/")
                    }
                }
                developers {
                    developer {
                        name.set("Mozilla Foundation")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/publicsuffix/list.git")
                    developerConnection.set("scm:git:ssh://github.com/publicsuffix/list.git")
                    url.set("http://github.com/publicsuffix/list/")
                }
            }
        }
    }
}