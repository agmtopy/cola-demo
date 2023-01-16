/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    id("com.agmtopy.demo.java-conventions")
}

dependencies {
    implementation(project(":cola-demo-api"))
    implementation(project(":cola-demo-infrastructure"))
    implementation("com.alibaba.cola:cola-component-catchlog-starter:4.3.1")
    implementation("org.hibernate.validator:hibernate-validator:6.2.3.Final")
    implementation("javax.el:javax.el-api:3.0.0")
    implementation("org.glassfish:jakarta.el:3.0.4")
}

description = "cola-demo-configure"
