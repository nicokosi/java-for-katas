record Food (Diet worstDiet, int calories, int fat, int salt) {
  public Food and(Food food) {
    return new Food(
      food.worstDiet.compareTo(this.worstDiet) > 0 ?
        food.worstDiet :
        this.worstDiet,
      food.calories + this.calories,
      food.fat + this.fat,
      food.salt + this.salt
      );
  }

  public boolean is(Diet diet) {
    return worstDiet.compareTo(diet) <= 0;
  }

}
