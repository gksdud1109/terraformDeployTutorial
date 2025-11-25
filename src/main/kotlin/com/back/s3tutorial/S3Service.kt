package com.back.s3tutorial

interface S3Service {
    fun getBucketNames(): List<String>
}