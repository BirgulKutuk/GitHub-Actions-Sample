package com.brgl.githubactionssample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GithubActionsSampleApplication

fun main(args: Array<String>) {
	runApplication<GithubActionsSampleApplication>(*args)
}
