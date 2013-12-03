package fuchimi;


public abstract class Hand {
	
public abstract Boolean beats(Hand hand);

protected abstract Boolean looseAgainst(Rock rock);
protected abstract Boolean looseAgainst(Paper paper);
protected abstract Boolean looseAgainst(Scissor scissor);
}
