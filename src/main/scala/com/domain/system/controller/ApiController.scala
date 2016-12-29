package com.domain.system.controller

import com.twitter.finatra.Controller

/**
  * Created by hendisantika on 28/12/16.
  */
class ApiController extends Controller {

  get("/api") { request =>

    val content = Map(
      "id" -> "411",
      "title" -> "Pejalan kaki pejuang Islam dari Ciamis",
      "copy" -> "Para pejuang pembela kebenaran itu mulai berjalan dari Ciamis  menuju titik lapangan MONAS",
      "byline" -> "GNPF"
    )

    render.json(content).toFuture

  }

}
