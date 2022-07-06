import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

class FoodTest {

  private Food none;
  private Food salad;
  private Food tomato;
  private Food cheese;
  private Food ham;

  @BeforeEach
  void setup() {
    none = new Food(Diet.VEGAN, 0, 0, 0);
    salad = new Food(Diet.VEGAN, 2, 0, 1);
    tomato = new Food(Diet.VEGAN, 5, 0, 2);
    cheese = new Food(Diet.VEGETARIAN, 15, 15, 5);
    ham = new Food(Diet.CARNIVOROUS, 115, 8, 6);
  }

  @Test
  @DisplayName("'None' ingredient is neutral")
  void none() {
    var ingredients = asList(salad, tomato, cheese, ham);
    ingredients
        .forEach(ingredient -> {
          var food = none.and(ingredient);
          assertThat(food.is(ingredient.worstDiet())).isTrue();
          assertThat(food.calories()).isEqualTo(ingredient.calories());
          assertThat(food.salt()).isEqualTo(ingredient.salt());
          assertThat(food.fat()).isEqualTo(ingredient.fat());
        });
  }

  @Test
  @DisplayName("Panini")
  void panini() {
    var panini = ham.and(salad).and(cheese);
    assertThat(panini.is(Diet.VEGAN)).isFalse();
    assertThat(panini.is(Diet.VEGETARIAN)).isFalse();
    assertThat(panini.is(Diet.PESCETARIAN)).isFalse();
    assertThat(panini.is(Diet.CARNIVOROUS)).isTrue();
    assertThat(panini.calories()).isEqualTo(ham.calories() + salad.calories() + cheese.calories());
    assertThat(panini.fat()).isEqualTo(ham.fat() + salad.fat() + cheese.fat());
    assertThat(panini.salt()).isEqualTo(ham.salt() + salad.salt() + cheese.salt());
  }

  @Test
  @DisplayName("Mixed salad")
  void mixed_salad() {
    Food mixedSalad = tomato.and(salad);
    assertThat(mixedSalad.is(Diet.VEGAN)).isTrue();
    assertThat(mixedSalad.is(Diet.VEGETARIAN)).isTrue();
    assertThat(mixedSalad.is(Diet.PESCETARIAN)).isTrue();
    assertThat(mixedSalad.is(Diet.CARNIVOROUS)).isTrue();
    assertThat(mixedSalad.calories()).isEqualTo(tomato.calories() + salad.calories());
    assertThat(mixedSalad.fat()).isEqualTo(tomato.fat() + salad.fat());
    assertThat(mixedSalad.salt()).isEqualTo(tomato.salt() + salad.salt());
  }

}
