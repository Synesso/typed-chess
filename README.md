Tags

newgame-pieces-positioned-red:

NewGameSpecification assertion that a new game has all pieces in the correct position.
Test is "red" because there are no supporting classes and it can't compile. I've taken assumptions about how
the API is to look, knowing full well that it may be refactored along the way.

newgame-pieces-positioned-green:

We start to fix NewGameSpecification by adding the NewGame type and the PlacedPiece type.

newgame-pieces-positioned-refactor:

NewGameSpecification passes because we have effectively just copied the assertion into the newly created NewGame type.
Time to refactor?

newgame-allow-white-to-play-red:

A new game should allow white to start. Write the spec and let it fail.

newgame-allow-white-to-play-red2:

Added a few methods to allow compilation, but the spec fails as it is not implemented correctly. Plus there's some
definite need for refactoring in NewGame regarding how it models pieces on the board.

newgame-allow-white-to-play-green:

whiteMoves method has to return something other than a NewGame, as we have need to modify the pieces. In the process
it becomes evident that pieces should become a Map[Position, Piece]



