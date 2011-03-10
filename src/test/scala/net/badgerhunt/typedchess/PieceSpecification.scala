package net.badgerhunt.typedchess

import org.specs2.mutable._
import org.specs2.ScalaCheck
import org.scalacheck.{Prop, Gen}

import Position._


class PieceSpecification extends Specification with ScalaCheck {

/*
  val positionAndPieceGenerator = for {
    position <- Gen.oneOf(Position.values.toSeq)
    team <- Gen.oneOf(Black, White)
    role <- Gen.oneOf(Pawn, Rook, Knight, Bishop, Queen, King)
  } yield (position, UnplacedPiece(team, role))

  "Every piece" should {
    "be positionable" ! Prop.forAll(positionAndPieceGenerator) {case (position, piece) =>
      (piece at position).position must_== position
    }
  }
*/
}