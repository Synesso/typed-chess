package net.badgerhunt.typedchess

import org.specs2.mutable._

class NewGameSpecification extends Specification {

  "The NewGame" should {
    "Have all pieces in the correct position" in {
      NewGame.pieces must contain(
        WhiteRook at 'a1,
        WhiteKnight at 'b1,
        WhiteBishop at 'c1,
        WhiteQueen at 'd1,
        WhiteKing at 'e1,
        WhiteBishop at 'f1,
        WhiteKnight at 'g1,
        WhiteRook at 'h1,
        WhitePawn at 'a2,
        WhitePawn at 'b2,
        WhitePawn at 'c2,
        WhitePawn at 'd2,
        WhitePawn at 'e2,
        WhitePawn at 'f2,
        WhitePawn at 'g2,
        WhitePawn at 'h2,
        BlackPawn at 'a7,
        BlackPawn at 'b7,
        BlackPawn at 'c7,
        BlackPawn at 'd7,
        BlackPawn at 'e7,
        BlackPawn at 'f7,
        BlackPawn at 'g7,
        BlackPawn at 'h7,
        BlackRook at 'a8,
        BlackKnight at 'b8,
        BlackBishop at 'c8,
        BlackQueen at 'd8,
        BlackKing at 'e8,
        BlackBishop at 'f8,
        BlackKnight at 'g8,
        BlackRook at 'h8
      ).exactly
    }
  }

}