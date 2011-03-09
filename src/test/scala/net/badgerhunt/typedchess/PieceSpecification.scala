package net.badgerhunt.typedchess

import org.specs2.mutable._
//import org.specs2.ScalaCheck
//import org.scalacheck.{Prop, Gen}

import Position._


class PieceSpecification extends Specification { // with ScalaCheck {

  "An unplaced piece" should {
    val piece = UnplacedPiece(White, Queen)
    "be positionable" in {
      (piece at D4).position must_== D4
    }
  }


/*
  val positionAndPieceGenerator = for {
    position <- Gen.choose(1, Position.values.size)
    piece <- Gen.oneOf(BlackPawn, BlackRook, BlackQueen, BlackBishop, BlackKing, BlackKnight,
      WhiteKing, WhiteKnight, WhitePawn, WhiteQueen, WhiteRook, WhiteBishop)
  } yield (position, piece)

  "Every piece" should {
    "be positionable" ! Prop.forAll(positionAndPieceGenerator){case (position, piece) =>
      val symbol = Symbol("%s%d".format(position.file, position.rank))
      // just assert on an arbitrary piece at this time ...
      (WhiteBishop at symbol).position must beSome(position)
    }
  }
*/
}