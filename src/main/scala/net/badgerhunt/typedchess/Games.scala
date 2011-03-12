package net.badgerhunt.typedchess

import Position._

sealed trait Game {
}

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
  }.foldLeft(Map.empty[Position, PlacedPiece])((map, piece) => map.updated(piece.position, piece))

  def whiteMoves(origin: Position) = new {
    def to(destination: Position) = {
      val maybePieceMoving = pieces.get(origin)
      val maybeMapWithPieceCopied = maybePieceMoving.map{
        movingPiece => pieces.updated(destination, movingPiece.copy(position = destination))
      }
      val maybeMapWithPieceMoved = maybeMapWithPieceCopied.map(_ - origin)
      val updatedPieces = maybeMapWithPieceMoved.getOrElse(pieces)
      new InProgressGame(updatedPieces)
    }
  }
}

class InProgressGame(pieces: Map[Position, PlacedPiece]) extends Game {
  def pieceAt(pos: Position) = pieces.get(pos)
}