package org.davidcampos.k8sjenkinsexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class K8sJenkinsExampleApplication

fun main(args: Array<String>) {
	if (true) throw Exception("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEException")
	runApplication<K8sJenkinsExampleApplication>(*args)
}
