package eu.stolin.kotlin.samples.json

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule

object JacksonLoadJsonFileKotlinModule {

    @JvmStatic
    fun main(args: Array<String>) {
        val json = """
            |{
            |   "a": "some data",
            |   "b": 1234
            |}""".trimMargin()

        val mapper = ObjectMapper().registerKotlinModule()
        val result = mapper.readValue(json, Data::class.java)
        println(result)
    }
}