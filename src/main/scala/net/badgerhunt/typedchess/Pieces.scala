package net.badgerhunt.typedchess

sealed trait Piece

trait UnplayablePiece extends Piece
trait PlayablePiece extends Piece

case class UnplacedPiece(team: Team, role: Role) extends UnplayablePiece {
  def at(pos: Position.Value) = PlacedPiece(team = this.team, role = this.role, position = pos)
}

case class PlacedPiece(team: Team, role: Role, position: Position.Value) extends PlayablePiece

case class TakenPiece(team: Team, role: Role) extends UnplayablePiece

