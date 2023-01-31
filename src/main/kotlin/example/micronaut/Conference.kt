package example.micronaut

import io.micronaut.serde.annotation.Serdeable;

// configura como serializavel ou não serializavel
@Serdeable // <1>
data class Conference(val name: String)
