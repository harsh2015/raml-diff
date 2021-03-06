package diff;

import java.util.Collection;

import org.raml.model.Action;

public class TraitDiff extends ActionDiff {
	
	Collection<String> traits;

	public TraitDiff(DiffType diffType, Action action, Collection<String> traits) {
		super(diffType, action);
		this.traits = traits;
	}
	
	@Override
	  public String toString() {
	    return "Trait "+traits+" is " + this.getDiffType() + " in " + this.getAction();
	  }

}
