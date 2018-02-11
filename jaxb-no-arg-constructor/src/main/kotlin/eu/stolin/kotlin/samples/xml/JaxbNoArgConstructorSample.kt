package eu.stolin.kotlin.samples.xml

import java.io.ByteArrayInputStream
import javax.xml.bind.JAXBContext



object JaxbNoArgConstructorSample {

    @JvmStatic
    fun main(args: Array<String>) {

        val xml = """
            |<data>
            |   <a>data</a>
            |   <b>12345</b>
            |</data>""".trimMargin()
        val inputStream = ByteArrayInputStream(xml.toByteArray())

        val jaxbContext = JAXBContext.newInstance(Data::class.java)

        val jaxbUnmarshaller = jaxbContext.createUnmarshaller()
        val customer = jaxbUnmarshaller.unmarshal(inputStream) as Data
        System.out.println(customer)
    }
}