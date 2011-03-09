package net.badgerhunt.typedchess

sealed trait Role

case object Pawn extends Role
case object Rook extends Role
case object Knight extends Role
case object Bishop extends Role
case object Queen extends Role
case object King extends Role