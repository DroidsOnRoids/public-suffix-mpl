plugins {
    `maven-publish`
    signing
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {

            groupId = "pl.droidsonroids.gradle"
            artifactId = "publicsuffix"
            version = "1.0.0"

            pom {
                name.set("Public Suffix List")
                description.set("A \"public suffix\" is one under which Internet users can (or historically could) directly register names")
                url.set("https://publicsuffix.org/")
                issueManagement {
                    system.set("GitHub Issues")
                    url.set("https://github.com/DroidsOnRoids/public-suffix-mpl")
                }
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

signing {
    sign(publishing.publications["mavenJava"])
}

tasks.withType(GenerateMavenPom::class) {
    destination = File(destination.parentFile, "publicsuffix.pom")
}
