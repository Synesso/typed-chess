package net.badgerhunt.typedchess

sealed trait Game
trait WhiteToPlay extends Game
trait BlackToPlay extends Game

object NewGame extends WhiteToPlay {

  val pieces = {
    val backRow = List(Rook, Knight, Bishop, Queen, King, Bishop, Knight, Rook)
    val whiteBackRow = backRow.zip(Position.values.toList.filter(_.id % 8 == 0)).map(rp => PlacedPiece(White, rp._1, rp._2))
    val whitePawnRow = Position.values.toList.filter(_.id % 8 == 1).map(p => PlacedPiece(White, Pawn, p))
    val blackPawnRow = Position.values.toList.filter(_.id % 8 == 6).map(p => PlacedPiece(Black, Pawn, p))
    val blackBackRow = backRow.zip(Position.values.toList.filter(_.id % 8 == 7)).map(rp => PlacedPiece(Black, rp._1, rp._2))

    whiteBackRow ::: whitePawnRow ::: blackPawnRow ::: blackBackRow
  }

}