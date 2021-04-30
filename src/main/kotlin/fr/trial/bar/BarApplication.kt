package fr.trial.bar

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BarApplication

//@Table("MESSAGES")
//data class Message(@Id val id: String?, val text: String)

//interface MessageRepository : CrudRepository<Message, String> {
//
//    @Query("select * from messages")
//    fun findMessages(): List<Message>
//}

//@Service
//class MessageService(val db: MessageRepository) {
//
//    fun findMessages(): List<Message> = db.findMessages()
//
//    fun post(message: Message) {
//        db.save(message)
//    }
//}


//@RestController
//class MessageResource(val service: MessageService) {
//
//    @GetMapping
//    fun index(): List<Message> = service.findMessages()
//
//    @PostMapping
//    fun post(@RequestBody message: Message) {
//        service.post(message)
//    }
//
//}

fun main(args: Array<String>) {
    runApplication<BarApplication>(*args)
}
