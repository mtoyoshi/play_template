package controllers

import play.api.libs.json._

import play.api._
import play.api.mvc._

object UserController extends Controller {

  def index = Action {
    Ok(views.html.index())
  }

  def update = Action { implicit request =>
    val json = request.body.asJson
    println(json)
    Ok("i found!" + " " + json)
  }

  def list = Action {
    val json: JsValue = Json.arr(
      Json.obj(
        "id" -> 1,
        "name" -> "tanaka",
        "age" -> 30,
        "org" -> Json.obj(
          "name" -> "開発部"
        )
      ),
      Json.obj(
        "id" -> 2,
        "name" -> "satou",
        "age" -> 40,
        "org" -> Json.obj(
          "name" -> "開発部"
        )
      ),
      Json.obj(
        "id" -> 3,
        "name" -> "suzuki",
        "age" -> 20,
        "org" -> Json.obj(
          "name" -> "営業部"
        )
      ),
      Json.obj(
        "id" -> 4,
        "name" -> "yamada",
        "age" -> 26,
        "org" -> Json.obj(
          "name" -> "総務部"
        )
      )
    )

    Ok(json)
  }

}
