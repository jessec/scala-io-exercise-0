package com.xebia
package exercise0

import akka.actor.{Actor, Props}
case object AskNameMessage
object EchoActor {
  //TODO define props and name for EchoActor here
  
    val props = Props(new EchoActor)
    val name = "echo-actor"
  
}

class EchoActor extends Actor {

  def receive = {
    
    case AskNameMessage => sender ! "Fred"
    //TODO reply with the same message you received. The ActorRef of the sender can be accesses via the sender() method:
    
    
  }
}
