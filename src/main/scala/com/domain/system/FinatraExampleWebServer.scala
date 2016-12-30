package com.domain.system

import com.domain.system.controller.{ApiController, ContentController}
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import com.twitter.finatra.FinatraServer

/**
  * Created by hendisantika on 28/12/16.
  */
object FinatraExampleWebServer extends FinatraServer {
  System.setProperty("com.twitter.finatra.config.port", ":9000")

  val mapper = new ObjectMapper()
  mapper.registerModule(DefaultScalaModule)

  register(new ApiController())
  register(new ContentController(mapper))
}
