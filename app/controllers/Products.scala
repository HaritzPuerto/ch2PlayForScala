package controllers

import models.Product
import play.api.mvc.{Action, Controller}
import play.api.i18n.MessagesApi

/**
 * Created by haritz on 25/07/15.
 */
class Products extends Controller {

  def list = Action { implicit request =>
    val products = Product.findAll
    Ok(views.html.products.list(products))
  }

}
