plugins {
    id("java")
}

group = "cola-demo-parent"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    maven(url = "https://maven.aliyun.com/nexus/content/groups/public/")
    maven(url = "https://repo.spring.io/milestone")
    maven(url = "https://repo.maven.apache.org/maven2/")
    mavenCentral()
}

val lombokVersion = "1.18.24"
val colaVersion = "4.3.1"
val springBootVersion = "2.7.2"
val mybatisStarterVersion = "2.2.2"

tasks.compileJava {
    sourceCompatibility = "16"
    targetCompatibility = "16"
    options.encoding = "UTF-8"
}

dependencies {
    implementation("org.projectlombok:lombok:$lombokVersion")
    implementation("org.springframework.boot:spring-boot-dependencies:$springBootVersion")
    implementation("org.mybatis.spring.boot:mybatis-spring-boot-starter:$mybatisStarterVersion")
    implementation("javax.el:javax.el-api:3.0.0")
    implementation("com.alibaba:fastjson:1.2.83")

    implementation(platform("com.alibaba.cola:cola-components-bom:$colaVersion"))

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}