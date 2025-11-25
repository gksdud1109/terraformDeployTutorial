package com.back.s3tutorial

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class S3TutorialApplication

fun main(args: Array<String>) {
    runApplication<S3TutorialApplication>(*args)
}
