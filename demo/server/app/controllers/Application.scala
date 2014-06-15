package controllers

import java.io._

import play.api.mvc._
import play.api.libs.{Files, Comet}
import play.api.libs.iteratee._
import play.api.libs.concurrent._
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.api._
import play.api.Play.current
import play.api.libs.json._

import scala.concurrent.duration._
import scala.concurrent.Future

object Application extends Controller {

  def meteo = Action {
    Ok(
      JsObject(
        "ville" -> JsString("nantes") ::
        "meteo" -> JsString("beau") :: Nil
      )
    )
  }
}
