package eu.stolin.kotlin.samples.xml

import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlRootElement

@XmlRootElement
data class Data(

    @field:XmlElement
    val a: String,

    @field:XmlElement
    val b: Int
)