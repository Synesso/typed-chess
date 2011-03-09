Tags

newgame-pieces-positioned-red:

NewGameSpecification assertion that a new game has all pieces in the correct position.
Test is "red" because there are no supporting classes and it can't compile. I've taken assumptions about how
the API is to look, knowing full well that it may be refactored along the way.


pieces-are-where-its-at-red:

We start to fix NewGameSpecification by adding the NewGame type and a pieces value, but still we need to create the
piece at behaviour. So we start a new specification to handle that.


newgame-pieces-positioned-green:

NewGameSpecification passes because we have effectively just copied the assertion into the newly created NewGame type.
Time to refactor?