package com.domain.system.view

import com.twitter.finatra.View

/**
  * Created by hendisantika on 28/12/16.
  */
class ContentView(values: Map[String, String]) extends View {
  val template = "templates/content.mustache"

  def content: Map[String, String] = {
    values
  }

}