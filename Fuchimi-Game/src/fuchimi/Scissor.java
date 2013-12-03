package fuchimi;


public class Scissor extends Hand{

	@Override
	public Boolean beats(Hand hand) {
		return hand.looseAgainst(this);
	}

	@Override
	protected Boolean looseAgainst(Rock rock) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	protected Boolean looseAgainst(Paper paper) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected Boolean looseAgainst(Scissor scissor) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString()
	{
		return "Scissor";
	}

}
