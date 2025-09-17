// class Food{
//     String name;
//     int rating;
//     Food(String name,int rating)
//     {
//         this.name=name;
//         this.rating=rating;
//     }
// }
// class FoodRatings {
//     HashMap<String,String>samples=new HashMap<>();
//     HashMap<String,TreeSet<Food>>all=new HashMap<>();
//     Comparator<Food> foodComparator = (a, b) -> {
//         if (b.rating != a.rating) return b.rating - a.rating;
//         return a.name.compareTo(b.name);
//     };
//     public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
//         samples=new HashMap<>();
//         all=new HashMap<>();
//         for(int i=0;i<foods.length;i++)
//         {
//             samples.put(foods[i], cuisines[i]);
//             all.putIfAbsent(cuisines[i], new TreeSet<>(foodComparator));
//             all.get(cuisines[i]).add(new Food(foods[i], ratings[i]));
//         }
//     }
    
//     public void changeRating(String food, int newRating) {
//         String cus=samples.get(food);
//         TreeSet<Food> set = all.get(cus);

//         // Find and remove the existing Food object
//         Food toRemove = null;
//         for (Food f : set) {
//             if (f.name.equals(food)) {
//                 toRemove = f;
//                 break;
//             }
//         }

//         if (toRemove != null) {
//             set.remove(toRemove);
//             set.add(new Food(food, newRating));
//         }
//     }
    
//     public String highestRated(String cuisine) {
//        return all.get(cuisine).first().name;
//     }
// }


class Food {
    String name;
    int rating;

    Food(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }
}

class FoodRatings {
    HashMap<String, String> samples = new HashMap<>();        // food -> cuisine
    HashMap<String, TreeSet<Food>> all = new HashMap<>();    // cuisine -> sorted foods
    HashMap<String, Food> foodMap = new HashMap<>();         // food -> Food object

    Comparator<Food> foodComparator = (a, b) -> {
        if (b.rating != a.rating)
            return b.rating - a.rating;
        return a.name.compareTo(b.name);
    };

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for (int i = 0; i < foods.length; i++) {
            samples.put(foods[i], cuisines[i]);
            Food f = new Food(foods[i], ratings[i]);
            foodMap.put(foods[i], f);

            all.putIfAbsent(cuisines[i], new TreeSet<>(foodComparator));
            all.get(cuisines[i]).add(f);
        }
    }

    public void changeRating(String food, int newRating) {
        Food f = foodMap.get(food);
        String cuisine = samples.get(food);
        TreeSet<Food> set = all.get(cuisine);

        set.remove(f);    // Remove the old Food object
        f.rating = newRating;  // Update rating
        set.add(f);       // Re-insert the updated Food object
    }

    public String highestRated(String cuisine) {
        return all.get(cuisine).first().name;
    }
}
/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */