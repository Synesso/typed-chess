package net.badgerhunt.typedchess

import org.specs2.mutable._
import Position._
import org.specs2.matcher.{Expectable, Matcher}

class NewGameSpecification extends Specification {

  "The NewGame" should {
    "Have all playable pieces in their correct positions" in {
      NewGame.pieces.values must contain(
        PlacedPiece(White, Rook, A1),
        PlacedPiece(White, Knight, B1),
        PlacedPiece(White, Bishop, C1),
        PlacedPiece(White, Queen, D1),
        PlacedPiece(White, King, E1),
        PlacedPiece(White, Bishop, F1),
        PlacedPiece(White, Knight, G1),
        PlacedPiece(White, Rook, H1),
        PlacedPiece(White, Pawn, A2),
        PlacedPiece(White, Pawn, B2),
        PlacedPiece(White, Pawn, C2),
        PlacedPiece(White, Pawn, D2),
        PlacedPiece(White, Pawn, E2),
        PlacedPiece(White, Pawn, F2),
        PlacedPiece(White, Pawn, G2),
        PlacedPiece(White, Pawn, H2),
        PlacedPiece(Black, Pawn, A7),
        PlacedPiece(Black, Pawn, B7),
        PlacedPiece(Black, Pawn, C7),
        PlacedPiece(Black, Pawn, D7),
        PlacedPiece(Black, Pawn, E7),
        PlacedPiece(Black, Pawn, F7),
        PlacedPiece(Black, Pawn, G7),
        PlacedPiece(Black, Pawn, H7),
        PlacedPiece(Black, Rook, A8),
        PlacedPiece(Black, Knight, B8),
        PlacedPiece(Black, Bishop, C8),
        PlacedPiece(Black, Queen, D8),
        PlacedPiece(Black, King, E8),
        PlacedPiece(Black, Bishop, F8),
        PlacedPiece(Black, Knight, G8),
        PlacedPiece(Black, Rook, H8)
      ).only
    }

    "Allow White to play" in {
      val updatedGame = NewGame whiteMoves D2 to D4
      updatedGame pieceAt D2 must beNone
      updatedGame pieceAt D4 must beSome(PlacedPiece(White, Pawn, D4))
    }
  }
}