package engine.impl.finders;

import java.util.Set;

import org.raml.model.Action;

import engine.Finder;

public class FindActionsWithUpdatedQueryParameters extends AbstractFindActionsWithUpdatedParameters implements Finder {
  
  public Set<String> getParameterKeySet(Action action) {
    return action.getQueryParameters().keySet();
  }

  @Override
  public boolean equals(Object other) {
    boolean result = false;
    if (getClass().equals(other.getClass())) {
      result = true;
    }
    return result;
  }

}
