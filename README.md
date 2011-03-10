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