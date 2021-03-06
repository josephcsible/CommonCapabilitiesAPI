package org.cyclops.commoncapabilities.api.capability.recipehandler;

import java.util.List;
import java.util.function.Predicate;

/**
 * An ingredient of a certain component type inside a recipe.
 *
 * An ingredient acts as a predicate, and can test instances.
 * It can also list possible instances that match with the predicate.
 *
 * Implementing classes SHOULD correctly implement the equals method.
 *
 * @param <T> The instance type.
 * @param <R> The recipe target type, may be Void.
 * @author rubensworks
 */
public interface IRecipeIngredient<T, R> extends Predicate<T> {

    /**
     * @return The recipe component type.
     */
    public RecipeComponent<T, R> getComponent();

    /**
     * @return Possible instances that match with the predicate.
     *         This collection is not necessarily exhaustive.
     */
    public List<T> getMatchingInstances();

}
