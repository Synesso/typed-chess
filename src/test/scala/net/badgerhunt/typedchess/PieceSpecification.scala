package net.badgerhunt.typedchess

import org.specs2.mutable._
import org.specs2.ScalaCheck
import Position._
import org.scalacheck.{Arbitrary, Gen}


class PieceSpecification extends Specification with ScalaCheck {

  val positionAndPieceGenerator = for {
    position <- Gen.oneOf(Position.values.toSeq)
    team <- Gen.oneOf(Black, White)
    role <- Gen.oneOf(Pawn, Rook, Knight, Bishop, Queen, King)
  } yield (position, UnplacedPiece(team, role))

  "Every piece" should {
    "be placeable" ! checkProp {
      implicit def arb = Arbitrary{positionAndPieceGenerator}
      asProperty{(positionAndPiece: (Position, UnplacedPiece)) =>
        val (position, unplacedPiece) = positionAndPiece
        val piece = unplacedPiece at position
        position.toString must haveSize(2)
        piece must haveClass[PlacedPiece]
        piece.position must_== position
      }
    }
  }
}