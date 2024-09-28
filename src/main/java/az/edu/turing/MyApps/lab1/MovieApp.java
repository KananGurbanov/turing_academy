package az.edu.turing.MyApps.lab1;

import java.util.Scanner;

public class MovieApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Input the number of movies you want to enter: ");

        int len = s.nextInt();

        Movie[] movies = new Movie[len];

        boolean entered = false;

        while (true){
            System.out.println("Press 1 to enter movies, 2 to display that movies info, 3 to add more movies, 4 to get average rating, min and max ratings, 5 to search for the movie, 6 to update a rating, 7 to delete movie 0 to exit");

            int choice = s.nextInt();

            if(choice == 1){
                if(!entered){
                    System.out.println("Enter info of movies");
                    for (int i = 0; i< movies.length;i++){
                        movies[i] = new Movie();
                        movies[i].setName(s.next());
                        movies[i].setRating(s.nextDouble());
                    }
                    entered = true;
                }
                else{
                    System.out.println("You have already entered infos about movies ");
                }

            }

            else if(choice == 2){
                if(entered) for (Movie movie : movies) {
                    System.out.println(movie);
                }
                else{
                    System.out.println("Info about movies have not been entered yet");
                }
            }

            else if(choice == 3){

                if(entered){
                    System.out.println("Enter how many movies you want to extend: ");

                    int add = s.nextInt();

                    Movie [] mv = new Movie[add + movies.length];

                    for (int i = 0;i<movies.length+add;i++){
                        if(i< movies.length){
                            mv[i] = movies[i];
                        }
                        else{
                            mv[i] = new Movie();
                            mv[i].setName(s.next());
                            mv[i].setRating(s.nextDouble());
                        }




                    }
                    movies = mv;
                }

                else{
                    System.out.println("You have not entered movies yet to extend");
                }


            }

            else if(choice == 4){
                double total = 0;

                Movie max = movies[0];

                Movie min = movies[0];

                if(entered) {
                    for (Movie movie : movies){
                        total+=movie.getRating();

                        if(movie.getRating()>max.getRating()){
                            max = movie;
                        }
                        if(movie.getRating()<min.getRating()){
                            min = movie;
                        }
                    }

                    double average = total / movies.length;

                    System.out.println("Average rating is " + average);

                    System.out.println("Minimum rating movie is " + min);

                    System.out.println("Maximum rating movie is " + max);


                }
                else{
                    System.out.println("There's no enough data to get that info");
                }


            }

            else if(choice == 5){
                if(entered){
                    System.out.println("Enter the name of movie you search");

                    String m = s.next();

                    boolean found = false;
                    for (Movie mov: movies){
                        if(mov.getName().equals(m)){
                            System.out.println(mov);
                            found = true;
                        }

                    }

                    if(!found){
                        System.out.println("That movie wasn't found in the list");
                    }
                }

                else{
                    System.out.println("You have not entered movies");
                }
            }

            else if(choice == 6){
                if(entered){
                    System.out.println("Enter the name of movie whose rating you want to update");

                    String mo= s.next();

                    boolean found = false;
                    for (Movie movi: movies){
                        if(movi.getName().equals(mo)){
                            System.out.println("Enter the new rating");

                            movi.setRating(s.nextDouble());

                            found = true;
                        }

                    }

                    if(!found){
                        System.out.println("That movie wasn't found in the list");
                    }
                }

                else{
                    System.out.println("You have not entered movies");
                }
            }

            else if(choice == 7){
                if(entered){
                    System.out.println("Enter the name of movie you want to delete");

                    String nam = s.next();

                    boolean found = false;

                    Movie[] newmovies = new Movie[movies.length - 1];



                    for (int i = 0;i<movies.length - 1;i++){

                        if (!movies[i].getName().equals(nam)){

                            newmovies[i] = movies[i];
                        }
                        if(movies[i].getName().equals(nam)){
                            newmovies[i] = movies[i+1];
                            //movies[i+1] = null;
                            found = true;
                        }
                    }

                    movies = newmovies;

                    if(!found){
                        System.out.println("The movie wasn't found");
                    }
                }

                else{
                    System.out.println("You have not entered yet");
                }
            }

            else if(choice == 0){
                System.out.println("Program exited successfully");

                break;
            }

        }

    }
}
