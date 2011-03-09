package net.badgerhunt.typedchess

sealed trait Team

case object Black extends Team
case object White extends Team