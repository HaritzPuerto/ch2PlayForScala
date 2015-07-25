package models

/**
 * Created by haritz on 25/07/15.
 */

//Model class
case class Product(ean: Long, name: String, description: String)

//DAO with static data. In the future, it should access a DB.
object Product {

  //Note that it is a VAR and not a VAL
  var products = Set(
    Product(5010255079763L, "Paperclips Large",
      "Large Plain Pack of 1000"),
    Product(5018206244666L, "Giant Paperclips",
      "Giant Plain 51mm 100 pack"),
    Product(5018306332812L, "Paperclip Giant Plain",
      "Giant Plain Pack of 10000"),
    Product(5018306312913L, "No Tear Paper Clip",
      "No Tear Extra Large Pack of 1000"),
    Product(5018206244611L, "Zebra Paperclips",
      "Zebra Length 28mm Assorted 150 Pack")
  )

  //Function to retrieve all products
  def findAll = products.toList.sortBy(_.ean)

}
