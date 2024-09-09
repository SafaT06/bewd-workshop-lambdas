package nl.han.bewd.lambdas.reis;

public class JetVervoerStrategy implements VervoerStrategy {
	@Override
	public int berekenReistijd(boolean isReisTijdensSpits) {
		return isReisTijdensSpits ? 10 : 5;
	}
}
