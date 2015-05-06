package diff;

import java.util.Collection;

import org.raml.model.Action;

public class ActionParamDiff extends ActionDiff {

  Collection<String> parameters;

  public ActionParamDiff(DiffType diffType, Action action, Collection<String> parameters) {
    super(diffType, action);
    this.parameters = parameters;
  }

}
